package frc.robot.subsystems;

import org.photonvision.PhotonCamera;
import org.photonvision.PhotonUtils;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class photon extends SubsystemBase {
    
    public static final PhotonCamera camera = new PhotonCamera(cameraName);
    

    public void isConnected() {
        System.out.println("Camera connected: " + camera.isConnected());
    }

    public void setReflective() {
        camera.setPipelineIndex(reflectivePipeline);
    }

    public void setApril() {
        camera.setPipelineIndex(aprilPipeline);
    }

    public double getAprilYaw() {

        camera.setPipelineIndex(aprilPipeline);

        if(camera.getLatestResult().hasTargets()) {
            return camera.getLatestResult().getBestTarget().getYaw();
        }

        return 0;
    }

    public boolean hasAprilTarget() {
        camera.setPipelineIndex(aprilPipeline);
        return camera.getLatestResult().hasTargets();
    }

    public double getAprilDistance() {
        
        camera.setPipelineIndex(aprilPipeline);

        return PhotonUtils.calculateDistanceToTargetMeters(CAMERA_HEIGHT_METERS, TARGET_HEIGHT_METERS, CAMERA_PITCH_RADIANS, camera.getLatestResult().getBestTarget().getPitch());
    }

    public double getReflectiveYaw() {

        camera.setPipelineIndex(reflectivePipeline);

        if(camera.getLatestResult().hasTargets()) {
            return camera.getLatestResult().getBestTarget().getYaw();
        }

        return 0;
    }

    public boolean hasReflectiveTarget() {
        camera.setPipelineIndex(reflectivePipeline);
        return camera.getLatestResult().hasTargets();
    }

    public double getReflectiveDistance() {
        
        camera.setPipelineIndex(reflectivePipeline);

        return PhotonUtils.calculateDistanceToTargetMeters(CAMERA_HEIGHT_METERS, TARGET_HEIGHT_METERS, CAMERA_PITCH_RADIANS, camera.getLatestResult().getBestTarget().getPitch());
    }

    @Override
    public void periodic() {
        camera.setPipelineIndex(aprilPipeline);
        SmartDashboard.putBoolean("April Target", camera.getLatestResult().hasTargets());
        camera.setPipelineIndex(reflectivePipeline);
        SmartDashboard.putBoolean("Reflective Target", camera.getLatestResult().hasTargets());
    }

}
