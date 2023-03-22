package frc.robot.commands.Wrist;



import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.Constants;
// import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Wrist;

public class StoppeWrist extends CommandBase {

    private final Wrist m_wrist;

   
   

  public StoppeWrist(Wrist wrist) {
    
   
    m_wrist = wrist;
    
   
    
  }

  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    m_wrist.Stoppe();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
    
  }
}
