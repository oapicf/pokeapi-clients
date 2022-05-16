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
 * API tests for PokemonSpeciesApi
 */
@MicronautTest
public class PokemonSpeciesApiTest {

    @Inject
    PokemonSpeciesApi api;

    
    /**
     * 
     */
    @Test
    public void pokemonSpeciesListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.pokemonSpeciesList(limit, offset).block();
        // Mono<String> asyncResponse = api.pokemonSpeciesList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void pokemonSpeciesReadTest() {
        Integer id = null;
        // String response = api.pokemonSpeciesRead(id).block();
        // Mono<String> asyncResponse = api.pokemonSpeciesRead(id);
        // TODO: test validations
    }

    
}
