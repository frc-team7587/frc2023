package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.elevator.ElevatorGoTo;
import frc.robot.Constants;

public class Upper extends SequentialCommandGroup {
    public Upper() {
        addCommands(
            Commands.parallel(new ElevatorGoTo(Robot.elevator, Constants.elevatorUpper),
            new pivotGoTo(Robot.pivot, Constants.pivotUpper)),
            new armOut(Robot.arm)
        );
    }
}

