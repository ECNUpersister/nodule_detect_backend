package com.dong.nodule_detect_backend.service.DetectService;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author dongli
 */
public interface DetectService {
    String getDetectImage(MultipartFile imageFile);
}
