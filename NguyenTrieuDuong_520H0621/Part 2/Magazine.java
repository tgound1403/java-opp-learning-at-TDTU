public class Magazine extends Book {
    private String datePublished;
    private String publisher;
    private boolean isSpecial;

    //2 constructors
    public Magazine() {};
    public Magazine(String bookName, String publisher, String datePublished, int numberSale, float originalCost, boolean isSpecial) {
        super(bookName, originalCost, numberSale);
        this.publisher = publisher;
        this.datePublished = datePublished;
        this.isSpecial = isSpecial;
    }

    @Override
    float calSellingPrice(){
        return (float)(this.originalCost + 0.1*this.originalCost);
    }
    //2 process constructor
    public boolean isAvailable(){
        if (calBookInStock() > 0) return true;
        else return false;
    }
    public float calPriceForSpecialMagazine() {
        double tax;
        if ( this.isSpecial == true)
            tax = 0.2;
        else tax = 0;
        return (float)(calSellingPrice() + tax*this.originalCost); 
    }
    //getters, setters and toString
    public boolean getIsSpecial(){
        return this.isSpecial;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public String getDatePublished(){
        return this.datePublished;
    }
    public void setIsSpecial(boolean isSpecial){
        this.isSpecial = isSpecial;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setDatePublished(String datePublished){
        this.datePublished = datePublished;
    }
    @Override
    public String toString(){ 
        return "Magazine:["+bookName+","+publisher+","+datePublished+","+numberSale+","+originalCost+","+isSpecial+"]";
    }
}