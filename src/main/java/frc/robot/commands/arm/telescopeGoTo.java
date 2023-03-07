package frc.robot.commands.arm;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.telescope;

public class telescopeGoTo extends PIDCommand {

    public telescopeGoTo(telescope subsystem, double target) {
        super(new PIDController(0.3, 0, 0),
        () -> subsystem.getTelescope(),
        target,
        (output) -> subsystem.setTelescope(output),
        subsystem);

        getController().setTolerance(1);

    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint();
    }
    
}
