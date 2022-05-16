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
 * API tests for MoveApi
 */
@MicronautTest
public class MoveApiTest {

    @Inject
    MoveApi api;

    
    /**
     * 
     */
    @Test
    public void moveListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.moveList(limit, offset).block();
        // Mono<String> asyncResponse = api.moveList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void moveReadTest() {
        Integer id = null;
        // String response = api.moveRead(id).block();
        // Mono<String> asyncResponse = api.moveRead(id);
        // TODO: test validations
    }

    
}
