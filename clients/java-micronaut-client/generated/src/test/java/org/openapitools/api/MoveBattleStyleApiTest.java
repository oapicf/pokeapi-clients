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
 * API tests for MoveBattleStyleApi
 */
@MicronautTest
public class MoveBattleStyleApiTest {

    @Inject
    MoveBattleStyleApi api;

    
    /**
     * 
     */
    @Test
    public void moveBattleStyleListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.moveBattleStyleList(limit, offset).block();
        // Mono<String> asyncResponse = api.moveBattleStyleList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void moveBattleStyleReadTest() {
        Integer id = null;
        // String response = api.moveBattleStyleRead(id).block();
        // Mono<String> asyncResponse = api.moveBattleStyleRead(id);
        // TODO: test validations
    }

    
}
