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
 * API tests for NatureApi
 */
@MicronautTest
public class NatureApiTest {

    @Inject
    NatureApi api;

    
    /**
     * 
     */
    @Test
    public void natureListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.natureList(limit, offset).block();
        // Mono<String> asyncResponse = api.natureList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void natureReadTest() {
        Integer id = null;
        // String response = api.natureRead(id).block();
        // Mono<String> asyncResponse = api.natureRead(id);
        // TODO: test validations
    }

    
}
