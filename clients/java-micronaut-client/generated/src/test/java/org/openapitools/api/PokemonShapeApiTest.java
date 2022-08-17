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
    @Disabled("Not Implemented")
    public void pokemonShapeListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.pokemonShapeList(limit, offset).block();

        // then
        // TODO implement the pokemonShapeListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonShapeReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.pokemonShapeRead(id).block();

        // then
        // TODO implement the pokemonShapeReadTest()
    }

    
}
