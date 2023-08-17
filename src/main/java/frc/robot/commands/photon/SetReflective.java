package frc.robot.commands.photon;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.photon;

public class SetReflective extends CommandBase{

    private final photon photon;
    public SetReflective(photon subsystem) {
        addRequirements(subsystem);
        photon = subsystem;
    }

    @Override
    public void execute() {
        photon.setReflective();
    }
    
}
