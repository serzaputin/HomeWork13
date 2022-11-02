public class Main {
    public static void main(String[] args) {
        System.out.println("Объекты и Классы");
        Author philipPullman = new Author("Phlip", "Pullman");
        Book firstBook = new Book("DarkMaterials", philipPullman, 2005);
        Book secondBook = new Book("Сat'sСradle", new Author("Kurt", "Vonnegut"), 1963);


        System.out.println("Authors:");
        Author philipPullman1 = new Author("Philip", "Pullman");
        Author philipPullman2 = new Author("Philip", "Pullman");
        Author levTolstoy = new Author("lev", "Tolstoy");
        System.out.println("Autor copies equal: " + philipPullman1.equals(philipPullman2));
        System.out.println("Autor copies equal by hashCode: " + (philipPullman1.hashCode() == philipPullman2.hashCode()));
        System.out.println("Autors equal: " + philipPullman1.equals(levTolstoy));
        System.out.println("Autors equal by hashCode: " + (philipPullman1.hashCode() == levTolstoy.hashCode()));

        System.out.println(philipPullman1);
        System.out.println(levTolstoy);

        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println("book");
        Book galatea = new Book("galatea", philipPullman1, 1976);
        Book galatea2 = new Book("galatea", philipPullman1, 1976);
        Book warAndPeace = new Book("warAndPeace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + galatea.equals(galatea2));
        System.out.println("Book copies equal by hashCode " + (galatea.hashCode() == galatea2.hashCode()));
        System.out.println("Book equal: " + galatea.equals(warAndPeace));
        System.out.println("Book equal by hashCode: " + (galatea.hashCode() == warAndPeace.hashCode()));
        System.out.println(galatea);
        System.out.println(warAndPeace);
    }
}
