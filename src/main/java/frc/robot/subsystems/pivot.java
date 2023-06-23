package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pivot extends SubsystemBase {
    private final CANSparkMax pivot;
    private final RelativeEncoder pivotEncoder;

    public Pivot() {
        pivot = new CANSparkMax(pivotPort, MotorType.kBrushless);
        pivot.setIdleMode(IdleMode.kBrake);
        pivotEncoder = pivot.getEncoder();
    }

    public void pivotUp() {
        pivot.set(pivotSpeedUp);
    }

    public void pivotDown() {
        pivot.set(pivotSpeedDown);
    }

    public void pivotStop() {
        pivot.set(0);
    }

    public void setPivot(double speed) {
        pivot.set(speed);
    }

    public double getPivot() {
        return pivotEncoder.getPosition();
    }

    public void resetPivot() {
        pivotEncoder.setPosition(0);
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("Pivot", getPivot());
    }
}
