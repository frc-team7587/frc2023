package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.RGB;

public class Red extends CommandBase{
    private final RGB rgb;
    public Red(RGB subsystem) {
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