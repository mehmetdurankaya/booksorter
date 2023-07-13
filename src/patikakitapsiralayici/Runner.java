package patikakitapsiralayici;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Runner {//HashSet TreeSet ' e dönüştürülerek sıralama yapılmıştır sıralama kitap ismine ve sayfa sayısına göre yapılmıştır.
    public static void main(String[] args) {
        HashSet<Book> books= new HashSet<>();
        books.add(new Book("1984",328,"George Orwell",1949));
        books.add(new Book("Alchemist",208," Paulo Coelho",1949));
        books.add(new Book("Da Vinci Code",597,"Dan Brown",2003));
        books.add(new Book("Hunger Games",384,"Suzanne Collins",2008));
        books.add(new Book("Lord of the Rings",1216,"J.R.R. Tolkien",1216));


       //Set<Book> hashSetToTreeSet=new TreeSet<>(new OrderNameComparator());// kitap ismine göre sıralıyor
        Set<Book> hashSetToTreeSet=new TreeSet<>(new OrderPagesNumberComparator());//Sayfa sayısına göre sıralıyor
        hashSetToTreeSet.addAll(books);

//printf metodu kullanılarak liste formatı kazandırılmıştır
        String str="-";
        System.out.println(str.repeat(75));
        System.out.printf("|%-25S |%-15S |%-15S |%-5S|\n","Book Name","Number of Pages","Author Name", "Relase Date");
        System.out.println(str.repeat(75));
//------------------------------------------------------------liste

        for(Book w: hashSetToTreeSet){
            System.out.printf("|%-25S |%-15S |%-15S |%-5S|",w.getBookName(),w.getNumberPages(),w.getAuthorName(),w.getReleaseDate()+"\n");
            System.out.println(str.repeat(75));// repeat metodu kullanılarak çizgiler tekrarlı hale getirilmiştir.
        }

    }


}
