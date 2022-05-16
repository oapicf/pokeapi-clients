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
 * API tests for BerryFirmnessApi
 */
@MicronautTest
public class BerryFirmnessApiTest {

    @Inject
    BerryFirmnessApi api;

    
    /**
     * 
     */
    @Test
    public void berryFirmnessListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.berryFirmnessList(limit, offset).block();
        // Mono<String> asyncResponse = api.berryFirmnessList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void berryFirmnessReadTest() {
        Integer id = null;
        // String response = api.berryFirmnessRead(id).block();
        // Mono<String> asyncResponse = api.berryFirmnessRead(id);
        // TODO: test validations
    }

    
}
