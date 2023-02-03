package frc.robot.commands.elevator;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.elevator;

public class elevatorGoTo extends PIDCommand {

    public elevatorGoTo(elevator subsystem, double target) {
        super(new PIDController(0.01, 0, 0),
        () -> subsystem.getElevator(),
        target,
        (output) -> subsystem.setElevator(output),
        subsystem);

        getController().setTolerance(1);

    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint();
    }
    
}
