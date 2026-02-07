package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.EncounterConditionDetail;
import org.openapitools.model.EncounterConditionValueDetail;
import org.openapitools.model.EncounterMethodDetail;
import org.openapitools.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.model.PaginatedEncounterMethodSummaryList;

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
public class EncountersApiServiceImpl implements EncountersApi {
    /**
     * List encounter conditions
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     *
     */
    public PaginatedEncounterConditionSummaryList encounterConditionList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get encounter condition
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     *
     */
    public EncounterConditionDetail encounterConditionRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List encounter condition values
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     *
     */
    public PaginatedEncounterConditionValueSummaryList encounterConditionValueList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get encounter condition value
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     *
     */
    public EncounterConditionValueDetail encounterConditionValueRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List encounter methods
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     *
     */
    public PaginatedEncounterMethodSummaryList encounterMethodList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get encounter method
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     *
     */
    public EncounterMethodDetail encounterMethodRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

}
