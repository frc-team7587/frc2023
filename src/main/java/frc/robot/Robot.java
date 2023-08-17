// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.pivot;
import frc.robot.subsystems.rgb;
import frc.robot.subsystems.intake;
import frc.robot.subsystems.arm;
import frc.robot.subsystems.drivetrain;
import frc.robot.subsystems.elevator;
import frc.robot.subsystems.marquee;
import frc.robot.subsystems.photon;
import static frc.robot.Constants.*;

import java.text.DecimalFormat;
import frc.robot.commands.intake.*;
import frc.robot.commands.arm.*;
import frc.robot.commands.auto.autonomous;
import frc.robot.commands.combos.home;
import frc.robot.commands.combos.hs;
import frc.robot.commands.combos.mid;
import frc.robot.commands.combos.reset;
import frc.robot.commands.combos.upper;
import frc.robot.commands.drivetrain.*;
import frc.robot.commands.elevator.elevatorDown;
import frc.robot.commands.elevator.elevatorUp;
import frc.robot.commands.marquee.DisplayMessage;
import frc.robot.commands.photon.*;
import frc.robot.commands.pivot.PivotDown;
import frc.robot.commands.pivot.PivotUp;
import frc.robot.commands.rgb.*;
import frc.robot.utilities.BNO055;




/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the
 * name of this class or
 * the package after creating this project, you must also update the
 * build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static final drivetrain m_drive = new drivetrain();
  public static final Joystick logi = new Joystick(0);
  public static final XboxController xbox = new XboxController(1);
  // public static final marquee m_marquee = new marquee();
  public static final arm m_arm = new arm();
  public static final elevator m_elevator = new elevator();
  public static final pivot m_pivot = new pivot();
  public static final intake m_intake = new intake();
  public static final photon photon = new photon();
// public static final auto
  // public static final rgb m_underglow = new rgb(0, 300);
  // public static final rgb m_upperLeft = new rgb(1, 144);
  // public static final rgb m_lowerLeft = new rgb(2, 144);
  // public static final rgb m_upperRight = new rgb(3, 144);
  // public static final rgb m_rightRGB = new rgb(0, 144);
  public static final rgb m_rgb = new rgb(1, 300);
  UsbCamera camera = CameraServer.startAutomaticCapture();



  // public static BNO055 imu;
  // private BNO055.CalData cal;
  // private DecimalFormat f = new DecimalFormat("+000.000;-000.000");
  // public static double[] pos = new double[3]; // [x,y,z] position data
  private autonomous auto = new autonomous();

  public final static SendableChooser<String> m_chooser = new SendableChooser<>();
  public final static SendableChooser<String> m_teamColorChooser = new SendableChooser<>();
  public static double level;

  /**
   * This function is run when the robot is first started up and should be used
   * for any
   * initialization code.*9
   */
  @Override
  public void robotInit() {
    m_chooser.setDefaultOption("Easy", "Easy");
    m_chooser.addOption("Pop and Lock", "Pop and Lock");
    m_chooser.addOption("Jackpot", "Jackpot");
    m_chooser.addOption("Set Up", "Set Up");
    m_chooser.addOption("Zoomies", "Zoomies");
    SmartDashboard.putData(m_chooser);

    m_teamColorChooser.setDefaultOption("Blue", "Blue");
    m_teamColorChooser.addOption("Red", "Red");
    // SmartDashboard.putData(m_teamC ssxxxxxxxxxxxxxxxxolorChooser);

    // imu = BNO055.getInstance(BNO055.opmode_t.OPERATION_MODE_IMUPLUS,
    //     BNO055.vector_type_t.VECTOR_EULER);
    // pos = imu.getVector();

    // if(imu.isInitialized()) {
    //   level = (imu.getVector()[1]);
    // } else {
    //   level = 58.125;
    // }

    // System.out.println("LEVEL: " + level);

    // System.out.println("Sensor present" + imu.isSensorPresent());
    // System.out.println("Initialize complete" + imu.isInitialized());
    // System.out.println("calibrated" + imu.isCalibrated());
    // Instantiate our RobotContainer. This will perform all our button bindings,
    // and put our
    // autonomous chooser on the dashboard.
    photon.isConnected();
    m_drive.resetEncoders();
    m_intake.resetIntake();
    m_pivot.resetPivot();
    m_elevator.resetElevator();
    configureButtonBindings();
    photon.setApril();

    m_drive.setDefaultCommand(new defaultDrive(m_drive));
    m_intake.setDefaultCommand(new IntakeDefault(m_intake));
    m_rgb.setDefaultCommand(new Rainbow(m_rgb));
    // m_rightRGB.setDefaultCommand(new defaultRGB(m_rightRGB));
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items
   * like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>
   * This runs after the mode specific periodic functions, but before LiveWindow
   * and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {

    // SmartDashboard.putNumber("Gyro", imu.getHeading());
    CommandScheduler.getInstance().run();
    // System.out.println("Pivot: " + m_pivot.getPivot());
    // System.out.println("Elevator: " + m_elevator.getElevator());
    // if (pos[1] > 20 && pos[1] < 120) {
      // pos = imu.getVector();
    // System.out.println("Sensor present" + imu.isSensorPresent());
    // System.out.println("Initialize complete" + imu.isInitialized());
    // System.out.println("calibrated" + imu.isCalibrated());
   
    // System.out.println("pitch: " + pos[1]);
    // photon.isConnected();
    // System.out.println(m_drive.getAverageDistance());
    // System.out.println(m_drive.getAverageDistance());
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {
    // while (isDisabled()) {
    // System.out.println("COMMS: " + imu.isSensorPresent()
    // + ", INITIALIZED: " + imu.isInitialized()
    // + ", CALIBRATED: " + imu.isCalibrated());
    // if(imu.isInitialized()){
    // pos = imu.getVector();

    // /* Display the floating point data */
 
    


    // /* Display calibration status for each sensor. */
    // cal = imu.getCalibration();
    // System.out.println("\tCALIBRATION: Sys=" + cal.sys
    // + " Gyro=" + cal.gyro + " Accel=" + cal.accel
    // + " Mag=" + cal.mag);
    // }

    // }
  }

  @Override
  public void disabledPeriodic() {
    new DefaultRGB(m_rgb);

  }

  private void configureButtonBindings() {
    new JoystickButton(xbox, Button.kY.value)
        .whileTrue(new elevatorUp(m_elevator));

    // new JoystickButton(xbox, Button.kBack.value)
    // .whileTrue(new hs());

    new JoystickButton(xbox, Button.kA.value)
        .whileTrue(new elevatorDown(m_elevator));

      new JoystickButton(xbox, Button.kLeftBumper.value)
          .onTrue(new armIn(m_arm));

    // // new JoystickButton(xbox, Button.kLeftBumper.value)
    // // .onTrue(new driveStraight(m_drive, 12.0, m_drive.getAverageDistance()));

    // new JoystickButton(xbox, Button.kLeftStick.value)
    //     .onTrue(new upper());

    // new JoystickButton(xbox, Button.kRightStick.value)
    //     .onTrue(new mid());

    // new JoystickButton(xbox, Button.kY.value)
    // .whileTrue(new pivotUp(m_pivot));
    new JoystickButton(xbox, Button.kRightBumper.value)
        .onTrue(new armOut(m_arm));

    new JoystickButton(xbox, Button.kB.value)
        .whileTrue(new PivotDown(m_pivot));

    new JoystickButton(xbox, Button.kX.value)
      .whileTrue(new PivotUp(m_pivot));

    
    // new JoystickButton(xbox, Button.kX.value)
    // .onTrue(new driveStraight(m_drive, 12.0, m_drive.getAverageDistance()));

    // new JoystickButton(xbox, Button.kA.value)
    // .onTrue(new telescopeGoTo(m_arm, 0));

    // new JoystickButton(logi, 2)
    //   .onTrue(new driveStraight(m_drive, 50, Robot.m_drive.getAverageDistance()));

    // new JoystickButton(xbox, Button.kStart.value)
    //     .onTrue(new home());
    // new JoystickButton(xbox, Button.kBack.value)
    // .onTrue(new driveTrackApril(m_drive));

    // new JoystickButton(logi, 7)
    // .toggleOnTrue(new displayMessage(m_marquee));

    new JoystickButton(logi, 5)
    .whileTrue(new Yellow(m_rgb));

    // new JoystickButton(logi, 1)
    //   .onTrue(new driveTrackApril(m_drive));

    new JoystickButton(logi, 2)
    .whileTrue(new Rainbow(m_rgb));

    new JoystickButton(logi, 3)
      .whileTrue(new Purple(m_rgb));

    // new JoystickButton(logi, 4)
    //   .onTrue(new setApril(photon));

    // new JoystickButton(logi, 6)
    //   .onTrue(new setReflective(photon));
    // new JoystickButton(logi, 5)
    // .whileTrue(Commands.parallel(new rainbow(m_leftRGB), new
    // rainbow(m_rightRGB)));

    // new JoystickButton(logi, 1)
    // .whileTrue(new yellow(m_rightRGB));

    // new JoystickButton(logi, 2)
    // .whileTrue(new purple(m_rightRGB));

    // new JoystickButton(logi, 5)
    // .whileTrue(new rainbow(m_rightRGB));
    // home
    // new JoystickButton(xbox, Button.kBack.value)
    // .onTrue(new home());
    // //mid rung - left joystick
    // new JoystickButton(xbox, 9)
    // .onTrue(new mid());
    // //high rung - right joystick
    // new JoystickButton(xbox, 10)
    // .onTrue(new upper());

    // new JoystickButton(logi, 3)
    // .onTrue(new driveStraight(m_drive, 100, m_drive.getAverageDistance()));
    // new JoystickButton(xbox, Button.kY.value)
    // .onTrue(new clawIn(m_claw));

    // new JoystickButton(xbox, Button.kX.value)
    // .onTrue(new clawOut(m_claw));

  }


  /**
   * This autonomous runs the autonomous command selected by your
   * {@link RobotContainer} class.
   */
  @Override
  public void autonomousInit() {

    if (auto.getCommand() != null) {
    auto.getCommand().schedule();

    }
    // new mid().andThen(new driveStraight(Robot.m_drive, -55, Robot.m_drive.getAverageDistance()));
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (auto.getCommand() != null) {
      auto.getCommand().cancel();
    }
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
  }

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {
  }

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {
  }

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {
  }
}