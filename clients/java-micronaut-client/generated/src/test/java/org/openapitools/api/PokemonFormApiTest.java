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
 * API tests for PokemonFormApi
 */
@MicronautTest
public class PokemonFormApiTest {

    @Inject
    PokemonFormApi api;

    
    /**
     * 
     */
    @Test
    public void pokemonFormListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.pokemonFormList(limit, offset).block();
        // Mono<String> asyncResponse = api.pokemonFormList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void pokemonFormReadTest() {
        Integer id = null;
        // String response = api.pokemonFormRead(id).block();
        // Mono<String> asyncResponse = api.pokemonFormRead(id);
        // TODO: test validations
    }

    
}
