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
 * API tests for PokemonShapeApi
 */
@MicronautTest
public class PokemonShapeApiTest {

    @Inject
    PokemonShapeApi api;

    
    /**
     * 
     */
    @Test
    public void pokemonShapeListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.pokemonShapeList(limit, offset).block();
        // Mono<String> asyncResponse = api.pokemonShapeList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void pokemonShapeReadTest() {
        Integer id = null;
        // String response = api.pokemonShapeRead(id).block();
        // Mono<String> asyncResponse = api.pokemonShapeRead(id);
        // TODO: test validations
    }

    
}
