import java.util.*;
public class BookstoreManagement {
    public static void main(String[] args) {
    //construct a literary book and a magazine, call all methods for each
    LiteraryBook selfhelp = new LiteraryBook("How to win friend and influence people","Dale Carnegie",1936,"english",155000,1000,false);
    LiteraryBook matbiec = new LiteraryBook("Mat Biec","Nguyen Nhat Anh",2000,"vietnam",50000,2000,false);
    LiteraryBook minimal = new LiteraryBook("Nghi don gian song don thuan","ABC",2019,"vietnam",70000,1000,true);
    Magazine glamour = new Magazine("Glamour","XYZ","31/2",500, 200000, false);
    Magazine IT = new Magazine("IT la vua cua cac nghe","thang em 2k2 KHMT-TDT","14/03",2021,500000,true);
    Magazine phunu = new Magazine("Phu Nu","NXB Phu nu","23/7",1000,75000,false);
    System.out.println(selfhelp.toString());
    System.out.println(selfhelp.getBookName());
    System.out.println(selfhelp.getAuthor());
    System.out.println(selfhelp.getReleaseYear());
    System.out.println(selfhelp.getBookLanguage());
    System.out.println(selfhelp.getOriginalCost());
    System.out.println(selfhelp.getNumberSale());
    System.out.println(selfhelp.getBookStatus());
    System.out.println("selling price start at: "+selfhelp.calSellingPrice());
    System.out.println("if book from foreign country then price: "+selfhelp.calPriceForForeignBook());
    System.out.println("price by book status, if old sale 50%: "+selfhelp.calPriceByBookStatus());
    System.out.println("total income of this book: "+selfhelp.calBookIncome());
    System.out.println(phunu.toString()); 
    System.out.println(phunu.getBookName());
    System.out.println(phunu.getPublisher());
    System.out.println(phunu.getDatePublished());
    System.out.println(phunu.getNumberSale());
    System.out.println(phunu.getOriginalCost());
    System.out.println(phunu.getIsSpecial()); 
    System.out.println("selling price start at: "+phunu.calSellingPrice());
    System.out.println("Does this book still available: "+phunu.isAvailable());
    System.out.println("price if this is a special magazine, if not price will remain: "+phunu.calPriceForSpecialMagazine());
    System.out.println("total income of this book: "+phunu.calBookIncome());
    //construct book management object, pass 6 book, call method
    ArrayList<Book> bookLists = new ArrayList<Book>();
    bookLists.add(selfhelp);
    bookLists.add(matbiec);
    bookLists.add(minimal);
    bookLists.add(phunu);
    bookLists.add(glamour);
    bookLists.add(IT);
    ManageBook list = new ManageBook(bookLists);
    System.out.println("Book has highest price is: "+list.findMaxSellingPrice());
    int totalMagazine = 0;
    int totalLBook = 0;
    float totalPriceMagazine = 0;
    float totalPriceLBook = 0;
    for (int i=0; i<bookLists.size(); i++)
        if(bookLists.get(i) instanceof LiteraryBook) {
            totalPriceLBook = totalPriceLBook + bookLists.get(i).getOriginalCost();
            totalLBook++;
        }
    for (int i=0; i<bookLists.size(); i++)
        if(bookLists.get(i) instanceof Magazine) {
            totalPriceMagazine = totalPriceMagazine + bookLists.get(i).getOriginalCost();
            totalMagazine++;
        } 
    System.out.println("Average price of LiteraryBook: " + totalPriceLBook/totalLBook);
    System.out.println("Average price of Magazine: " + totalPriceMagazine/totalMagazine);
    }
}
