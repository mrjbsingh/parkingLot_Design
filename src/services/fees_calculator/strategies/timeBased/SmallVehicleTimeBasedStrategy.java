package src.services.fees_calculator.strategies.timeBased;

import src.models.Ticket;

public class SmallVehicleTimeBasedStrategy implements TimeBasedStrategy{
    @Override
    public int calculateFees(Ticket ticket) {
        return 0;
    }
}
