package frc.robot.commands.elevator;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Robot;
import frc.robot.subsystems.Elevator;

public class elevatorGoTo extends PIDCommand {
    private double target;

    public elevatorGoTo(Elevator subsystem, double target) {
        super(new PIDController(0.04, 0, 0),
        () -> subsystem.getElevator(),
        target,
        (output) -> subsystem.setElevator(output),
        subsystem);

        getController().setTolerance(1);
        this.target = target;
    }

    @Override
    public boolean isFinished() {
        return Robot.elevator.getElevator() >= target - 3 && Robot.elevator.getElevator() <= target + 3;
    }
    
}
