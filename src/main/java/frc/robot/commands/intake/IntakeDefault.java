package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;
import frc.robot.subsystems.intake;
import static frc.robot.Constants.*;

public class IntakeDefault extends CommandBase{

    private final intake intake;
    
    public IntakeDefault(intake subsystem) {
        addRequirements(subsystem);
        intake = subsystem;
    }

    @Override
    public void execute() {
        intake.setIntake(intakeMultiplier * (Robot.xbox.getLeftTriggerAxis() - Robot.xbox.getRightTriggerAxis()));
    }

    @Override
    public void end(boolean interrupted) {
        intake.intakeStop();
    }
}
