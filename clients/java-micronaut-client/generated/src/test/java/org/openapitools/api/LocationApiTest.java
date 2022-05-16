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
 * API tests for LocationApi
 */
@MicronautTest
public class LocationApiTest {

    @Inject
    LocationApi api;

    
    /**
     * 
     */
    @Test
    public void locationListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.locationList(limit, offset).block();
        // Mono<String> asyncResponse = api.locationList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void locationReadTest() {
        Integer id = null;
        // String response = api.locationRead(id).block();
        // Mono<String> asyncResponse = api.locationRead(id);
        // TODO: test validations
    }

    
}
