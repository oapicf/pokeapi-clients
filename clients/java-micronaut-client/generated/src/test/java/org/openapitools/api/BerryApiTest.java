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
 * API tests for BerryApi
 */
@MicronautTest
public class BerryApiTest {

    @Inject
    BerryApi api;

    
    /**
     * 
     */
    @Test
    public void berryListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.berryList(limit, offset).block();
        // Mono<String> asyncResponse = api.berryList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void berryReadTest() {
        Integer id = null;
        // String response = api.berryRead(id).block();
        // Mono<String> asyncResponse = api.berryRead(id);
        // TODO: test validations
    }

    
}
