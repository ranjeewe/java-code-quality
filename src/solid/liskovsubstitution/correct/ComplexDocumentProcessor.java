package solid.liskovsubstitution.correct;

import solid.liskovsubstitution.Document;
import solid.liskovsubstitution.DocumentProcessor;
import solid.liskovsubstitution.ProcessedDocument;

public class ComplexDocumentProcessor implements DocumentProcessor {
    @Override
    public ProcessedDocument process(Document document) {
        //assume more complex calculation here as well
        System.out.println(document);
        int FACTOR = 2000;
        return new ProcessedDocument(document.getId() + FACTOR,
                "Hash",
                document,
                null);
    }
}