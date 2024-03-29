package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class Reset extends CommandBase {
    public Reset() {
        
    }

    @Override
    public void execute() {
        Robot.pivot.resetPivot();
        Robot.intake.resetIntake();
        Robot.elevator.resetElevator();
    }

    @Override
    public void end(boolean interrupted) {
        
    }
}
