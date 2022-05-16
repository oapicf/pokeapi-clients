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
 * API tests for MoveTargetApi
 */
@MicronautTest
public class MoveTargetApiTest {

    @Inject
    MoveTargetApi api;

    
    /**
     * 
     */
    @Test
    public void moveTargetListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.moveTargetList(limit, offset).block();
        // Mono<String> asyncResponse = api.moveTargetList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void moveTargetReadTest() {
        Integer id = null;
        // String response = api.moveTargetRead(id).block();
        // Mono<String> asyncResponse = api.moveTargetRead(id);
        // TODO: test validations
    }

    
}
