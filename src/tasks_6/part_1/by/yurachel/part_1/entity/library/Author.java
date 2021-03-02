package tasks_6.part_1.by.yurachel.part_1.entity.library;

public class Author {

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }


    public Author(String lastName) {
        this.Name = lastName;

    }

    @Override
    public String toString() {
        return Name;
    }
}
