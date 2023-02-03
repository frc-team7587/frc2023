package frc.robot.commands.claw;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.claw;


public class clawOut extends CommandBase {
    private final claw claw;

    public clawOut(claw subsystem) {
        addRequirements(subsystem);
        claw = subsystem;
    }

    @Override
    public void execute() {
        claw.clawOut();
    }

    @Override
    public void end(boolean interrupted) {
        claw.off();
  }
}
