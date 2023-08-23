package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.RGB;

public class red extends CommandBase{
    private final RGB rgb;
    public red(RGB subsystem) {
        addRequirements(subsystem);
        rgb = subsystem;
    }

    @Override
    public void execute() {
        rgb.setRed();
    }

    @Override
    public void end(boolean interrupted) {
        
    }
}