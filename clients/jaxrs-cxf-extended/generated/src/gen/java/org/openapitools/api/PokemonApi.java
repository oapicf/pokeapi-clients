package org.openapitools.api;

import org.openapitools.model.AbilityDetail;
import org.openapitools.model.CharacteristicDetail;
import org.openapitools.model.EggGroupDetail;
import org.openapitools.model.GenderDetail;
import org.openapitools.model.GrowthRateDetail;
import org.openapitools.model.MoveDamageClassDetail;
import org.openapitools.model.NatureDetail;
import org.openapitools.model.PaginatedAbilitySummaryList;
import org.openapitools.model.PaginatedCharacteristicSummaryList;
import org.openapitools.model.PaginatedEggGroupSummaryList;
import org.openapitools.model.PaginatedGenderSummaryList;
import org.openapitools.model.PaginatedGrowthRateSummaryList;
import org.openapitools.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.model.PaginatedNatureSummaryList;
import org.openapitools.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.model.PaginatedPokemonColorSummaryList;
import org.openapitools.model.PaginatedPokemonFormSummaryList;
import org.openapitools.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.model.PaginatedPokemonSummaryList;
import org.openapitools.model.PaginatedStatSummaryList;
import org.openapitools.model.PaginatedTypeSummaryList;
import org.openapitools.model.PokeathlonStatDetail;
import org.openapitools.model.PokemonColorDetail;
import org.openapitools.model.PokemonDetail;
import org.openapitools.model.PokemonFormDetail;
import org.openapitools.model.PokemonHabitatDetail;
import org.openapitools.model.PokemonShapeDetail;
import org.openapitools.model.PokemonSpeciesDetail;
import org.openapitools.model.StatDetail;
import org.openapitools.model.TypeDetail;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PokéAPI
 *
 * <p>All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 */
@Path("/api/v2")
@Api(value = "/", description = "")
public interface PokemonApi  {

    @GET
    @Path("/ability/")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedAbilitySummaryList.class) })
    public PaginatedAbilitySummaryList abilityList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    @GET
    @Path("/ability/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = AbilityDetail.class) })
    public AbilityDetail abilityRetrieve(@PathParam("id") String id);

    /**
     * List charecterictics
     *
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     *
     */
    @GET
    @Path("/characteristic/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List charecterictics", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedCharacteristicSummaryList.class) })
    public PaginatedCharacteristicSummaryList characteristicList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get characteristic
     *
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     *
     */
    @GET
    @Path("/characteristic/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get characteristic", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = CharacteristicDetail.class) })
    public CharacteristicDetail characteristicRetrieve(@PathParam("id") String id);

    /**
     * List egg groups
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     *
     */
    @GET
    @Path("/egg-group/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List egg groups", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEggGroupSummaryList.class) })
    public PaginatedEggGroupSummaryList eggGroupList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get egg group
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     *
     */
    @GET
    @Path("/egg-group/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get egg group", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EggGroupDetail.class) })
    public EggGroupDetail eggGroupRetrieve(@PathParam("id") String id);

    /**
     * List genders
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     *
     */
    @GET
    @Path("/gender/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List genders", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedGenderSummaryList.class) })
    public PaginatedGenderSummaryList genderList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get gender
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     *
     */
    @GET
    @Path("/gender/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get gender", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = GenderDetail.class) })
    public GenderDetail genderRetrieve(@PathParam("id") String id);

    /**
     * List growth rates
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     *
     */
    @GET
    @Path("/growth-rate/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List growth rates", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedGrowthRateSummaryList.class) })
    public PaginatedGrowthRateSummaryList growthRateList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get growth rate
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     *
     */
    @GET
    @Path("/growth-rate/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get growth rate", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = GrowthRateDetail.class) })
    public GrowthRateDetail growthRateRetrieve(@PathParam("id") String id);

    /**
     * List move damage classes
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     *
     */
    @GET
    @Path("/move-damage-class/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move damage classes", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveDamageClassSummaryList.class) })
    public PaginatedMoveDamageClassSummaryList moveDamageClassList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get move damage class
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     *
     */
    @GET
    @Path("/move-damage-class/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move damage class", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveDamageClassDetail.class) })
    public MoveDamageClassDetail moveDamageClassRetrieve(@PathParam("id") String id);

    /**
     * List natures
     *
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     *
     */
    @GET
    @Path("/nature/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List natures", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedNatureSummaryList.class) })
    public PaginatedNatureSummaryList natureList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get nature
     *
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     *
     */
    @GET
    @Path("/nature/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get nature", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = NatureDetail.class) })
    public NatureDetail natureRetrieve(@PathParam("id") String id);

    /**
     * List pokeathlon stats
     *
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     *
     */
    @GET
    @Path("/pokeathlon-stat/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokeathlon stats", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokeathlonStatSummaryList.class) })
    public PaginatedPokeathlonStatSummaryList pokeathlonStatList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pokeathlon stat
     *
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     *
     */
    @GET
    @Path("/pokeathlon-stat/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokeathlon stat", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokeathlonStatDetail.class) })
    public PokeathlonStatDetail pokeathlonStatRetrieve(@PathParam("id") String id);

    /**
     * List pokemon colors
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     *
     */
    @GET
    @Path("/pokemon-color/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon colors", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonColorSummaryList.class) })
    public PaginatedPokemonColorSummaryList pokemonColorList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pokemon color
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     *
     */
    @GET
    @Path("/pokemon-color/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon color", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonColorDetail.class) })
    public PokemonColorDetail pokemonColorRetrieve(@PathParam("id") String id);

    /**
     * List pokemon forms
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     *
     */
    @GET
    @Path("/pokemon-form/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon forms", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonFormSummaryList.class) })
    public PaginatedPokemonFormSummaryList pokemonFormList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pokemon form
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     *
     */
    @GET
    @Path("/pokemon-form/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon form", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonFormDetail.class) })
    public PokemonFormDetail pokemonFormRetrieve(@PathParam("id") String id);

    /**
     * List pokemom habitas
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     *
     */
    @GET
    @Path("/pokemon-habitat/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemom habitas", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonHabitatSummaryList.class) })
    public PaginatedPokemonHabitatSummaryList pokemonHabitatList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pokemom habita
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     *
     */
    @GET
    @Path("/pokemon-habitat/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemom habita", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonHabitatDetail.class) })
    public PokemonHabitatDetail pokemonHabitatRetrieve(@PathParam("id") String id);

    /**
     * List pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     *
     */
    @GET
    @Path("/pokemon/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonSummaryList.class) })
    public PaginatedPokemonSummaryList pokemonList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     *
     */
    @GET
    @Path("/pokemon/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonDetail.class) })
    public PokemonDetail pokemonRetrieve(@PathParam("id") String id);

    /**
     * List pokemon shapes
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     *
     */
    @GET
    @Path("/pokemon-shape/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon shapes", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonShapeSummaryList.class) })
    public PaginatedPokemonShapeSummaryList pokemonShapeList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pokemon shape
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     *
     */
    @GET
    @Path("/pokemon-shape/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon shape", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonShapeDetail.class) })
    public PokemonShapeDetail pokemonShapeRetrieve(@PathParam("id") String id);

    /**
     * List pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     *
     */
    @GET
    @Path("/pokemon-species/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon species", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonSpeciesSummaryList.class) })
    public PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     *
     */
    @GET
    @Path("/pokemon-species/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon species", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonSpeciesDetail.class) })
    public PokemonSpeciesDetail pokemonSpeciesRetrieve(@PathParam("id") String id);

    /**
     * List stats
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     *
     */
    @GET
    @Path("/stat/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List stats", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedStatSummaryList.class) })
    public PaginatedStatSummaryList statList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get stat
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     *
     */
    @GET
    @Path("/stat/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get stat", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = StatDetail.class) })
    public StatDetail statRetrieve(@PathParam("id") String id);

    /**
     * List types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     *
     */
    @GET
    @Path("/type/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List types", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedTypeSummaryList.class) })
    public PaginatedTypeSummaryList typeList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     *
     */
    @GET
    @Path("/type/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get types", tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = TypeDetail.class) })
    public TypeDetail typeRetrieve(@PathParam("id") String id);
}
