package com.dong.garbage_classification_backend.client;

import org.springframework.util.MultiValueMap;
public interface ImageDetectClient {
    String getDetectImagePost(String imageBase64Code);
}
