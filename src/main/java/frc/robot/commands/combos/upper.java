package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.elevator.elevatorGoTo;
import frc.robot.Constants;

public class upper extends ParallelCommandGroup {


    public upper() {
        addCommands(
            new elevatorGoTo(Robot.m_elevator, Constants.elevatorUpper),
            new pivotGoTo(Robot.m_pivot, Constants.pivotUpper),
            new armOut(Robot.m_arm)
        );
    }
}

