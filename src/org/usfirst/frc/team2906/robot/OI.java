package org.usfirst.frc.team2906.robot;



import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Joystick joystick1;
    public Joystick joystick2;
    public JoystickButton j1b1;
    public JoystickButton j1b2;
    public JoystickButton j1b3;
    public JoystickButton j1b4;
    public JoystickButton j1b5;
    public JoystickButton j1b6;
    public JoystickButton j1b7;
    public JoystickButton j1b8;
    public JoystickButton j1b9;
    public JoystickButton j1b10;
    public JoystickButton j2b1;
    public JoystickButton j2b2;
    public JoystickButton j2b3;
    public JoystickButton j2b4;
    public JoystickButton j2b5;
    public JoystickButton j2b6;
    public JoystickButton j2b7;
    public JoystickButton j2b8;
    public JoystickButton j2b9;
    public JoystickButton j2b10;
    public JoystickButton j2b11;
    public JoystickButton j2b12;

    public OI() {
    	joystick1 = new Joystick(0);
    	joystick2 = new Joystick(1);

    
    }

    
    public Joystick getJoystick1() {
        return joystick1;
    }
   
    public double getJoystick1X(){
    	if(Math.abs(joystick1.getX())>0.1){
    		return -1*joystick1.getX();
    	} 
    	else {
    		return 0.0;
    	}
    }
    
    public double getJoystick1Y(){
    	if(Math.abs(joystick1.getY())>0.1){
    		return -1*joystick1.getY();
    	} 
    	else {
    		return 0.0;
    	}
    }
}
