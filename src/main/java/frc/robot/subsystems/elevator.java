package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import static frc.robot.Constants.*;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class elevator extends SubsystemBase {
    
    private final CANSparkMax elevator1;
    private final CANSparkMax elevator2;


    private final RelativeEncoder elevatorEncoder1;
    private final RelativeEncoder elevatorEncoder2;


    public elevator() {
        
        elevator1 = new CANSparkMax(elevatorPort1, MotorType.kBrushless);
        elevator2 = new CANSparkMax(elevatorPort2, MotorType.kBrushless);

        elevator1.setIdleMode(IdleMode.kBrake);
        elevator2.setIdleMode(IdleMode.kBrake);
        
        elevatorEncoder1 = elevator1.getEncoder();
        elevatorEncoder2 = elevator2.getEncoder();

    }

    public void elevatorUp() {
        elevator1.set(elevatorUp);
        elevator2.set(elevatorUp);

    }

    public void elevatorDown() {
        elevator1.set(elevatorDown);
        elevator2.set(elevatorDown);

    }

    public void elevatorStop() {
        elevator1.set(0);
        elevator2.set(0);

    }

    public void setElevator(double speed) {
        elevator1.set(speed);

        elevator2.set(speed);
    }

    public double getElevator() {
        // return elevatorEncoder1.getPosition();
        // return elevatorEncoder2.getPosition();
return (Double) null;
    }

    public void resetElevator() {
        elevatorEncoder1.setPosition(0);
        elevatorEncoder2.setPosition(0);

    } 
}
