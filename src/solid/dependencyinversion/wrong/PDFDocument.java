package solid.dependencyinversion.wrong;

public class PDFDocument {
    private int id;
    private byte[] payload;

    public PDFDocument(){

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