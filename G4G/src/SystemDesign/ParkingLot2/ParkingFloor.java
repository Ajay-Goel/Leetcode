package SystemDesign.ParkingLot2;

import java.util.HashMap;
import java.util.List;

public class ParkingFloor {
    String name;
    private HashMap<Integer,HandicappedSpot> handicappedSpotHashMap;
    private HashMap<Integer,MotorBikeSpot> motorBikeSpotHashMap;
    private HashMap<Integer,ElectricSpot> electricSpotHashMap;
    private HashMap<Integer,LargeSpot> largeSpotHashMap;
    private HashMap<Integer,CompactSpot> compactSpotHashMap;

    ParkingDisplayBoard parkingDisplayBoard;

    public ParkingFloor(String name) {
        this.name = name;
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        switch(parkingSpot.getSpotType()){
            case MotorBike:
                motorBikeSpotHashMap.put(parkingSpot.number, (MotorBikeSpot) parkingSpot);
                break;
            case Compact:
                compactSpotHashMap.put(parkingSpot.number, (CompactSpot) parkingSpot);
                break;
            case Large:
                largeSpotHashMap.put(parkingSpot.number, (LargeSpot) parkingSpot);
                break;
            case Electric:
                electricSpotHashMap.put(parkingSpot.number, (ElectricSpot) parkingSpot);
                break;
            case Handicapped:
                handicappedSpotHashMap.put(parkingSpot.number, (HandicappedSpot) parkingSpot);
                break;
            default: System.out.println("Wrong Parking spot");
        }
    }


}
