public class Book extends Product{
    private String author;

    public Book(){}
    public Book(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        double discount_percent = (20/100.0);
        int newPrice = (int) (getPrice() * discount_percent);
        super.setPrice(super.getPrice() - newPrice);
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Book name :"+getName()+".\nThe author : "+author+"\nWith price before discount = "+getPrice()+"\n" +
                "The price after discount by 20% : "+getDiscount() ;
    }
}
