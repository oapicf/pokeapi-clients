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
 * API tests for PokeathlonStatApi
 */
@MicronautTest
public class PokeathlonStatApiTest {

    @Inject
    PokeathlonStatApi api;

    
    /**
     * 
     */
    @Test
    public void pokeathlonStatListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.pokeathlonStatList(limit, offset).block();
        // Mono<String> asyncResponse = api.pokeathlonStatList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void pokeathlonStatReadTest() {
        Integer id = null;
        // String response = api.pokeathlonStatRead(id).block();
        // Mono<String> asyncResponse = api.pokeathlonStatRead(id);
        // TODO: test validations
    }

    
}
