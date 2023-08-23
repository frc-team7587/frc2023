package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.ArmIn;
import frc.robot.commands.arm.ArmOut;
import frc.robot.commands.elevator.ElevatorGoTo;
import frc.robot.Constants;

public class Mid extends SequentialCommandGroup {
    public Mid() {
        addCommands(
            Commands.parallel(new ElevatorGoTo(Robot.elevator, Constants.elevatorMid),
            new pivotGoTo(Robot.pivot, Constants.pivotMid))
            // new armIn(Robot.m_arm)
        );
        // super(
        //     Commands.parallel( new elevatorGoTo(Robot.m_elevator, Constants.elevatorMid),
        //     new pivotGoTo(Robot.m_pivot, Constants.pivotMid))
        //     // new armIn(Robot.m_arm).withTimeout(2.0)
        // );
    }

}

