package com.dong.garbage_classification_backend.controller;

import com.dong.garbage_classification_backend.service.DetectService.DetectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author dongli
 */
@RestController
public class ImageDetectController {
    @Autowired
    private DetectService detectService;
    @CrossOrigin
    @PostMapping( "/api/detect")
    public String detectOut(MultipartFile file) throws Exception{
        String  s=detectService.getDetectImage(file);
        return detectService.getDetectImage(file);
    }
}
