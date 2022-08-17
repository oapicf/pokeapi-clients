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
 * API tests for EvolutionChainApi
 */
@MicronautTest
public class EvolutionChainApiTest {

    @Inject
    EvolutionChainApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void evolutionChainListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.evolutionChainList(limit, offset).block();

        // then
        // TODO implement the evolutionChainListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void evolutionChainReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.evolutionChainRead(id).block();

        // then
        // TODO implement the evolutionChainReadTest()
    }

    
}
