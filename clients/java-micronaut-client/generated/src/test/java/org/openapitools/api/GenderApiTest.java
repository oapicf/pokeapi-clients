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
 * API tests for GenderApi
 */
@MicronautTest
public class GenderApiTest {

    @Inject
    GenderApi api;

    
    /**
     * 
     */
    @Test
    public void genderListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.genderList(limit, offset).block();
        // Mono<String> asyncResponse = api.genderList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void genderReadTest() {
        Integer id = null;
        // String response = api.genderRead(id).block();
        // Mono<String> asyncResponse = api.genderRead(id);
        // TODO: test validations
    }

    
}
