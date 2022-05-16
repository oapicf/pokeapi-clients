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
 * API tests for BerryFlavorApi
 */
@MicronautTest
public class BerryFlavorApiTest {

    @Inject
    BerryFlavorApi api;

    
    /**
     * 
     */
    @Test
    public void berryFlavorListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.berryFlavorList(limit, offset).block();
        // Mono<String> asyncResponse = api.berryFlavorList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void berryFlavorReadTest() {
        Integer id = null;
        // String response = api.berryFlavorRead(id).block();
        // Mono<String> asyncResponse = api.berryFlavorRead(id);
        // TODO: test validations
    }

    
}
