package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import static frc.robot.Constants.*;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class elevator extends SubsystemBase {
    
    private final CANSparkMax elevator;

    private final RelativeEncoder elevatorEncoder;

    public elevator() {
        
        elevator = new CANSparkMax(elevatorPort, MotorType.kBrushless);
        elevator.setIdleMode(IdleMode.kBrake);

        elevatorEncoder = elevator.getEncoder();

    }

    public void elevatorUp() {
        elevator.set(elevatorUp);
    }

    public void elevatorDown() {
        elevator.set(elevatorDown);
    }

    public void elevatorStop() {
        elevator.set(0);
    }

    public void setElevator(double speed) {
        elevator.set(speed);
    }

    public double getElevator() {
        return elevatorEncoder.getPosition();
    }

    public void resetElevator() {
        elevatorEncoder.setPosition(0);
    } 
}
