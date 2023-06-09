// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


import frc.robot.subsystems.Wrist;

import frc.robot.commands.Wrist.DownWrist;
import frc.robot.commands.Wrist.UpWrist;
import frc.robot.commands.Wrist.StoppeWrist;
// import frc.robot.commands.Intake.ElevatorTestUpCommand;
//https://first.wpi.edu/wpilib/allwpilib/docs/release/java/edu/wpi/first/wpilibj/XboxController.Button.html
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  /** The container for the robot. Contains subsystems, OI devices, and commands. */


  Wrist wrist = new Wrist();
  XboxController operator = new XboxController(0);

 
  // Trigger yButton = new JoystickButton(operator, XboxController.Button.kY.value);

  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    


    new JoystickButton(operator, Button.kLeftStick.value)
       .whileTrue(new DownWrist(wrist));

    new JoystickButton(operator, Button.kRightStick.value)
       .whileTrue(new StoppeWrist(wrist));

    new JoystickButton(operator, Button.kStart.value)
       .whileTrue(new UpWrist(wrist));



  }
 
  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */


  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}