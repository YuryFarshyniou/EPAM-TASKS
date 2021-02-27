package tasks_6.part_1.by.yurachel.part_1.entity.library;

public class Genre {
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Genre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genre. " + genre;
    }
}
