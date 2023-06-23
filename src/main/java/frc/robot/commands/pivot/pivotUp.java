package frc.robot.commands.pivot;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pivot;

public class pivotUp extends CommandBase {
    private final Pivot arm;

    public pivotUp(Pivot subsystem) {
        addRequirements(subsystem);
        arm = subsystem;
    }

    @Override
    public void execute() {
        arm.pivotUp();
    }

    @Override
    public void end(boolean interrupted) {
        arm.pivotStop();
    }
}
