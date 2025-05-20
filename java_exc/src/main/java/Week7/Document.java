package Week7;

public class Document implements Printable {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Printing document: " + name);
    }

    public static void printAnything(Printable p) {
        p.print();
    }

    public static void main(String[] args) {
        Document doc = new Document("Week7Notes.txt");
        printAnything(doc);
    }

}
