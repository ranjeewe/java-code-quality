package solid.dependencyinversion.correct;

import solid.dependencyinversion.Document;

public class SignManager {

    public void sign(Document document) {
        System.out.println("Sign " + document);
    }
}