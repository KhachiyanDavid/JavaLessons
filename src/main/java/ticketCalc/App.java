package ticketCalc;

public class App {
    public static void main(String[] args) {

        Ticket annaTicket = new Ticket(22,1000);

        System.out.println(annaTicket.calcPrice());
    }
}
