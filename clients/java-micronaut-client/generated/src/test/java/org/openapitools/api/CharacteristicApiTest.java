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
 * API tests for CharacteristicApi
 */
@MicronautTest
public class CharacteristicApiTest {

    @Inject
    CharacteristicApi api;

    
    /**
     * 
     */
    @Test
    public void characteristicListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.characteristicList(limit, offset).block();
        // Mono<String> asyncResponse = api.characteristicList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void characteristicReadTest() {
        Integer id = null;
        // String response = api.characteristicRead(id).block();
        // Mono<String> asyncResponse = api.characteristicRead(id);
        // TODO: test validations
    }

    
}
