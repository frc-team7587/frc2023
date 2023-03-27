package frc.robot.commands.combos;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.elevator.elevatorGoTo;
import frc.robot.commands.pivot.pivotDown;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.pivot.pivotUp;
import frc.robot.subsystems.drivetrain;

public class autoRot {
    
    // private final pivotDown m_pivotDown;
    // private final pivotUp m_pivotUp;
    // private final pivotGoTo m_goTo;


    public autoRot() {
      
            new elevatorGoTo(Robot.m_elevator, Constants.elevatorMid);
            new pivotGoTo(Robot.m_pivot, Constants.pivotMid);
            new armIn(Robot.m_arm);
        
    }

    private void addCommands(CommandBase parallel, armIn armIn) {
    }

    // @Override
    // public void initialize() {
        
    // }

    // @Override
    // public boolean isFinished() {
    //     return Robot.m_drive.getAverageDistance() >= target - 2 &&  Robot.m_drive.getAverageDistance() <= target + 2;
    // }

    // @Override
    // public void end(boolean interrupted) {
    //     System.out.println("end");
    // }
}
