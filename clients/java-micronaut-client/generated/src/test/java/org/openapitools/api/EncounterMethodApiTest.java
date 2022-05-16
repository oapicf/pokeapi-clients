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
 * API tests for EncounterMethodApi
 */
@MicronautTest
public class EncounterMethodApiTest {

    @Inject
    EncounterMethodApi api;

    
    /**
     * 
     */
    @Test
    public void encounterMethodListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.encounterMethodList(limit, offset).block();
        // Mono<String> asyncResponse = api.encounterMethodList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void encounterMethodReadTest() {
        Integer id = null;
        // String response = api.encounterMethodRead(id).block();
        // Mono<String> asyncResponse = api.encounterMethodRead(id);
        // TODO: test validations
    }

    
}
