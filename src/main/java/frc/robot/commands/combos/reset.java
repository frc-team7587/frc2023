package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class reset extends CommandBase {
    public reset() {
        
    }

    @Override
    public void execute() {
        Robot.m_pivot.resetPivot();
        Robot.m_telescope.resetTelescope();
        Robot.elevator.resetElevator();
    }

    @Override
    public void end(boolean interrupted) {
        
    }
}
