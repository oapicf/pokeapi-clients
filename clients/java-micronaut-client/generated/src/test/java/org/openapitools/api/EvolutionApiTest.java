package org.openapitools.api;

import org.openapitools.model.EvolutionChainDetail;
import org.openapitools.model.EvolutionTriggerDetail;
import org.openapitools.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList;
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
 * API tests for EvolutionApi
 */
@MicronautTest
public class EvolutionApiTest {

    @Inject
    EvolutionApi api;

    
    /**
     * List evolution chains
     *
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     */
    @Test
    @Disabled("Not Implemented")
    public void evolutionChainListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEvolutionChainSummaryList body = api.evolutionChainList(limit, offset, q).block();

        // then
        // TODO implement the evolutionChainListTest()
    }

    
    /**
     * Get evolution chain
     *
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     */
    @Test
    @Disabled("Not Implemented")
    public void evolutionChainRetrieveTest() {
        // given
        String id = "example";

        // when
        EvolutionChainDetail body = api.evolutionChainRetrieve(id).block();

        // then
        // TODO implement the evolutionChainRetrieveTest()
    }

    
    /**
     * List evolution triggers
     *
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void evolutionTriggerListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEvolutionTriggerSummaryList body = api.evolutionTriggerList(limit, offset, q).block();

        // then
        // TODO implement the evolutionTriggerListTest()
    }

    
    /**
     * Get evolution trigger
     *
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void evolutionTriggerRetrieveTest() {
        // given
        String id = "example";

        // when
        EvolutionTriggerDetail body = api.evolutionTriggerRetrieve(id).block();

        // then
        // TODO implement the evolutionTriggerRetrieveTest()
    }

    
}
