package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.elevator.elevatorGoTo;

public class home extends SequentialCommandGroup {
    public home() {
        addCommands(
            new armIn(Robot.arm).withTimeout(0.5),
            Commands.parallel(new pivotGoTo(Robot.pivot, 0),
            new elevatorGoTo(Robot.elevator, 0))
        );
    }
}

