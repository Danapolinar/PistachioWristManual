// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.DemandType;
// import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.TalonFXControlMode;

// import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.Constants;

public class Wrist extends SubsystemBase {
  public static TalonFX wristmotor = new TalonFX(55);
  /** Creates a new EveryBotIntakeSubsystem. */
  public Wrist() {
    //don't let motor stall after intake

    super();


    wristmotor.configFactoryDefault();
    wristmotor.setNeutralMode(NeutralMode.Brake);
    wristmotor.setInverted(false);
    // ebotmotor.setSmartCurrentLimit(Constants.Intake.ebotAmpLimit);
  }

  public void Up() {
    wristmotor.set(ControlMode.PercentOutput,0.2);
    
  }

  public void Down() {
    wristmotor.set(ControlMode.PercentOutput,0.2);
  }

  public void Stoppe() {
    // double m_stoppe÷
    wristmotor.set(ControlMode.PercentOutput,0.0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
