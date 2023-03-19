package frc.robot.commands.marquee;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.marquee;

public class displayMessage extends CommandBase {
    private final marquee marquee;
    private final String message;

    public displayMessage(marquee subsystem, String msg) {
        addRequirements(subsystem);
        marquee = subsystem;
        message = msg;
    }

    @Override
    public void execute() {
        marquee.displayMessage(message);
    }

    @Override
    public void end(boolean interrupted) {
    }
}
