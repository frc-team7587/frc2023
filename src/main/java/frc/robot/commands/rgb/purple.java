package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.RGB;

public class purple extends CommandBase{
    private final RGB rgb;
    public purple(RGB subsystem) {
        addRequirements(subsystem);
        rgb = subsystem;
    }

    @Override
    public void execute() {
        rgb.setPurple();
    }

    @Override
    public void end(boolean interrupted) {
    }
} 
