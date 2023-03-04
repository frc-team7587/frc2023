package frc.robot.commands.auto;
import frc.robot.Robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class autonomous {
    String choice;
    public autonomous(){
    }
    public Command getCommand() {
        CommandBase cmd = null;
        switch(Robot.m_chooser.getSelected()) {
            case "Easy":
            cmd = new easy();

            case "Pop and Lock":
            cmd = new popAndLock();

            case "Jackpot":
            cmd = new jackpot();

            case "Set Up":
            cmd = new setUp();

            case "Zoomies":
            cmd = new zoomies();

            break;
        }
        return cmd;
    }
}
