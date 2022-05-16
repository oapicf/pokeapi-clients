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
 * API tests for SuperContestEffectApi
 */
@MicronautTest
public class SuperContestEffectApiTest {

    @Inject
    SuperContestEffectApi api;

    
    /**
     * 
     */
    @Test
    public void superContestEffectListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.superContestEffectList(limit, offset).block();
        // Mono<String> asyncResponse = api.superContestEffectList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void superContestEffectReadTest() {
        Integer id = null;
        // String response = api.superContestEffectRead(id).block();
        // Mono<String> asyncResponse = api.superContestEffectRead(id);
        // TODO: test validations
    }

    
}
