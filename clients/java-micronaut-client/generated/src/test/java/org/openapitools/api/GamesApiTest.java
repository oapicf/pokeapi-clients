package org.openapitools.api;

import org.openapitools.model.GenerationDetail;
import org.openapitools.model.PaginatedGenerationSummaryList;
import org.openapitools.model.PaginatedPokedexSummaryList;
import org.openapitools.model.PaginatedVersionGroupSummaryList;
import org.openapitools.model.PaginatedVersionSummaryList;
import org.openapitools.model.PokedexDetail;
import org.openapitools.model.VersionDetail;
import org.openapitools.model.VersionGroupDetail;
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
 * API tests for GamesApi
 */
@MicronautTest
public class GamesApiTest {

    @Inject
    GamesApi api;

    
    /**
     * List genrations
     *
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     */
    @Test
    @Disabled("Not Implemented")
    public void generationListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedGenerationSummaryList body = api.generationList(limit, offset, q).block();

        // then
        // TODO implement the generationListTest()
    }

    
    /**
     * Get genration
     *
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     */
    @Test
    @Disabled("Not Implemented")
    public void generationRetrieveTest() {
        // given
        String id = "example";

        // when
        GenerationDetail body = api.generationRetrieve(id).block();

        // then
        // TODO implement the generationRetrieveTest()
    }

    
    /**
     * List pokedex
     *
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokedexListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokedexSummaryList body = api.pokedexList(limit, offset, q).block();

        // then
        // TODO implement the pokedexListTest()
    }

    
    /**
     * Get pokedex
     *
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokedexRetrieveTest() {
        // given
        String id = "example";

        // when
        PokedexDetail body = api.pokedexRetrieve(id).block();

        // then
        // TODO implement the pokedexRetrieveTest()
    }

    
    /**
     * List version groups
     *
     * Version groups categorize highly similar versions of the games.
     */
    @Test
    @Disabled("Not Implemented")
    public void versionGroupListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedVersionGroupSummaryList body = api.versionGroupList(limit, offset, q).block();

        // then
        // TODO implement the versionGroupListTest()
    }

    
    /**
     * Get version group
     *
     * Version groups categorize highly similar versions of the games.
     */
    @Test
    @Disabled("Not Implemented")
    public void versionGroupRetrieveTest() {
        // given
        String id = "example";

        // when
        VersionGroupDetail body = api.versionGroupRetrieve(id).block();

        // then
        // TODO implement the versionGroupRetrieveTest()
    }

    
    /**
     * List versions
     *
     * Versions of the games, e.g., Red, Blue or Yellow.
     */
    @Test
    @Disabled("Not Implemented")
    public void versionListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedVersionSummaryList body = api.versionList(limit, offset, q).block();

        // then
        // TODO implement the versionListTest()
    }

    
    /**
     * Get version
     *
     * Versions of the games, e.g., Red, Blue or Yellow.
     */
    @Test
    @Disabled("Not Implemented")
    public void versionRetrieveTest() {
        // given
        String id = "example";

        // when
        VersionDetail body = api.versionRetrieve(id).block();

        // then
        // TODO implement the versionRetrieveTest()
    }

    
}
