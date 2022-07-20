package solid.liskovsubstitution;

public class SimpleDocumentProcessor implements DocumentProcessor {
    @Override
    public ProcessedDocument process(Document document) {
        int FACTOR = 1000;
        System.out.println(document);
        return new ProcessedDocument(document.getId() + FACTOR,
                "Hash",
                document,
                null);
    }
}