/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for SuperContestEffectApi
 */
@Ignore
public class SuperContestEffectApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final SuperContestEffectApi api = new SuperContestEffectApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void superContestEffectListTest() throws Exception {
        Integer limit = null;
        Integer offset = null;
    ResponseEntity<String> response = api.superContestEffectList(limit, offset , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void superContestEffectReadTest() throws Exception {
        Integer id = null;
    ResponseEntity<String> response = api.superContestEffectRead(id , accept);

        // TODO: test validations
    }
    
}