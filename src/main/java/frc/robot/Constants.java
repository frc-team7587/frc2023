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
    public static final int pcm = 10;
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
    public static final double pivotUpper = 60;
    public static final double elevatorUpper = -27;

    //human station
    public static final double pivotHs = 85;
    //drivetrain encoder calculations
    public static final double wheelDiameter = 6; //inches
    public static final double wheelCircumference = wheelDiameter * Math.PI;
    public static final double encoderCountsPerRev = 42; //Neo Hall Sensor
    public static final double rotationsPerEncoderCount = 1 / encoderCountsPerRev;
    public static final double driveGearBoxFactor = 12.75; //toughbox
    public static final double axelToMotor = 1 / driveGearBoxFactor;
    // public static final double metersPerPulse = wheelCircumference * rotationsPerEncoderCount * axelToMotor;
    public static final double inchesPerPulse = wheelCircumference * axelToMotor;

    //motor speeds
    public static final double intakeSpeedIn = 0.05;
    public static final double intakeSpeedOut = -0.2;
    public static final double intakeSpeedStop = 0;
    public static final double intakeMultiplier = 0.6;

    public static final double pivotSpeedUp = -0.8;
    public static final double pivotSpeedDown = 0.6;
    public static final double elevatorUp = -0.2;
    public static final double elevatorDown = 0.1;
    

    // Marquee Commands
    // Scrolling commands: use later
    // public static final String team_message_blue = "Metuchen Momentum Team 7587|6|0|0|0|0|127|0|0|0\r\n";
    // public static final String team_message_red = "Metuchen Momentum Team 7587|6|0|0|127|0|0|0|0|0\r\n";
    // public static final String thank_you_message = "Thank you|6|2000|250|63|63|0|0|0|0\r\n";
    // Commands
    public static final String BLUE_TEAM = "7587|5|0|0|0|0|127|0|0|0\r\n";
    public static final String BLUE_7587 = "7587|5|0|0|0|0|127|0|0|0\r\n";
    public static final String RED_TEAM = "7587|5|0|0|127|0|0|0|0|0\r\n";
    public static final String RED_7587 = "7587|5|0|0|127|0|0|0|0|0\r\n";
    
    // NOKIA BELL LABS, EXXON MOBIL, COLE SOLUTIONS, ELKS LODGE, ADP, JSTAR RESEARCH, PICATINNY STEM
    public static final String THANK_YOU_1 = "THANK|5|0|0|63|63|0|0|0|0\r\n";
    public static final String THANK_YOU_2 = " YOU|5|0|0|63|63|0|0|0|0\r\n";
    public static final String THANK_YOU_3 = " FOR|5|0|0|63|63|0|0|0|0\r\n";
    public static final String THANK_YOU_4 = " OUR|5|0|0|63|63|0|0|0|0\r\n";
    public static final String SPONSORS_1 = "SPON|5|0|0|127|127|127|0|0|0\r\n";
    public static final String SPONSORS_2 = "SORS|5|0|0|127|127|127|0|0|0\r\n";
    public static final String NOKIA_1 = "NOKIA|5|0|0|0|0|127|0|0|0\r\n";
    public static final String NOKIA_2 = "BELL|5|0|0|0|0|127|0|0|0\r\n";
    public static final String NOKIA_3 = "LABS|5|0|0|0|0|127|0|0|0\r\n";
    public static final String EXXON_1 = "EXXON|5|0|0|127|0|0|0|0|0\r\n";
    public static final String EXXON_2 = "MOBIL|5|0|0|127|0|0|0|0|0\r\n";
    public static final String COLE_1 = "COLE|5|0|0|0|200|255|0|0|0\r\n";
    public static final String COLE_2 = "SOLU|5|0|0|0|200|255|0|0|0\r\n";
    public static final String COLE_3 = "-TIONS|5|0|0|0|200|255|0|0|0\r\n";
    public static final String ELKS_1 = "ELKS|5|0|0|127|127|127|0|0|0\r\n";
    public static final String ELKS_2 = "LODGE|5|0|0|127|127|127|0|0|0\r\n";
    public static final String ADP = "ADP|5|0|0|127|0|0|0|0|0\r\n";
    public static final String JSTAR_1 = "JSTAR|5|0|0|255|170|0|0|0|0\r\n";
    public static final String JSTAR_2 = "RESE|5|0|0|255|170|0|0|0|0\r\n";
    public static final String JSTAR_3 = "-ARCH|5|0|0|127|127|127|0|0|0\r\n";
    public static final String PICATINNY_1 = "PICAT|5|0|0|63|63|0|0|0|0\r\n";
    public static final String PICATINNY_2 = "-INNY|5|0|0|63|63|0|0|0|0\r\n";
    public static final String PICATINNY_3 = "STEM|5|0|0|63|63|0|0|0|0\r\n";

    public static final String messages[] = {
        BLUE_TEAM,
        BLUE_7587,
        RED_TEAM,
        RED_7587,
        THANK_YOU_1,
        THANK_YOU_2,
        THANK_YOU_3,
        THANK_YOU_4,
        SPONSORS_1,
        SPONSORS_2,
        NOKIA_1,
        NOKIA_2,
        NOKIA_3,
        EXXON_1,
        EXXON_2,
        COLE_1,
        COLE_2,
        COLE_3,
        ELKS_1,
        ELKS_2,
        ADP,
        JSTAR_1,
        JSTAR_2,
        JSTAR_3,
        PICATINNY_1,
        PICATINNY_2,
        PICATINNY_3,
    };
}