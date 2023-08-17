package frc.robot.commands.marquee;
import edu.wpi.first.wpilibj2.command.CommandBase;
import static frc.robot.Constants.*;
import frc.robot.subsystems.marquee;

public class displayMessage extends CommandBase {
    private final marquee marquee;
    private int index = 0;
    public displayMessage(marquee subsystem) {
        addRequirements(subsystem);
        marquee = subsystem;

    }

    @Override
    public void execute() {
        marquee.displayMessage(messages[index]);
        index++;
        if (index >= messages.length) {
            index = 0;
        }
    }

    @Override
    public void end(boolean interrupted) {
    }
}
