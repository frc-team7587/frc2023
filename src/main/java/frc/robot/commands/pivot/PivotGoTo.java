package frc.robot.commands.pivot;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Robot;
import frc.robot.subsystems.pivot;

public class PivotGoTo extends PIDCommand {

private double target;

    public PivotGoTo(pivot subsystem, double target) {
        super(new PIDController(0.05, 0, 0),
        () -> subsystem.getPivot(),
        target,
        (output) -> subsystem.setPivot(output),
        subsystem);

        getController().setTolerance(3);
        this.target = target;
    }

    @Override
    public boolean isFinished() {
        return Robot.m_pivot.getPivot() >= target - 3 && Robot.m_pivot.getPivot() <= target + 3;
    }
    
}
