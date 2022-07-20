package solid.singleresponsibilty.simple.correct;

public class BookDAO {

    public void save(Book book) {
        System.out.println(book);
    }
}