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
 * API tests for GenerationApi
 */
@MicronautTest
public class GenerationApiTest {

    @Inject
    GenerationApi api;

    
    /**
     * 
     */
    @Test
    public void generationListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.generationList(limit, offset).block();
        // Mono<String> asyncResponse = api.generationList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void generationReadTest() {
        Integer id = null;
        // String response = api.generationRead(id).block();
        // Mono<String> asyncResponse = api.generationRead(id);
        // TODO: test validations
    }

    
}
