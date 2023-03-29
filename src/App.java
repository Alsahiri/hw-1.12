public class App {
    public static String stringAddition(String a, String b) {
        String c = a + " " + b;
        return c;
    }

    public static void resultOutput(String a, String b, int c) {
        System.out.println("Название книги - " + a);
        System.out.println("Имя автора - " + b);
        System.out.println("Дата публикации - " + c);
    }

    public static void printSeparator() {
        System.out.println();
        System.out.println("=======================");
        System.out.println();
    }
    public static void main(String[] args) {
        printSeparator();
        Author DSimons = new Author("Дэн", "Симмонс");
        String authorDS = stringAddition(DSimons.getFirstName(), DSimons.getSecondName());
        Book giperion = new Book("Гиперион", authorDS, 1989);
        resultOutput(giperion.getName(), authorDS, giperion.getPublishingYear());
        printSeparator();
        Author KVonegut = new Author("Курт", "Воннегут");
        String authorKV = stringAddition(KVonegut.getFirstName(), KVonegut.getSecondName());
        Book mechPiano = new Book("Механическое пианино", authorKV, 1952);
        resultOutput(mechPiano.getName(), authorDS, mechPiano.getPublishingYear());
        printSeparator();
        mechPiano.setPublishingYear(1888);
        System.out.println("Возможный год публикации - " + mechPiano.getPublishingYear());
    }
}
