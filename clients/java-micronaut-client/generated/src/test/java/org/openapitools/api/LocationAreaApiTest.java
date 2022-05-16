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
 * API tests for LocationAreaApi
 */
@MicronautTest
public class LocationAreaApiTest {

    @Inject
    LocationAreaApi api;

    
    /**
     * 
     */
    @Test
    public void locationAreaListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.locationAreaList(limit, offset).block();
        // Mono<String> asyncResponse = api.locationAreaList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void locationAreaReadTest() {
        Integer id = null;
        // String response = api.locationAreaRead(id).block();
        // Mono<String> asyncResponse = api.locationAreaRead(id);
        // TODO: test validations
    }

    
}
