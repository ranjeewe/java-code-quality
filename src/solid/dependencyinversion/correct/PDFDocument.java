package solid.dependencyinversion.correct;

import solid.dependencyinversion.Document;

public class PDFDocument extends Document {
    private int id;
    private byte[] payload;

    public PDFDocument() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getPayload() {
        return payload;
    }

    public void setPayload(byte[] payload) {
        this.payload = payload;
    }
}