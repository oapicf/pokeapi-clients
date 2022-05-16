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
 * API tests for EvolutionChainApi
 */
@MicronautTest
public class EvolutionChainApiTest {

    @Inject
    EvolutionChainApi api;

    
    /**
     * 
     */
    @Test
    public void evolutionChainListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.evolutionChainList(limit, offset).block();
        // Mono<String> asyncResponse = api.evolutionChainList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void evolutionChainReadTest() {
        Integer id = null;
        // String response = api.evolutionChainRead(id).block();
        // Mono<String> asyncResponse = api.evolutionChainRead(id);
        // TODO: test validations
    }

    
}
