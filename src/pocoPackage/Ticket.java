package pocoPackage;

import java.security.PublicKey;

public class Ticket implements POCO{
    public long id;
    public long flightId;
    public long customerId;

    public Ticket( long id,long flightId, long customerId) {
        this.id=id;
        this.flightId = flightId;
        this.customerId = customerId;
    }

    public Ticket() {
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", flightId=" + flightId +
                ", customerId=" + customerId +
                '}';
    }
}
