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
    @Disabled("Not Implemented")
    public void pokemonHabitatListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.pokemonHabitatList(limit, offset).block();

        // then
        // TODO implement the pokemonHabitatListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonHabitatReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.pokemonHabitatRead(id).block();

        // then
        // TODO implement the pokemonHabitatReadTest()
    }

    
}
