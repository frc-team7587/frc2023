package frc.robot.commands.elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Elevator;

public class ElevatorDown extends CommandBase {
    private final Elevator elevator;

    public ElevatorDown(Elevator subsystem) {
        addRequirements(subsystem);
        elevator = subsystem;
    }

    @Override
    public void execute() {
        elevator.elevatorDown();
    }
    @Override
    public void end(boolean interrupted) {
        elevator.elevatorStop();
    }
}
