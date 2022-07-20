package solid.liskovsubstitution.wrong;

import solid.liskovsubstitution.Document;
import solid.liskovsubstitution.DocumentProcessor;
import solid.liskovsubstitution.ProcessedDocument;

public class ComplexDocumentProcessor implements DocumentProcessor {
    @Override
    public ProcessedDocument process(Document document) {
        int FACTOR = 2000;
        ProcessedDocument processedDocument = new ProcessedDocument(document.getId() + FACTOR,
                "Hash",
                document,
                null);

        //below given stuff breaks Liskov substitution principle
        int COMPLEX_FACTOR = 2;
        int COMPLEX_FACTOR_RESULT = 0;
        if (processedDocument.getId() % COMPLEX_FACTOR == COMPLEX_FACTOR_RESULT) {
            //assume calling a third party service and reply will return asynchronously
            //ANY WAY ABOVE TASK IS VERY BAD IF IT IS DONE
            //Also assume that the below given exception can occur
            //This will violate Liskov substitution
            throw new DocumentRuntimeException("Test", "Failed when calling third party");
        } else {
            //assume more complex calculation here as well
            System.out.println(document);
            return processedDocument;
        }
    }
}