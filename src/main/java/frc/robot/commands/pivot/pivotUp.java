package frc.robot.commands.pivot;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.pivot;

public class PivotUp extends CommandBase {
    
    private final pivot arm;

    public PivotUp(pivot subsystem) {
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
