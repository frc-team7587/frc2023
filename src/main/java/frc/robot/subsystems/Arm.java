package frc.robot.subsystems;
import static frc.robot.Constants.*;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class arm extends SubsystemBase{
    
    private final Compressor compressor;
    private final DoubleSolenoid solenoid;

    public arm() {
        compressor = new Compressor(pcm, PneumaticsModuleType.REVPH);
        solenoid = new DoubleSolenoid(pcm, PneumaticsModuleType.REVPH, solenoid1, solenoid2);

        // compressor.enableAnalog(60, 120);
      compressor.enableDigital();;
        
        double getPressureSwitch = compressor.getPressure();

    }

    public void armIn() {
        solenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void armOut() {
        solenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void off() {
        solenoid.set(DoubleSolenoid.Value.kOff);
    }

    public double getPressure() {
        return compressor.getPressure();
    }

    @Override
    public void periodic() {    
        // if (getPressure() > 120) {
        //     compressor.disable();
        // } else {
        //     compressor.enableDigital();
        // }
    }

}
