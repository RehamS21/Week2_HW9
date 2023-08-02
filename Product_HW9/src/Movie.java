public class Movie extends Product{
    private String director;

    public Movie(){}

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public double getDiscount() {
        double discount_percent = (15/100.0);
        int newPrice = (int) (getPrice() * discount_percent);
        super.setPrice(super.getPrice() - newPrice);
        return super.getPrice();
    }

    public String toString() {
        return "Movie name :"+getName()+ "\nWith director: "+director +"\nWith price before discount = "+getPrice()+"\n" +
                "The price after discount by 15% : "+getDiscount() ;
    }
}
