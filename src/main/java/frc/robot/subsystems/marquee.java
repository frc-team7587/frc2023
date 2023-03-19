package frc.robot.subsystems;

import java.nio.charset.Charset;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class marquee extends SubsystemBase{
    SerialPort marquee;

    public marquee() {
        marquee = new SerialPort(115200, SerialPort.Port.kUSB1, 8, SerialPort.Parity.kNone, SerialPort.StopBits.kOne);
    }

    public void displayMessage(String message) {
        marquee.writeString(message); 
    }
}
