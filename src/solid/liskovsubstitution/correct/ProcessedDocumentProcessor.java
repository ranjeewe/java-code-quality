package solid.liskovsubstitution.correct;

import solid.liskovsubstitution.ProcessedDocument;

public interface ProcessedDocumentProcessor {

    void processDocument(ProcessedDocument document) throws DocumentException;
}