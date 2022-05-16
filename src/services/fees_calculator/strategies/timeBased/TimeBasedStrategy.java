package src.services.fees_calculator.strategies.timeBased;

import src.models.Ticket;

public interface TimeBasedStrategy {
    int calculateFees(Ticket ticket);
}
