package frc.robot.subsystems;
import static frc.robot.Constants.*;


import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class arm extends SubsystemBase {
    
    private final CANSparkMax telescope;
    private final CANSparkMax pivot;

    private final RelativeEncoder telescopeEncoder;
    private final RelativeEncoder pivotEncoder;

    public arm() {

        telescope = new CANSparkMax(telescopePort, MotorType.kBrushless);
        pivot = new CANSparkMax(pivotPort, MotorType.kBrushless);

        telescope.setIdleMode(IdleMode.kBrake);
        pivot.setIdleMode(IdleMode.kBrake);

        telescopeEncoder = telescope.getEncoder();
        pivotEncoder = pivot.getEncoder();

    }

    public void telescopeIn() {
        telescope.set(telescopeSpeedIn);
    }

    public void telescopeOut() {
        telescope.set(telescopeSpeedOut);
    }

    public void telescopeStop() {
        telescope.set(telescopeSpeedStop);
    }

    public void setTelescope(double speed) {
        telescope.set(speed);
    }

    public double getTelescope() {
        return telescopeEncoder.getPosition();
    }

    public void resetTelescope() {
        telescopeEncoder.setPosition(0);
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

    }
}
