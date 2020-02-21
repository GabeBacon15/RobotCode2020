/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Belt;

public class IntakeBall extends CommandBase {
  /**
   * Creates a new IntakeBall.
   */
  public IntakeBall() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    System.out.println("IntakeBall command running...");

    System.out.println("Start INTAKE BALL");
    Belt.getInstance().run(0.3);
  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("End INTAKE BALL");
    Belt.getInstance().run(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return Belt.getInstance().getUltrasonic() > Constants.BALL_DETECTION;
  }
  
}