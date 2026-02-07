/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 * OpenAPI document version: 2.7.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Methods;

/**
 * The default implementation for {@link HandlerProvider} and {@link PathHandlerInterface}.
 *
 * <p>There are two flavors of {@link HttpHandler}s to choose from, depending on your needs:</p>
 *
 * <ul>
 * <li>
 * <b>Stateless</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is not retained – a different {@link HttpHandler} is instantiated for every new
 * session. This is the default behavior.
 * </li>
 * <li>
 * <b>Stateful</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is retained properly. For example, if you want to keep a class property that counts
 * the number of requests or the last time a request was received.
 * </li>
 * </ul>
 * <p>Note: <b>Stateful</b> flavor is more performant than <b>Stateless</b>.</p>
 */
@SuppressWarnings("TooManyFunctions")
abstract public class PathHandlerProvider implements HandlerProvider, PathHandlerInterface {
    /**
     * Returns the default base path to access this server.
     */
    @javax.annotation.Nonnull
    public String getBasePath() {
        return "";
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
    * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    @Override
    public HttpHandler getHandler() {
        return getHandler(false);
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with ""
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final boolean withBasePath) {
        return getHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @SuppressWarnings("Convert2Lambda")
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.GET, basePath + "/api/v2/berry-firmness/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    berryFirmnessList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/berry-firmness/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    berryFirmnessRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/berry-flavor/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    berryFlavorList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/berry-flavor/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    berryFlavorRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/berry/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    berryList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/berry/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    berryRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/contest-effect/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    contestEffectList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/contest-effect/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    contestEffectRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/contest-type/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    contestTypeList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/contest-type/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    contestTypeRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/super-contest-effect/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    superContestEffectList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/super-contest-effect/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    superContestEffectRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/encounter-condition/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    encounterConditionList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/encounter-condition/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    encounterConditionRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/encounter-condition-value/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    encounterConditionValueList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/encounter-condition-value/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    encounterConditionValueRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/encounter-method/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    encounterMethodList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/encounter-method/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    encounterMethodRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/evolution-chain/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    evolutionChainList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/evolution-chain/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    evolutionChainRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/evolution-trigger/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    evolutionTriggerList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/evolution-trigger/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    evolutionTriggerRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/generation/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generationList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/generation/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generationRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokedex/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokedexList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokedex/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokedexRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/version-group/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    versionGroupList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/version-group/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    versionGroupRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/version/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    versionList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/version/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    versionRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item-attribute/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemAttributeList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item-attribute/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemAttributeRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item-category/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemCategoryList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item-category/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemCategoryRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item-fling-effect/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemFlingEffectList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item-fling-effect/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemFlingEffectRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item-pocket/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemPocketList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item-pocket/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemPocketRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/item/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/location-area/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    locationAreaList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/location-area/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    locationAreaRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/location/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    locationList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/location/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    locationRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pal-park-area/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    palParkAreaList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pal-park-area/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    palParkAreaRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/region/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    regionList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/region/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    regionRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/machine/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    machineList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/machine/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    machineRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-ailment/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveAilmentList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-ailment/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveAilmentRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-battle-style/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveBattleStyleList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-battle-style/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveBattleStyleRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-category/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveCategoryList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-category/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveCategoryRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-learn-method/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveLearnMethodList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-learn-method/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveLearnMethodRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-target/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveTargetList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-target/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveTargetRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/ability/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    abilityList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/ability/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    abilityRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/characteristic/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    characteristicList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/characteristic/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    characteristicRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/egg-group/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    eggGroupList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/egg-group/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    eggGroupRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/gender/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    genderList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/gender/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    genderRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/growth-rate/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    growthRateList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/growth-rate/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    growthRateRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-damage-class/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveDamageClassList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/move-damage-class/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    moveDamageClassRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/nature/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    natureList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/nature/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    natureRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokeathlon-stat/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokeathlonStatList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokeathlon-stat/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokeathlonStatRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-color/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonColorList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-color/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonColorRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-form/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonFormList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-form/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonFormRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-habitat/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonHabitatList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-habitat/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonHabitatRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-shape/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonShapeList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-shape/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonShapeRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-species/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonSpeciesList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/pokemon-species/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pokemonSpeciesRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/stat/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    statList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/stat/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    statRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/type/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    typeList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/type/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    typeRetrieve().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/language/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    languageList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/api/v2/language/{id}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    languageRetrieve().handleRequest(exchange);
                }
            })
            ;
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler() {
        return getStatefulHandler(false);
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with ""
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final boolean withBasePath) {
        return getStatefulHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.GET, basePath + "/api/v2/berry-firmness/", berryFirmnessList())
            .add(Methods.GET, basePath + "/api/v2/berry-firmness/{id}/", berryFirmnessRetrieve())
            .add(Methods.GET, basePath + "/api/v2/berry-flavor/", berryFlavorList())
            .add(Methods.GET, basePath + "/api/v2/berry-flavor/{id}/", berryFlavorRetrieve())
            .add(Methods.GET, basePath + "/api/v2/berry/", berryList())
            .add(Methods.GET, basePath + "/api/v2/berry/{id}/", berryRetrieve())
            .add(Methods.GET, basePath + "/api/v2/contest-effect/", contestEffectList())
            .add(Methods.GET, basePath + "/api/v2/contest-effect/{id}/", contestEffectRetrieve())
            .add(Methods.GET, basePath + "/api/v2/contest-type/", contestTypeList())
            .add(Methods.GET, basePath + "/api/v2/contest-type/{id}/", contestTypeRetrieve())
            .add(Methods.GET, basePath + "/api/v2/super-contest-effect/", superContestEffectList())
            .add(Methods.GET, basePath + "/api/v2/super-contest-effect/{id}/", superContestEffectRetrieve())
            .add(Methods.GET, basePath + "/api/v2/encounter-condition/", encounterConditionList())
            .add(Methods.GET, basePath + "/api/v2/encounter-condition/{id}/", encounterConditionRetrieve())
            .add(Methods.GET, basePath + "/api/v2/encounter-condition-value/", encounterConditionValueList())
            .add(Methods.GET, basePath + "/api/v2/encounter-condition-value/{id}/", encounterConditionValueRetrieve())
            .add(Methods.GET, basePath + "/api/v2/encounter-method/", encounterMethodList())
            .add(Methods.GET, basePath + "/api/v2/encounter-method/{id}/", encounterMethodRetrieve())
            .add(Methods.GET, basePath + "/api/v2/evolution-chain/", evolutionChainList())
            .add(Methods.GET, basePath + "/api/v2/evolution-chain/{id}/", evolutionChainRetrieve())
            .add(Methods.GET, basePath + "/api/v2/evolution-trigger/", evolutionTriggerList())
            .add(Methods.GET, basePath + "/api/v2/evolution-trigger/{id}/", evolutionTriggerRetrieve())
            .add(Methods.GET, basePath + "/api/v2/generation/", generationList())
            .add(Methods.GET, basePath + "/api/v2/generation/{id}/", generationRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pokedex/", pokedexList())
            .add(Methods.GET, basePath + "/api/v2/pokedex/{id}/", pokedexRetrieve())
            .add(Methods.GET, basePath + "/api/v2/version-group/", versionGroupList())
            .add(Methods.GET, basePath + "/api/v2/version-group/{id}/", versionGroupRetrieve())
            .add(Methods.GET, basePath + "/api/v2/version/", versionList())
            .add(Methods.GET, basePath + "/api/v2/version/{id}/", versionRetrieve())
            .add(Methods.GET, basePath + "/api/v2/item-attribute/", itemAttributeList())
            .add(Methods.GET, basePath + "/api/v2/item-attribute/{id}/", itemAttributeRetrieve())
            .add(Methods.GET, basePath + "/api/v2/item-category/", itemCategoryList())
            .add(Methods.GET, basePath + "/api/v2/item-category/{id}/", itemCategoryRetrieve())
            .add(Methods.GET, basePath + "/api/v2/item-fling-effect/", itemFlingEffectList())
            .add(Methods.GET, basePath + "/api/v2/item-fling-effect/{id}/", itemFlingEffectRetrieve())
            .add(Methods.GET, basePath + "/api/v2/item/", itemList())
            .add(Methods.GET, basePath + "/api/v2/item-pocket/", itemPocketList())
            .add(Methods.GET, basePath + "/api/v2/item-pocket/{id}/", itemPocketRetrieve())
            .add(Methods.GET, basePath + "/api/v2/item/{id}/", itemRetrieve())
            .add(Methods.GET, basePath + "/api/v2/location-area/", locationAreaList())
            .add(Methods.GET, basePath + "/api/v2/location-area/{id}/", locationAreaRetrieve())
            .add(Methods.GET, basePath + "/api/v2/location/", locationList())
            .add(Methods.GET, basePath + "/api/v2/location/{id}/", locationRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pal-park-area/", palParkAreaList())
            .add(Methods.GET, basePath + "/api/v2/pal-park-area/{id}/", palParkAreaRetrieve())
            .add(Methods.GET, basePath + "/api/v2/region/", regionList())
            .add(Methods.GET, basePath + "/api/v2/region/{id}/", regionRetrieve())
            .add(Methods.GET, basePath + "/api/v2/machine/", machineList())
            .add(Methods.GET, basePath + "/api/v2/machine/{id}/", machineRetrieve())
            .add(Methods.GET, basePath + "/api/v2/move-ailment/", moveAilmentList())
            .add(Methods.GET, basePath + "/api/v2/move-ailment/{id}/", moveAilmentRetrieve())
            .add(Methods.GET, basePath + "/api/v2/move-battle-style/", moveBattleStyleList())
            .add(Methods.GET, basePath + "/api/v2/move-battle-style/{id}/", moveBattleStyleRetrieve())
            .add(Methods.GET, basePath + "/api/v2/move-category/", moveCategoryList())
            .add(Methods.GET, basePath + "/api/v2/move-category/{id}/", moveCategoryRetrieve())
            .add(Methods.GET, basePath + "/api/v2/move-learn-method/", moveLearnMethodList())
            .add(Methods.GET, basePath + "/api/v2/move-learn-method/{id}/", moveLearnMethodRetrieve())
            .add(Methods.GET, basePath + "/api/v2/move/", moveList())
            .add(Methods.GET, basePath + "/api/v2/move/{id}/", moveRetrieve())
            .add(Methods.GET, basePath + "/api/v2/move-target/", moveTargetList())
            .add(Methods.GET, basePath + "/api/v2/move-target/{id}/", moveTargetRetrieve())
            .add(Methods.GET, basePath + "/api/v2/ability/", abilityList())
            .add(Methods.GET, basePath + "/api/v2/ability/{id}/", abilityRetrieve())
            .add(Methods.GET, basePath + "/api/v2/characteristic/", characteristicList())
            .add(Methods.GET, basePath + "/api/v2/characteristic/{id}/", characteristicRetrieve())
            .add(Methods.GET, basePath + "/api/v2/egg-group/", eggGroupList())
            .add(Methods.GET, basePath + "/api/v2/egg-group/{id}/", eggGroupRetrieve())
            .add(Methods.GET, basePath + "/api/v2/gender/", genderList())
            .add(Methods.GET, basePath + "/api/v2/gender/{id}/", genderRetrieve())
            .add(Methods.GET, basePath + "/api/v2/growth-rate/", growthRateList())
            .add(Methods.GET, basePath + "/api/v2/growth-rate/{id}/", growthRateRetrieve())
            .add(Methods.GET, basePath + "/api/v2/move-damage-class/", moveDamageClassList())
            .add(Methods.GET, basePath + "/api/v2/move-damage-class/{id}/", moveDamageClassRetrieve())
            .add(Methods.GET, basePath + "/api/v2/nature/", natureList())
            .add(Methods.GET, basePath + "/api/v2/nature/{id}/", natureRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pokeathlon-stat/", pokeathlonStatList())
            .add(Methods.GET, basePath + "/api/v2/pokeathlon-stat/{id}/", pokeathlonStatRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pokemon-color/", pokemonColorList())
            .add(Methods.GET, basePath + "/api/v2/pokemon-color/{id}/", pokemonColorRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pokemon-form/", pokemonFormList())
            .add(Methods.GET, basePath + "/api/v2/pokemon-form/{id}/", pokemonFormRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pokemon-habitat/", pokemonHabitatList())
            .add(Methods.GET, basePath + "/api/v2/pokemon-habitat/{id}/", pokemonHabitatRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pokemon/", pokemonList())
            .add(Methods.GET, basePath + "/api/v2/pokemon/{id}/", pokemonRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pokemon-shape/", pokemonShapeList())
            .add(Methods.GET, basePath + "/api/v2/pokemon-shape/{id}/", pokemonShapeRetrieve())
            .add(Methods.GET, basePath + "/api/v2/pokemon-species/", pokemonSpeciesList())
            .add(Methods.GET, basePath + "/api/v2/pokemon-species/{id}/", pokemonSpeciesRetrieve())
            .add(Methods.GET, basePath + "/api/v2/stat/", statList())
            .add(Methods.GET, basePath + "/api/v2/stat/{id}/", statRetrieve())
            .add(Methods.GET, basePath + "/api/v2/type/", typeList())
            .add(Methods.GET, basePath + "/api/v2/type/{id}/", typeRetrieve())
            .add(Methods.GET, basePath + "/api/v2/language/", languageList())
            .add(Methods.GET, basePath + "/api/v2/language/{id}/", languageRetrieve())
            ;
    }
}
