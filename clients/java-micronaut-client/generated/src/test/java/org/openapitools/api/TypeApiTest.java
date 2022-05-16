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
 * API tests for TypeApi
 */
@MicronautTest
public class TypeApiTest {

    @Inject
    TypeApi api;

    
    /**
     * 
     */
    @Test
    public void typeListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.typeList(limit, offset).block();
        // Mono<String> asyncResponse = api.typeList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void typeReadTest() {
        Integer id = null;
        // String response = api.typeRead(id).block();
        // Mono<String> asyncResponse = api.typeRead(id);
        // TODO: test validations
    }

    
}
