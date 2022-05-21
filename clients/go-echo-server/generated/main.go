package main

import (
	"github.com/GIT_USER_ID/GIT_REPO_ID/handlers"
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


	// AbilityList - 
	e.GET("/api/v2/ability/", c.AbilityList)

	// AbilityRead - 
	e.GET("/api/v2/ability/:id/", c.AbilityRead)

	// BerryList - 
	e.GET("/api/v2/berry/", c.BerryList)

	// BerryRead - 
	e.GET("/api/v2/berry/:id/", c.BerryRead)

	// BerryFirmnessList - 
	e.GET("/api/v2/berry-firmness/", c.BerryFirmnessList)

	// BerryFirmnessRead - 
	e.GET("/api/v2/berry-firmness/:id/", c.BerryFirmnessRead)

	// BerryFlavorList - 
	e.GET("/api/v2/berry-flavor/", c.BerryFlavorList)

	// BerryFlavorRead - 
	e.GET("/api/v2/berry-flavor/:id/", c.BerryFlavorRead)

	// CharacteristicList - 
	e.GET("/api/v2/characteristic/", c.CharacteristicList)

	// CharacteristicRead - 
	e.GET("/api/v2/characteristic/:id/", c.CharacteristicRead)

	// ContestEffectList - 
	e.GET("/api/v2/contest-effect/", c.ContestEffectList)

	// ContestEffectRead - 
	e.GET("/api/v2/contest-effect/:id/", c.ContestEffectRead)

	// ContestTypeList - 
	e.GET("/api/v2/contest-type/", c.ContestTypeList)

	// ContestTypeRead - 
	e.GET("/api/v2/contest-type/:id/", c.ContestTypeRead)

	// EggGroupList - 
	e.GET("/api/v2/egg-group/", c.EggGroupList)

	// EggGroupRead - 
	e.GET("/api/v2/egg-group/:id/", c.EggGroupRead)

	// EncounterConditionList - 
	e.GET("/api/v2/encounter-condition/", c.EncounterConditionList)

	// EncounterConditionRead - 
	e.GET("/api/v2/encounter-condition/:id/", c.EncounterConditionRead)

	// EncounterConditionValueList - 
	e.GET("/api/v2/encounter-condition-value/", c.EncounterConditionValueList)

	// EncounterConditionValueRead - 
	e.GET("/api/v2/encounter-condition-value/:id/", c.EncounterConditionValueRead)

	// EncounterMethodList - 
	e.GET("/api/v2/encounter-method/", c.EncounterMethodList)

	// EncounterMethodRead - 
	e.GET("/api/v2/encounter-method/:id/", c.EncounterMethodRead)

	// EvolutionChainList - 
	e.GET("/api/v2/evolution-chain/", c.EvolutionChainList)

	// EvolutionChainRead - 
	e.GET("/api/v2/evolution-chain/:id/", c.EvolutionChainRead)

	// EvolutionTriggerList - 
	e.GET("/api/v2/evolution-trigger/", c.EvolutionTriggerList)

	// EvolutionTriggerRead - 
	e.GET("/api/v2/evolution-trigger/:id/", c.EvolutionTriggerRead)

	// GenderList - 
	e.GET("/api/v2/gender/", c.GenderList)

	// GenderRead - 
	e.GET("/api/v2/gender/:id/", c.GenderRead)

	// GenerationList - 
	e.GET("/api/v2/generation/", c.GenerationList)

	// GenerationRead - 
	e.GET("/api/v2/generation/:id/", c.GenerationRead)

	// GrowthRateList - 
	e.GET("/api/v2/growth-rate/", c.GrowthRateList)

	// GrowthRateRead - 
	e.GET("/api/v2/growth-rate/:id/", c.GrowthRateRead)

	// ItemList - 
	e.GET("/api/v2/item/", c.ItemList)

	// ItemRead - 
	e.GET("/api/v2/item/:id/", c.ItemRead)

	// ItemAttributeList - 
	e.GET("/api/v2/item-attribute/", c.ItemAttributeList)

	// ItemAttributeRead - 
	e.GET("/api/v2/item-attribute/:id/", c.ItemAttributeRead)

	// ItemCategoryList - 
	e.GET("/api/v2/item-category/", c.ItemCategoryList)

	// ItemCategoryRead - 
	e.GET("/api/v2/item-category/:id/", c.ItemCategoryRead)

	// ItemFlingEffectList - 
	e.GET("/api/v2/item-fling-effect/", c.ItemFlingEffectList)

	// ItemFlingEffectRead - 
	e.GET("/api/v2/item-fling-effect/:id/", c.ItemFlingEffectRead)

	// ItemPocketList - 
	e.GET("/api/v2/item-pocket/", c.ItemPocketList)

	// ItemPocketRead - 
	e.GET("/api/v2/item-pocket/:id/", c.ItemPocketRead)

	// LanguageList - 
	e.GET("/api/v2/language/", c.LanguageList)

	// LanguageRead - 
	e.GET("/api/v2/language/:id/", c.LanguageRead)

	// LocationList - 
	e.GET("/api/v2/location/", c.LocationList)

	// LocationRead - 
	e.GET("/api/v2/location/:id/", c.LocationRead)

	// LocationAreaList - 
	e.GET("/api/v2/location-area/", c.LocationAreaList)

	// LocationAreaRead - 
	e.GET("/api/v2/location-area/:id/", c.LocationAreaRead)

	// MachineList - 
	e.GET("/api/v2/machine/", c.MachineList)

	// MachineRead - 
	e.GET("/api/v2/machine/:id/", c.MachineRead)

	// MoveList - 
	e.GET("/api/v2/move/", c.MoveList)

	// MoveRead - 
	e.GET("/api/v2/move/:id/", c.MoveRead)

	// MoveAilmentList - 
	e.GET("/api/v2/move-ailment/", c.MoveAilmentList)

	// MoveAilmentRead - 
	e.GET("/api/v2/move-ailment/:id/", c.MoveAilmentRead)

	// MoveBattleStyleList - 
	e.GET("/api/v2/move-battle-style/", c.MoveBattleStyleList)

	// MoveBattleStyleRead - 
	e.GET("/api/v2/move-battle-style/:id/", c.MoveBattleStyleRead)

	// MoveCategoryList - 
	e.GET("/api/v2/move-category/", c.MoveCategoryList)

	// MoveCategoryRead - 
	e.GET("/api/v2/move-category/:id/", c.MoveCategoryRead)

	// MoveDamageClassList - 
	e.GET("/api/v2/move-damage-class/", c.MoveDamageClassList)

	// MoveDamageClassRead - 
	e.GET("/api/v2/move-damage-class/:id/", c.MoveDamageClassRead)

	// MoveLearnMethodList - 
	e.GET("/api/v2/move-learn-method/", c.MoveLearnMethodList)

	// MoveLearnMethodRead - 
	e.GET("/api/v2/move-learn-method/:id/", c.MoveLearnMethodRead)

	// MoveTargetList - 
	e.GET("/api/v2/move-target/", c.MoveTargetList)

	// MoveTargetRead - 
	e.GET("/api/v2/move-target/:id/", c.MoveTargetRead)

	// NatureList - 
	e.GET("/api/v2/nature/", c.NatureList)

	// NatureRead - 
	e.GET("/api/v2/nature/:id/", c.NatureRead)

	// PalParkAreaList - 
	e.GET("/api/v2/pal-park-area/", c.PalParkAreaList)

	// PalParkAreaRead - 
	e.GET("/api/v2/pal-park-area/:id/", c.PalParkAreaRead)

	// PokeathlonStatList - 
	e.GET("/api/v2/pokeathlon-stat/", c.PokeathlonStatList)

	// PokeathlonStatRead - 
	e.GET("/api/v2/pokeathlon-stat/:id/", c.PokeathlonStatRead)

	// PokedexList - 
	e.GET("/api/v2/pokedex/", c.PokedexList)

	// PokedexRead - 
	e.GET("/api/v2/pokedex/:id/", c.PokedexRead)

	// PokemonList - 
	e.GET("/api/v2/pokemon/", c.PokemonList)

	// PokemonRead - 
	e.GET("/api/v2/pokemon/:id/", c.PokemonRead)

	// PokemonColorList - 
	e.GET("/api/v2/pokemon-color/", c.PokemonColorList)

	// PokemonColorRead - 
	e.GET("/api/v2/pokemon-color/:id/", c.PokemonColorRead)

	// PokemonFormList - 
	e.GET("/api/v2/pokemon-form/", c.PokemonFormList)

	// PokemonFormRead - 
	e.GET("/api/v2/pokemon-form/:id/", c.PokemonFormRead)

	// PokemonHabitatList - 
	e.GET("/api/v2/pokemon-habitat/", c.PokemonHabitatList)

	// PokemonHabitatRead - 
	e.GET("/api/v2/pokemon-habitat/:id/", c.PokemonHabitatRead)

	// PokemonShapeList - 
	e.GET("/api/v2/pokemon-shape/", c.PokemonShapeList)

	// PokemonShapeRead - 
	e.GET("/api/v2/pokemon-shape/:id/", c.PokemonShapeRead)

	// PokemonSpeciesList - 
	e.GET("/api/v2/pokemon-species/", c.PokemonSpeciesList)

	// PokemonSpeciesRead - 
	e.GET("/api/v2/pokemon-species/:id/", c.PokemonSpeciesRead)

	// RegionList - 
	e.GET("/api/v2/region/", c.RegionList)

	// RegionRead - 
	e.GET("/api/v2/region/:id/", c.RegionRead)

	// StatList - 
	e.GET("/api/v2/stat/", c.StatList)

	// StatRead - 
	e.GET("/api/v2/stat/:id/", c.StatRead)

	// SuperContestEffectList - 
	e.GET("/api/v2/super-contest-effect/", c.SuperContestEffectList)

	// SuperContestEffectRead - 
	e.GET("/api/v2/super-contest-effect/:id/", c.SuperContestEffectRead)

	// TypeList - 
	e.GET("/api/v2/type/", c.TypeList)

	// TypeRead - 
	e.GET("/api/v2/type/:id/", c.TypeRead)

	// VersionList - 
	e.GET("/api/v2/version/", c.VersionList)

	// VersionRead - 
	e.GET("/api/v2/version/:id/", c.VersionRead)

	// VersionGroupList - 
	e.GET("/api/v2/version-group/", c.VersionGroupList)

	// VersionGroupRead - 
	e.GET("/api/v2/version-group/:id/", c.VersionGroupRead)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}