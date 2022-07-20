package solid.dependencyinversion;

public class Document {
    private int id;
    private byte[] payload;

    public Document() {
    }

    public Document(int id, byte[] payload) {
        this.id = id;
        this.payload = payload;
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
