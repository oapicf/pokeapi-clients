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
 * API tests for GrowthRateApi
 */
@MicronautTest
public class GrowthRateApiTest {

    @Inject
    GrowthRateApi api;

    
    /**
     * 
     */
    @Test
    public void growthRateListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.growthRateList(limit, offset).block();
        // Mono<String> asyncResponse = api.growthRateList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void growthRateReadTest() {
        Integer id = null;
        // String response = api.growthRateRead(id).block();
        // Mono<String> asyncResponse = api.growthRateRead(id);
        // TODO: test validations
    }

    
}
