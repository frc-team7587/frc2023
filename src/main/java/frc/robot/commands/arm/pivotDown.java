package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.arm;

public class pivotDown extends CommandBase {
    
    private final arm arm;

    public pivotDown(arm subsystem) {
        addRequirements(subsystem);
        arm = subsystem;
    }

    @Override
    public void execute() {
        arm.pivotDown();
    }

    @Override
    public void end(boolean interrupted) {
        arm.pivotStop();
    }
}
