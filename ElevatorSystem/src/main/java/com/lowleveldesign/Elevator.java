package com.lowleveldesign;

import com.lowleveldesign.enums.Direction;
import com.lowleveldesign.enums.ElevatorState;

import java.util.Map;

public class Elevator {
    private int id;
    private Direction elevatorDirection;
    private int currentFloor;
    private ElevatorState elevatorState;
    private Display display;


    public Elevator(int currentFloor,ElevatorState elevatorState) {
        this.currentFloor = currentFloor;
        this.elevatorState = ElevatorState.IDLE;
    }

}
