// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.LimeLight;
import frc.robot.subsystems.arm;
import frc.robot.subsystems.claw;
import frc.robot.subsystems.drivetrain;
import frc.robot.subsystems.elevator;
import static frc.robot.Constants.*;

import java.text.DecimalFormat;

import frc.robot.commands.drivetrain.*;
import frc.robot.utilities.BNO055;



/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  // public static final drivetrain m_drive = new drivetrain();
  // public static final AnalogGyro gyro = new AnalogGyro(gyroPort);
  public static final Joystick logi = new Joystick(0);
  // public static final LimeLight limelight = new LimeLight();
  // public static final arm m_arm = new arm();
  // public static final claw m_claw = new claw();
  // public static final elevator m_elevator = new elevator();
  public static BNO055 imu;
  private BNO055.CalData cal;
  private DecimalFormat f = new DecimalFormat("+000.000;-000.000");
  private double[] pos = new double[3]; // [x,y,z] position data




  private Command autonomousCommand;
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.
    imu = BNO055.getInstance(BNO055.opmode_t.OPERATION_MODE_IMUPLUS,
				BNO055.vector_type_t.VECTOR_EULER);
      
    System.out.println("Sensor present" + imu.isSensorPresent());
    System.out.println("Initialize complete" + imu.isInitialized());
    System.out.println("calibrated" + imu.isCalibrated());


    // gyro.calibrate();
    // gyro.reset();

    // m_drive.resetEncoders();

    configureButtonBindings();

    // m_drive.setDefaultCommand(new defaultDrive(m_drive));

  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {
    while (isDisabled()) {
			System.out.println("COMMS: " + imu.isSensorPresent()
					+ ", INITIALIZED: " + imu.isInitialized()
					+ ", CALIBRATED: " + imu.isCalibrated());
			if(imu.isInitialized()){
				pos = imu.getVector();
	
				/* Display the floating point data */
				System.out.println("\tX: " + f.format(pos[0])
						+ " Y: " + f.format(pos[1]) + " Z: " + f.format(pos[2])
						+ "  H: " + imu.getHeading());
	
				/* Display calibration status for each sensor. */
				cal = imu.getCalibration();
				System.out.println("\tCALIBRATION: Sys=" + cal.sys
						+ " Gyro=" + cal.gyro + " Accel=" + cal.accel
						+ " Mag=" + cal.mag);
			}

    }
  }

  @Override
  public void disabledPeriodic() {}

  private void configureButtonBindings() {

  }

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {

    // schedule the autonomous command (example)
    if (autonomousCommand != null) {
      autonomousCommand.schedule();
    }
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (autonomousCommand != null) {
      autonomousCommand.cancel();
    }
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {}

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}
}
