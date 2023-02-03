package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.arm;

public class telescopeOut extends CommandBase {
    
    private final arm arm;

    public telescopeOut(arm subsystem) {
        addRequirements(subsystem);
        arm = subsystem;
    }

    @Override
    public void execute() {
        arm.telescopeOut();
    }

    @Override
    public void end(boolean interrupted) {
        arm.telescopeStop();
    }
}
