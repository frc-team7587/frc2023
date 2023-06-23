package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.RGB;

public class yellow extends CommandBase{
    private final RGB rgb;
    public yellow(RGB subsystem) {
        addRequirements(subsystem);
        rgb = subsystem;
    }

    @Override
    public void execute() {
        rgb.setYellow();
    }

    @Override
    public void end(boolean interrupted) {
        
    }
} 
