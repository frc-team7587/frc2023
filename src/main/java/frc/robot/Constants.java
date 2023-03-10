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
    public static final int telescopePort = 8;


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
    public static final double telescopeMid = -42.2;
    public static final double pivotMid = 48.4;
    public static final double elevatorMid = 0;

    //cone high rung
    public static final double telescopeUpper = -64;
    public static final double pivotUpper = 91.5;
    public static final double elevatorUpper = -24.7;

    //drivetrain encoder calculations
    public static final double wheelDiameter = 0.03; //meters
    public static final double wheelCircumference = wheelDiameter * Math.PI;
    public static final double encoderCountsPerRev = 42; //Neo Hall Sensor
    public static final double rotationsPerEncoderCount = 1 / encoderCountsPerRev;
    public static final double driveGearBoxFactor = 12.75; //toughbox
    public static final double axelToMotor = 1 / driveGearBoxFactor;
    public static final double metersPerPulse = wheelCircumference * rotationsPerEncoderCount * axelToMotor;

    //motor speeds
    public static final double telescopeSpeedIn = 0.2;
    public static final double telescopeSpeedOut = -0.2;
    public static final double telescopeSpeedStop = 0;

    public static final double pivotSpeedUp = -0.5;
    public static final double pivotSpeedDown = 0.3;
    public static final double elevatorUp = -0.2;
    public static final double elevatorDown = 0.1;
    ;



}
