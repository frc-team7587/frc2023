package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class rgb extends SubsystemBase {
    
    private final AddressableLED led;
    private final AddressableLEDBuffer buffer;
    private int FirstPixelHue = 0;

    public rgb(int m_port, int m_length) {
        led = new AddressableLED(m_port);
        buffer = new AddressableLEDBuffer(m_length);
        led.setLength(buffer.getLength());
        led.setData(buffer);
        led.start();
    }

    public void setBlue() {
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, 0, 0, 255);
         }
         
         led.setData(buffer);
    }

    public void setRed() {
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, 0, 0, 255);
         }
         
         led.setData(buffer);
    }

    public void setPurple() {
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, 170, 0, 255);
         }
         
         led.setData(buffer);
    }

    public void setYellow() {
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, 255, 255, 0);
         }
         
         led.setData(buffer);
    }

    public void setRainbow() {
        // For every pixel
        for (var i = 0; i < buffer.getLength(); i++) {
          // Calculate the hue - hue is easier for rainbows because the color
          // shape is a circle so only one value needs to precess
          final var hue = (FirstPixelHue + (i * 180 / buffer.getLength())) % 180;
          // Set the value
          buffer.setHSV(i, hue, 255, 128);
        }
        // Increase by to make the rainbow "move"
        FirstPixelHue += 3;
        // Check bounds
        FirstPixelHue %= 180;

        led.setData(buffer);
      }

      public void off() {
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, 0, 0, 0);
         }
         
         led.setData(buffer);
    }
}
