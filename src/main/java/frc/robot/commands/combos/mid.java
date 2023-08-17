package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.PivotGoTo;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.elevator.elevatorGoTo;
import frc.robot.Constants;

public class mid extends SequentialCommandGroup {


    public mid() {
        addCommands(
            Commands.parallel(new elevatorGoTo(Robot.m_elevator, Constants.elevatorMid),
            new PivotGoTo(Robot.m_pivot, Constants.pivotMid))
            // new armIn(Robot.m_arm)
        );
        // super(
        //     Commands.parallel( new elevatorGoTo(Robot.m_elevator, Constants.elevatorMid),
        //     new pivotGoTo(Robot.m_pivot, Constants.pivotMid))
        //     // new armIn(Robot.m_arm).withTimeout(2.0)
        // );
    }

}

