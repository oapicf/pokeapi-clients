package org.openapitools.api;

import org.openapitools.model.AbilityDetail;
import org.openapitools.model.BerryDetail;
import org.openapitools.model.BerryFirmnessDetail;
import org.openapitools.model.BerryFlavorDetail;
import org.openapitools.model.CharacteristicDetail;
import org.openapitools.model.ContestEffectDetail;
import org.openapitools.model.ContestTypeDetail;
import org.openapitools.model.EggGroupDetail;
import org.openapitools.model.EncounterConditionDetail;
import org.openapitools.model.EncounterConditionValueDetail;
import org.openapitools.model.EncounterMethodDetail;
import org.openapitools.model.EvolutionChainDetail;
import org.openapitools.model.EvolutionTriggerDetail;
import org.openapitools.model.GenderDetail;
import org.openapitools.model.GenerationDetail;
import org.openapitools.model.GrowthRateDetail;
import org.openapitools.model.ItemAttributeDetail;
import org.openapitools.model.ItemCategoryDetail;
import org.openapitools.model.ItemDetail;
import org.openapitools.model.ItemFlingEffectDetail;
import org.openapitools.model.ItemPocketDetail;
import org.openapitools.model.LanguageDetail;
import org.openapitools.model.LocationAreaDetail;
import org.openapitools.model.LocationDetail;
import org.openapitools.model.MachineDetail;
import org.openapitools.model.MoveBattleStyleDetail;
import org.openapitools.model.MoveDamageClassDetail;
import org.openapitools.model.MoveDetail;
import org.openapitools.model.MoveLearnMethodDetail;
import org.openapitools.model.MoveMetaAilmentDetail;
import org.openapitools.model.MoveMetaCategoryDetail;
import org.openapitools.model.MoveTargetDetail;
import org.openapitools.model.NatureDetail;
import org.openapitools.model.PaginatedAbilitySummaryList;
import org.openapitools.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.model.PaginatedBerrySummaryList;
import org.openapitools.model.PaginatedCharacteristicSummaryList;
import org.openapitools.model.PaginatedContestEffectSummaryList;
import org.openapitools.model.PaginatedContestTypeSummaryList;
import org.openapitools.model.PaginatedEggGroupSummaryList;
import org.openapitools.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList;
import org.openapitools.model.PaginatedGenderSummaryList;
import org.openapitools.model.PaginatedGenerationSummaryList;
import org.openapitools.model.PaginatedGrowthRateSummaryList;
import org.openapitools.model.PaginatedItemAttributeSummaryList;
import org.openapitools.model.PaginatedItemCategorySummaryList;
import org.openapitools.model.PaginatedItemFlingEffectSummaryList;
import org.openapitools.model.PaginatedItemPocketSummaryList;
import org.openapitools.model.PaginatedItemSummaryList;
import org.openapitools.model.PaginatedLanguageSummaryList;
import org.openapitools.model.PaginatedLocationAreaSummaryList;
import org.openapitools.model.PaginatedLocationSummaryList;
import org.openapitools.model.PaginatedMachineSummaryList;
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.model.PaginatedMoveSummaryList;
import org.openapitools.model.PaginatedMoveTargetSummaryList;
import org.openapitools.model.PaginatedNatureSummaryList;
import org.openapitools.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.model.PaginatedPokedexSummaryList;
import org.openapitools.model.PaginatedPokemonColorSummaryList;
import org.openapitools.model.PaginatedPokemonFormSummaryList;
import org.openapitools.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.model.PaginatedPokemonSummaryList;
import org.openapitools.model.PaginatedRegionSummaryList;
import org.openapitools.model.PaginatedStatSummaryList;
import org.openapitools.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.model.PaginatedTypeSummaryList;
import org.openapitools.model.PaginatedVersionGroupSummaryList;
import org.openapitools.model.PaginatedVersionSummaryList;
import org.openapitools.model.PalParkAreaDetail;
import org.openapitools.model.PokeathlonStatDetail;
import org.openapitools.model.PokedexDetail;
import org.openapitools.model.PokemonColorDetail;
import org.openapitools.model.PokemonDetail;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInner;
import org.openapitools.model.PokemonFormDetail;
import org.openapitools.model.PokemonHabitatDetail;
import org.openapitools.model.PokemonShapeDetail;
import org.openapitools.model.PokemonSpeciesDetail;
import org.openapitools.model.RegionDetail;
import org.openapitools.model.StatDetail;
import org.openapitools.model.SuperContestEffectDetail;
import org.openapitools.model.TypeDetail;
import org.openapitools.model.VersionDetail;
import org.openapitools.model.VersionGroupDetail;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/api/v2")
@Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ApiApi {

    @GET
    @Path("/ability/")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.", response = PaginatedAbilitySummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedAbilitySummaryList.class)
    })
    public Response abilityList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/ability/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.", response = AbilityDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = AbilityDetail.class)
    })
    public Response abilityRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry-firmness/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List berry firmness", notes = "Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.", response = PaginatedBerryFirmnessSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedBerryFirmnessSummaryList.class)
    })
    public Response berryFirmnessList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry-firmness/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get berry by firmness", notes = "Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.", response = BerryFirmnessDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BerryFirmnessDetail.class)
    })
    public Response berryFirmnessRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry-flavor/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List berry flavors", notes = "Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.", response = PaginatedBerryFlavorSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedBerryFlavorSummaryList.class)
    })
    public Response berryFlavorList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry-flavor/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get berries by flavor", notes = "Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.", response = BerryFlavorDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BerryFlavorDetail.class)
    })
    public Response berryFlavorRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List berries", notes = "Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.", response = PaginatedBerrySummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedBerrySummaryList.class)
    })
    public Response berryList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a berry", notes = "Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.", response = BerryDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BerryDetail.class)
    })
    public Response berryRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/characteristic/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List charecterictics", notes = "Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.", response = PaginatedCharacteristicSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedCharacteristicSummaryList.class)
    })
    public Response characteristicList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/characteristic/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get characteristic", notes = "Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.", response = CharacteristicDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = CharacteristicDetail.class)
    })
    public Response characteristicRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/contest-effect/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List contest effects", notes = "Contest effects refer to the effects of moves when used in contests.", response = PaginatedContestEffectSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "contests" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedContestEffectSummaryList.class)
    })
    public Response contestEffectList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/contest-effect/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get contest effect", notes = "Contest effects refer to the effects of moves when used in contests.", response = ContestEffectDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "contests" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ContestEffectDetail.class)
    })
    public Response contestEffectRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/contest-type/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List contest types", notes = "Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.", response = PaginatedContestTypeSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "contests" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedContestTypeSummaryList.class)
    })
    public Response contestTypeList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/contest-type/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get contest type", notes = "Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.", response = ContestTypeDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "contests" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ContestTypeDetail.class)
    })
    public Response contestTypeRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/egg-group/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List egg groups", notes = "Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.", response = PaginatedEggGroupSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEggGroupSummaryList.class)
    })
    public Response eggGroupList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/egg-group/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get egg group", notes = "Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.", response = EggGroupDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EggGroupDetail.class)
    })
    public Response eggGroupRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-condition/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List encounter conditions", notes = "Conditions which affect what pokemon might appear in the wild, e.g., day or night.", response = PaginatedEncounterConditionSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEncounterConditionSummaryList.class)
    })
    public Response encounterConditionList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-condition/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get encounter condition", notes = "Conditions which affect what pokemon might appear in the wild, e.g., day or night.", response = EncounterConditionDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EncounterConditionDetail.class)
    })
    public Response encounterConditionRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-condition-value/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List encounter condition values", notes = "Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.", response = PaginatedEncounterConditionValueSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEncounterConditionValueSummaryList.class)
    })
    public Response encounterConditionValueList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-condition-value/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get encounter condition value", notes = "Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.", response = EncounterConditionValueDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EncounterConditionValueDetail.class)
    })
    public Response encounterConditionValueRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-method/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List encounter methods", notes = "Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.", response = PaginatedEncounterMethodSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEncounterMethodSummaryList.class)
    })
    public Response encounterMethodList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-method/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get encounter method", notes = "Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.", response = EncounterMethodDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EncounterMethodDetail.class)
    })
    public Response encounterMethodRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/evolution-chain/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List evolution chains", notes = "Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.", response = PaginatedEvolutionChainSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "evolution" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEvolutionChainSummaryList.class)
    })
    public Response evolutionChainList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/evolution-chain/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get evolution chain", notes = "Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.", response = EvolutionChainDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "evolution" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EvolutionChainDetail.class)
    })
    public Response evolutionChainRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/evolution-trigger/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List evolution triggers", notes = "Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.", response = PaginatedEvolutionTriggerSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "evolution" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEvolutionTriggerSummaryList.class)
    })
    public Response evolutionTriggerList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/evolution-trigger/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get evolution trigger", notes = "Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.", response = EvolutionTriggerDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "evolution" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EvolutionTriggerDetail.class)
    })
    public Response evolutionTriggerRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/gender/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List genders", notes = "Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.", response = PaginatedGenderSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedGenderSummaryList.class)
    })
    public Response genderList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/gender/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get gender", notes = "Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.", response = GenderDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = GenderDetail.class)
    })
    public Response genderRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/generation/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List genrations", notes = "A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.", response = PaginatedGenerationSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "games" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedGenerationSummaryList.class)
    })
    public Response generationList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/generation/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get genration", notes = "A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.", response = GenerationDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "games" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = GenerationDetail.class)
    })
    public Response generationRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/growth-rate/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List growth rates", notes = "Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.", response = PaginatedGrowthRateSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedGrowthRateSummaryList.class)
    })
    public Response growthRateList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/growth-rate/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get growth rate", notes = "Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.", response = GrowthRateDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = GrowthRateDetail.class)
    })
    public Response growthRateRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-attribute/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List item attributes", notes = "Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".", response = PaginatedItemAttributeSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemAttributeSummaryList.class)
    })
    public Response itemAttributeList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-attribute/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item attribute", notes = "Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".", response = ItemAttributeDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemAttributeDetail.class)
    })
    public Response itemAttributeRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-category/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List item categories", notes = "Item categories determine where items will be placed in the players bag.", response = PaginatedItemCategorySummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemCategorySummaryList.class)
    })
    public Response itemCategoryList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-category/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item category", notes = "Item categories determine where items will be placed in the players bag.", response = ItemCategoryDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemCategoryDetail.class)
    })
    public Response itemCategoryRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-fling-effect/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List item fling effects", notes = "The various effects of the move\"Fling\" when used with different items.", response = PaginatedItemFlingEffectSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemFlingEffectSummaryList.class)
    })
    public Response itemFlingEffectList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-fling-effect/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item fling effect", notes = "The various effects of the move\"Fling\" when used with different items.", response = ItemFlingEffectDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemFlingEffectDetail.class)
    })
    public Response itemFlingEffectRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List items", notes = "An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.", response = PaginatedItemSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemSummaryList.class)
    })
    public Response itemList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-pocket/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List item pockets", notes = "Pockets within the players bag used for storing items by category.", response = PaginatedItemPocketSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemPocketSummaryList.class)
    })
    public Response itemPocketList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-pocket/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item pocket", notes = "Pockets within the players bag used for storing items by category.", response = ItemPocketDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemPocketDetail.class)
    })
    public Response itemPocketRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item", notes = "An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.", response = ItemDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemDetail.class)
    })
    public Response itemRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/language/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List languages", notes = "Languages for translations of API resource information.", response = PaginatedLanguageSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "utility" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedLanguageSummaryList.class)
    })
    public Response languageList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/language/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get language", notes = "Languages for translations of API resource information.", response = LanguageDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "utility" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = LanguageDetail.class)
    })
    public Response languageRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/location-area/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List location areas", notes = "Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.", response = PaginatedLocationAreaSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedLocationAreaSummaryList.class)
    })
    public Response locationAreaList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/location-area/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get location area", notes = "Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.", response = LocationAreaDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = LocationAreaDetail.class)
    })
    public Response locationAreaRetrieve(@PathParam("id") @ApiParam("A unique integer value identifying this location area.") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/location/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List locations", notes = "Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.", response = PaginatedLocationSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedLocationSummaryList.class)
    })
    public Response locationList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/location/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get location", notes = "Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.", response = LocationDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = LocationDetail.class)
    })
    public Response locationRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/machine/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List machines", notes = "Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.", response = PaginatedMachineSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "machines" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMachineSummaryList.class)
    })
    public Response machineList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/machine/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get machine", notes = "Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.", response = MachineDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "machines" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MachineDetail.class)
    })
    public Response machineRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-ailment/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move meta ailments", notes = "Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.", response = PaginatedMoveMetaAilmentSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveMetaAilmentSummaryList.class)
    })
    public Response moveAilmentList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-ailment/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move meta ailment", notes = "Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.", response = MoveMetaAilmentDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveMetaAilmentDetail.class)
    })
    public Response moveAilmentRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-battle-style/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move battle styles", notes = "Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.", response = PaginatedMoveBattleStyleSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveBattleStyleSummaryList.class)
    })
    public Response moveBattleStyleList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-battle-style/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move battle style", notes = "Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.", response = MoveBattleStyleDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveBattleStyleDetail.class)
    })
    public Response moveBattleStyleRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-category/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move meta categories", notes = "Very general categories that loosely group move effects.", response = PaginatedMoveMetaCategorySummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveMetaCategorySummaryList.class)
    })
    public Response moveCategoryList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-category/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move meta category", notes = "Very general categories that loosely group move effects.", response = MoveMetaCategoryDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveMetaCategoryDetail.class)
    })
    public Response moveCategoryRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-damage-class/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move damage classes", notes = "Damage classes moves can have, e.g. physical, special, or non-damaging.", response = PaginatedMoveDamageClassSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveDamageClassSummaryList.class)
    })
    public Response moveDamageClassList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-damage-class/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move damage class", notes = "Damage classes moves can have, e.g. physical, special, or non-damaging.", response = MoveDamageClassDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveDamageClassDetail.class)
    })
    public Response moveDamageClassRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-learn-method/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move learn methods", notes = "Methods by which Pokémon can learn moves.", response = PaginatedMoveLearnMethodSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveLearnMethodSummaryList.class)
    })
    public Response moveLearnMethodList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-learn-method/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move learn method", notes = "Methods by which Pokémon can learn moves.", response = MoveLearnMethodDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveLearnMethodDetail.class)
    })
    public Response moveLearnMethodRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List moves", notes = "Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.", response = PaginatedMoveSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveSummaryList.class)
    })
    public Response moveList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move", notes = "Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.", response = MoveDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveDetail.class)
    })
    public Response moveRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-target/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move targets", notes = "Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.", response = PaginatedMoveTargetSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveTargetSummaryList.class)
    })
    public Response moveTargetList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-target/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move target", notes = "Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.", response = MoveTargetDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveTargetDetail.class)
    })
    public Response moveTargetRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/nature/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List natures", notes = "Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.", response = PaginatedNatureSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedNatureSummaryList.class)
    })
    public Response natureList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/nature/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get nature", notes = "Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.", response = NatureDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = NatureDetail.class)
    })
    public Response natureRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pal-park-area/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pal park areas", notes = "Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.", response = PaginatedPalParkAreaSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPalParkAreaSummaryList.class)
    })
    public Response palParkAreaList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pal-park-area/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pal park area", notes = "Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.", response = PalParkAreaDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PalParkAreaDetail.class)
    })
    public Response palParkAreaRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokeathlon-stat/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokeathlon stats", notes = "Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.", response = PaginatedPokeathlonStatSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokeathlonStatSummaryList.class)
    })
    public Response pokeathlonStatList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokeathlon-stat/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokeathlon stat", notes = "Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.", response = PokeathlonStatDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokeathlonStatDetail.class)
    })
    public Response pokeathlonStatRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokedex/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokedex", notes = "A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.", response = PaginatedPokedexSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "games" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokedexSummaryList.class)
    })
    public Response pokedexList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokedex/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokedex", notes = "A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.", response = PokedexDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "games" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokedexDetail.class)
    })
    public Response pokedexRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-color/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon colors", notes = "Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.", response = PaginatedPokemonColorSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonColorSummaryList.class)
    })
    public Response pokemonColorList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-color/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon color", notes = "Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.", response = PokemonColorDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonColorDetail.class)
    })
    public Response pokemonColorRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon/{pokemon_id}/encounters")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon encounter", notes = "Handles Pokemon Encounters as a sub-resource.", response = PokemonEncountersRetrieve200ResponseInner.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonEncountersRetrieve200ResponseInner.class, responseContainer = "List")
    })
    public Response pokemonEncountersRetrieve(@PathParam("pokemon_id") @Pattern(regexp="^\\d+$") String pokemonId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-form/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon forms", notes = "Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.", response = PaginatedPokemonFormSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonFormSummaryList.class)
    })
    public Response pokemonFormList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-form/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon form", notes = "Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.", response = PokemonFormDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonFormDetail.class)
    })
    public Response pokemonFormRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-habitat/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemom habitas", notes = "Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.", response = PaginatedPokemonHabitatSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonHabitatSummaryList.class)
    })
    public Response pokemonHabitatList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-habitat/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemom habita", notes = "Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.", response = PokemonHabitatDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonHabitatDetail.class)
    })
    public Response pokemonHabitatRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon", notes = "Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.", response = PaginatedPokemonSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonSummaryList.class)
    })
    public Response pokemonList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon", notes = "Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.", response = PokemonDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonDetail.class)
    })
    public Response pokemonRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-shape/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon shapes", notes = "Shapes used for sorting Pokémon in a Pokédex.", response = PaginatedPokemonShapeSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonShapeSummaryList.class)
    })
    public Response pokemonShapeList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-shape/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon shape", notes = "Shapes used for sorting Pokémon in a Pokédex.", response = PokemonShapeDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonShapeDetail.class)
    })
    public Response pokemonShapeRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-species/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokemon species", notes = "A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.", response = PaginatedPokemonSpeciesSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokemonSpeciesSummaryList.class)
    })
    public Response pokemonSpeciesList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-species/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon species", notes = "A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.", response = PokemonSpeciesDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonSpeciesDetail.class)
    })
    public Response pokemonSpeciesRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/region/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List regions", notes = "A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.", response = PaginatedRegionSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedRegionSummaryList.class)
    })
    public Response regionList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/region/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get region", notes = "A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.", response = RegionDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = RegionDetail.class)
    })
    public Response regionRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/stat/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List stats", notes = "Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.", response = PaginatedStatSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedStatSummaryList.class)
    })
    public Response statList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/stat/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get stat", notes = "Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.", response = StatDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = StatDetail.class)
    })
    public Response statRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/super-contest-effect/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List super contest effects", notes = "Super contest effects refer to the effects of moves when used in super contests.", response = PaginatedSuperContestEffectSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "contests" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedSuperContestEffectSummaryList.class)
    })
    public Response superContestEffectList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/super-contest-effect/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get super contest effect", notes = "Super contest effects refer to the effects of moves when used in super contests.", response = SuperContestEffectDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "contests" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = SuperContestEffectDetail.class)
    })
    public Response superContestEffectRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/type/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List types", notes = "Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.", response = PaginatedTypeSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedTypeSummaryList.class)
    })
    public Response typeList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/type/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get types", notes = "Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.", response = TypeDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = TypeDetail.class)
    })
    public Response typeRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/version-group/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List version groups", notes = "Version groups categorize highly similar versions of the games.", response = PaginatedVersionGroupSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "games" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedVersionGroupSummaryList.class)
    })
    public Response versionGroupList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/version-group/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get version group", notes = "Version groups categorize highly similar versions of the games.", response = VersionGroupDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "games" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = VersionGroupDetail.class)
    })
    public Response versionGroupRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/version/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List versions", notes = "Versions of the games, e.g., Red, Blue or Yellow.", response = PaginatedVersionSummaryList.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "games" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedVersionSummaryList.class)
    })
    public Response versionList(@QueryParam("limit")  @ApiParam("Number of results to return per page.")  Integer limit,@QueryParam("offset")  @ApiParam("The initial index from which to return the results.")  Integer offset,@QueryParam("q")  @ApiParam("&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ")  String q) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/version/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get version", notes = "Versions of the games, e.g., Red, Blue or Yellow.", response = VersionDetail.class, authorizations = {
        
        @Authorization(value = "basicAuth"),
        
        @Authorization(value = "cookieAuth")
         }, tags={ "games" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = VersionDetail.class)
    })
    public Response versionRetrieve(@PathParam("id") @ApiParam("This parameter can be a string or an integer.") String id) {
        return Response.ok().entity("magic!").build();
    }
}
