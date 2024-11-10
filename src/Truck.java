public class Truck implements Vehicle{

    private int week;
    private String type;

    public Truck(int week, String type) {
        this.week = week;
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calculateRentalCost() {
        return week*100;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Brand: "+type+"\n"+
                "Weekly Rental Rate: $100\n"+
                "Rental Cost: $"+calculateRentalCost());
    }
}
