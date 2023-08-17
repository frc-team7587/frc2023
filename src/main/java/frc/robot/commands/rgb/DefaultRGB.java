package frc.robot.commands.rgb;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.rgb;
import frc.robot.Robot;

public class DefaultRGB extends CommandBase{
    
    private final rgb rgb;

    public DefaultRGB(rgb subsystem) {
        addRequirements(subsystem);
        rgb = subsystem;
    }

    @Override
    public void execute() {
        // if (Robot.m_teamColorChooser.getSelected() == "Blue") {
        //     rgb.setBlue();
        // } else if (Robot.m_teamColorChooser.getSelected() == "Red") {
        //     rgb.setRed();
        // }
        rgb.setRed();
    }
}
