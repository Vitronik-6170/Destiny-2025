package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotContainer;

public class AutoHex extends SequentialCommandGroup{
    public AutoHex(){
        addCommands(
            new SwerveMoveDistance(RobotContainer.m_swerveDrive, -5)
        );
    }
}
