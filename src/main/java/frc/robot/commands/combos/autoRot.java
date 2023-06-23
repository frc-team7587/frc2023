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
import frc.robot.subsystems.DriveTrain;

public class autoRot {
    // private final pivotDown pivotDown;
    // private final pivotUp pivotUp;
    // private final pivotGoTo goTo;


    public autoRot() {
        new elevatorGoTo(Robot.elevator, Constants.elevatorMid);
        new pivotGoTo(Robot.pivot, Constants.pivotMid);
        new armIn(Robot.arm);
    }

    private void addCommands(CommandBase parallel, armIn armIn) {
    }

    // @Override
    // public void initialize() {
        
    // }

    // @Override
    // public boolean isFinished() {
    //     return Robot.drive.getAverageDistance() >= target - 2 &&  Robot.drive.getAverageDistance() <= target + 2;
    // }

    // @Override
    // public void end(boolean interrupted) {
    //     System.out.println("end");
    // }
}
