package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ContestEffectDetail;
import org.openapitools.model.ContestTypeDetail;
import org.openapitools.model.PaginatedContestEffectSummaryList;
import org.openapitools.model.PaginatedContestTypeSummaryList;
import org.openapitools.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.model.SuperContestEffectDetail;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * PokéAPI
 *
 * <p>All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 */
public class ContestsApiServiceImpl implements ContestsApi {
    /**
     * List contest effects
     *
     * Contest effects refer to the effects of moves when used in contests.
     *
     */
    @Override
    public PaginatedContestEffectSummaryList contestEffectList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get contest effect
     *
     * Contest effects refer to the effects of moves when used in contests.
     *
     */
    @Override
    public ContestEffectDetail contestEffectRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * List contest types
     *
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     *
     */
    @Override
    public PaginatedContestTypeSummaryList contestTypeList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get contest type
     *
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     *
     */
    @Override
    public ContestTypeDetail contestTypeRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * List super contest effects
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     *
     */
    @Override
    public PaginatedSuperContestEffectSummaryList superContestEffectList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get super contest effect
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     *
     */
    @Override
    public SuperContestEffectDetail superContestEffectRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

}
