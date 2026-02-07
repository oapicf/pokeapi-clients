package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.EvolutionChainDetail;
import org.openapitools.model.EvolutionTriggerDetail;
import org.openapitools.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList;

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
public class EvolutionApiServiceImpl implements EvolutionApi {
    /**
     * List evolution chains
     *
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     *
     */
    @Override
    public PaginatedEvolutionChainSummaryList evolutionChainList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get evolution chain
     *
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     *
     */
    @Override
    public EvolutionChainDetail evolutionChainRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * List evolution triggers
     *
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     *
     */
    @Override
    public PaginatedEvolutionTriggerSummaryList evolutionTriggerList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get evolution trigger
     *
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     *
     */
    @Override
    public EvolutionTriggerDetail evolutionTriggerRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

}
