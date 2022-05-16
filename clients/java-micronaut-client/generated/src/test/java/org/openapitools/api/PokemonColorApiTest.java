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
 * API tests for PokemonColorApi
 */
@MicronautTest
public class PokemonColorApiTest {

    @Inject
    PokemonColorApi api;

    
    /**
     * 
     */
    @Test
    public void pokemonColorListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.pokemonColorList(limit, offset).block();
        // Mono<String> asyncResponse = api.pokemonColorList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void pokemonColorReadTest() {
        Integer id = null;
        // String response = api.pokemonColorRead(id).block();
        // Mono<String> asyncResponse = api.pokemonColorRead(id);
        // TODO: test validations
    }

    
}
