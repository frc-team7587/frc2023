package frc.robot.commands.photon;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Photon;

public class setReflective extends CommandBase{
    private final Photon photon;

    public setReflective(Photon subsystem) {
        addRequirements(subsystem);
        photon = subsystem;
    }

    @Override
    public void execute() {
        photon.setReflective();
    }
}