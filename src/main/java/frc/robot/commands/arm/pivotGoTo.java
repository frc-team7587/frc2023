package frc.robot.commands.arm;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.arm;

public class pivotGoTo extends PIDCommand {

    public pivotGoTo(arm subsystem, double target) {
        super(new PIDController(0.01, 0, 0),
        () -> subsystem.getPivot(),
        target,
        (output) -> subsystem.setPivot(output),
        subsystem);

        getController().setTolerance(1);

    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint();
    }
    
}
