package src.services.fees_calculator.strategies.timeBased;

import src.models.Ticket;

public class MediumVehicleTimeBasedStrategy implements TimeBasedStrategy{
    @Override
    public int calculateFees(Ticket ticket) {
        return 0;
    }
}
