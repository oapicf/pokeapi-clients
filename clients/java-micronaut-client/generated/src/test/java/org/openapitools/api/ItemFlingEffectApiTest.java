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
 * API tests for ItemFlingEffectApi
 */
@MicronautTest
public class ItemFlingEffectApiTest {

    @Inject
    ItemFlingEffectApi api;

    
    /**
     * 
     */
    @Test
    public void itemFlingEffectListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.itemFlingEffectList(limit, offset).block();
        // Mono<String> asyncResponse = api.itemFlingEffectList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void itemFlingEffectReadTest() {
        Integer id = null;
        // String response = api.itemFlingEffectRead(id).block();
        // Mono<String> asyncResponse = api.itemFlingEffectRead(id);
        // TODO: test validations
    }

    
}
