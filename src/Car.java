public class Car implements Vehicle{

    private String model;
    private int days;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days*50;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: "+model+"\n"+
                "Daily Rental Rate: $50\n"+
                "Rental Cost: $"+calculateRentalCost());
    }
}
