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
 * API tests for PokedexApi
 */
@MicronautTest
public class PokedexApiTest {

    @Inject
    PokedexApi api;

    
    /**
     * 
     */
    @Test
    public void pokedexListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.pokedexList(limit, offset).block();
        // Mono<String> asyncResponse = api.pokedexList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void pokedexReadTest() {
        Integer id = null;
        // String response = api.pokedexRead(id).block();
        // Mono<String> asyncResponse = api.pokedexRead(id);
        // TODO: test validations
    }

    
}
