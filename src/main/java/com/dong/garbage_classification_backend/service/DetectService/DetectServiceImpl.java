package com.dong.garbage_classification_backend.service.DetectService;

import com.dong.garbage_classification_backend.client.ImageDetectClient;
import com.dong.garbage_classification_backend.client.ImageDetectClientImpl;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Encoder;

/**
 * @author dongli
 */
@Service
public class DetectServiceImpl implements DetectService{
    private Logger logger =LoggerFactory.getLogger(ImageDetectClientImpl.class);

    @Autowired
    private ImageDetectClient imageDetectClient;
    @Override
    public String getDetectImage(MultipartFile imageFile) {
        try {
            Encoder encoder = Base64.getEncoder();
            String encoderImg = encoder.encodeToString(imageFile.getBytes());
            return imageDetectClient.getDetectImagePost(encoderImg);
        }catch (IOException e){
            logger.error("imageFile convert failed");
        }
        return null;
    }
}
