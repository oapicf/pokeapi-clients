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
 * API tests for MoveDamageClassApi
 */
@MicronautTest
public class MoveDamageClassApiTest {

    @Inject
    MoveDamageClassApi api;

    
    /**
     * 
     */
    @Test
    public void moveDamageClassListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.moveDamageClassList(limit, offset).block();
        // Mono<String> asyncResponse = api.moveDamageClassList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void moveDamageClassReadTest() {
        Integer id = null;
        // String response = api.moveDamageClassRead(id).block();
        // Mono<String> asyncResponse = api.moveDamageClassRead(id);
        // TODO: test validations
    }

    
}
