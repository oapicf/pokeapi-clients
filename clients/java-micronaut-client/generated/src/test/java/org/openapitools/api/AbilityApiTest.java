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
 * API tests for AbilityApi
 */
@MicronautTest
public class AbilityApiTest {

    @Inject
    AbilityApi api;

    
    /**
     * 
     */
    @Test
    public void abilityListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.abilityList(limit, offset).block();
        // Mono<String> asyncResponse = api.abilityList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void abilityReadTest() {
        Integer id = null;
        // String response = api.abilityRead(id).block();
        // Mono<String> asyncResponse = api.abilityRead(id);
        // TODO: test validations
    }

    
}
