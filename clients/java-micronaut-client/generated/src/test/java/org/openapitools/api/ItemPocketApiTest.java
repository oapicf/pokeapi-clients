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
 * API tests for ItemPocketApi
 */
@MicronautTest
public class ItemPocketApiTest {

    @Inject
    ItemPocketApi api;

    
    /**
     * 
     */
    @Test
    public void itemPocketListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.itemPocketList(limit, offset).block();
        // Mono<String> asyncResponse = api.itemPocketList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void itemPocketReadTest() {
        Integer id = null;
        // String response = api.itemPocketRead(id).block();
        // Mono<String> asyncResponse = api.itemPocketRead(id);
        // TODO: test validations
    }

    
}
