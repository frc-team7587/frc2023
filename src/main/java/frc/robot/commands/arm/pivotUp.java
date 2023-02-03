package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.arm;

public class pivotUp extends CommandBase {
    
    private final arm arm;

    public pivotUp(arm subsystem) {
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
