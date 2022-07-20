package solid.liskovsubstitution.correct;

import solid.liskovsubstitution.ProcessedDocument;

public class SimpleProcessedDocumentProcessor implements ProcessedDocumentProcessor {
    @Override
    public void processDocument(ProcessedDocument document) {
        //do nothing important...But don't break interface segregation
        System.out.println(document);
    }
}