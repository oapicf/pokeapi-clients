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
 * API tests for RegionApi
 */
@MicronautTest
public class RegionApiTest {

    @Inject
    RegionApi api;

    
    /**
     * 
     */
    @Test
    public void regionListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.regionList(limit, offset).block();
        // Mono<String> asyncResponse = api.regionList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void regionReadTest() {
        Integer id = null;
        // String response = api.regionRead(id).block();
        // Mono<String> asyncResponse = api.regionRead(id);
        // TODO: test validations
    }

    
}
