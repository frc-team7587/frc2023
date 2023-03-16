package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.elevator.elevatorGoTo;
import frc.robot.Constants;

public class lower extends ParallelCommandGroup {

    public lower() {
        addCommands(
            new elevatorGoTo(Robot.m_elevator, Constants.elevatorLower),
            new pivotGoTo(Robot.m_pivot, Constants.pivotLower),
            new armOut(Robot.m_arm)
        );
    }
}

