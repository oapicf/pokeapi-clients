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
 * API tests for ItemAttributeApi
 */
@MicronautTest
public class ItemAttributeApiTest {

    @Inject
    ItemAttributeApi api;

    
    /**
     * 
     */
    @Test
    public void itemAttributeListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.itemAttributeList(limit, offset).block();
        // Mono<String> asyncResponse = api.itemAttributeList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void itemAttributeReadTest() {
        Integer id = null;
        // String response = api.itemAttributeRead(id).block();
        // Mono<String> asyncResponse = api.itemAttributeRead(id);
        // TODO: test validations
    }

    
}
