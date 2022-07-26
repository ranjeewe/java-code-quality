package solid.dependencyinversion.wrong;

import solid.liskovsubstitution.Document;

public class PDFDocument extends Document {
    private int id;
    private byte[] payload;

    public PDFDocument(int id, byte[] payload) {
        super(id, "", "", payload);
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