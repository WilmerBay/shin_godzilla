package Week3;

import java.util.ArrayList;
import java.util.List;

public class ListMiniExercise {

    public static void main(String[] args) {

        List<String> artists = new ArrayList<>();

        artists.add("Perfume");
        artists.add("Born of Osiris");
        artists.add("NMIXX");

        for (int i = 0; i < artists.size(); i++)
        System.out.println((i + 1) + " : " + artists.get(i));

        artists.remove(1);

        artists.add("Twice");

        for (int i = 0; i < artists.size(); i++)
        System.out.println((i + 1) + " : " + artists.get(i) );

        List<Integer> favNum = new ArrayList<>();

        favNum.add(13);
        favNum.add(17);
        favNum.add(7);

        for (int i = 0; i < favNum.size(); i++)
        System.out.println((i +1) + " : " + favNum.get(i));

        favNum.remove(0);
        favNum.add(5);

        for (int i = 0; i < favNum.size(); i++)
            System.out.println((i +1) + " : " + favNum.get(i));

        int total = 0;
        for (int num : favNum) {
            total = total + num;
        }

        Book book1 = new Book("Book1", "wilmer",4, 2000);
        Book book2 = new Book("Book2", "wilmer",3, 2001);
        Book book3 = new Book("Book3", "wilmer",2, 2002);

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (int i = 0; i < books.size(); i++)
            System.out.println(books.get(i).getTitle());











    }
}
