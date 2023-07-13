package patikakitapsiralayici;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Book {
  private  String bookName;
  private int numberPages;
  private String authorName;
  private int releaseDate;



  public Book(){}
  public Book(String bookName, int numberPages,String authorName,int relaseDate){
      this.bookName=bookName;
      this.numberPages=numberPages;
      this.authorName=authorName;
      this.releaseDate=relaseDate;
  }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
