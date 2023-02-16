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

        byte[] toSend = new byte[128];

        for(int i = 0; i<toSend.length; i++) {
            toSend[i] = 0;
        }
        
        byte[] messageBytes = message.getBytes(Charset.forName("ASCII"));
        for(int i = 0; i<messageBytes.length; i++) {
            toSend[i] = messageBytes[i];
        }

        marquee.writeString(message); //need to figure this out
    }
}
