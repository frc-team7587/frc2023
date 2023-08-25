package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RGB;

public class Blue extends CommandBase {
    private final RGB rgb;

    public Blue(RGB subsystem) {
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
