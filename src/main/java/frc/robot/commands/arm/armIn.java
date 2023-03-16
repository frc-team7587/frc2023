package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.arm;


public class armIn extends CommandBase {
    private final arm arm;

    public armIn(arm subsystem) {
        addRequirements(subsystem);
        arm = subsystem;
    }

    @Override
    public void execute() {
        arm.armIn();
    }

    @Override
    public void end(boolean interrupted) {
        arm.off();
  }
}