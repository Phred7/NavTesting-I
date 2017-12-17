package org.usfirst.frc.team2906.robot.subsystems;

import org.usfirst.frc.team2906.robot.RobotMap;
import org.usfirst.frc.team2906.robot.commands.DriveWithJoysticks;

import com.ctre.CANTalon;


import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class EDriveTrain extends Subsystem {
	/*VictorSP EDTLeftI = RobotMap.EDTLeftI;
	VictorSP motorR2 = RobotMap.motorR2;
	VictorSP EDTRightI = RobotMap.EDTRightI;
	VictorSP motorL2 = RobotMap.motorL2;
	Encoder encR = RobotMap.encR;
	Encoder encL = RobotMap.encL;*/
	CANTalon EDTLeftI = RobotMap.EDTLeftI;
	CANTalon EDTRightI = RobotMap.EDTRightI;
			
	private final RobotDrive driveTrain = RobotMap.eDriveTrain;

	// Put methods for controlling this subsystem
    // here. Call these from Commands.
/*	public DriveTrain(){
		encL.reset();
		encR.reset();
	}*/
	public void resetREnc(){
		EDTRightI.setEncPosition(0);
	}
	public void resetLEnc(){
		EDTLeftI.setEncPosition(0);
	}
	public void resetEncs(){
		EDTRightI.setEncPosition(0);
		EDTLeftI.setEncPosition(0);
	}
	public int getREnc(){
		return EDTRightI.getEncPosition();
	}
	public int getLEnc(){
		return EDTLeftI.getEncPosition();
	}
	public void drive(double RMotor, double LMotor) {
		  EDTLeftI.set(RMotor);
		  EDTRightI.set(-LMotor);

	  }
	  public void driveR(double RMotor){
		  EDTRightI.set(RMotor);

	  }
	  public void driveL(double LMotor){
		  EDTLeftI.set(-LMotor);

	  }
	  public void stopR(){
		  EDTLeftI.set(0.0);
	  }
	  public void stopL(){
		  EDTRightI.set(0.0);

	  }
	  public void stop(){
		  EDTRightI.set(0.0);
		  EDTLeftI.set(0.0);
		   
	  }
	  
	  public void arcadeDrive(double move, double rotate){
		  driveTrain.arcadeDrive(move, rotate);
	  }
	  
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
    }
}
