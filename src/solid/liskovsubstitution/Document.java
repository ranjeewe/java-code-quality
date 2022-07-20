package solid.liskovsubstitution;

public class Document {
    private int id;
    private String filename;
    private String country;
    private byte[] payload;

    public Document(int id, String filename, String country, byte[] payload) {
        this.id = id;
        this.filename = filename;
        this.country = country;
        this.payload = payload;
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

    public byte[] getPayload() {
        return payload;
    }

    public void setPayload(byte[] payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}