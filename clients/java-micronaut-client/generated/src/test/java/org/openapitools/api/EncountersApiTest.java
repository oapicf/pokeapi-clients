package org.openapitools.api;

import org.openapitools.model.EncounterConditionDetail;
import org.openapitools.model.EncounterConditionValueDetail;
import org.openapitools.model.EncounterMethodDetail;
import org.openapitools.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInner;
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
 * API tests for EncountersApi
 */
@MicronautTest
public class EncountersApiTest {

    @Inject
    EncountersApi api;

    
    /**
     * List encounter conditions
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     */
    @Test
    @Disabled("Not Implemented")
    public void encounterConditionListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEncounterConditionSummaryList body = api.encounterConditionList(limit, offset, q).block();

        // then
        // TODO implement the encounterConditionListTest()
    }

    
    /**
     * Get encounter condition
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     */
    @Test
    @Disabled("Not Implemented")
    public void encounterConditionRetrieveTest() {
        // given
        String id = "example";

        // when
        EncounterConditionDetail body = api.encounterConditionRetrieve(id).block();

        // then
        // TODO implement the encounterConditionRetrieveTest()
    }

    
    /**
     * List encounter condition values
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     */
    @Test
    @Disabled("Not Implemented")
    public void encounterConditionValueListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEncounterConditionValueSummaryList body = api.encounterConditionValueList(limit, offset, q).block();

        // then
        // TODO implement the encounterConditionValueListTest()
    }

    
    /**
     * Get encounter condition value
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     */
    @Test
    @Disabled("Not Implemented")
    public void encounterConditionValueRetrieveTest() {
        // given
        String id = "example";

        // when
        EncounterConditionValueDetail body = api.encounterConditionValueRetrieve(id).block();

        // then
        // TODO implement the encounterConditionValueRetrieveTest()
    }

    
    /**
     * List encounter methods
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void encounterMethodListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEncounterMethodSummaryList body = api.encounterMethodList(limit, offset, q).block();

        // then
        // TODO implement the encounterMethodListTest()
    }

    
    /**
     * Get encounter method
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void encounterMethodRetrieveTest() {
        // given
        String id = "example";

        // when
        EncounterMethodDetail body = api.encounterMethodRetrieve(id).block();

        // then
        // TODO implement the encounterMethodRetrieveTest()
    }

    
    /**
     * Get pokemon encounter
     *
     * Handles Pokemon Encounters as a sub-resource.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonEncountersRetrieveTest() {
        // given
        String pokemonId = "example";

        // when
        List<PokemonEncountersRetrieve200ResponseInner> body = api.pokemonEncountersRetrieve(pokemonId).block();

        // then
        // TODO implement the pokemonEncountersRetrieveTest()
    }

    
}
