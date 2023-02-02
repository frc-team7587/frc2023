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
    public static final int LFront = 1;
    public static final int LRear = 2;
    public static final int RFront = 3;
    public static final int RRear = 4;
    public static final int pivotPort = 5;
    public static final int telescopePort = 6;

    //solenoids
    public static final int solenoid1 = 0;
    public static final int solenoid2 = 1;

    public static final int distancePerPulse = 1;

    public static final double telescopeSpeedIn = 0.6;
    public static final double telescopeSpeedOut = -0.4;

    public static final double pivotSpeedUp = 0.5;
    public static final double pivotSpeedDown = -0.3;

}
