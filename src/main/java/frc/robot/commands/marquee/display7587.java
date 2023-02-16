package frc.robot.commands.marquee;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.marquee;

public class display7587 extends CommandBase {
    
    private final marquee marquee;

    public display7587 (marquee subsystem) {
        addRequirements(subsystem);
        marquee = subsystem;
    }

    @Override
    public void execute() {
        marquee.displayMessage(" 7587|5|0|0|63|0|0|0|0|0\r\n");
    }

    @Override
    public void end(boolean interrupted) {
    }
}
