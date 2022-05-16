package org.openapitools.api;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EncounterConditionApi
 */
@MicronautTest
public class EncounterConditionApiTest {

    @Inject
    EncounterConditionApi api;

    
    /**
     * 
     */
    @Test
    public void encounterConditionListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.encounterConditionList(limit, offset).block();
        // Mono<String> asyncResponse = api.encounterConditionList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void encounterConditionReadTest() {
        Integer id = null;
        // String response = api.encounterConditionRead(id).block();
        // Mono<String> asyncResponse = api.encounterConditionRead(id);
        // TODO: test validations
    }

    
}
