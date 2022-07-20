package solid.liskovsubstitution.correct;

import solid.liskovsubstitution.ProcessedDocument;

public class AdvanceProcessedDocumentProcessor implements ProcessedDocumentProcessor {
    @Override
    public void processDocument(ProcessedDocument document) throws DocumentException {
        //below given stuff doesn't break Liskov substitution principle
        int COMPLEX_FACTOR = 2;
        int COMPLEX_FACTOR_RESULT = 0;
        if (document.getId() % COMPLEX_FACTOR == COMPLEX_FACTOR_RESULT) {
            //DO NOT do anything which breaks the contract
            throw new DocumentException("Test", "Failed when calling third party");
        }
    }
}