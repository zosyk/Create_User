package models;

/**
 * Created by Alekcandr on 2/28/2016.
 */
public class User1 {
    private final int id;
    private final String login;
    private final String email;

    public User1(final int id, final String login, final String email){
        this.id = id;
        this.login = login;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
