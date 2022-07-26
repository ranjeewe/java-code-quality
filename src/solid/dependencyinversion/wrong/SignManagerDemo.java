package solid.dependencyinversion.wrong;

import solid.dependencyinversion.Document;

public class SignManagerDemo {

    public static void main(String[] args) {
        SignManager signManager = new SignManager();
        signManager.sign(new PDFDocument(1, null));

        Document document = new Document();
        System.out.println(document);
        //signManager.sign(document);//HOW TO SIGN DOCUMENT or any other type of similar document??
    }
}
