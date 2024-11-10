public class Bike implements Vehicle{

    private int hour;
    private String brand;

    public Bike(int hour, String brand) {
        this.hour = hour;
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double calculateRentalCost() {
        return hour*10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: "+brand+"\n"+
                "Hourly Rental Rate: $10.0\n" +
                "Rental Cost: $"+calculateRentalCost());
    }
}
