package frc.robot.commands.intake;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.intake;

public class intakeGoTo extends PIDCommand {

    public intakeGoTo(intake subsystem, double target) {
        super(new PIDController(0.3, 0, 0),
        () -> subsystem.getIntake(),
        target,
        (output) -> subsystem.setIntake(output),
        subsystem);

        getController().setTolerance(1);

    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint();
    }
    
}
