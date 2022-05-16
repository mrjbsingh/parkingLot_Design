package src.services.fees_calculator.strategies.timeBased;

import src.models.Ticket;

public class LargeVehicleTimeBasedStrategy implements TimeBasedStrategy{
    @Override
    public int calculateFees(Ticket ticket) {
        return 0;
    }
}
