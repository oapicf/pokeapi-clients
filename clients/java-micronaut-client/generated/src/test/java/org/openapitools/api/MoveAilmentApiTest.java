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
 * API tests for MoveAilmentApi
 */
@MicronautTest
public class MoveAilmentApiTest {

    @Inject
    MoveAilmentApi api;

    
    /**
     * 
     */
    @Test
    public void moveAilmentListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.moveAilmentList(limit, offset).block();
        // Mono<String> asyncResponse = api.moveAilmentList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void moveAilmentReadTest() {
        Integer id = null;
        // String response = api.moveAilmentRead(id).block();
        // Mono<String> asyncResponse = api.moveAilmentRead(id);
        // TODO: test validations
    }

    
}
