package frc.robot.commands.claw;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.claw;


public class clawIn extends CommandBase {
    private final claw claw;

    public clawIn(claw subsystem) {
        addRequirements(subsystem);
        claw = subsystem;
    }

    @Override
    public void execute() {
        claw.clawIn();
    }

    @Override
    public void end(boolean interrupted) {
        claw.off();
  }
}
