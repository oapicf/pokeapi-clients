package org.openapitools.api

import org.openapitools.model.AbilityDetail
import org.openapitools.model.BerryDetail
import org.openapitools.model.BerryFirmnessDetail
import org.openapitools.model.BerryFlavorDetail
import org.openapitools.model.CharacteristicDetail
import org.openapitools.model.ContestEffectDetail
import org.openapitools.model.ContestTypeDetail
import org.openapitools.model.EggGroupDetail
import org.openapitools.model.EncounterConditionDetail
import org.openapitools.model.EncounterConditionValueDetail
import org.openapitools.model.EncounterMethodDetail
import org.openapitools.model.EvolutionChainDetail
import org.openapitools.model.EvolutionTriggerDetail
import org.openapitools.model.GenderDetail
import org.openapitools.model.GenerationDetail
import org.openapitools.model.GrowthRateDetail
import org.openapitools.model.ItemAttributeDetail
import org.openapitools.model.ItemCategoryDetail
import org.openapitools.model.ItemDetail
import org.openapitools.model.ItemFlingEffectDetail
import org.openapitools.model.ItemPocketDetail
import org.openapitools.model.LanguageDetail
import org.openapitools.model.LocationAreaDetail
import org.openapitools.model.LocationDetail
import org.openapitools.model.MachineDetail
import org.openapitools.model.MoveBattleStyleDetail
import org.openapitools.model.MoveDamageClassDetail
import org.openapitools.model.MoveDetail
import org.openapitools.model.MoveLearnMethodDetail
import org.openapitools.model.MoveMetaAilmentDetail
import org.openapitools.model.MoveMetaCategoryDetail
import org.openapitools.model.MoveTargetDetail
import org.openapitools.model.NatureDetail
import org.openapitools.model.PaginatedAbilitySummaryList
import org.openapitools.model.PaginatedBerryFirmnessSummaryList
import org.openapitools.model.PaginatedBerryFlavorSummaryList
import org.openapitools.model.PaginatedBerrySummaryList
import org.openapitools.model.PaginatedCharacteristicSummaryList
import org.openapitools.model.PaginatedContestEffectSummaryList
import org.openapitools.model.PaginatedContestTypeSummaryList
import org.openapitools.model.PaginatedEggGroupSummaryList
import org.openapitools.model.PaginatedEncounterConditionSummaryList
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList
import org.openapitools.model.PaginatedEncounterMethodSummaryList
import org.openapitools.model.PaginatedEvolutionChainSummaryList
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList
import org.openapitools.model.PaginatedGenderSummaryList
import org.openapitools.model.PaginatedGenerationSummaryList
import org.openapitools.model.PaginatedGrowthRateSummaryList
import org.openapitools.model.PaginatedItemAttributeSummaryList
import org.openapitools.model.PaginatedItemCategorySummaryList
import org.openapitools.model.PaginatedItemFlingEffectSummaryList
import org.openapitools.model.PaginatedItemPocketSummaryList
import org.openapitools.model.PaginatedItemSummaryList
import org.openapitools.model.PaginatedLanguageSummaryList
import org.openapitools.model.PaginatedLocationAreaSummaryList
import org.openapitools.model.PaginatedLocationSummaryList
import org.openapitools.model.PaginatedMachineSummaryList
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList
import org.openapitools.model.PaginatedMoveDamageClassSummaryList
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList
import org.openapitools.model.PaginatedMoveSummaryList
import org.openapitools.model.PaginatedMoveTargetSummaryList
import org.openapitools.model.PaginatedNatureSummaryList
import org.openapitools.model.PaginatedPalParkAreaSummaryList
import org.openapitools.model.PaginatedPokeathlonStatSummaryList
import org.openapitools.model.PaginatedPokedexSummaryList
import org.openapitools.model.PaginatedPokemonColorSummaryList
import org.openapitools.model.PaginatedPokemonFormSummaryList
import org.openapitools.model.PaginatedPokemonHabitatSummaryList
import org.openapitools.model.PaginatedPokemonShapeSummaryList
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList
import org.openapitools.model.PaginatedPokemonSummaryList
import org.openapitools.model.PaginatedRegionSummaryList
import org.openapitools.model.PaginatedStatSummaryList
import org.openapitools.model.PaginatedSuperContestEffectSummaryList
import org.openapitools.model.PaginatedTypeSummaryList
import org.openapitools.model.PaginatedVersionGroupSummaryList
import org.openapitools.model.PaginatedVersionSummaryList
import org.openapitools.model.PalParkAreaDetail
import org.openapitools.model.PokeathlonStatDetail
import org.openapitools.model.PokedexDetail
import org.openapitools.model.PokemonColorDetail
import org.openapitools.model.PokemonDetail
import org.openapitools.model.PokemonFormDetail
import org.openapitools.model.PokemonHabitatDetail
import org.openapitools.model.PokemonShapeDetail
import org.openapitools.model.PokemonSpeciesDetail
import org.openapitools.model.RegionDetail
import org.openapitools.model.StatDetail
import org.openapitools.model.SuperContestEffectDetail
import org.openapitools.model.TypeDetail
import org.openapitools.model.VersionDetail
import org.openapitools.model.VersionGroupDetail
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired
import org.openapitools.api.ApiApiController.Companion.BASE_PATH

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${openapi.pok.base-path:\${api.base-path:$BASE_PATH}}")
class ApiApiController() {

    @Operation(
        summary = "",
        operationId = "abilityList",
        description = """Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedAbilitySummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ABILITY_LIST /* "/api/v2/ability/" */],
        produces = ["application/json"]
    )
    fun abilityList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedAbilitySummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "abilityRetrieve",
        description = """Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = AbilityDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ABILITY_RETRIEVE /* "/api/v2/ability/{id}/" */],
        produces = ["application/json"]
    )
    fun abilityRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<AbilityDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List berry firmness",
        operationId = "berryFirmnessList",
        description = """Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedBerryFirmnessSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BERRY_FIRMNESS_LIST /* "/api/v2/berry-firmness/" */],
        produces = ["application/json"]
    )
    fun berryFirmnessList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedBerryFirmnessSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get berry by firmness",
        operationId = "berryFirmnessRetrieve",
        description = """Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = BerryFirmnessDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BERRY_FIRMNESS_RETRIEVE /* "/api/v2/berry-firmness/{id}/" */],
        produces = ["application/json"]
    )
    fun berryFirmnessRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<BerryFirmnessDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List berry flavors",
        operationId = "berryFlavorList",
        description = """Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedBerryFlavorSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BERRY_FLAVOR_LIST /* "/api/v2/berry-flavor/" */],
        produces = ["application/json"]
    )
    fun berryFlavorList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedBerryFlavorSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get berries by flavor",
        operationId = "berryFlavorRetrieve",
        description = """Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = BerryFlavorDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BERRY_FLAVOR_RETRIEVE /* "/api/v2/berry-flavor/{id}/" */],
        produces = ["application/json"]
    )
    fun berryFlavorRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<BerryFlavorDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List berries",
        operationId = "berryList",
        description = """Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedBerrySummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BERRY_LIST /* "/api/v2/berry/" */],
        produces = ["application/json"]
    )
    fun berryList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedBerrySummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get a berry",
        operationId = "berryRetrieve",
        description = """Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = BerryDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BERRY_RETRIEVE /* "/api/v2/berry/{id}/" */],
        produces = ["application/json"]
    )
    fun berryRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<BerryDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List charecterictics",
        operationId = "characteristicList",
        description = """Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedCharacteristicSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_CHARACTERISTIC_LIST /* "/api/v2/characteristic/" */],
        produces = ["application/json"]
    )
    fun characteristicList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedCharacteristicSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get characteristic",
        operationId = "characteristicRetrieve",
        description = """Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = CharacteristicDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_CHARACTERISTIC_RETRIEVE /* "/api/v2/characteristic/{id}/" */],
        produces = ["application/json"]
    )
    fun characteristicRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<CharacteristicDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List contest effects",
        operationId = "contestEffectList",
        description = """Contest effects refer to the effects of moves when used in contests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedContestEffectSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_CONTEST_EFFECT_LIST /* "/api/v2/contest-effect/" */],
        produces = ["application/json"]
    )
    fun contestEffectList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedContestEffectSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get contest effect",
        operationId = "contestEffectRetrieve",
        description = """Contest effects refer to the effects of moves when used in contests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = ContestEffectDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_CONTEST_EFFECT_RETRIEVE /* "/api/v2/contest-effect/{id}/" */],
        produces = ["application/json"]
    )
    fun contestEffectRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<ContestEffectDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List contest types",
        operationId = "contestTypeList",
        description = """Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedContestTypeSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_CONTEST_TYPE_LIST /* "/api/v2/contest-type/" */],
        produces = ["application/json"]
    )
    fun contestTypeList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedContestTypeSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get contest type",
        operationId = "contestTypeRetrieve",
        description = """Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = ContestTypeDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_CONTEST_TYPE_RETRIEVE /* "/api/v2/contest-type/{id}/" */],
        produces = ["application/json"]
    )
    fun contestTypeRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<ContestTypeDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List egg groups",
        operationId = "eggGroupList",
        description = """Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedEggGroupSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_EGG_GROUP_LIST /* "/api/v2/egg-group/" */],
        produces = ["application/json"]
    )
    fun eggGroupList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedEggGroupSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get egg group",
        operationId = "eggGroupRetrieve",
        description = """Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = EggGroupDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_EGG_GROUP_RETRIEVE /* "/api/v2/egg-group/{id}/" */],
        produces = ["application/json"]
    )
    fun eggGroupRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<EggGroupDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List encounter conditions",
        operationId = "encounterConditionList",
        description = """Conditions which affect what pokemon might appear in the wild, e.g., day or night.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedEncounterConditionSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ENCOUNTER_CONDITION_LIST /* "/api/v2/encounter-condition/" */],
        produces = ["application/json"]
    )
    fun encounterConditionList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedEncounterConditionSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get encounter condition",
        operationId = "encounterConditionRetrieve",
        description = """Conditions which affect what pokemon might appear in the wild, e.g., day or night.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = EncounterConditionDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ENCOUNTER_CONDITION_RETRIEVE /* "/api/v2/encounter-condition/{id}/" */],
        produces = ["application/json"]
    )
    fun encounterConditionRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<EncounterConditionDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List encounter condition values",
        operationId = "encounterConditionValueList",
        description = """Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedEncounterConditionValueSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ENCOUNTER_CONDITION_VALUE_LIST /* "/api/v2/encounter-condition-value/" */],
        produces = ["application/json"]
    )
    fun encounterConditionValueList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedEncounterConditionValueSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get encounter condition value",
        operationId = "encounterConditionValueRetrieve",
        description = """Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = EncounterConditionValueDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ENCOUNTER_CONDITION_VALUE_RETRIEVE /* "/api/v2/encounter-condition-value/{id}/" */],
        produces = ["application/json"]
    )
    fun encounterConditionValueRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<EncounterConditionValueDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List encounter methods",
        operationId = "encounterMethodList",
        description = """Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedEncounterMethodSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ENCOUNTER_METHOD_LIST /* "/api/v2/encounter-method/" */],
        produces = ["application/json"]
    )
    fun encounterMethodList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedEncounterMethodSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get encounter method",
        operationId = "encounterMethodRetrieve",
        description = """Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = EncounterMethodDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ENCOUNTER_METHOD_RETRIEVE /* "/api/v2/encounter-method/{id}/" */],
        produces = ["application/json"]
    )
    fun encounterMethodRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<EncounterMethodDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List evolution chains",
        operationId = "evolutionChainList",
        description = """Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedEvolutionChainSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_EVOLUTION_CHAIN_LIST /* "/api/v2/evolution-chain/" */],
        produces = ["application/json"]
    )
    fun evolutionChainList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedEvolutionChainSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get evolution chain",
        operationId = "evolutionChainRetrieve",
        description = """Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = EvolutionChainDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_EVOLUTION_CHAIN_RETRIEVE /* "/api/v2/evolution-chain/{id}/" */],
        produces = ["application/json"]
    )
    fun evolutionChainRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<EvolutionChainDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List evolution triggers",
        operationId = "evolutionTriggerList",
        description = """Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedEvolutionTriggerSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_EVOLUTION_TRIGGER_LIST /* "/api/v2/evolution-trigger/" */],
        produces = ["application/json"]
    )
    fun evolutionTriggerList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedEvolutionTriggerSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get evolution trigger",
        operationId = "evolutionTriggerRetrieve",
        description = """Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = EvolutionTriggerDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_EVOLUTION_TRIGGER_RETRIEVE /* "/api/v2/evolution-trigger/{id}/" */],
        produces = ["application/json"]
    )
    fun evolutionTriggerRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<EvolutionTriggerDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List genders",
        operationId = "genderList",
        description = """Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedGenderSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GENDER_LIST /* "/api/v2/gender/" */],
        produces = ["application/json"]
    )
    fun genderList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedGenderSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get gender",
        operationId = "genderRetrieve",
        description = """Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = GenderDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GENDER_RETRIEVE /* "/api/v2/gender/{id}/" */],
        produces = ["application/json"]
    )
    fun genderRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<GenderDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List genrations",
        operationId = "generationList",
        description = """A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedGenerationSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GENERATION_LIST /* "/api/v2/generation/" */],
        produces = ["application/json"]
    )
    fun generationList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedGenerationSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get genration",
        operationId = "generationRetrieve",
        description = """A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = GenerationDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GENERATION_RETRIEVE /* "/api/v2/generation/{id}/" */],
        produces = ["application/json"]
    )
    fun generationRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<GenerationDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List growth rates",
        operationId = "growthRateList",
        description = """Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedGrowthRateSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GROWTH_RATE_LIST /* "/api/v2/growth-rate/" */],
        produces = ["application/json"]
    )
    fun growthRateList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedGrowthRateSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get growth rate",
        operationId = "growthRateRetrieve",
        description = """Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = GrowthRateDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GROWTH_RATE_RETRIEVE /* "/api/v2/growth-rate/{id}/" */],
        produces = ["application/json"]
    )
    fun growthRateRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<GrowthRateDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List item attributes",
        operationId = "itemAttributeList",
        description = """Item attributes define particular aspects of items, e.g."usable in battle" or "consumable".""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedItemAttributeSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_ATTRIBUTE_LIST /* "/api/v2/item-attribute/" */],
        produces = ["application/json"]
    )
    fun itemAttributeList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedItemAttributeSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get item attribute",
        operationId = "itemAttributeRetrieve",
        description = """Item attributes define particular aspects of items, e.g."usable in battle" or "consumable".""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = ItemAttributeDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_ATTRIBUTE_RETRIEVE /* "/api/v2/item-attribute/{id}/" */],
        produces = ["application/json"]
    )
    fun itemAttributeRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<ItemAttributeDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List item categories",
        operationId = "itemCategoryList",
        description = """Item categories determine where items will be placed in the players bag.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedItemCategorySummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_CATEGORY_LIST /* "/api/v2/item-category/" */],
        produces = ["application/json"]
    )
    fun itemCategoryList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedItemCategorySummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get item category",
        operationId = "itemCategoryRetrieve",
        description = """Item categories determine where items will be placed in the players bag.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = ItemCategoryDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_CATEGORY_RETRIEVE /* "/api/v2/item-category/{id}/" */],
        produces = ["application/json"]
    )
    fun itemCategoryRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<ItemCategoryDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List item fling effects",
        operationId = "itemFlingEffectList",
        description = """The various effects of the move"Fling" when used with different items.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedItemFlingEffectSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_FLING_EFFECT_LIST /* "/api/v2/item-fling-effect/" */],
        produces = ["application/json"]
    )
    fun itemFlingEffectList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedItemFlingEffectSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get item fling effect",
        operationId = "itemFlingEffectRetrieve",
        description = """The various effects of the move"Fling" when used with different items.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = ItemFlingEffectDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_FLING_EFFECT_RETRIEVE /* "/api/v2/item-fling-effect/{id}/" */],
        produces = ["application/json"]
    )
    fun itemFlingEffectRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<ItemFlingEffectDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List items",
        operationId = "itemList",
        description = """An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedItemSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_LIST /* "/api/v2/item/" */],
        produces = ["application/json"]
    )
    fun itemList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedItemSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List item pockets",
        operationId = "itemPocketList",
        description = """Pockets within the players bag used for storing items by category.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedItemPocketSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_POCKET_LIST /* "/api/v2/item-pocket/" */],
        produces = ["application/json"]
    )
    fun itemPocketList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedItemPocketSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get item pocket",
        operationId = "itemPocketRetrieve",
        description = """Pockets within the players bag used for storing items by category.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = ItemPocketDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_POCKET_RETRIEVE /* "/api/v2/item-pocket/{id}/" */],
        produces = ["application/json"]
    )
    fun itemPocketRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<ItemPocketDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get item",
        operationId = "itemRetrieve",
        description = """An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = ItemDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ITEM_RETRIEVE /* "/api/v2/item/{id}/" */],
        produces = ["application/json"]
    )
    fun itemRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<ItemDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List languages",
        operationId = "languageList",
        description = """Languages for translations of API resource information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedLanguageSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LANGUAGE_LIST /* "/api/v2/language/" */],
        produces = ["application/json"]
    )
    fun languageList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedLanguageSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get language",
        operationId = "languageRetrieve",
        description = """Languages for translations of API resource information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = LanguageDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LANGUAGE_RETRIEVE /* "/api/v2/language/{id}/" */],
        produces = ["application/json"]
    )
    fun languageRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<LanguageDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List location areas",
        operationId = "locationAreaList",
        description = """Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedLocationAreaSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LOCATION_AREA_LIST /* "/api/v2/location-area/" */],
        produces = ["application/json"]
    )
    fun locationAreaList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?
    ): ResponseEntity<PaginatedLocationAreaSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get location area",
        operationId = "locationAreaRetrieve",
        description = """Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = LocationAreaDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LOCATION_AREA_RETRIEVE /* "/api/v2/location-area/{id}/" */],
        produces = ["application/json"]
    )
    fun locationAreaRetrieve(
        @Parameter(description = "A unique integer value identifying this location area.", required = true) @PathVariable("id") id: kotlin.Int
    ): ResponseEntity<LocationAreaDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List locations",
        operationId = "locationList",
        description = """Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedLocationSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LOCATION_LIST /* "/api/v2/location/" */],
        produces = ["application/json"]
    )
    fun locationList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedLocationSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get location",
        operationId = "locationRetrieve",
        description = """Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = LocationDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LOCATION_RETRIEVE /* "/api/v2/location/{id}/" */],
        produces = ["application/json"]
    )
    fun locationRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<LocationDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List machines",
        operationId = "machineList",
        description = """Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedMachineSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MACHINE_LIST /* "/api/v2/machine/" */],
        produces = ["application/json"]
    )
    fun machineList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedMachineSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get machine",
        operationId = "machineRetrieve",
        description = """Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = MachineDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MACHINE_RETRIEVE /* "/api/v2/machine/{id}/" */],
        produces = ["application/json"]
    )
    fun machineRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<MachineDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List move meta ailments",
        operationId = "moveAilmentList",
        description = """Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedMoveMetaAilmentSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_AILMENT_LIST /* "/api/v2/move-ailment/" */],
        produces = ["application/json"]
    )
    fun moveAilmentList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedMoveMetaAilmentSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get move meta ailment",
        operationId = "moveAilmentRetrieve",
        description = """Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = MoveMetaAilmentDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_AILMENT_RETRIEVE /* "/api/v2/move-ailment/{id}/" */],
        produces = ["application/json"]
    )
    fun moveAilmentRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<MoveMetaAilmentDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List move battle styles",
        operationId = "moveBattleStyleList",
        description = """Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedMoveBattleStyleSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_BATTLE_STYLE_LIST /* "/api/v2/move-battle-style/" */],
        produces = ["application/json"]
    )
    fun moveBattleStyleList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedMoveBattleStyleSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get move battle style",
        operationId = "moveBattleStyleRetrieve",
        description = """Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = MoveBattleStyleDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_BATTLE_STYLE_RETRIEVE /* "/api/v2/move-battle-style/{id}/" */],
        produces = ["application/json"]
    )
    fun moveBattleStyleRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<MoveBattleStyleDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List move meta categories",
        operationId = "moveCategoryList",
        description = """Very general categories that loosely group move effects.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedMoveMetaCategorySummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_CATEGORY_LIST /* "/api/v2/move-category/" */],
        produces = ["application/json"]
    )
    fun moveCategoryList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedMoveMetaCategorySummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get move meta category",
        operationId = "moveCategoryRetrieve",
        description = """Very general categories that loosely group move effects.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = MoveMetaCategoryDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_CATEGORY_RETRIEVE /* "/api/v2/move-category/{id}/" */],
        produces = ["application/json"]
    )
    fun moveCategoryRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<MoveMetaCategoryDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List move damage classes",
        operationId = "moveDamageClassList",
        description = """Damage classes moves can have, e.g. physical, special, or non-damaging.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedMoveDamageClassSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_DAMAGE_CLASS_LIST /* "/api/v2/move-damage-class/" */],
        produces = ["application/json"]
    )
    fun moveDamageClassList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedMoveDamageClassSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get move damage class",
        operationId = "moveDamageClassRetrieve",
        description = """Damage classes moves can have, e.g. physical, special, or non-damaging.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = MoveDamageClassDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_DAMAGE_CLASS_RETRIEVE /* "/api/v2/move-damage-class/{id}/" */],
        produces = ["application/json"]
    )
    fun moveDamageClassRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<MoveDamageClassDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List move learn methods",
        operationId = "moveLearnMethodList",
        description = """Methods by which Pokémon can learn moves.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedMoveLearnMethodSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_LEARN_METHOD_LIST /* "/api/v2/move-learn-method/" */],
        produces = ["application/json"]
    )
    fun moveLearnMethodList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedMoveLearnMethodSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get move learn method",
        operationId = "moveLearnMethodRetrieve",
        description = """Methods by which Pokémon can learn moves.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = MoveLearnMethodDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_LEARN_METHOD_RETRIEVE /* "/api/v2/move-learn-method/{id}/" */],
        produces = ["application/json"]
    )
    fun moveLearnMethodRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<MoveLearnMethodDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List moves",
        operationId = "moveList",
        description = """Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedMoveSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_LIST /* "/api/v2/move/" */],
        produces = ["application/json"]
    )
    fun moveList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedMoveSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get move",
        operationId = "moveRetrieve",
        description = """Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = MoveDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_RETRIEVE /* "/api/v2/move/{id}/" */],
        produces = ["application/json"]
    )
    fun moveRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<MoveDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List move targets",
        operationId = "moveTargetList",
        description = """Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedMoveTargetSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_TARGET_LIST /* "/api/v2/move-target/" */],
        produces = ["application/json"]
    )
    fun moveTargetList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedMoveTargetSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get move target",
        operationId = "moveTargetRetrieve",
        description = """Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = MoveTargetDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_MOVE_TARGET_RETRIEVE /* "/api/v2/move-target/{id}/" */],
        produces = ["application/json"]
    )
    fun moveTargetRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<MoveTargetDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List natures",
        operationId = "natureList",
        description = """Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedNatureSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_NATURE_LIST /* "/api/v2/nature/" */],
        produces = ["application/json"]
    )
    fun natureList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedNatureSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get nature",
        operationId = "natureRetrieve",
        description = """Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = NatureDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_NATURE_RETRIEVE /* "/api/v2/nature/{id}/" */],
        produces = ["application/json"]
    )
    fun natureRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<NatureDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pal park areas",
        operationId = "palParkAreaList",
        description = """Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPalParkAreaSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_PAL_PARK_AREA_LIST /* "/api/v2/pal-park-area/" */],
        produces = ["application/json"]
    )
    fun palParkAreaList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPalParkAreaSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pal park area",
        operationId = "palParkAreaRetrieve",
        description = """Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PalParkAreaDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_PAL_PARK_AREA_RETRIEVE /* "/api/v2/pal-park-area/{id}/" */],
        produces = ["application/json"]
    )
    fun palParkAreaRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PalParkAreaDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pokeathlon stats",
        operationId = "pokeathlonStatList",
        description = """Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPokeathlonStatSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEATHLON_STAT_LIST /* "/api/v2/pokeathlon-stat/" */],
        produces = ["application/json"]
    )
    fun pokeathlonStatList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPokeathlonStatSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pokeathlon stat",
        operationId = "pokeathlonStatRetrieve",
        description = """Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PokeathlonStatDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEATHLON_STAT_RETRIEVE /* "/api/v2/pokeathlon-stat/{id}/" */],
        produces = ["application/json"]
    )
    fun pokeathlonStatRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PokeathlonStatDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pokedex",
        operationId = "pokedexList",
        description = """A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPokedexSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEDEX_LIST /* "/api/v2/pokedex/" */],
        produces = ["application/json"]
    )
    fun pokedexList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPokedexSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pokedex",
        operationId = "pokedexRetrieve",
        description = """A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PokedexDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEDEX_RETRIEVE /* "/api/v2/pokedex/{id}/" */],
        produces = ["application/json"]
    )
    fun pokedexRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PokedexDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pokemon colors",
        operationId = "pokemonColorList",
        description = """Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPokemonColorSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_COLOR_LIST /* "/api/v2/pokemon-color/" */],
        produces = ["application/json"]
    )
    fun pokemonColorList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPokemonColorSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pokemon color",
        operationId = "pokemonColorRetrieve",
        description = """Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PokemonColorDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_COLOR_RETRIEVE /* "/api/v2/pokemon-color/{id}/" */],
        produces = ["application/json"]
    )
    fun pokemonColorRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PokemonColorDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pokemon forms",
        operationId = "pokemonFormList",
        description = """Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPokemonFormSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_FORM_LIST /* "/api/v2/pokemon-form/" */],
        produces = ["application/json"]
    )
    fun pokemonFormList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPokemonFormSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pokemon form",
        operationId = "pokemonFormRetrieve",
        description = """Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PokemonFormDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_FORM_RETRIEVE /* "/api/v2/pokemon-form/{id}/" */],
        produces = ["application/json"]
    )
    fun pokemonFormRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PokemonFormDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pokemom habitas",
        operationId = "pokemonHabitatList",
        description = """Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPokemonHabitatSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_HABITAT_LIST /* "/api/v2/pokemon-habitat/" */],
        produces = ["application/json"]
    )
    fun pokemonHabitatList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPokemonHabitatSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pokemom habita",
        operationId = "pokemonHabitatRetrieve",
        description = """Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PokemonHabitatDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_HABITAT_RETRIEVE /* "/api/v2/pokemon-habitat/{id}/" */],
        produces = ["application/json"]
    )
    fun pokemonHabitatRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PokemonHabitatDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pokemon",
        operationId = "pokemonList",
        description = """Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPokemonSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_LIST /* "/api/v2/pokemon/" */],
        produces = ["application/json"]
    )
    fun pokemonList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPokemonSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pokemon",
        operationId = "pokemonRetrieve",
        description = """Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PokemonDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_RETRIEVE /* "/api/v2/pokemon/{id}/" */],
        produces = ["application/json"]
    )
    fun pokemonRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PokemonDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pokemon shapes",
        operationId = "pokemonShapeList",
        description = """Shapes used for sorting Pokémon in a Pokédex.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPokemonShapeSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_SHAPE_LIST /* "/api/v2/pokemon-shape/" */],
        produces = ["application/json"]
    )
    fun pokemonShapeList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPokemonShapeSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pokemon shape",
        operationId = "pokemonShapeRetrieve",
        description = """Shapes used for sorting Pokémon in a Pokédex.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PokemonShapeDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_SHAPE_RETRIEVE /* "/api/v2/pokemon-shape/{id}/" */],
        produces = ["application/json"]
    )
    fun pokemonShapeRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PokemonShapeDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List pokemon species",
        operationId = "pokemonSpeciesList",
        description = """A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedPokemonSpeciesSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_SPECIES_LIST /* "/api/v2/pokemon-species/" */],
        produces = ["application/json"]
    )
    fun pokemonSpeciesList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedPokemonSpeciesSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pokemon species",
        operationId = "pokemonSpeciesRetrieve",
        description = """A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PokemonSpeciesDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_POKEMON_SPECIES_RETRIEVE /* "/api/v2/pokemon-species/{id}/" */],
        produces = ["application/json"]
    )
    fun pokemonSpeciesRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<PokemonSpeciesDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List regions",
        operationId = "regionList",
        description = """A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedRegionSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_REGION_LIST /* "/api/v2/region/" */],
        produces = ["application/json"]
    )
    fun regionList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedRegionSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get region",
        operationId = "regionRetrieve",
        description = """A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = RegionDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_REGION_RETRIEVE /* "/api/v2/region/{id}/" */],
        produces = ["application/json"]
    )
    fun regionRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<RegionDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List stats",
        operationId = "statList",
        description = """Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedStatSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_STAT_LIST /* "/api/v2/stat/" */],
        produces = ["application/json"]
    )
    fun statList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedStatSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get stat",
        operationId = "statRetrieve",
        description = """Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = StatDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_STAT_RETRIEVE /* "/api/v2/stat/{id}/" */],
        produces = ["application/json"]
    )
    fun statRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<StatDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List super contest effects",
        operationId = "superContestEffectList",
        description = """Super contest effects refer to the effects of moves when used in super contests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedSuperContestEffectSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_SUPER_CONTEST_EFFECT_LIST /* "/api/v2/super-contest-effect/" */],
        produces = ["application/json"]
    )
    fun superContestEffectList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedSuperContestEffectSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get super contest effect",
        operationId = "superContestEffectRetrieve",
        description = """Super contest effects refer to the effects of moves when used in super contests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = SuperContestEffectDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_SUPER_CONTEST_EFFECT_RETRIEVE /* "/api/v2/super-contest-effect/{id}/" */],
        produces = ["application/json"]
    )
    fun superContestEffectRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<SuperContestEffectDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List types",
        operationId = "typeList",
        description = """Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedTypeSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_TYPE_LIST /* "/api/v2/type/" */],
        produces = ["application/json"]
    )
    fun typeList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedTypeSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get types",
        operationId = "typeRetrieve",
        description = """Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = TypeDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_TYPE_RETRIEVE /* "/api/v2/type/{id}/" */],
        produces = ["application/json"]
    )
    fun typeRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<TypeDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List version groups",
        operationId = "versionGroupList",
        description = """Version groups categorize highly similar versions of the games.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedVersionGroupSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_VERSION_GROUP_LIST /* "/api/v2/version-group/" */],
        produces = ["application/json"]
    )
    fun versionGroupList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedVersionGroupSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get version group",
        operationId = "versionGroupRetrieve",
        description = """Version groups categorize highly similar versions of the games.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = VersionGroupDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_VERSION_GROUP_RETRIEVE /* "/api/v2/version-group/{id}/" */],
        produces = ["application/json"]
    )
    fun versionGroupRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<VersionGroupDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List versions",
        operationId = "versionList",
        description = """Versions of the games, e.g., Red, Blue or Yellow.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = PaginatedVersionSummaryList::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_VERSION_LIST /* "/api/v2/version/" */],
        produces = ["application/json"]
    )
    fun versionList(
        @Parameter(description = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The initial index from which to return the results.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?
    ): ResponseEntity<PaginatedVersionSummaryList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get version",
        operationId = "versionRetrieve",
        description = """Versions of the games, e.g., Red, Blue or Yellow.""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = VersionDetail::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth"),SecurityRequirement(name = "cookieAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_VERSION_RETRIEVE /* "/api/v2/version/{id}/" */],
        produces = ["application/json"]
    )
    fun versionRetrieve(
        @Parameter(description = "This parameter can be a string or an integer.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<VersionDetail> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_ABILITY_LIST: String = "/api/v2/ability/"
        const val PATH_ABILITY_RETRIEVE: String = "/api/v2/ability/{id}/"
        const val PATH_BERRY_FIRMNESS_LIST: String = "/api/v2/berry-firmness/"
        const val PATH_BERRY_FIRMNESS_RETRIEVE: String = "/api/v2/berry-firmness/{id}/"
        const val PATH_BERRY_FLAVOR_LIST: String = "/api/v2/berry-flavor/"
        const val PATH_BERRY_FLAVOR_RETRIEVE: String = "/api/v2/berry-flavor/{id}/"
        const val PATH_BERRY_LIST: String = "/api/v2/berry/"
        const val PATH_BERRY_RETRIEVE: String = "/api/v2/berry/{id}/"
        const val PATH_CHARACTERISTIC_LIST: String = "/api/v2/characteristic/"
        const val PATH_CHARACTERISTIC_RETRIEVE: String = "/api/v2/characteristic/{id}/"
        const val PATH_CONTEST_EFFECT_LIST: String = "/api/v2/contest-effect/"
        const val PATH_CONTEST_EFFECT_RETRIEVE: String = "/api/v2/contest-effect/{id}/"
        const val PATH_CONTEST_TYPE_LIST: String = "/api/v2/contest-type/"
        const val PATH_CONTEST_TYPE_RETRIEVE: String = "/api/v2/contest-type/{id}/"
        const val PATH_EGG_GROUP_LIST: String = "/api/v2/egg-group/"
        const val PATH_EGG_GROUP_RETRIEVE: String = "/api/v2/egg-group/{id}/"
        const val PATH_ENCOUNTER_CONDITION_LIST: String = "/api/v2/encounter-condition/"
        const val PATH_ENCOUNTER_CONDITION_RETRIEVE: String = "/api/v2/encounter-condition/{id}/"
        const val PATH_ENCOUNTER_CONDITION_VALUE_LIST: String = "/api/v2/encounter-condition-value/"
        const val PATH_ENCOUNTER_CONDITION_VALUE_RETRIEVE: String = "/api/v2/encounter-condition-value/{id}/"
        const val PATH_ENCOUNTER_METHOD_LIST: String = "/api/v2/encounter-method/"
        const val PATH_ENCOUNTER_METHOD_RETRIEVE: String = "/api/v2/encounter-method/{id}/"
        const val PATH_EVOLUTION_CHAIN_LIST: String = "/api/v2/evolution-chain/"
        const val PATH_EVOLUTION_CHAIN_RETRIEVE: String = "/api/v2/evolution-chain/{id}/"
        const val PATH_EVOLUTION_TRIGGER_LIST: String = "/api/v2/evolution-trigger/"
        const val PATH_EVOLUTION_TRIGGER_RETRIEVE: String = "/api/v2/evolution-trigger/{id}/"
        const val PATH_GENDER_LIST: String = "/api/v2/gender/"
        const val PATH_GENDER_RETRIEVE: String = "/api/v2/gender/{id}/"
        const val PATH_GENERATION_LIST: String = "/api/v2/generation/"
        const val PATH_GENERATION_RETRIEVE: String = "/api/v2/generation/{id}/"
        const val PATH_GROWTH_RATE_LIST: String = "/api/v2/growth-rate/"
        const val PATH_GROWTH_RATE_RETRIEVE: String = "/api/v2/growth-rate/{id}/"
        const val PATH_ITEM_ATTRIBUTE_LIST: String = "/api/v2/item-attribute/"
        const val PATH_ITEM_ATTRIBUTE_RETRIEVE: String = "/api/v2/item-attribute/{id}/"
        const val PATH_ITEM_CATEGORY_LIST: String = "/api/v2/item-category/"
        const val PATH_ITEM_CATEGORY_RETRIEVE: String = "/api/v2/item-category/{id}/"
        const val PATH_ITEM_FLING_EFFECT_LIST: String = "/api/v2/item-fling-effect/"
        const val PATH_ITEM_FLING_EFFECT_RETRIEVE: String = "/api/v2/item-fling-effect/{id}/"
        const val PATH_ITEM_LIST: String = "/api/v2/item/"
        const val PATH_ITEM_POCKET_LIST: String = "/api/v2/item-pocket/"
        const val PATH_ITEM_POCKET_RETRIEVE: String = "/api/v2/item-pocket/{id}/"
        const val PATH_ITEM_RETRIEVE: String = "/api/v2/item/{id}/"
        const val PATH_LANGUAGE_LIST: String = "/api/v2/language/"
        const val PATH_LANGUAGE_RETRIEVE: String = "/api/v2/language/{id}/"
        const val PATH_LOCATION_AREA_LIST: String = "/api/v2/location-area/"
        const val PATH_LOCATION_AREA_RETRIEVE: String = "/api/v2/location-area/{id}/"
        const val PATH_LOCATION_LIST: String = "/api/v2/location/"
        const val PATH_LOCATION_RETRIEVE: String = "/api/v2/location/{id}/"
        const val PATH_MACHINE_LIST: String = "/api/v2/machine/"
        const val PATH_MACHINE_RETRIEVE: String = "/api/v2/machine/{id}/"
        const val PATH_MOVE_AILMENT_LIST: String = "/api/v2/move-ailment/"
        const val PATH_MOVE_AILMENT_RETRIEVE: String = "/api/v2/move-ailment/{id}/"
        const val PATH_MOVE_BATTLE_STYLE_LIST: String = "/api/v2/move-battle-style/"
        const val PATH_MOVE_BATTLE_STYLE_RETRIEVE: String = "/api/v2/move-battle-style/{id}/"
        const val PATH_MOVE_CATEGORY_LIST: String = "/api/v2/move-category/"
        const val PATH_MOVE_CATEGORY_RETRIEVE: String = "/api/v2/move-category/{id}/"
        const val PATH_MOVE_DAMAGE_CLASS_LIST: String = "/api/v2/move-damage-class/"
        const val PATH_MOVE_DAMAGE_CLASS_RETRIEVE: String = "/api/v2/move-damage-class/{id}/"
        const val PATH_MOVE_LEARN_METHOD_LIST: String = "/api/v2/move-learn-method/"
        const val PATH_MOVE_LEARN_METHOD_RETRIEVE: String = "/api/v2/move-learn-method/{id}/"
        const val PATH_MOVE_LIST: String = "/api/v2/move/"
        const val PATH_MOVE_RETRIEVE: String = "/api/v2/move/{id}/"
        const val PATH_MOVE_TARGET_LIST: String = "/api/v2/move-target/"
        const val PATH_MOVE_TARGET_RETRIEVE: String = "/api/v2/move-target/{id}/"
        const val PATH_NATURE_LIST: String = "/api/v2/nature/"
        const val PATH_NATURE_RETRIEVE: String = "/api/v2/nature/{id}/"
        const val PATH_PAL_PARK_AREA_LIST: String = "/api/v2/pal-park-area/"
        const val PATH_PAL_PARK_AREA_RETRIEVE: String = "/api/v2/pal-park-area/{id}/"
        const val PATH_POKEATHLON_STAT_LIST: String = "/api/v2/pokeathlon-stat/"
        const val PATH_POKEATHLON_STAT_RETRIEVE: String = "/api/v2/pokeathlon-stat/{id}/"
        const val PATH_POKEDEX_LIST: String = "/api/v2/pokedex/"
        const val PATH_POKEDEX_RETRIEVE: String = "/api/v2/pokedex/{id}/"
        const val PATH_POKEMON_COLOR_LIST: String = "/api/v2/pokemon-color/"
        const val PATH_POKEMON_COLOR_RETRIEVE: String = "/api/v2/pokemon-color/{id}/"
        const val PATH_POKEMON_FORM_LIST: String = "/api/v2/pokemon-form/"
        const val PATH_POKEMON_FORM_RETRIEVE: String = "/api/v2/pokemon-form/{id}/"
        const val PATH_POKEMON_HABITAT_LIST: String = "/api/v2/pokemon-habitat/"
        const val PATH_POKEMON_HABITAT_RETRIEVE: String = "/api/v2/pokemon-habitat/{id}/"
        const val PATH_POKEMON_LIST: String = "/api/v2/pokemon/"
        const val PATH_POKEMON_RETRIEVE: String = "/api/v2/pokemon/{id}/"
        const val PATH_POKEMON_SHAPE_LIST: String = "/api/v2/pokemon-shape/"
        const val PATH_POKEMON_SHAPE_RETRIEVE: String = "/api/v2/pokemon-shape/{id}/"
        const val PATH_POKEMON_SPECIES_LIST: String = "/api/v2/pokemon-species/"
        const val PATH_POKEMON_SPECIES_RETRIEVE: String = "/api/v2/pokemon-species/{id}/"
        const val PATH_REGION_LIST: String = "/api/v2/region/"
        const val PATH_REGION_RETRIEVE: String = "/api/v2/region/{id}/"
        const val PATH_STAT_LIST: String = "/api/v2/stat/"
        const val PATH_STAT_RETRIEVE: String = "/api/v2/stat/{id}/"
        const val PATH_SUPER_CONTEST_EFFECT_LIST: String = "/api/v2/super-contest-effect/"
        const val PATH_SUPER_CONTEST_EFFECT_RETRIEVE: String = "/api/v2/super-contest-effect/{id}/"
        const val PATH_TYPE_LIST: String = "/api/v2/type/"
        const val PATH_TYPE_RETRIEVE: String = "/api/v2/type/{id}/"
        const val PATH_VERSION_GROUP_LIST: String = "/api/v2/version-group/"
        const val PATH_VERSION_GROUP_RETRIEVE: String = "/api/v2/version-group/{id}/"
        const val PATH_VERSION_LIST: String = "/api/v2/version/"
        const val PATH_VERSION_RETRIEVE: String = "/api/v2/version/{id}/"
    }
}
