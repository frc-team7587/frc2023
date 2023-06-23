package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.RGB;

public class rainbow extends CommandBase {
    private final RGB rgb;

    public rainbow(RGB subsystem) {
        addRequirements(subsystem);
        rgb = subsystem;
    }

    @Override
    public void execute() {
        rgb.setRainbow();

    }

    @Override
    public void end(boolean interrupted) {

    }
}