public class App {
    public static void printSeparator() {
        System.out.println();
        System.out.println("=======================");
        System.out.println();
    }

    public static void main(String[] args) {
        printSeparator();
        Author DSimons = new Author("Дэн", "Симмонс");
        Book giperion = new Book("Гиперион", DSimons, 1989);
        System.out.println(giperion);
        printSeparator();
        Author KVonegut = new Author("Курт", "Воннегут");
        Book mechPiano = new Book("Механическое пианино", KVonegut, 1952);
        System.out.println(mechPiano);
        printSeparator();
        mechPiano.setPublishingYear(2019);
        System.out.println("Год переиздания - " + mechPiano.getPublishingYear());;
        Book giperion2 = new Book("Гиперион", DSimons, 2021);
        printSeparator();
        System.out.println(giperion.equals(giperion2));
        System.out.println(giperion.hashCode());
    }
}
