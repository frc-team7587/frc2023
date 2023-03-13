package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.arm.pivotGoTo;
import frc.robot.commands.arm.telescopeGoTo;
import frc.robot.commands.elevator.elevatorGoTo;

public class home extends ParallelCommandGroup {


    public home() {
        addCommands(
            new elevatorGoTo(Robot.m_elevator, 0),
            new telescopeGoTo(Robot.m_telescope, 0),
            new pivotGoTo(Robot.m_pivot, 0)
        );
    }
}

