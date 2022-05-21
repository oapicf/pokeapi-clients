package org.openapitools.api

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class ApiApiController() {


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/ability/"],
        produces = ["text/plain"]
    )
    fun abilityList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/ability/{id}/"],
        produces = ["text/plain"]
    )
    fun abilityRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/berry-firmness/"],
        produces = ["text/plain"]
    )
    fun berryFirmnessList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/berry-firmness/{id}/"],
        produces = ["text/plain"]
    )
    fun berryFirmnessRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/berry-flavor/"],
        produces = ["text/plain"]
    )
    fun berryFlavorList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/berry-flavor/{id}/"],
        produces = ["text/plain"]
    )
    fun berryFlavorRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/berry/"],
        produces = ["text/plain"]
    )
    fun berryList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/berry/{id}/"],
        produces = ["text/plain"]
    )
    fun berryRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/characteristic/"],
        produces = ["text/plain"]
    )
    fun characteristicList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/characteristic/{id}/"],
        produces = ["text/plain"]
    )
    fun characteristicRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/contest-effect/"],
        produces = ["text/plain"]
    )
    fun contestEffectList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/contest-effect/{id}/"],
        produces = ["text/plain"]
    )
    fun contestEffectRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/contest-type/"],
        produces = ["text/plain"]
    )
    fun contestTypeList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/contest-type/{id}/"],
        produces = ["text/plain"]
    )
    fun contestTypeRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/egg-group/"],
        produces = ["text/plain"]
    )
    fun eggGroupList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/egg-group/{id}/"],
        produces = ["text/plain"]
    )
    fun eggGroupRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/encounter-condition/"],
        produces = ["text/plain"]
    )
    fun encounterConditionList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/encounter-condition/{id}/"],
        produces = ["text/plain"]
    )
    fun encounterConditionRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/encounter-condition-value/"],
        produces = ["text/plain"]
    )
    fun encounterConditionValueList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/encounter-condition-value/{id}/"],
        produces = ["text/plain"]
    )
    fun encounterConditionValueRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/encounter-method/"],
        produces = ["text/plain"]
    )
    fun encounterMethodList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/encounter-method/{id}/"],
        produces = ["text/plain"]
    )
    fun encounterMethodRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/evolution-chain/"],
        produces = ["text/plain"]
    )
    fun evolutionChainList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/evolution-chain/{id}/"],
        produces = ["text/plain"]
    )
    fun evolutionChainRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/evolution-trigger/"],
        produces = ["text/plain"]
    )
    fun evolutionTriggerList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/evolution-trigger/{id}/"],
        produces = ["text/plain"]
    )
    fun evolutionTriggerRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/gender/"],
        produces = ["text/plain"]
    )
    fun genderList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/gender/{id}/"],
        produces = ["text/plain"]
    )
    fun genderRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/generation/"],
        produces = ["text/plain"]
    )
    fun generationList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/generation/{id}/"],
        produces = ["text/plain"]
    )
    fun generationRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/growth-rate/"],
        produces = ["text/plain"]
    )
    fun growthRateList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/growth-rate/{id}/"],
        produces = ["text/plain"]
    )
    fun growthRateRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item-attribute/"],
        produces = ["text/plain"]
    )
    fun itemAttributeList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item-attribute/{id}/"],
        produces = ["text/plain"]
    )
    fun itemAttributeRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item-category/"],
        produces = ["text/plain"]
    )
    fun itemCategoryList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item-category/{id}/"],
        produces = ["text/plain"]
    )
    fun itemCategoryRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item-fling-effect/"],
        produces = ["text/plain"]
    )
    fun itemFlingEffectList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item-fling-effect/{id}/"],
        produces = ["text/plain"]
    )
    fun itemFlingEffectRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item/"],
        produces = ["text/plain"]
    )
    fun itemList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item-pocket/"],
        produces = ["text/plain"]
    )
    fun itemPocketList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item-pocket/{id}/"],
        produces = ["text/plain"]
    )
    fun itemPocketRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/item/{id}/"],
        produces = ["text/plain"]
    )
    fun itemRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/language/"],
        produces = ["text/plain"]
    )
    fun languageList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/language/{id}/"],
        produces = ["text/plain"]
    )
    fun languageRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/location-area/"],
        produces = ["text/plain"]
    )
    fun locationAreaList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/location-area/{id}/"],
        produces = ["text/plain"]
    )
    fun locationAreaRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/location/"],
        produces = ["text/plain"]
    )
    fun locationList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/location/{id}/"],
        produces = ["text/plain"]
    )
    fun locationRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/machine/"],
        produces = ["text/plain"]
    )
    fun machineList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/machine/{id}/"],
        produces = ["text/plain"]
    )
    fun machineRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-ailment/"],
        produces = ["text/plain"]
    )
    fun moveAilmentList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-ailment/{id}/"],
        produces = ["text/plain"]
    )
    fun moveAilmentRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-battle-style/"],
        produces = ["text/plain"]
    )
    fun moveBattleStyleList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-battle-style/{id}/"],
        produces = ["text/plain"]
    )
    fun moveBattleStyleRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-category/"],
        produces = ["text/plain"]
    )
    fun moveCategoryList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-category/{id}/"],
        produces = ["text/plain"]
    )
    fun moveCategoryRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-damage-class/"],
        produces = ["text/plain"]
    )
    fun moveDamageClassList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-damage-class/{id}/"],
        produces = ["text/plain"]
    )
    fun moveDamageClassRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-learn-method/"],
        produces = ["text/plain"]
    )
    fun moveLearnMethodList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-learn-method/{id}/"],
        produces = ["text/plain"]
    )
    fun moveLearnMethodRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move/"],
        produces = ["text/plain"]
    )
    fun moveList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move/{id}/"],
        produces = ["text/plain"]
    )
    fun moveRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-target/"],
        produces = ["text/plain"]
    )
    fun moveTargetList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/move-target/{id}/"],
        produces = ["text/plain"]
    )
    fun moveTargetRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/nature/"],
        produces = ["text/plain"]
    )
    fun natureList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/nature/{id}/"],
        produces = ["text/plain"]
    )
    fun natureRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pal-park-area/"],
        produces = ["text/plain"]
    )
    fun palParkAreaList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pal-park-area/{id}/"],
        produces = ["text/plain"]
    )
    fun palParkAreaRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokeathlon-stat/"],
        produces = ["text/plain"]
    )
    fun pokeathlonStatList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokeathlon-stat/{id}/"],
        produces = ["text/plain"]
    )
    fun pokeathlonStatRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokedex/"],
        produces = ["text/plain"]
    )
    fun pokedexList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokedex/{id}/"],
        produces = ["text/plain"]
    )
    fun pokedexRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-color/"],
        produces = ["text/plain"]
    )
    fun pokemonColorList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-color/{id}/"],
        produces = ["text/plain"]
    )
    fun pokemonColorRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-form/"],
        produces = ["text/plain"]
    )
    fun pokemonFormList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-form/{id}/"],
        produces = ["text/plain"]
    )
    fun pokemonFormRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-habitat/"],
        produces = ["text/plain"]
    )
    fun pokemonHabitatList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-habitat/{id}/"],
        produces = ["text/plain"]
    )
    fun pokemonHabitatRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon/"],
        produces = ["text/plain"]
    )
    fun pokemonList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon/{id}/"],
        produces = ["text/plain"]
    )
    fun pokemonRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-shape/"],
        produces = ["text/plain"]
    )
    fun pokemonShapeList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-shape/{id}/"],
        produces = ["text/plain"]
    )
    fun pokemonShapeRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-species/"],
        produces = ["text/plain"]
    )
    fun pokemonSpeciesList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/pokemon-species/{id}/"],
        produces = ["text/plain"]
    )
    fun pokemonSpeciesRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/region/"],
        produces = ["text/plain"]
    )
    fun regionList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/region/{id}/"],
        produces = ["text/plain"]
    )
    fun regionRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/stat/"],
        produces = ["text/plain"]
    )
    fun statList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/stat/{id}/"],
        produces = ["text/plain"]
    )
    fun statRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/super-contest-effect/"],
        produces = ["text/plain"]
    )
    fun superContestEffectList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/super-contest-effect/{id}/"],
        produces = ["text/plain"]
    )
    fun superContestEffectRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/type/"],
        produces = ["text/plain"]
    )
    fun typeList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/type/{id}/"],
        produces = ["text/plain"]
    )
    fun typeRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/version-group/"],
        produces = ["text/plain"]
    )
    fun versionGroupList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/version-group/{id}/"],
        produces = ["text/plain"]
    )
    fun versionGroupRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/version/"],
        produces = ["text/plain"]
    )
    fun versionList( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
, @RequestParam(value = "offset", required = false) offset: kotlin.Int?
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/v2/version/{id}/"],
        produces = ["text/plain"]
    )
    fun versionRead( @PathVariable("id") id: kotlin.Int
): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
