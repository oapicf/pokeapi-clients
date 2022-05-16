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
 * API tests for MoveLearnMethodApi
 */
@MicronautTest
public class MoveLearnMethodApiTest {

    @Inject
    MoveLearnMethodApi api;

    
    /**
     * 
     */
    @Test
    public void moveLearnMethodListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.moveLearnMethodList(limit, offset).block();
        // Mono<String> asyncResponse = api.moveLearnMethodList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void moveLearnMethodReadTest() {
        Integer id = null;
        // String response = api.moveLearnMethodRead(id).block();
        // Mono<String> asyncResponse = api.moveLearnMethodRead(id);
        // TODO: test validations
    }

    
}
