package frc.robot.subsystems;
import static frc.robot.Constants.*;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class claw extends SubsystemBase{
    
    private final Compressor compressor;
    private final DoubleSolenoid solenoid;

    public claw() {

        compressor = new Compressor(pcm, PneumaticsModuleType.CTREPCM);
        solenoid = new DoubleSolenoid(pcm, PneumaticsModuleType.CTREPCM, solenoid1, solenoid2);

        compressor.enableDigital();
    }

    public void clawIn() {
        solenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void clawOut() {
        solenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void off() {
        solenoid.set(DoubleSolenoid.Value.kOff);
    }

    public double getPressure() {
        return compressor.getPressure();
    }

    @Override
    public void periodic() {

    }

}
