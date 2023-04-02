import java.util.Objects;

public class Book {
    private String name;
    Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги - " + this.name + "; " + "/n" +
                "Имя автора - " + author + "; " + "/n" +
                "Дата публикации - " + this.publishingYear;
    }

//    @Override
    public boolean equals(Book other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return publishingYear == other.publishingYear && name.equals(c2.name) && author.equals(c2.author);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,author,publishingYear);
    }
}
