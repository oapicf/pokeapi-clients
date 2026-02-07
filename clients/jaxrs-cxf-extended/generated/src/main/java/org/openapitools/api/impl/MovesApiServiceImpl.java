package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.MoveBattleStyleDetail;
import org.openapitools.model.MoveDetail;
import org.openapitools.model.MoveLearnMethodDetail;
import org.openapitools.model.MoveMetaAilmentDetail;
import org.openapitools.model.MoveMetaCategoryDetail;
import org.openapitools.model.MoveTargetDetail;
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.model.PaginatedMoveSummaryList;
import org.openapitools.model.PaginatedMoveTargetSummaryList;

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
public class MovesApiServiceImpl implements MovesApi {
    /**
     * List move meta ailments
     *
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     *
     */
    @Override
    public PaginatedMoveMetaAilmentSummaryList moveAilmentList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get move meta ailment
     *
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     *
     */
    @Override
    public MoveMetaAilmentDetail moveAilmentRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * List move battle styles
     *
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     *
     */
    @Override
    public PaginatedMoveBattleStyleSummaryList moveBattleStyleList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get move battle style
     *
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     *
     */
    @Override
    public MoveBattleStyleDetail moveBattleStyleRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * List move meta categories
     *
     * Very general categories that loosely group move effects.
     *
     */
    @Override
    public PaginatedMoveMetaCategorySummaryList moveCategoryList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get move meta category
     *
     * Very general categories that loosely group move effects.
     *
     */
    @Override
    public MoveMetaCategoryDetail moveCategoryRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * List move learn methods
     *
     * Methods by which Pokémon can learn moves.
     *
     */
    @Override
    public PaginatedMoveLearnMethodSummaryList moveLearnMethodList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get move learn method
     *
     * Methods by which Pokémon can learn moves.
     *
     */
    @Override
    public MoveLearnMethodDetail moveLearnMethodRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * List moves
     *
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     *
     */
    @Override
    public PaginatedMoveSummaryList moveList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get move
     *
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     *
     */
    @Override
    public MoveDetail moveRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * List move targets
     *
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     *
     */
    @Override
    public PaginatedMoveTargetSummaryList moveTargetList(Integer limit, Integer offset, String q) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get move target
     *
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     *
     */
    @Override
    public MoveTargetDetail moveTargetRetrieve(String id) {
        // TODO: Implement...
        return null;
    }

}
