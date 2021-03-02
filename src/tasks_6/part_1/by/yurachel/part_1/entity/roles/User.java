package tasks_6.part_1.by.yurachel.part_1.entity.roles;


import tasks_6.part_1.by.yurachel.part_1.entity.library.Book;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User's information. " + "id: " + id + ", name: " + name + ", password: " + password + ", email: " + email;
    }

    // Пользователь предлагает добавить книгу.

    public void offerToAddBook(Book book) {
        System.out.println("The book: " + book + " is sent to " + Admin.ADMIN_EMAIL);
    }


}
