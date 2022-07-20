package solid.dependencyinversion.correct;

import solid.dependencyinversion.Document;

public class SignManagerDemo {

    public static void main(String[] args) {
        SignManager signManager = new SignManager();
        signManager.sign(new PDFDocument());

        Document document = new Document();
        System.out.println(document);
        signManager.sign(document);//NOW POSSIBLE
    }
}
