package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import ticketCalc.Ticket;

public class Tickets {
    @Test
    public void tickets_infant_freeTicket(){
        // Arrange
        Ticket passenger = new Ticket(1,1000);

        // Act
        double result = passenger.calcPrice();

        // Assert
        Assert.assertEquals(result,0.0);
    }

    @Test
    public void tickets_child_halfPrice() {
        Ticket passenger = new Ticket(5, 1000);
        double result = passenger.calcPrice();
        Assert.assertEquals(result, 500);
    }

    @Test
    public void tickets_adult_fullPrice(){
        Ticket passenger = new Ticket(35, 1000);
        double result = passenger.calcPrice();
        Assert.assertEquals(result, 1000);
    }

    @Test
    public void tickets_senior_80procent(){
        Ticket passenger = new Ticket(75, 1000);
        double result = passenger.calcPrice();
        Assert.assertEquals(result, 800);
    }


}
