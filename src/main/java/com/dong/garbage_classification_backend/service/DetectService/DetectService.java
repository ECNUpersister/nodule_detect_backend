package com.dong.garbage_classification_backend.service.DetectService;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author dongli
 */
public interface DetectService {
    String getDetectImage(MultipartFile imageFile);
}
