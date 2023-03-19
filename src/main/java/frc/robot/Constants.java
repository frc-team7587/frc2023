// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //CAN ports
    public static final int pcm = 0;
    public static final int RFront = 1;
    public static final int RRear = 2;
    public static final int LFront = 3;
    public static final int LRear = 4;
    public static final int elevatorPort1 = 5;
    public static final int elevatorPort2 = 6;
    public static final int pivotPort = 7;
    public static final int intakePort = 8;


    //solenoid ports
    public static final int solenoid1 = 0;
    public static final int solenoid2 = 1;

    //spi ports
    public static final int gyroPort = 0;

    //photon
    public static final String cameraName = "OV5647";
    public static final double CAMERA_PITCH_RADIANS = 0;
    public static final double CAMERA_HEIGHT_METERS = 1;
    public static final double TARGET_HEIGHT_METERS = 1;
    public static final int aprilPipeline = 0;
    public static final int reflectivePipeline = 1;

    //targets
    public static final double telescopeMax = -68; //the very end of the telescope
    public static final double pivotTargetMax = 5;
    public static final double elevatorMax = -24.8;

    //cone low rung
    public static final double telescopeLower = -21.5;
    public static final double pivotLower = 186.1;
    public static final double elevatorLower = -21.5;

    //cone middle rung
    public static final double pivotMid = 73;
    public static final double elevatorMid = -10;

    //cone high rung
    public static final double pivotUpper = 85;
    public static final double elevatorUpper = -24;

    //drivetrain encoder calculations
    public static final double wheelDiameter = 0.03; //meters
    public static final double wheelCircumference = wheelDiameter * Math.PI;
    public static final double encoderCountsPerRev = 42; //Neo Hall Sensor
    public static final double rotationsPerEncoderCount = 1 / encoderCountsPerRev;
    public static final double driveGearBoxFactor = 12.75; //toughbox
    public static final double axelToMotor = 1 / driveGearBoxFactor;
    public static final double metersPerPulse = wheelCircumference * rotationsPerEncoderCount * axelToMotor;

    //motor speeds
    public static final double intakeSpeedIn = 0.2;
    public static final double intakeSpeedOut = -0.2;
    public static final double intakeSpeedStop = 0;
    public static final double intakeMultiplier = 0.2;

    public static final double pivotSpeedUp = -0.5;
    public static final double pivotSpeedDown = 0.3;
    public static final double elevatorUp = -0.2;
    public static final double elevatorDown = 0.1;
    
    // Marquee Commands

    // Scrolling "Metuchen Momentum" in medium blue on a black background with default delay values.
    public static final String team_message_blue = "Metuchen Momentum Team 7587|6|0|0|0|0|127|0|0|0\r\n";

    // Scrolling "Metuchen Momentum" in medium red on a black background with default delay values.
    public static final String team_message_red = "Metuchen Momentum Team 7587|6|0|0|127|0|0|0|0|0\r\n";

    // Scrolling "Thank you, Robbinsville Robotics" in medium yellow with two second
    // initial delay and 250 millisecond inter-frame delay.
    public static final String thank_you_message = "Thank you, Robbinsville Robitics|6|2000|250|63|63|0|0|0|0\r\n";
}
