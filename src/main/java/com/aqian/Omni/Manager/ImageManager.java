package com.aqian.Omni.Manager;


import nu.pattern.OpenCV;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ImageManager {

    @Value("${images-path}")
    String fileDirectory;

    public Mat loadImage(String fileName) {
        nu.pattern.OpenCV.loadLocally();
        String fullPath = fileDirectory + "/" + fileName;
        Imgcodecs imageCodecs = new Imgcodecs();
        return imageCodecs.imread(fullPath);
    }

    // Turns an image to entirely grayscale
    public void turnGrayScale(String filePath) {
        // Load OpenCV library
        OpenCV.loadShared();
        Imgcodecs imageCodecs = new Imgcodecs();

    }


}
