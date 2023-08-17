package frc.robot.commands.photon;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.photon;

public class SetApril extends CommandBase{

    private final photon photon;
    public SetApril(photon subsystem) {
        addRequirements(subsystem);
        photon = subsystem;
    }

    @Override
    public void execute() {
        photon.setApril();
    }
    
}
