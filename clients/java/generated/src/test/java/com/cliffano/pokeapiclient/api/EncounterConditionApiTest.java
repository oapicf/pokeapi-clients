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


package com.cliffano.pokeapiclient.api;

import com.cliffano.pokeapiclient.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EncounterConditionApi
 */
@Disabled
public class EncounterConditionApiTest {

    private final EncounterConditionApi api = new EncounterConditionApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void encounterConditionListTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String response = api.encounterConditionList(limit, offset);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void encounterConditionReadTest() throws ApiException {
        Integer id = null;
        String response = api.encounterConditionRead(id);
        // TODO: test validations
    }

}
