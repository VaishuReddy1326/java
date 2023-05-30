public class Cars {
    private String brand;
    private double milleage;
    private double price;
    private boolean havingAC;
     private int seatingcapacity;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getMilleage(){
        return milleage;
    }
    public void setMilleage(double milleage) {
        this.milleage = milleage;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean getHavingAC() {
        return havingAC;
    
    }
    public void setHavingAc(boolean havingAC) {
        this.havingAC = havingAC;
    }
    public int getSeatingcapacity() {
        return seatingcapacity;
    }
    public void setSeatingcapacity(int seatingcapacity) {
        this.seatingcapacity = seatingcapacity;
    }
    @Override
    public String toString() {
        
        return "cars{" +
                "brand='" + brand + '\''+
                "' milleage="+milleage+
                "'price="+price +
                "'havingAC= " + havingAC +
                "'seatingcapacity"+seatingcapacity +
                '}';
    }

    
}
