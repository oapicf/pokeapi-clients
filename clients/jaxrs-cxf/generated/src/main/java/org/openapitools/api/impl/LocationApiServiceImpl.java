package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.LocationAreaDetail;
import org.openapitools.model.LocationDetail;
import org.openapitools.model.PaginatedLocationAreaSummaryList;
import org.openapitools.model.PaginatedLocationSummaryList;
import org.openapitools.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.model.PaginatedRegionSummaryList;
import org.openapitools.model.PalParkAreaDetail;
import org.openapitools.model.RegionDetail;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * PokéAPI
 *
 * <p>All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 */
public class LocationApiServiceImpl implements LocationApi {
    /**
     * List location areas
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     *
     */
    public PaginatedLocationAreaSummaryList locationAreaList(Integer limit, Integer offset) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get location area
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     *
     */
    public LocationAreaDetail locationAreaRetrieve(Integer id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List locations
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     *
     */
    public PaginatedLocationSummaryList locationList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get location
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     *
     */
    public LocationDetail locationRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pal park areas
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     *
     */
    public PaginatedPalParkAreaSummaryList palParkAreaList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pal park area
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     *
     */
    public PalParkAreaDetail palParkAreaRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List regions
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     *
     */
    public PaginatedRegionSummaryList regionList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get region
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     *
     */
    public RegionDetail regionRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

}
