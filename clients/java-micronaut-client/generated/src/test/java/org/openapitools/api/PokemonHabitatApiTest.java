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
 * API tests for PokemonHabitatApi
 */
@MicronautTest
public class PokemonHabitatApiTest {

    @Inject
    PokemonHabitatApi api;

    
    /**
     * 
     */
    @Test
    public void pokemonHabitatListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.pokemonHabitatList(limit, offset).block();
        // Mono<String> asyncResponse = api.pokemonHabitatList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void pokemonHabitatReadTest() {
        Integer id = null;
        // String response = api.pokemonHabitatRead(id).block();
        // Mono<String> asyncResponse = api.pokemonHabitatRead(id);
        // TODO: test validations
    }

    
}
