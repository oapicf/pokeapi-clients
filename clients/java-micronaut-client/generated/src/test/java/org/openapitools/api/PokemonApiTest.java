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
 * API tests for PokemonApi
 */
@MicronautTest
public class PokemonApiTest {

    @Inject
    PokemonApi api;

    
    /**
     * 
     */
    @Test
    public void pokemonListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.pokemonList(limit, offset).block();
        // Mono<String> asyncResponse = api.pokemonList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void pokemonReadTest() {
        Integer id = null;
        // String response = api.pokemonRead(id).block();
        // Mono<String> asyncResponse = api.pokemonRead(id);
        // TODO: test validations
    }

    
}
