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
 * API tests for EvolutionTriggerApi
 */
@MicronautTest
public class EvolutionTriggerApiTest {

    @Inject
    EvolutionTriggerApi api;

    
    /**
     * 
     */
    @Test
    public void evolutionTriggerListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.evolutionTriggerList(limit, offset).block();
        // Mono<String> asyncResponse = api.evolutionTriggerList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void evolutionTriggerReadTest() {
        Integer id = null;
        // String response = api.evolutionTriggerRead(id).block();
        // Mono<String> asyncResponse = api.evolutionTriggerRead(id);
        // TODO: test validations
    }

    
}
