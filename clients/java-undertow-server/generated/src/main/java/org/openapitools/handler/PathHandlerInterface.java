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

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>List berry firmness</p>
     *
     * <p>Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/berry-firmness/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedBerryFirmnessSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler berryFirmnessList();

    /**
     * <p>Get berry by firmness</p>
     *
     * <p>Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/berry-firmness/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BerryFirmnessDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler berryFirmnessRetrieve();

    /**
     * <p>List berry flavors</p>
     *
     * <p>Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/berry-flavor/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedBerryFlavorSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler berryFlavorList();

    /**
     * <p>Get berries by flavor</p>
     *
     * <p>Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/berry-flavor/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BerryFlavorDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler berryFlavorRetrieve();

    /**
     * <p>List berries</p>
     *
     * <p>Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/berry/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedBerrySummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler berryList();

    /**
     * <p>Get a berry</p>
     *
     * <p>Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/berry/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BerryDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler berryRetrieve();

    /**
     * <p>List contest effects</p>
     *
     * <p>Contest effects refer to the effects of moves when used in contests.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/contest-effect/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedContestEffectSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler contestEffectList();

    /**
     * <p>Get contest effect</p>
     *
     * <p>Contest effects refer to the effects of moves when used in contests.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/contest-effect/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ContestEffectDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler contestEffectRetrieve();

    /**
     * <p>List contest types</p>
     *
     * <p>Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/contest-type/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedContestTypeSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler contestTypeList();

    /**
     * <p>Get contest type</p>
     *
     * <p>Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/contest-type/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ContestTypeDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler contestTypeRetrieve();

    /**
     * <p>List super contest effects</p>
     *
     * <p>Super contest effects refer to the effects of moves when used in super contests.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/super-contest-effect/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedSuperContestEffectSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler superContestEffectList();

    /**
     * <p>Get super contest effect</p>
     *
     * <p>Super contest effects refer to the effects of moves when used in super contests.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/super-contest-effect/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SuperContestEffectDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler superContestEffectRetrieve();

    /**
     * <p>List encounter conditions</p>
     *
     * <p>Conditions which affect what pokemon might appear in the wild, e.g., day or night.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/encounter-condition/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedEncounterConditionSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler encounterConditionList();

    /**
     * <p>Get encounter condition</p>
     *
     * <p>Conditions which affect what pokemon might appear in the wild, e.g., day or night.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/encounter-condition/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link EncounterConditionDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler encounterConditionRetrieve();

    /**
     * <p>List encounter condition values</p>
     *
     * <p>Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/encounter-condition-value/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedEncounterConditionValueSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler encounterConditionValueList();

    /**
     * <p>Get encounter condition value</p>
     *
     * <p>Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/encounter-condition-value/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link EncounterConditionValueDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler encounterConditionValueRetrieve();

    /**
     * <p>List encounter methods</p>
     *
     * <p>Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/encounter-method/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedEncounterMethodSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler encounterMethodList();

    /**
     * <p>Get encounter method</p>
     *
     * <p>Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/encounter-method/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link EncounterMethodDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler encounterMethodRetrieve();

    /**
     * <p>Get pokemon encounter</p>
     *
     * <p>Handles Pokemon Encounters as a sub-resource.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon/{pokemon_id}/encounters" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pokemon_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link PokemonEncountersRetrieve200ResponseInner}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonEncountersRetrieve();

    /**
     * <p>List evolution chains</p>
     *
     * <p>Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/evolution-chain/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedEvolutionChainSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler evolutionChainList();

    /**
     * <p>Get evolution chain</p>
     *
     * <p>Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/evolution-chain/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link EvolutionChainDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler evolutionChainRetrieve();

    /**
     * <p>List evolution triggers</p>
     *
     * <p>Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/evolution-trigger/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedEvolutionTriggerSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler evolutionTriggerList();

    /**
     * <p>Get evolution trigger</p>
     *
     * <p>Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/evolution-trigger/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link EvolutionTriggerDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler evolutionTriggerRetrieve();

    /**
     * <p>List genrations</p>
     *
     * <p>A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/generation/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedGenerationSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler generationList();

    /**
     * <p>Get genration</p>
     *
     * <p>A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/generation/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link GenerationDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler generationRetrieve();

    /**
     * <p>List pokedex</p>
     *
     * <p>A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokedex/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPokedexSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokedexList();

    /**
     * <p>Get pokedex</p>
     *
     * <p>A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokedex/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PokedexDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokedexRetrieve();

    /**
     * <p>List version groups</p>
     *
     * <p>Version groups categorize highly similar versions of the games.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/version-group/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedVersionGroupSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler versionGroupList();

    /**
     * <p>Get version group</p>
     *
     * <p>Version groups categorize highly similar versions of the games.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/version-group/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VersionGroupDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler versionGroupRetrieve();

    /**
     * <p>List versions</p>
     *
     * <p>Versions of the games, e.g., Red, Blue or Yellow.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/version/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedVersionSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler versionList();

    /**
     * <p>Get version</p>
     *
     * <p>Versions of the games, e.g., Red, Blue or Yellow.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/version/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VersionDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler versionRetrieve();

    /**
     * <p>List item attributes</p>
     *
     * <p>Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item-attribute/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedItemAttributeSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemAttributeList();

    /**
     * <p>Get item attribute</p>
     *
     * <p>Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item-attribute/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ItemAttributeDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemAttributeRetrieve();

    /**
     * <p>List item categories</p>
     *
     * <p>Item categories determine where items will be placed in the players bag.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item-category/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedItemCategorySummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemCategoryList();

    /**
     * <p>Get item category</p>
     *
     * <p>Item categories determine where items will be placed in the players bag.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item-category/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ItemCategoryDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemCategoryRetrieve();

    /**
     * <p>List item fling effects</p>
     *
     * <p>The various effects of the move\"Fling\" when used with different items.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item-fling-effect/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedItemFlingEffectSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemFlingEffectList();

    /**
     * <p>Get item fling effect</p>
     *
     * <p>The various effects of the move\"Fling\" when used with different items.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item-fling-effect/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ItemFlingEffectDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemFlingEffectRetrieve();

    /**
     * <p>List items</p>
     *
     * <p>An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedItemSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemList();

    /**
     * <p>List item pockets</p>
     *
     * <p>Pockets within the players bag used for storing items by category.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item-pocket/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedItemPocketSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemPocketList();

    /**
     * <p>Get item pocket</p>
     *
     * <p>Pockets within the players bag used for storing items by category.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item-pocket/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ItemPocketDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemPocketRetrieve();

    /**
     * <p>Get item</p>
     *
     * <p>An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/item/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ItemDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemRetrieve();

    /**
     * <p>List location areas</p>
     *
     * <p>Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/location-area/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedLocationAreaSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler locationAreaList();

    /**
     * <p>Get location area</p>
     *
     * <p>Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/location-area/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>A unique integer value identifying this location area.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LocationAreaDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler locationAreaRetrieve();

    /**
     * <p>List locations</p>
     *
     * <p>Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/location/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedLocationSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler locationList();

    /**
     * <p>Get location</p>
     *
     * <p>Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/location/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LocationDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler locationRetrieve();

    /**
     * <p>List pal park areas</p>
     *
     * <p>Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pal-park-area/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPalParkAreaSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler palParkAreaList();

    /**
     * <p>Get pal park area</p>
     *
     * <p>Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pal-park-area/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PalParkAreaDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler palParkAreaRetrieve();

    /**
     * <p>List regions</p>
     *
     * <p>A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/region/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedRegionSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler regionList();

    /**
     * <p>Get region</p>
     *
     * <p>A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/region/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RegionDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler regionRetrieve();

    /**
     * <p>List machines</p>
     *
     * <p>Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/machine/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedMachineSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler machineList();

    /**
     * <p>Get machine</p>
     *
     * <p>Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/machine/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MachineDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler machineRetrieve();

    /**
     * <p>List move meta ailments</p>
     *
     * <p>Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-ailment/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedMoveMetaAilmentSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveAilmentList();

    /**
     * <p>Get move meta ailment</p>
     *
     * <p>Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-ailment/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MoveMetaAilmentDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveAilmentRetrieve();

    /**
     * <p>List move battle styles</p>
     *
     * <p>Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-battle-style/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedMoveBattleStyleSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveBattleStyleList();

    /**
     * <p>Get move battle style</p>
     *
     * <p>Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-battle-style/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MoveBattleStyleDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveBattleStyleRetrieve();

    /**
     * <p>List move meta categories</p>
     *
     * <p>Very general categories that loosely group move effects.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-category/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedMoveMetaCategorySummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveCategoryList();

    /**
     * <p>Get move meta category</p>
     *
     * <p>Very general categories that loosely group move effects.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-category/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MoveMetaCategoryDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveCategoryRetrieve();

    /**
     * <p>List move learn methods</p>
     *
     * <p>Methods by which Pokémon can learn moves.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-learn-method/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedMoveLearnMethodSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveLearnMethodList();

    /**
     * <p>Get move learn method</p>
     *
     * <p>Methods by which Pokémon can learn moves.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-learn-method/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MoveLearnMethodDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveLearnMethodRetrieve();

    /**
     * <p>List moves</p>
     *
     * <p>Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedMoveSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveList();

    /**
     * <p>Get move</p>
     *
     * <p>Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MoveDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveRetrieve();

    /**
     * <p>List move targets</p>
     *
     * <p>Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-target/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedMoveTargetSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveTargetList();

    /**
     * <p>Get move target</p>
     *
     * <p>Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-target/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MoveTargetDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveTargetRetrieve();

    /**
     * <p>Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/ability/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedAbilitySummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler abilityList();

    /**
     * <p>Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/ability/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AbilityDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler abilityRetrieve();

    /**
     * <p>List charecterictics</p>
     *
     * <p>Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/characteristic/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedCharacteristicSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler characteristicList();

    /**
     * <p>Get characteristic</p>
     *
     * <p>Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/characteristic/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CharacteristicDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler characteristicRetrieve();

    /**
     * <p>List egg groups</p>
     *
     * <p>Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/egg-group/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedEggGroupSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler eggGroupList();

    /**
     * <p>Get egg group</p>
     *
     * <p>Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/egg-group/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link EggGroupDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler eggGroupRetrieve();

    /**
     * <p>List genders</p>
     *
     * <p>Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/gender/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedGenderSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler genderList();

    /**
     * <p>Get gender</p>
     *
     * <p>Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/gender/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link GenderDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler genderRetrieve();

    /**
     * <p>List growth rates</p>
     *
     * <p>Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/growth-rate/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedGrowthRateSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler growthRateList();

    /**
     * <p>Get growth rate</p>
     *
     * <p>Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/growth-rate/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link GrowthRateDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler growthRateRetrieve();

    /**
     * <p>List move damage classes</p>
     *
     * <p>Damage classes moves can have, e.g. physical, special, or non-damaging.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-damage-class/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedMoveDamageClassSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveDamageClassList();

    /**
     * <p>Get move damage class</p>
     *
     * <p>Damage classes moves can have, e.g. physical, special, or non-damaging.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/move-damage-class/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MoveDamageClassDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler moveDamageClassRetrieve();

    /**
     * <p>List natures</p>
     *
     * <p>Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/nature/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedNatureSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler natureList();

    /**
     * <p>Get nature</p>
     *
     * <p>Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/nature/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link NatureDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler natureRetrieve();

    /**
     * <p>List pokeathlon stats</p>
     *
     * <p>Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokeathlon-stat/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPokeathlonStatSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokeathlonStatList();

    /**
     * <p>Get pokeathlon stat</p>
     *
     * <p>Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokeathlon-stat/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PokeathlonStatDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokeathlonStatRetrieve();

    /**
     * <p>List pokemon colors</p>
     *
     * <p>Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-color/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPokemonColorSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonColorList();

    /**
     * <p>Get pokemon color</p>
     *
     * <p>Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-color/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PokemonColorDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonColorRetrieve();

    /**
     * <p>List pokemon forms</p>
     *
     * <p>Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-form/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPokemonFormSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonFormList();

    /**
     * <p>Get pokemon form</p>
     *
     * <p>Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-form/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PokemonFormDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonFormRetrieve();

    /**
     * <p>List pokemom habitas</p>
     *
     * <p>Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-habitat/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPokemonHabitatSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonHabitatList();

    /**
     * <p>Get pokemom habita</p>
     *
     * <p>Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-habitat/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PokemonHabitatDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonHabitatRetrieve();

    /**
     * <p>List pokemon</p>
     *
     * <p>Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPokemonSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonList();

    /**
     * <p>Get pokemon</p>
     *
     * <p>Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PokemonDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonRetrieve();

    /**
     * <p>List pokemon shapes</p>
     *
     * <p>Shapes used for sorting Pokémon in a Pokédex.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-shape/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPokemonShapeSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonShapeList();

    /**
     * <p>Get pokemon shape</p>
     *
     * <p>Shapes used for sorting Pokémon in a Pokédex.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-shape/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PokemonShapeDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonShapeRetrieve();

    /**
     * <p>List pokemon species</p>
     *
     * <p>A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-species/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedPokemonSpeciesSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonSpeciesList();

    /**
     * <p>Get pokemon species</p>
     *
     * <p>A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/pokemon-species/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PokemonSpeciesDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pokemonSpeciesRetrieve();

    /**
     * <p>List stats</p>
     *
     * <p>Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/stat/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedStatSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler statList();

    /**
     * <p>Get stat</p>
     *
     * <p>Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/stat/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link StatDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler statRetrieve();

    /**
     * <p>List types</p>
     *
     * <p>Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/type/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedTypeSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler typeList();

    /**
     * <p>Get types</p>
     *
     * <p>Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/type/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TypeDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler typeRetrieve();

    /**
     * <p>List languages</p>
     *
     * <p>Languages for translations of API resource information.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/language/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of results to return per page.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>offset</b>"
     * <p>The initial index from which to return the results.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>q</b>"
     * <p>> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PaginatedLanguageSummaryList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler languageList();

    /**
     * <p>Get language</p>
     *
     * <p>Languages for translations of API resource information.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v2/language/{id}/" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>This parameter can be a string or an integer.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LanguageDetail}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler languageRetrieve();
}
