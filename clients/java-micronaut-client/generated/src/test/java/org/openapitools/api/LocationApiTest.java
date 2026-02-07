package org.openapitools.api;

import org.openapitools.model.LocationAreaDetail;
import org.openapitools.model.LocationDetail;
import org.openapitools.model.PaginatedLocationAreaSummaryList;
import org.openapitools.model.PaginatedLocationSummaryList;
import org.openapitools.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.model.PaginatedRegionSummaryList;
import org.openapitools.model.PalParkAreaDetail;
import org.openapitools.model.RegionDetail;
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
 * API tests for LocationApi
 */
@MicronautTest
public class LocationApiTest {

    @Inject
    LocationApi api;

    
    /**
     * List location areas
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     */
    @Test
    @Disabled("Not Implemented")
    public void locationAreaListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        PaginatedLocationAreaSummaryList body = api.locationAreaList(limit, offset).block();

        // then
        // TODO implement the locationAreaListTest()
    }

    
    /**
     * Get location area
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     */
    @Test
    @Disabled("Not Implemented")
    public void locationAreaRetrieveTest() {
        // given
        Integer id = 56;

        // when
        LocationAreaDetail body = api.locationAreaRetrieve(id).block();

        // then
        // TODO implement the locationAreaRetrieveTest()
    }

    
    /**
     * List locations
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     */
    @Test
    @Disabled("Not Implemented")
    public void locationListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedLocationSummaryList body = api.locationList(limit, offset, q).block();

        // then
        // TODO implement the locationListTest()
    }

    
    /**
     * Get location
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     */
    @Test
    @Disabled("Not Implemented")
    public void locationRetrieveTest() {
        // given
        String id = "example";

        // when
        LocationDetail body = api.locationRetrieve(id).block();

        // then
        // TODO implement the locationRetrieveTest()
    }

    
    /**
     * List pal park areas
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     */
    @Test
    @Disabled("Not Implemented")
    public void palParkAreaListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPalParkAreaSummaryList body = api.palParkAreaList(limit, offset, q).block();

        // then
        // TODO implement the palParkAreaListTest()
    }

    
    /**
     * Get pal park area
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     */
    @Test
    @Disabled("Not Implemented")
    public void palParkAreaRetrieveTest() {
        // given
        String id = "example";

        // when
        PalParkAreaDetail body = api.palParkAreaRetrieve(id).block();

        // then
        // TODO implement the palParkAreaRetrieveTest()
    }

    
    /**
     * List regions
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     */
    @Test
    @Disabled("Not Implemented")
    public void regionListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedRegionSummaryList body = api.regionList(limit, offset, q).block();

        // then
        // TODO implement the regionListTest()
    }

    
    /**
     * Get region
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     */
    @Test
    @Disabled("Not Implemented")
    public void regionRetrieveTest() {
        // given
        String id = "example";

        // when
        RegionDetail body = api.regionRetrieve(id).block();

        // then
        // TODO implement the regionRetrieveTest()
    }

    
}
