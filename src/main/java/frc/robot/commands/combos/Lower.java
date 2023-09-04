package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.PivotGoTo;
import frc.robot.commands.arm.ArmOut;
import frc.robot.commands.elevator.ElevatorGoTo;
import frc.robot.Constants;

public class Lower extends SequentialCommandGroup {
    public Lower() {
      
    }
}

