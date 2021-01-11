package com.dong.garbage_classification_backend.client;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongli
 */
@Component
public class ImageDetectClientImpl implements ImageDetectClient {

    @Override
    public String getDetectImagePost(String imageBase64Code) {
        MultiValueMap<String,String>paramMap=new LinkedMultiValueMap<>();
        paramMap.add("imageBase64Code",imageBase64Code);

        // step 1. request
        String url = "http://127.0.0.1:8081/detect/imageDetect";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> request;
        request = new HttpEntity<>(paramMap, headers);

        //step 2. post http call
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

        Assert.isTrue(HttpStatus.OK == response.getStatusCode(), "http call is failed");
        return response.getBody();
    }
}