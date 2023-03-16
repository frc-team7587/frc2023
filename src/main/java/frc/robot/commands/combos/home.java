package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.elevator.elevatorGoTo;

public class home extends ParallelCommandGroup {


    public home() {
        addCommands(
            new armIn(Robot.m_arm),
            new elevatorGoTo(Robot.m_elevator, 0),
            new pivotGoTo(Robot.m_pivot, 0)
        );
    }
}

