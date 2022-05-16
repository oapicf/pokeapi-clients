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
 * API tests for ItemCategoryApi
 */
@MicronautTest
public class ItemCategoryApiTest {

    @Inject
    ItemCategoryApi api;

    
    /**
     * 
     */
    @Test
    public void itemCategoryListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.itemCategoryList(limit, offset).block();
        // Mono<String> asyncResponse = api.itemCategoryList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void itemCategoryReadTest() {
        Integer id = null;
        // String response = api.itemCategoryRead(id).block();
        // Mono<String> asyncResponse = api.itemCategoryRead(id);
        // TODO: test validations
    }

    
}
