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
 * API tests for ContestTypeApi
 */
@MicronautTest
public class ContestTypeApiTest {

    @Inject
    ContestTypeApi api;

    
    /**
     * 
     */
    @Test
    public void contestTypeListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.contestTypeList(limit, offset).block();
        // Mono<String> asyncResponse = api.contestTypeList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void contestTypeReadTest() {
        Integer id = null;
        // String response = api.contestTypeRead(id).block();
        // Mono<String> asyncResponse = api.contestTypeRead(id);
        // TODO: test validations
    }

    
}
