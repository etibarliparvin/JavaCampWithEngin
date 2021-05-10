package google;

public class GoogleUser {
    private String name;
    private String surname;
    private String email;

    public GoogleUser() {
    }

    public GoogleUser(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public GoogleUser setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public GoogleUser setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public GoogleUser setEmail(String email) {
        this.email = email;
        return this;
    }
}
