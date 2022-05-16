package src.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    String name;
    String address;
    List<ParkingFloor> parkingFloorList;
    List<EntryGate>  entryGateList;
    List<ExitGate> exitGateList;
}
