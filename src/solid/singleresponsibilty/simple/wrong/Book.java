package solid.singleresponsibilty.simple.wrong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * One disadvantage except clarity is that if there is a need to change the db, db connection or the way of
 * saving the entity to db this code will have to change. E.g.: If NoSQL or a newer ORM was introduced.
 */
public class Book {
    private int id;
    private String name;
    private String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void save() {
        try {
            Connection connection = DriverManager.getConnection("path","username","password");
            String insertString = "Insert into t_book(id,name,authoer)" +
                    "values(" + id + "," + name + "," + author;
            PreparedStatement preparedStatement = connection.prepareStatement(insertString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}