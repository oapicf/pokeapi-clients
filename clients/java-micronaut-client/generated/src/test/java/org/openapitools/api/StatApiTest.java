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
 * API tests for StatApi
 */
@MicronautTest
public class StatApiTest {

    @Inject
    StatApi api;

    
    /**
     * 
     */
    @Test
    public void statListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.statList(limit, offset).block();
        // Mono<String> asyncResponse = api.statList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void statReadTest() {
        Integer id = null;
        // String response = api.statRead(id).block();
        // Mono<String> asyncResponse = api.statRead(id);
        // TODO: test validations
    }

    
}
