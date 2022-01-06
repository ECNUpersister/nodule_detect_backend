package com.dong.nodule_detect_backend.client;

public interface ImageDetectClient {
    String getDetectImagePost(String imageBase64Code);
}
