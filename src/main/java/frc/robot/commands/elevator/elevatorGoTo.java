package frc.robot.commands.elevator;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Robot;
import frc.robot.subsystems.elevator;

public class elevatorGoTo extends PIDCommand {

    private double target;

    public elevatorGoTo(elevator subsystem, double target) {
        super(new PIDController(0.03, 0, 0),
        () -> subsystem.getElevator(),
        target,
        (output) -> subsystem.setElevator(output),
        subsystem);

        getController().setTolerance(2);
        this.target = target;
    }

    @Override
    public boolean isFinished() {
        return Robot.m_elevator.getElevator() >= target - 3 && Robot.m_elevator.getElevator() <= target + 3;
    }
    
}
