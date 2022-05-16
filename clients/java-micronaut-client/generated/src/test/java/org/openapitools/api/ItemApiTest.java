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
 * API tests for ItemApi
 */
@MicronautTest
public class ItemApiTest {

    @Inject
    ItemApi api;

    
    /**
     * 
     */
    @Test
    public void itemListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.itemList(limit, offset).block();
        // Mono<String> asyncResponse = api.itemList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void itemReadTest() {
        Integer id = null;
        // String response = api.itemRead(id).block();
        // Mono<String> asyncResponse = api.itemRead(id);
        // TODO: test validations
    }

    
}
