package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.ArmIn;
import frc.robot.commands.elevator.ElevatorGoTo;

public class Home extends SequentialCommandGroup {
    public Home() {
        addCommands(
            new ArmIn(Robot.arm).withTimeout(0.5),
            Commands.parallel(new pivotGoTo(Robot.pivot, 0),
            new ElevatorGoTo(Robot.elevator, 0))
        );
    }
}

