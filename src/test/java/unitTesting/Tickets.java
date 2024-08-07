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


}
