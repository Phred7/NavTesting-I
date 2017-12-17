package org.usfirst.frc.team2906.robot;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SerialPort;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static AHRS ahrs = new AHRS(SerialPort.Port.kMXP);
	public static RobotDrive eDriveTrain;
	public static CANTalon EDTLeftI;
	public static CANTalon EDTLeftII;
	public static CANTalon EDTRightI;
	public static CANTalon EDTRightII;
	
	public static double sensitivity = 0.1;
	
	public static void init(){
		
		EDTLeftI = new CANTalon(0);
		EDTLeftII = new CANTalon(1);
		EDTRightI = new CANTalon(2);
		EDTRightII = new CANTalon(3);
		
		EDTLeftII.changeControlMode(TalonControlMode.Follower);
		EDTLeftII.set(0);
		EDTRightII.changeControlMode(TalonControlMode.Follower);
		EDTRightII.set(2);
		
		EDTLeftI.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
		EDTLeftI.configEncoderCodesPerRev(360);
		EDTRightI.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
		EDTRightI.configEncoderCodesPerRev(360);
		
		eDriveTrain = new RobotDrive(EDTLeftI, EDTRightI);
        eDriveTrain.setSafetyEnabled(false);
        eDriveTrain.setExpiration(0.1);
        eDriveTrain.setSensitivity(0.1);
        eDriveTrain.setMaxOutput(1);
        eDriveTrain.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
	}
}
