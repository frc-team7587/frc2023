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

    //drivetrain ports
    public static final int LFront = 1;
    public static final int LRear = 2;
    public static final int RFront = 3;
    public static final int RRear = 4;

    //left encoder
    public static final int[] LEncoder = new int[] {0, 1};
    public static final boolean LReverse = false;

    //right encoder
    public static final int[] REncoder = new int[] {2, 3};
    public static final boolean RReverse = true;

    public static final int kEncoderCPR = 1024;
    public static final double kWheelDiameterInches = 6;
    public static final double kEncoderDistancePerPulse =
        // Assumes the encoders are directly mounted on the wheel shafts
        (kWheelDiameterInches * Math.PI) / (double) kEncoderCPR;

}
