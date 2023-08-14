package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Arm;


public class ArmIn extends CommandBase {
    private final Arm arm;

    public ArmIn(Arm subsystem) {
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
