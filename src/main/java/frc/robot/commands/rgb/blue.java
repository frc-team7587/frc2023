package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.rgb;

public class blue extends CommandBase{
    private final rgb rgb;
    public blue(rgb subsystem) {
        addRequirements(subsystem);
        rgb = subsystem;
    }

    @Override
    public void execute() {
        rgb.setBlue();
    }

    @Override
    public void end(boolean interrupted) {
    }
} 
