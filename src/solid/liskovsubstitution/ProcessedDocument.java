package solid.liskovsubstitution;

import solid.liskovsubstitution.Document;

public class ProcessedDocument {
    private int id;
    private String filename;
    private String hash;
    private byte[] originalDoc;
    private byte[] processedDoc;

    public ProcessedDocument(int id,
                             String hash,
                             Document document,
                             byte[] processedDoc) {
        this.id = id;
        this.filename = document.getFilename();
        this.originalDoc = document.getPayload();
        this.hash = hash;
        this.processedDoc = processedDoc;
    }

    public ProcessedDocument(int id,
                             String filename,
                             String hash,
                             byte[] originalDoc,
                             byte[] processedDoc) {
        this.id = id;
        this.filename = filename;
        this.hash = hash;
        this.originalDoc = originalDoc;
        this.processedDoc = processedDoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public byte[] getOriginalDoc() {
        return originalDoc;
    }

    public void setOriginalDoc(byte[] originalDoc) {
        this.originalDoc = originalDoc;
    }

    public byte[] getProcessedDoc() {
        return processedDoc;
    }

    public void setProcessedDoc(byte[] processedDoc) {
        this.processedDoc = processedDoc;
    }

    @Override
    public String toString() {
        return "ProcessedDocument{" +
                "id=" + id +
                ", filename=" + filename +
                ", hash='" + hash + '\'' +
                '}';
    }
}