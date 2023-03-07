package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.telescope;

public class telescopeOut extends CommandBase {
    
    private final telescope telescope;

    public telescopeOut(telescope subsystem) {
        addRequirements(subsystem);
        telescope = subsystem;
    }

    @Override
    public void execute() {
        telescope.telescopeOut();
    }

    @Override
    public void end(boolean interrupted) {
        telescope.telescopeStop();
    }
}
