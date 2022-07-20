package solid.liskovsubstitution.wrong;

import solid.liskovsubstitution.Document;
import solid.liskovsubstitution.DocumentProcessor;
import solid.liskovsubstitution.ProcessedDocument;
import solid.liskovsubstitution.SimpleDocumentProcessor;

public class DocumentProcessingManager {
    private static final String INDIA = "IN";
    private static final String LANKA = "LK";

    public static void main(String[] args) {
        DocumentProcessor documentProcessor = getDocumentProcessor("LK");
        ProcessedDocument processedDocument = documentProcessor.process(new Document(2,
                "test", "AF", null));
        System.out.println(processedDocument);
    }

    private static DocumentProcessor getDocumentProcessor(String country) {
        switch (country) {
            case INDIA:
            case LANKA:
                return new ComplexDocumentProcessor();
            default:
                return new SimpleDocumentProcessor();
        }
    }
}