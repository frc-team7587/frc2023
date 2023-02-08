package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class marquee extends SubsystemBase{
    SPI marquee;

    public marquee() {

        marquee = new SPI(Port.kOnboardCS0);

    }

    public void displayTeamNumber() {
        marquee.write(byte[] " 7587|5|0|0|63|0|0|0|0|0\r\n", 28); //need to figure this out
    }
}
