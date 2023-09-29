package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimeLight extends SubsystemBase {

    public static final NetworkTable limelight = NetworkTableInstance.getDefault().getTable("limelight");
    
    public static NetworkTable getLimeLightTable() {
        return limelight;
    }

    public double getTX() {
        return limelight.getEntry("tx").getDouble(0);
    }

    public double getTY() {
        return limelight.getEntry("ty").getDouble(0);
    }

    public boolean hasTargets() {
        return limelight.getEntry("tv").getDouble(0) > 0;
    }
}
