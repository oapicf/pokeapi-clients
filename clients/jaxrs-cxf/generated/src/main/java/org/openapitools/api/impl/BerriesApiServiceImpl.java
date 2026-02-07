package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.BerryDetail;
import org.openapitools.model.BerryFirmnessDetail;
import org.openapitools.model.BerryFlavorDetail;
import org.openapitools.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.model.PaginatedBerrySummaryList;

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
public class BerriesApiServiceImpl implements BerriesApi {
    /**
     * List berry firmness
     *
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     *
     */
    public PaginatedBerryFirmnessSummaryList berryFirmnessList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get berry by firmness
     *
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     *
     */
    public BerryFirmnessDetail berryFirmnessRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List berry flavors
     *
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     *
     */
    public PaginatedBerryFlavorSummaryList berryFlavorList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get berries by flavor
     *
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     *
     */
    public BerryFlavorDetail berryFlavorRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List berries
     *
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     *
     */
    public PaginatedBerrySummaryList berryList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get a berry
     *
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     *
     */
    public BerryDetail berryRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

}
