package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.MachineDetail;
import org.openapitools.model.PaginatedMachineSummaryList;

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
public class MachinesApiServiceImpl implements MachinesApi {
    /**
     * List machines
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     *
     */
    @Override
    public PaginatedMachineSummaryList machineList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get machine
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     *
     */
    @Override
    public MachineDetail machineRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

}
