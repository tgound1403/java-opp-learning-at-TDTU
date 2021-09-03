public class LiteraryBook extends Book {
    private String bookLanguage;
    private boolean isNewBook;
    private String author;
    private int releaseYear;
    //2 constructors
    public LiteraryBook(String bookName, String author, int releaseYear, String bookLanguage, float originalCost, int numberSale, boolean isNewBook){
        super(bookName, originalCost, numberSale);
        this.bookLanguage = bookLanguage;
        this.isNewBook = isNewBook;
        this.author = author;
        this.releaseYear = releaseYear;
    }
    public LiteraryBook() {};
    @Override
    float calSellingPrice() {
        return (float)Math.ceil(this.originalCost + 0.05*this.originalCost);
    }
    public float calPriceForForeignBook(){
        double importTax=0;
        if(this.bookLanguage != "vietnam") importTax = 0.1;
        return (float)(calSellingPrice() + importTax*calSellingPrice());
    }
    public float calPriceByBookStatus() {
        if(isNewBook == true) return calSellingPrice();
        else return (float)(0.5*calSellingPrice());
    }
    //getters, setters and toString
    public String getBookLanguage(){
        return this.bookLanguage;
    }
    public boolean getBookStatus(){
        return this.isNewBook;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }
    public void setBookLanguage(String bookLanguage){
        this.bookLanguage = bookLanguage;
    }
    public void setBookStatus(boolean isNewBook){
        this.isNewBook = isNewBook;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString() {
        return "LiteraryBook:["+bookName+","+author+","+releaseYear+","+bookLanguage+","+originalCost+","+numberSale+","+isNewBook+"]";
    }
}