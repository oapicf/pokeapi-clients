/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.pokeapiclient.api;

import com.github.oapicf.pokeapiclient.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AbilityApi
 */
@Disabled
public class AbilityApiTest {

    private final AbilityApi api = new AbilityApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void abilityListTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String response = api.abilityList(limit, offset);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void abilityReadTest() throws ApiException {
        Integer id = null;
        String response = api.abilityRead(id);
        // TODO: test validations
    }

}