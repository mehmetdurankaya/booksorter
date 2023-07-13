package patikakitapsiralayici;

import java.util.Comparator;

public class OrderPagesNumberComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNumberPages()-o2.getNumberPages();
    }
}
