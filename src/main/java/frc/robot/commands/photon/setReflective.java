package frc.robot.commands.photon;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Photon;

public class SetReflective extends CommandBase{
    private final Photon photon;

    public SetReflective(Photon subsystem) {
        addRequirements(subsystem);
        photon = subsystem;
    }

    @Override
    public void execute() {
        photon.setReflective();
    }
}