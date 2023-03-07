package frc.robot.subsystems;
import static frc.robot.Constants.*;


import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class telescope extends SubsystemBase {
    
    private final CANSparkMax telescope;

    private final RelativeEncoder telescopeEncoder;

    public telescope() {

        telescope = new CANSparkMax(telescopePort, MotorType.kBrushless);

        telescope.setIdleMode(IdleMode.kBrake);

        telescopeEncoder = telescope.getEncoder();

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

    

    @Override
    public void periodic() {
        SmartDashboard.putNumber("Telescope", getTelescope());
    }
}
