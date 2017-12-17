package org.usfirst.frc.team2906.robot.subsystems;


import org.usfirst.frc.team2906.robot.RobotMap;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class NavX extends Subsystem {
	AHRS ahrs = RobotMap.ahrs; 
	
	public double getAngle(){
		if( ahrs.getAngle() + 180 > 360){
			return ahrs.getAngle() - 180;		
		}
		return ahrs.getAngle() + 180;
		
	}

	public void reset(){
		ahrs.reset();
	}
	
	protected void initDefaultCommand() {
		
	}
}


