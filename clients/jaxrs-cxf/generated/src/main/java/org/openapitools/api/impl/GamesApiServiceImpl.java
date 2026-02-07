package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.GenerationDetail;
import org.openapitools.model.PaginatedGenerationSummaryList;
import org.openapitools.model.PaginatedPokedexSummaryList;
import org.openapitools.model.PaginatedVersionGroupSummaryList;
import org.openapitools.model.PaginatedVersionSummaryList;
import org.openapitools.model.PokedexDetail;
import org.openapitools.model.VersionDetail;
import org.openapitools.model.VersionGroupDetail;

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
public class GamesApiServiceImpl implements GamesApi {
    /**
     * List genrations
     *
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     *
     */
    public PaginatedGenerationSummaryList generationList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get genration
     *
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     *
     */
    public GenerationDetail generationRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pokedex
     *
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     *
     */
    public PaginatedPokedexSummaryList pokedexList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pokedex
     *
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     *
     */
    public PokedexDetail pokedexRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List version groups
     *
     * Version groups categorize highly similar versions of the games.
     *
     */
    public PaginatedVersionGroupSummaryList versionGroupList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get version group
     *
     * Version groups categorize highly similar versions of the games.
     *
     */
    public VersionGroupDetail versionGroupRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List versions
     *
     * Versions of the games, e.g., Red, Blue or Yellow.
     *
     */
    public PaginatedVersionSummaryList versionList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get version
     *
     * Versions of the games, e.g., Red, Blue or Yellow.
     *
     */
    public VersionDetail versionRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

}
