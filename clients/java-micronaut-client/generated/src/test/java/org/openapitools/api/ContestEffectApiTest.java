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
 * API tests for ContestEffectApi
 */
@MicronautTest
public class ContestEffectApiTest {

    @Inject
    ContestEffectApi api;

    
    /**
     * 
     */
    @Test
    public void contestEffectListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.contestEffectList(limit, offset).block();
        // Mono<String> asyncResponse = api.contestEffectList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void contestEffectReadTest() {
        Integer id = null;
        // String response = api.contestEffectRead(id).block();
        // Mono<String> asyncResponse = api.contestEffectRead(id);
        // TODO: test validations
    }

    
}
