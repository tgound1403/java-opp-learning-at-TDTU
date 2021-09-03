import java.util.*;
public class ManageBook {
    //List of books
    ArrayList<Book> bookList = new ArrayList<Book>();
    //constructor with a list of book as its argument
    ManageBook(ArrayList<Book> bookList){
        this.bookList = bookList;
    }
    //choose 1 of 3 method
    public Book findMaxSellingPrice(){
        int index = 0;
        float max = bookList.get(0).calSellingPrice();
        for(int i=0; i<bookList.size(); i++) {
            if (bookList.get(i).calSellingPrice() > max){
                max = bookList.get(i).calSellingPrice();
                index = i;
            }    
        }
        return bookList.get(index);
    }
}