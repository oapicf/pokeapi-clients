package org.openapitools.api;

import org.openapitools.model.BerryDetail;
import org.openapitools.model.BerryFirmnessDetail;
import org.openapitools.model.BerryFlavorDetail;
import org.openapitools.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.model.PaginatedBerrySummaryList;
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
 * API tests for BerriesApi
 */
@MicronautTest
public class BerriesApiTest {

    @Inject
    BerriesApi api;

    
    /**
     * List berry firmness
     *
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void berryFirmnessListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedBerryFirmnessSummaryList body = api.berryFirmnessList(limit, offset, q).block();

        // then
        // TODO implement the berryFirmnessListTest()
    }

    
    /**
     * Get berry by firmness
     *
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void berryFirmnessRetrieveTest() {
        // given
        String id = "example";

        // when
        BerryFirmnessDetail body = api.berryFirmnessRetrieve(id).block();

        // then
        // TODO implement the berryFirmnessRetrieveTest()
    }

    
    /**
     * List berry flavors
     *
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void berryFlavorListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedBerryFlavorSummaryList body = api.berryFlavorList(limit, offset, q).block();

        // then
        // TODO implement the berryFlavorListTest()
    }

    
    /**
     * Get berries by flavor
     *
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void berryFlavorRetrieveTest() {
        // given
        String id = "example";

        // when
        BerryFlavorDetail body = api.berryFlavorRetrieve(id).block();

        // then
        // TODO implement the berryFlavorRetrieveTest()
    }

    
    /**
     * List berries
     *
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void berryListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedBerrySummaryList body = api.berryList(limit, offset, q).block();

        // then
        // TODO implement the berryListTest()
    }

    
    /**
     * Get a berry
     *
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void berryRetrieveTest() {
        // given
        String id = "example";

        // when
        BerryDetail body = api.berryRetrieve(id).block();

        // then
        // TODO implement the berryRetrieveTest()
    }

    
}
