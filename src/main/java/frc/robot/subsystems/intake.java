package frc.robot.subsystems;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Intake extends SubsystemBase {

    private final CANSparkMax intake;

    private final RelativeEncoder intakeEncoder;

    public Intake() {

        intake = new CANSparkMax(intakePort, MotorType.kBrushless);

        intake.setIdleMode(IdleMode.kBrake);

        intakeEncoder = intake.getEncoder();

    }

    public void intakeIn() {
        intake.set(intakeSpeedIn);
    }

    public void intakeOut() {
        intake.set(intakeSpeedOut);
    }

    public void intakeStop() {
        intake.set(intakeSpeedStop);
    }

    public void setIntake(double speed) {
        intake.set(speed);
    }

    public double getIntake() {
        return intakeEncoder.getPosition();
    }

    public void resetIntake() {
        intakeEncoder.setPosition(0);
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("Intake", getIntake());
    }
}
