package frc.robot.subsystems;
import static frc.robot.Constants.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class drivetrain extends SubsystemBase {
    
    private final MotorControllerGroup left =
        new MotorControllerGroup(
            new CANSparkMax(LFront, MotorType.kBrushless),
            new CANSparkMax(LRear, MotorType.kBrushless));

    private final MotorControllerGroup right =
        new MotorControllerGroup(
            new CANSparkMax(RFront, MotorType.kBrushless),
            new CANSparkMax(RRear, MotorType.kBrushless));   

    private final DifferentialDrive m_drive = new DifferentialDrive(left, right);

    private final Encoder leftEncoder = new Encoder(LEncoder[0], LEncoder[1], LReverse);
    private final Encoder rightEncoder = new Encoder(REncoder[0], REncoder[1], RReverse);

    public drivetrain() {

        right.setInverted(true);

        leftEncoder.setDistancePerPulse(kEncoderDistancePerPulse);
        rightEncoder.setDistancePerPulse(kEncoderDistancePerPulse);

    }

    public void drive(double fwd, double rot) {

        m_drive.arcadeDrive(fwd, rot);
    
    }

    public void resetEncoders() {

        leftEncoder.reset();
        rightEncoder.reset();

    }

    public Encoder getLeftEncoder() {

        return leftEncoder;

    }

    public Encoder getRightEncoder() {

        return rightEncoder;

    }

}
