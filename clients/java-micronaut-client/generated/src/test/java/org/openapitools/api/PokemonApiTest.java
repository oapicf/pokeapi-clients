package org.openapitools.api;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


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
    @Disabled("Not Implemented")
    public void pokemonListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.pokemonList(limit, offset).block();

        // then
        // TODO implement the pokemonListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.pokemonRead(id).block();

        // then
        // TODO implement the pokemonReadTest()
    }

    
}
