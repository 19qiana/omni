package com.aqian.Omni.Controller;

import com.aqian.Omni.Manager.ImageManager;
import org.opencv.core.Mat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ImageController {

    @Autowired
    ImageManager imageManager;

    @RequestMapping(value = "/execute", method = RequestMethod.GET)
    public String execute() {

        Mat matrix = imageManager.loadImage("meme.jpg");
        System.out.println("Image dimensions: " + matrix.size().height + " x " + matrix.size().width);
        System.out.println(matrix.toString());
        return "Executed";
    }

}
