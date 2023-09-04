package frc.robot.commands.combos;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.commands.arm.ArmIn;
import frc.robot.commands.elevator.ElevatorGoTo;
import frc.robot.commands.pivot.PivotDown;
import frc.robot.commands.pivot.PivotGoTo;
import frc.robot.commands.pivot.PivotUp;
import frc.robot.subsystems.DriveTrain;

public class AutoRotate {
    // private final pivotDown pivotDown;
    // private final pivotUp pivotUp;
    // private final pivotGoTo goTo;

    public AutoRotate() {
        new ElevatorGoTo(Robot.elevator, Constants.elevatorMid);
        new PivotGoTo(Robot.pivot, Constants.pivotMid);
        new ArmIn(Robot.arm);
    }

    private void addCommands(CommandBase parallel, ArmIn armIn) {
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
