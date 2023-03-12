package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.rgb;

public class rainbow extends CommandBase{
    private final rgb rgb;
    public rainbow(rgb subsystem) {
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
