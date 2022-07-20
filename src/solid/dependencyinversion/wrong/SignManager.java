package solid.dependencyinversion.wrong;

public class SignManager {

    public void sign(PDFDocument document) {
        System.out.println("Sign " + document);
    }
}