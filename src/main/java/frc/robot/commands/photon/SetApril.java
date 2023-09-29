package frc.robot.commands.photon;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.photon;

public class setApril extends CommandBase{

    private final photon photon;
    public setApril(photon subsystem) {
        addRequirements(subsystem);
        photon = subsystem;
    }

    @Override
    public void execute() {
        photon.setApril();
    }
    
}
