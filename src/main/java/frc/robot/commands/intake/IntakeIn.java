package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake;

public class IntakeIn extends CommandBase {
    
    private final intake intake;
    
    public IntakeIn(intake subsystem) {
        addRequirements(subsystem);
        intake = subsystem;
    }

    @Override
    public void execute() {
        intake.intakeIn();
    }

    @Override
    public void end(boolean interrupted) {
        intake.intakeStop();
    }
}
