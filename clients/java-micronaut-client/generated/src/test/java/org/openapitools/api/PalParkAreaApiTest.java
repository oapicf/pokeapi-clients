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
 * API tests for PalParkAreaApi
 */
@MicronautTest
public class PalParkAreaApiTest {

    @Inject
    PalParkAreaApi api;

    
    /**
     * 
     */
    @Test
    public void palParkAreaListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.palParkAreaList(limit, offset).block();
        // Mono<String> asyncResponse = api.palParkAreaList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void palParkAreaReadTest() {
        Integer id = null;
        // String response = api.palParkAreaRead(id).block();
        // Mono<String> asyncResponse = api.palParkAreaRead(id);
        // TODO: test validations
    }

    
}
