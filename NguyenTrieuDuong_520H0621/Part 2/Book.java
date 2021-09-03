import java.util.*;
abstract class Book {
    //Original cost property
    protected float originalCost;
    //some random properties
    protected String bookName;
    protected int numberSale;

    //two random constructors
    public Book(String bookName, float originalCost, int numberSale) {
        this.bookName = bookName;
        this.originalCost = originalCost;
        this.numberSale = numberSale;
    }
    public Book() {};
    //abstract method
    abstract float calSellingPrice();
    //2 process method
    public float calBookIncome(){
        return (calSellingPrice()-originalCost)*numberSale;
    }
    public int calBookInStock() {
        System.out.print("How many book was imported? ");
        Scanner sc = new Scanner(System.in);
        int numberImport = sc.nextInt();
        sc.close();
        return numberImport - this.numberSale;
    }
    //getters,setters and toString
    public String getBookName(){
        return this.bookName;
    }
    
    public float getOriginalCost(){
        return this.originalCost;
    }
    public int getNumberSale(){
        return this.numberSale;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }   
    public void setOriginalCost(float originalCost){
        this.originalCost = originalCost;
    }
    public void setNumberSale(int numberSale){
        this.numberSale = numberSale;
    }
    public String toString(){
        return "Book:["+ bookName +","+ originalCost +","+ numberSale +","+"]";
    }
}