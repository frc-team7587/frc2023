package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeOut extends CommandBase {
    private final Intake intake;

    public IntakeOut(Intake subsystem) {
        addRequirements(subsystem);
        intake = subsystem;
    }

    @Override
    public void execute() {
        intake.intakeOut();
    }

    @Override
    public void end(boolean interrupted) {
        intake.intakeStop();
    }
}
