package main

import (
	"github.com/oapicf/pokeapi-clients/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// BerryFirmnessList - List berry firmness
	e.GET("/api/v2/berry-firmness/", c.BerryFirmnessList)

	// BerryFirmnessRetrieve - Get berry by firmness
	e.GET("/api/v2/berry-firmness/:id/", c.BerryFirmnessRetrieve)

	// BerryFlavorList - List berry flavors
	e.GET("/api/v2/berry-flavor/", c.BerryFlavorList)

	// BerryFlavorRetrieve - Get berries by flavor
	e.GET("/api/v2/berry-flavor/:id/", c.BerryFlavorRetrieve)

	// BerryList - List berries
	e.GET("/api/v2/berry/", c.BerryList)

	// BerryRetrieve - Get a berry
	e.GET("/api/v2/berry/:id/", c.BerryRetrieve)

	// ContestEffectList - List contest effects
	e.GET("/api/v2/contest-effect/", c.ContestEffectList)

	// ContestEffectRetrieve - Get contest effect
	e.GET("/api/v2/contest-effect/:id/", c.ContestEffectRetrieve)

	// ContestTypeList - List contest types
	e.GET("/api/v2/contest-type/", c.ContestTypeList)

	// ContestTypeRetrieve - Get contest type
	e.GET("/api/v2/contest-type/:id/", c.ContestTypeRetrieve)

	// SuperContestEffectList - List super contest effects
	e.GET("/api/v2/super-contest-effect/", c.SuperContestEffectList)

	// SuperContestEffectRetrieve - Get super contest effect
	e.GET("/api/v2/super-contest-effect/:id/", c.SuperContestEffectRetrieve)

	// EncounterConditionList - List encounter conditions
	e.GET("/api/v2/encounter-condition/", c.EncounterConditionList)

	// EncounterConditionRetrieve - Get encounter condition
	e.GET("/api/v2/encounter-condition/:id/", c.EncounterConditionRetrieve)

	// EncounterConditionValueList - List encounter condition values
	e.GET("/api/v2/encounter-condition-value/", c.EncounterConditionValueList)

	// EncounterConditionValueRetrieve - Get encounter condition value
	e.GET("/api/v2/encounter-condition-value/:id/", c.EncounterConditionValueRetrieve)

	// EncounterMethodList - List encounter methods
	e.GET("/api/v2/encounter-method/", c.EncounterMethodList)

	// EncounterMethodRetrieve - Get encounter method
	e.GET("/api/v2/encounter-method/:id/", c.EncounterMethodRetrieve)

	// PokemonEncountersRetrieve - Get pokemon encounter
	e.GET("/api/v2/pokemon/:pokemon_id/encounters", c.PokemonEncountersRetrieve)

	// EvolutionChainList - List evolution chains
	e.GET("/api/v2/evolution-chain/", c.EvolutionChainList)

	// EvolutionChainRetrieve - Get evolution chain
	e.GET("/api/v2/evolution-chain/:id/", c.EvolutionChainRetrieve)

	// EvolutionTriggerList - List evolution triggers
	e.GET("/api/v2/evolution-trigger/", c.EvolutionTriggerList)

	// EvolutionTriggerRetrieve - Get evolution trigger
	e.GET("/api/v2/evolution-trigger/:id/", c.EvolutionTriggerRetrieve)

	// GenerationList - List genrations
	e.GET("/api/v2/generation/", c.GenerationList)

	// GenerationRetrieve - Get genration
	e.GET("/api/v2/generation/:id/", c.GenerationRetrieve)

	// PokedexList - List pokedex
	e.GET("/api/v2/pokedex/", c.PokedexList)

	// PokedexRetrieve - Get pokedex
	e.GET("/api/v2/pokedex/:id/", c.PokedexRetrieve)

	// VersionGroupList - List version groups
	e.GET("/api/v2/version-group/", c.VersionGroupList)

	// VersionGroupRetrieve - Get version group
	e.GET("/api/v2/version-group/:id/", c.VersionGroupRetrieve)

	// VersionList - List versions
	e.GET("/api/v2/version/", c.VersionList)

	// VersionRetrieve - Get version
	e.GET("/api/v2/version/:id/", c.VersionRetrieve)

	// ItemAttributeList - List item attributes
	e.GET("/api/v2/item-attribute/", c.ItemAttributeList)

	// ItemAttributeRetrieve - Get item attribute
	e.GET("/api/v2/item-attribute/:id/", c.ItemAttributeRetrieve)

	// ItemCategoryList - List item categories
	e.GET("/api/v2/item-category/", c.ItemCategoryList)

	// ItemCategoryRetrieve - Get item category
	e.GET("/api/v2/item-category/:id/", c.ItemCategoryRetrieve)

	// ItemFlingEffectList - List item fling effects
	e.GET("/api/v2/item-fling-effect/", c.ItemFlingEffectList)

	// ItemFlingEffectRetrieve - Get item fling effect
	e.GET("/api/v2/item-fling-effect/:id/", c.ItemFlingEffectRetrieve)

	// ItemList - List items
	e.GET("/api/v2/item/", c.ItemList)

	// ItemPocketList - List item pockets
	e.GET("/api/v2/item-pocket/", c.ItemPocketList)

	// ItemPocketRetrieve - Get item pocket
	e.GET("/api/v2/item-pocket/:id/", c.ItemPocketRetrieve)

	// ItemRetrieve - Get item
	e.GET("/api/v2/item/:id/", c.ItemRetrieve)

	// LocationAreaList - List location areas
	e.GET("/api/v2/location-area/", c.LocationAreaList)

	// LocationAreaRetrieve - Get location area
	e.GET("/api/v2/location-area/:id/", c.LocationAreaRetrieve)

	// LocationList - List locations
	e.GET("/api/v2/location/", c.LocationList)

	// LocationRetrieve - Get location
	e.GET("/api/v2/location/:id/", c.LocationRetrieve)

	// PalParkAreaList - List pal park areas
	e.GET("/api/v2/pal-park-area/", c.PalParkAreaList)

	// PalParkAreaRetrieve - Get pal park area
	e.GET("/api/v2/pal-park-area/:id/", c.PalParkAreaRetrieve)

	// RegionList - List regions
	e.GET("/api/v2/region/", c.RegionList)

	// RegionRetrieve - Get region
	e.GET("/api/v2/region/:id/", c.RegionRetrieve)

	// MachineList - List machines
	e.GET("/api/v2/machine/", c.MachineList)

	// MachineRetrieve - Get machine
	e.GET("/api/v2/machine/:id/", c.MachineRetrieve)

	// MoveAilmentList - List move meta ailments
	e.GET("/api/v2/move-ailment/", c.MoveAilmentList)

	// MoveAilmentRetrieve - Get move meta ailment
	e.GET("/api/v2/move-ailment/:id/", c.MoveAilmentRetrieve)

	// MoveBattleStyleList - List move battle styles
	e.GET("/api/v2/move-battle-style/", c.MoveBattleStyleList)

	// MoveBattleStyleRetrieve - Get move battle style
	e.GET("/api/v2/move-battle-style/:id/", c.MoveBattleStyleRetrieve)

	// MoveCategoryList - List move meta categories
	e.GET("/api/v2/move-category/", c.MoveCategoryList)

	// MoveCategoryRetrieve - Get move meta category
	e.GET("/api/v2/move-category/:id/", c.MoveCategoryRetrieve)

	// MoveLearnMethodList - List move learn methods
	e.GET("/api/v2/move-learn-method/", c.MoveLearnMethodList)

	// MoveLearnMethodRetrieve - Get move learn method
	e.GET("/api/v2/move-learn-method/:id/", c.MoveLearnMethodRetrieve)

	// MoveList - List moves
	e.GET("/api/v2/move/", c.MoveList)

	// MoveRetrieve - Get move
	e.GET("/api/v2/move/:id/", c.MoveRetrieve)

	// MoveTargetList - List move targets
	e.GET("/api/v2/move-target/", c.MoveTargetList)

	// MoveTargetRetrieve - Get move target
	e.GET("/api/v2/move-target/:id/", c.MoveTargetRetrieve)

	// AbilityList - 
	e.GET("/api/v2/ability/", c.AbilityList)

	// AbilityRetrieve - 
	e.GET("/api/v2/ability/:id/", c.AbilityRetrieve)

	// CharacteristicList - List charecterictics
	e.GET("/api/v2/characteristic/", c.CharacteristicList)

	// CharacteristicRetrieve - Get characteristic
	e.GET("/api/v2/characteristic/:id/", c.CharacteristicRetrieve)

	// EggGroupList - List egg groups
	e.GET("/api/v2/egg-group/", c.EggGroupList)

	// EggGroupRetrieve - Get egg group
	e.GET("/api/v2/egg-group/:id/", c.EggGroupRetrieve)

	// GenderList - List genders
	e.GET("/api/v2/gender/", c.GenderList)

	// GenderRetrieve - Get gender
	e.GET("/api/v2/gender/:id/", c.GenderRetrieve)

	// GrowthRateList - List growth rates
	e.GET("/api/v2/growth-rate/", c.GrowthRateList)

	// GrowthRateRetrieve - Get growth rate
	e.GET("/api/v2/growth-rate/:id/", c.GrowthRateRetrieve)

	// MoveDamageClassList - List move damage classes
	e.GET("/api/v2/move-damage-class/", c.MoveDamageClassList)

	// MoveDamageClassRetrieve - Get move damage class
	e.GET("/api/v2/move-damage-class/:id/", c.MoveDamageClassRetrieve)

	// NatureList - List natures
	e.GET("/api/v2/nature/", c.NatureList)

	// NatureRetrieve - Get nature
	e.GET("/api/v2/nature/:id/", c.NatureRetrieve)

	// PokeathlonStatList - List pokeathlon stats
	e.GET("/api/v2/pokeathlon-stat/", c.PokeathlonStatList)

	// PokeathlonStatRetrieve - Get pokeathlon stat
	e.GET("/api/v2/pokeathlon-stat/:id/", c.PokeathlonStatRetrieve)

	// PokemonColorList - List pokemon colors
	e.GET("/api/v2/pokemon-color/", c.PokemonColorList)

	// PokemonColorRetrieve - Get pokemon color
	e.GET("/api/v2/pokemon-color/:id/", c.PokemonColorRetrieve)

	// PokemonFormList - List pokemon forms
	e.GET("/api/v2/pokemon-form/", c.PokemonFormList)

	// PokemonFormRetrieve - Get pokemon form
	e.GET("/api/v2/pokemon-form/:id/", c.PokemonFormRetrieve)

	// PokemonHabitatList - List pokemom habitas
	e.GET("/api/v2/pokemon-habitat/", c.PokemonHabitatList)

	// PokemonHabitatRetrieve - Get pokemom habita
	e.GET("/api/v2/pokemon-habitat/:id/", c.PokemonHabitatRetrieve)

	// PokemonList - List pokemon
	e.GET("/api/v2/pokemon/", c.PokemonList)

	// PokemonRetrieve - Get pokemon
	e.GET("/api/v2/pokemon/:id/", c.PokemonRetrieve)

	// PokemonShapeList - List pokemon shapes
	e.GET("/api/v2/pokemon-shape/", c.PokemonShapeList)

	// PokemonShapeRetrieve - Get pokemon shape
	e.GET("/api/v2/pokemon-shape/:id/", c.PokemonShapeRetrieve)

	// PokemonSpeciesList - List pokemon species
	e.GET("/api/v2/pokemon-species/", c.PokemonSpeciesList)

	// PokemonSpeciesRetrieve - Get pokemon species
	e.GET("/api/v2/pokemon-species/:id/", c.PokemonSpeciesRetrieve)

	// StatList - List stats
	e.GET("/api/v2/stat/", c.StatList)

	// StatRetrieve - Get stat
	e.GET("/api/v2/stat/:id/", c.StatRetrieve)

	// TypeList - List types
	e.GET("/api/v2/type/", c.TypeList)

	// TypeRetrieve - Get types
	e.GET("/api/v2/type/:id/", c.TypeRetrieve)

	// LanguageList - List languages
	e.GET("/api/v2/language/", c.LanguageList)

	// LanguageRetrieve - Get language
	e.GET("/api/v2/language/:id/", c.LanguageRetrieve)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
