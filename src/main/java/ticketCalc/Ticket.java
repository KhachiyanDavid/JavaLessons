package ticketCalc;

public class Ticket {
    private int age;
    private int basePrice;

    public Ticket(int age, int basePrice) {
        this.age = age;
        this.basePrice = basePrice;
    }

    public double calcPrice(){

        if(this.age<3){
            return 0;
        }
        if(this.age<13){
            return this.basePrice*0.5;
        }
        if(this.age<66){
            return this.basePrice;
        }
        return this.basePrice*0.8;
    }
}
