package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.rgb;

public class Red extends CommandBase{
    private final rgb rgb;
    public Red(rgb subsystem) {
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
