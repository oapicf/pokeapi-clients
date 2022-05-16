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
 * API tests for MoveCategoryApi
 */
@MicronautTest
public class MoveCategoryApiTest {

    @Inject
    MoveCategoryApi api;

    
    /**
     * 
     */
    @Test
    public void moveCategoryListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.moveCategoryList(limit, offset).block();
        // Mono<String> asyncResponse = api.moveCategoryList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void moveCategoryReadTest() {
        Integer id = null;
        // String response = api.moveCategoryRead(id).block();
        // Mono<String> asyncResponse = api.moveCategoryRead(id);
        // TODO: test validations
    }

    
}
