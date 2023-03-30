public class Main {

    public static void main(String[] args) {
        Author DSimons = new Author("Дэн", "Симмонс");
        System.out.println("DSimons.firstName = " + DSimons.getFirstName());
        System.out.println("DSimons.getSecondName() = " + DSimons.getSecondName());
        //String authorForBook = DSimons.getFirstName() + " " + DSimons.getSecondName();
        Book giperion = new Book("Гиперион", DSimons,1989);
        System.out.println("Название книги - " + giperion.getName());
        System.out.println("Автор - " + giperion.getAuthor());
        System.out.println("Год публикации - " + giperion.getPublishingYear());
        giperion.setPublishingYear(1990);
        System.out.println("Год публикации - " + giperion.getPublishingYear());

    }
}