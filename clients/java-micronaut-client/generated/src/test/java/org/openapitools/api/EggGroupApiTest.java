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
 * API tests for EggGroupApi
 */
@MicronautTest
public class EggGroupApiTest {

    @Inject
    EggGroupApi api;

    
    /**
     * 
     */
    @Test
    public void eggGroupListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.eggGroupList(limit, offset).block();
        // Mono<String> asyncResponse = api.eggGroupList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void eggGroupReadTest() {
        Integer id = null;
        // String response = api.eggGroupRead(id).block();
        // Mono<String> asyncResponse = api.eggGroupRead(id);
        // TODO: test validations
    }

    
}
