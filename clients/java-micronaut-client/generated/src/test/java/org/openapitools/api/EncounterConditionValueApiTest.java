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
 * API tests for EncounterConditionValueApi
 */
@MicronautTest
public class EncounterConditionValueApiTest {

    @Inject
    EncounterConditionValueApi api;

    
    /**
     * 
     */
    @Test
    public void encounterConditionValueListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.encounterConditionValueList(limit, offset).block();
        // Mono<String> asyncResponse = api.encounterConditionValueList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void encounterConditionValueReadTest() {
        Integer id = null;
        // String response = api.encounterConditionValueRead(id).block();
        // Mono<String> asyncResponse = api.encounterConditionValueRead(id);
        // TODO: test validations
    }

    
}
