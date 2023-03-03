package frc.robot.commands.auto;
import frc.robot.Robot;

import edu.wpi.first.wpilibj2.command.Command;

public class autonomous {
    String choice;
    public autonomous(){
    }
    public Command getCommand() {
        Command cmd = null;
        switch(Robot.m_chooser.getSelected()) {
            case "Easy":
            new easy();

            case "Pop and Lock":
            new popAndLock();

            case "Jackpot":
            new jackpot();

            case "Set Up":
            new setUp();

            case "Zoomies":
            new zoomies();

            break;
        }
        return cmd;
    }
}
