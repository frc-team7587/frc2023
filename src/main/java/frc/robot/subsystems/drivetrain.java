package frc.robot.subsystems;
import static frc.robot.Constants.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;


public class drivetrain extends SubsystemBase {

    private final CANSparkMax leftFront;
    private final CANSparkMax leftRear;
    private final CANSparkMax rightFront;
    private final CANSparkMax rightRear;

    private final RelativeEncoder leftFrontEncoder;
    private final RelativeEncoder leftRearEncoder;
    private final RelativeEncoder rightFrontEncoder;
    private final RelativeEncoder rightRearEncoder;

    private final MotorControllerGroup left;
    private final MotorControllerGroup right;

    private final DifferentialDrive drive;

    public drivetrain() {

        leftFront = new CANSparkMax(LFront, MotorType.kBrushless);
        leftRear = new CANSparkMax(LRear, MotorType.kBrushless);
        rightFront = new CANSparkMax(RFront, MotorType.kBrushless);
        rightRear = new CANSparkMax(RRear, MotorType.kBrushless);

        leftFront.setIdleMode(IdleMode.kBrake);
        leftRear.setIdleMode(IdleMode.kBrake);
        rightFront.setIdleMode(IdleMode.kBrake);
        rightRear.setIdleMode(IdleMode.kBrake);

        leftFrontEncoder = leftFront.getEncoder();
        leftRearEncoder = leftRear.getEncoder();
        rightFrontEncoder = rightFront.getEncoder();
        rightRearEncoder = rightRear.getEncoder();

        left = new MotorControllerGroup(leftFront, leftRear);
        right = new MotorControllerGroup(rightFront, rightRear);

        right.setInverted(true);

        drive = new DifferentialDrive(left, right);

    }

    public void drive(double fwd, double rot) {

        this.drive.arcadeDrive(fwd, rot);
    
    }

    public void resetEncoders() {

        leftFrontEncoder.setPosition(0);
        leftRearEncoder.setPosition(0);
        rightFrontEncoder.setPosition(0);
        rightRearEncoder.setPosition(0);

    }

    public int getLeftEncoder() {

        return (int) ((leftFrontEncoder.getPosition() + leftRearEncoder.getPosition()) / 2);

    }

    public int getRightEncoder() {

        return (int) -((rightFrontEncoder.getPosition() + rightRearEncoder.getPosition()) / 2);
    }

    public double getLeftEncoderDistance() {
        return getLeftEncoder() * distancePerPulse;
    }

    public double getRightEncoderDistance() {
        return getRightEncoder() * distancePerPulse;
    }

    public double getAverageDistance() {
        return (getLeftEncoderDistance() + getRightEncoderDistance()) / 2;
    }

    public void setMaxOutput(double output) {

        this.drive.setMaxOutput(output);

    }

    @Override
    public void periodic() {
        
    }
}
