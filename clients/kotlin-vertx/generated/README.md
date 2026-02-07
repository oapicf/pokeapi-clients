# org.openapitools - Kotlin Server library for PokéAPI

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://pokeapi.co*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BerriesApi* | [**berryFirmnessList**](docs/BerriesApi.md#berryfirmnesslist) | **GET** /api/v2/berry-firmness/ | List berry firmness
*BerriesApi* | [**berryFirmnessRetrieve**](docs/BerriesApi.md#berryfirmnessretrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
*BerriesApi* | [**berryFlavorList**](docs/BerriesApi.md#berryflavorlist) | **GET** /api/v2/berry-flavor/ | List berry flavors
*BerriesApi* | [**berryFlavorRetrieve**](docs/BerriesApi.md#berryflavorretrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
*BerriesApi* | [**berryList**](docs/BerriesApi.md#berrylist) | **GET** /api/v2/berry/ | List berries
*BerriesApi* | [**berryRetrieve**](docs/BerriesApi.md#berryretrieve) | **GET** /api/v2/berry/{id}/ | Get a berry
*ContestsApi* | [**contestEffectList**](docs/ContestsApi.md#contesteffectlist) | **GET** /api/v2/contest-effect/ | List contest effects
*ContestsApi* | [**contestEffectRetrieve**](docs/ContestsApi.md#contesteffectretrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
*ContestsApi* | [**contestTypeList**](docs/ContestsApi.md#contesttypelist) | **GET** /api/v2/contest-type/ | List contest types
*ContestsApi* | [**contestTypeRetrieve**](docs/ContestsApi.md#contesttyperetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
*ContestsApi* | [**superContestEffectList**](docs/ContestsApi.md#supercontesteffectlist) | **GET** /api/v2/super-contest-effect/ | List super contest effects
*ContestsApi* | [**superContestEffectRetrieve**](docs/ContestsApi.md#supercontesteffectretrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect
*EncountersApi* | [**encounterConditionList**](docs/EncountersApi.md#encounterconditionlist) | **GET** /api/v2/encounter-condition/ | List encounter conditions
*EncountersApi* | [**encounterConditionRetrieve**](docs/EncountersApi.md#encounterconditionretrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
*EncountersApi* | [**encounterConditionValueList**](docs/EncountersApi.md#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
*EncountersApi* | [**encounterConditionValueRetrieve**](docs/EncountersApi.md#encounterconditionvalueretrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
*EncountersApi* | [**encounterMethodList**](docs/EncountersApi.md#encountermethodlist) | **GET** /api/v2/encounter-method/ | List encounter methods
*EncountersApi* | [**encounterMethodRetrieve**](docs/EncountersApi.md#encountermethodretrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
*EncountersApi* | [**pokemonEncountersRetrieve**](docs/EncountersApi.md#pokemonencountersretrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter
*EvolutionApi* | [**evolutionChainList**](docs/EvolutionApi.md#evolutionchainlist) | **GET** /api/v2/evolution-chain/ | List evolution chains
*EvolutionApi* | [**evolutionChainRetrieve**](docs/EvolutionApi.md#evolutionchainretrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
*EvolutionApi* | [**evolutionTriggerList**](docs/EvolutionApi.md#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
*EvolutionApi* | [**evolutionTriggerRetrieve**](docs/EvolutionApi.md#evolutiontriggerretrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
*GamesApi* | [**generationList**](docs/GamesApi.md#generationlist) | **GET** /api/v2/generation/ | List genrations
*GamesApi* | [**generationRetrieve**](docs/GamesApi.md#generationretrieve) | **GET** /api/v2/generation/{id}/ | Get genration
*GamesApi* | [**pokedexList**](docs/GamesApi.md#pokedexlist) | **GET** /api/v2/pokedex/ | List pokedex
*GamesApi* | [**pokedexRetrieve**](docs/GamesApi.md#pokedexretrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
*GamesApi* | [**versionGroupList**](docs/GamesApi.md#versiongrouplist) | **GET** /api/v2/version-group/ | List version groups
*GamesApi* | [**versionGroupRetrieve**](docs/GamesApi.md#versiongroupretrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
*GamesApi* | [**versionList**](docs/GamesApi.md#versionlist) | **GET** /api/v2/version/ | List versions
*GamesApi* | [**versionRetrieve**](docs/GamesApi.md#versionretrieve) | **GET** /api/v2/version/{id}/ | Get version
*ItemsApi* | [**itemAttributeList**](docs/ItemsApi.md#itemattributelist) | **GET** /api/v2/item-attribute/ | List item attributes
*ItemsApi* | [**itemAttributeRetrieve**](docs/ItemsApi.md#itemattributeretrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
*ItemsApi* | [**itemCategoryList**](docs/ItemsApi.md#itemcategorylist) | **GET** /api/v2/item-category/ | List item categories
*ItemsApi* | [**itemCategoryRetrieve**](docs/ItemsApi.md#itemcategoryretrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
*ItemsApi* | [**itemFlingEffectList**](docs/ItemsApi.md#itemflingeffectlist) | **GET** /api/v2/item-fling-effect/ | List item fling effects
*ItemsApi* | [**itemFlingEffectRetrieve**](docs/ItemsApi.md#itemflingeffectretrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
*ItemsApi* | [**itemList**](docs/ItemsApi.md#itemlist) | **GET** /api/v2/item/ | List items
*ItemsApi* | [**itemPocketList**](docs/ItemsApi.md#itempocketlist) | **GET** /api/v2/item-pocket/ | List item pockets
*ItemsApi* | [**itemPocketRetrieve**](docs/ItemsApi.md#itempocketretrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
*ItemsApi* | [**itemRetrieve**](docs/ItemsApi.md#itemretrieve) | **GET** /api/v2/item/{id}/ | Get item
*LocationApi* | [**locationAreaList**](docs/LocationApi.md#locationarealist) | **GET** /api/v2/location-area/ | List location areas
*LocationApi* | [**locationAreaRetrieve**](docs/LocationApi.md#locationarearetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
*LocationApi* | [**locationList**](docs/LocationApi.md#locationlist) | **GET** /api/v2/location/ | List locations
*LocationApi* | [**locationRetrieve**](docs/LocationApi.md#locationretrieve) | **GET** /api/v2/location/{id}/ | Get location
*LocationApi* | [**palParkAreaList**](docs/LocationApi.md#palparkarealist) | **GET** /api/v2/pal-park-area/ | List pal park areas
*LocationApi* | [**palParkAreaRetrieve**](docs/LocationApi.md#palparkarearetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
*LocationApi* | [**regionList**](docs/LocationApi.md#regionlist) | **GET** /api/v2/region/ | List regions
*LocationApi* | [**regionRetrieve**](docs/LocationApi.md#regionretrieve) | **GET** /api/v2/region/{id}/ | Get region
*MachinesApi* | [**machineList**](docs/MachinesApi.md#machinelist) | **GET** /api/v2/machine/ | List machines
*MachinesApi* | [**machineRetrieve**](docs/MachinesApi.md#machineretrieve) | **GET** /api/v2/machine/{id}/ | Get machine
*MovesApi* | [**moveAilmentList**](docs/MovesApi.md#moveailmentlist) | **GET** /api/v2/move-ailment/ | List move meta ailments
*MovesApi* | [**moveAilmentRetrieve**](docs/MovesApi.md#moveailmentretrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
*MovesApi* | [**moveBattleStyleList**](docs/MovesApi.md#movebattlestylelist) | **GET** /api/v2/move-battle-style/ | List move battle styles
*MovesApi* | [**moveBattleStyleRetrieve**](docs/MovesApi.md#movebattlestyleretrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
*MovesApi* | [**moveCategoryList**](docs/MovesApi.md#movecategorylist) | **GET** /api/v2/move-category/ | List move meta categories
*MovesApi* | [**moveCategoryRetrieve**](docs/MovesApi.md#movecategoryretrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
*MovesApi* | [**moveLearnMethodList**](docs/MovesApi.md#movelearnmethodlist) | **GET** /api/v2/move-learn-method/ | List move learn methods
*MovesApi* | [**moveLearnMethodRetrieve**](docs/MovesApi.md#movelearnmethodretrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
*MovesApi* | [**moveList**](docs/MovesApi.md#movelist) | **GET** /api/v2/move/ | List moves
*MovesApi* | [**moveRetrieve**](docs/MovesApi.md#moveretrieve) | **GET** /api/v2/move/{id}/ | Get move
*MovesApi* | [**moveTargetList**](docs/MovesApi.md#movetargetlist) | **GET** /api/v2/move-target/ | List move targets
*MovesApi* | [**moveTargetRetrieve**](docs/MovesApi.md#movetargetretrieve) | **GET** /api/v2/move-target/{id}/ | Get move target
*PokemonApi* | [**abilityList**](docs/PokemonApi.md#abilitylist) | **GET** /api/v2/ability/ | 
*PokemonApi* | [**abilityRetrieve**](docs/PokemonApi.md#abilityretrieve) | **GET** /api/v2/ability/{id}/ | 
*PokemonApi* | [**characteristicList**](docs/PokemonApi.md#characteristiclist) | **GET** /api/v2/characteristic/ | List charecterictics
*PokemonApi* | [**characteristicRetrieve**](docs/PokemonApi.md#characteristicretrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
*PokemonApi* | [**eggGroupList**](docs/PokemonApi.md#egggrouplist) | **GET** /api/v2/egg-group/ | List egg groups
*PokemonApi* | [**eggGroupRetrieve**](docs/PokemonApi.md#egggroupretrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
*PokemonApi* | [**genderList**](docs/PokemonApi.md#genderlist) | **GET** /api/v2/gender/ | List genders
*PokemonApi* | [**genderRetrieve**](docs/PokemonApi.md#genderretrieve) | **GET** /api/v2/gender/{id}/ | Get gender
*PokemonApi* | [**growthRateList**](docs/PokemonApi.md#growthratelist) | **GET** /api/v2/growth-rate/ | List growth rates
*PokemonApi* | [**growthRateRetrieve**](docs/PokemonApi.md#growthrateretrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
*PokemonApi* | [**moveDamageClassList**](docs/PokemonApi.md#movedamageclasslist) | **GET** /api/v2/move-damage-class/ | List move damage classes
*PokemonApi* | [**moveDamageClassRetrieve**](docs/PokemonApi.md#movedamageclassretrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
*PokemonApi* | [**natureList**](docs/PokemonApi.md#naturelist) | **GET** /api/v2/nature/ | List natures
*PokemonApi* | [**natureRetrieve**](docs/PokemonApi.md#natureretrieve) | **GET** /api/v2/nature/{id}/ | Get nature
*PokemonApi* | [**pokeathlonStatList**](docs/PokemonApi.md#pokeathlonstatlist) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
*PokemonApi* | [**pokeathlonStatRetrieve**](docs/PokemonApi.md#pokeathlonstatretrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
*PokemonApi* | [**pokemonColorList**](docs/PokemonApi.md#pokemoncolorlist) | **GET** /api/v2/pokemon-color/ | List pokemon colors
*PokemonApi* | [**pokemonColorRetrieve**](docs/PokemonApi.md#pokemoncolorretrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
*PokemonApi* | [**pokemonFormList**](docs/PokemonApi.md#pokemonformlist) | **GET** /api/v2/pokemon-form/ | List pokemon forms
*PokemonApi* | [**pokemonFormRetrieve**](docs/PokemonApi.md#pokemonformretrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
*PokemonApi* | [**pokemonHabitatList**](docs/PokemonApi.md#pokemonhabitatlist) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
*PokemonApi* | [**pokemonHabitatRetrieve**](docs/PokemonApi.md#pokemonhabitatretrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
*PokemonApi* | [**pokemonList**](docs/PokemonApi.md#pokemonlist) | **GET** /api/v2/pokemon/ | List pokemon
*PokemonApi* | [**pokemonRetrieve**](docs/PokemonApi.md#pokemonretrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
*PokemonApi* | [**pokemonShapeList**](docs/PokemonApi.md#pokemonshapelist) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
*PokemonApi* | [**pokemonShapeRetrieve**](docs/PokemonApi.md#pokemonshaperetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
*PokemonApi* | [**pokemonSpeciesList**](docs/PokemonApi.md#pokemonspecieslist) | **GET** /api/v2/pokemon-species/ | List pokemon species
*PokemonApi* | [**pokemonSpeciesRetrieve**](docs/PokemonApi.md#pokemonspeciesretrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
*PokemonApi* | [**statList**](docs/PokemonApi.md#statlist) | **GET** /api/v2/stat/ | List stats
*PokemonApi* | [**statRetrieve**](docs/PokemonApi.md#statretrieve) | **GET** /api/v2/stat/{id}/ | Get stat
*PokemonApi* | [**typeList**](docs/PokemonApi.md#typelist) | **GET** /api/v2/type/ | List types
*PokemonApi* | [**typeRetrieve**](docs/PokemonApi.md#typeretrieve) | **GET** /api/v2/type/{id}/ | Get types
*UtilityApi* | [**languageList**](docs/UtilityApi.md#languagelist) | **GET** /api/v2/language/ | List languages
*UtilityApi* | [**languageRetrieve**](docs/UtilityApi.md#languageretrieve) | **GET** /api/v2/language/{id}/ | Get language


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.AbilityChange](docs/AbilityChange.md)
 - [org.openapitools.server.api.model.AbilityChangeEffectText](docs/AbilityChangeEffectText.md)
 - [org.openapitools.server.api.model.AbilityDetail](docs/AbilityDetail.md)
 - [org.openapitools.server.api.model.AbilityDetailPokemonInner](docs/AbilityDetailPokemonInner.md)
 - [org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon](docs/AbilityDetailPokemonInnerPokemon.md)
 - [org.openapitools.server.api.model.AbilityEffectText](docs/AbilityEffectText.md)
 - [org.openapitools.server.api.model.AbilityFlavorText](docs/AbilityFlavorText.md)
 - [org.openapitools.server.api.model.AbilityName](docs/AbilityName.md)
 - [org.openapitools.server.api.model.AbilitySummary](docs/AbilitySummary.md)
 - [org.openapitools.server.api.model.BerryDetail](docs/BerryDetail.md)
 - [org.openapitools.server.api.model.BerryDetailFlavorsInner](docs/BerryDetailFlavorsInner.md)
 - [org.openapitools.server.api.model.BerryDetailFlavorsInnerFlavor](docs/BerryDetailFlavorsInnerFlavor.md)
 - [org.openapitools.server.api.model.BerryFirmnessDetail](docs/BerryFirmnessDetail.md)
 - [org.openapitools.server.api.model.BerryFirmnessName](docs/BerryFirmnessName.md)
 - [org.openapitools.server.api.model.BerryFirmnessSummary](docs/BerryFirmnessSummary.md)
 - [org.openapitools.server.api.model.BerryFlavorDetail](docs/BerryFlavorDetail.md)
 - [org.openapitools.server.api.model.BerryFlavorDetailBerriesInner](docs/BerryFlavorDetailBerriesInner.md)
 - [org.openapitools.server.api.model.BerryFlavorDetailBerriesInnerBerry](docs/BerryFlavorDetailBerriesInnerBerry.md)
 - [org.openapitools.server.api.model.BerryFlavorName](docs/BerryFlavorName.md)
 - [org.openapitools.server.api.model.BerryFlavorSummary](docs/BerryFlavorSummary.md)
 - [org.openapitools.server.api.model.BerrySummary](docs/BerrySummary.md)
 - [org.openapitools.server.api.model.CharacteristicDescription](docs/CharacteristicDescription.md)
 - [org.openapitools.server.api.model.CharacteristicDetail](docs/CharacteristicDetail.md)
 - [org.openapitools.server.api.model.CharacteristicSummary](docs/CharacteristicSummary.md)
 - [org.openapitools.server.api.model.ContestEffectDetail](docs/ContestEffectDetail.md)
 - [org.openapitools.server.api.model.ContestEffectEffectText](docs/ContestEffectEffectText.md)
 - [org.openapitools.server.api.model.ContestEffectFlavorText](docs/ContestEffectFlavorText.md)
 - [org.openapitools.server.api.model.ContestEffectSummary](docs/ContestEffectSummary.md)
 - [org.openapitools.server.api.model.ContestTypeDetail](docs/ContestTypeDetail.md)
 - [org.openapitools.server.api.model.ContestTypeName](docs/ContestTypeName.md)
 - [org.openapitools.server.api.model.ContestTypeSummary](docs/ContestTypeSummary.md)
 - [org.openapitools.server.api.model.EggGroupDetail](docs/EggGroupDetail.md)
 - [org.openapitools.server.api.model.EggGroupDetailPokemonSpeciesInner](docs/EggGroupDetailPokemonSpeciesInner.md)
 - [org.openapitools.server.api.model.EggGroupName](docs/EggGroupName.md)
 - [org.openapitools.server.api.model.EggGroupSummary](docs/EggGroupSummary.md)
 - [org.openapitools.server.api.model.EncounterConditionDetail](docs/EncounterConditionDetail.md)
 - [org.openapitools.server.api.model.EncounterConditionName](docs/EncounterConditionName.md)
 - [org.openapitools.server.api.model.EncounterConditionSummary](docs/EncounterConditionSummary.md)
 - [org.openapitools.server.api.model.EncounterConditionValueDetail](docs/EncounterConditionValueDetail.md)
 - [org.openapitools.server.api.model.EncounterConditionValueName](docs/EncounterConditionValueName.md)
 - [org.openapitools.server.api.model.EncounterConditionValueSummary](docs/EncounterConditionValueSummary.md)
 - [org.openapitools.server.api.model.EncounterMethodDetail](docs/EncounterMethodDetail.md)
 - [org.openapitools.server.api.model.EncounterMethodName](docs/EncounterMethodName.md)
 - [org.openapitools.server.api.model.EncounterMethodSummary](docs/EncounterMethodSummary.md)
 - [org.openapitools.server.api.model.EvolutionChainDetail](docs/EvolutionChainDetail.md)
 - [org.openapitools.server.api.model.EvolutionChainDetailChain](docs/EvolutionChainDetailChain.md)
 - [org.openapitools.server.api.model.EvolutionChainDetailChainEvolvesToInner](docs/EvolutionChainDetailChainEvolvesToInner.md)
 - [org.openapitools.server.api.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner](docs/EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.md)
 - [org.openapitools.server.api.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender](docs/EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md)
 - [org.openapitools.server.api.model.EvolutionChainSummary](docs/EvolutionChainSummary.md)
 - [org.openapitools.server.api.model.EvolutionTriggerDetail](docs/EvolutionTriggerDetail.md)
 - [org.openapitools.server.api.model.EvolutionTriggerName](docs/EvolutionTriggerName.md)
 - [org.openapitools.server.api.model.EvolutionTriggerSummary](docs/EvolutionTriggerSummary.md)
 - [org.openapitools.server.api.model.Experience](docs/Experience.md)
 - [org.openapitools.server.api.model.GenderDetail](docs/GenderDetail.md)
 - [org.openapitools.server.api.model.GenderDetailPokemonSpeciesDetailsInner](docs/GenderDetailPokemonSpeciesDetailsInner.md)
 - [org.openapitools.server.api.model.GenderSummary](docs/GenderSummary.md)
 - [org.openapitools.server.api.model.GenerationDetail](docs/GenerationDetail.md)
 - [org.openapitools.server.api.model.GenerationName](docs/GenerationName.md)
 - [org.openapitools.server.api.model.GenerationSummary](docs/GenerationSummary.md)
 - [org.openapitools.server.api.model.GrowthRateDescription](docs/GrowthRateDescription.md)
 - [org.openapitools.server.api.model.GrowthRateDetail](docs/GrowthRateDetail.md)
 - [org.openapitools.server.api.model.GrowthRateSummary](docs/GrowthRateSummary.md)
 - [org.openapitools.server.api.model.ItemAttributeDescription](docs/ItemAttributeDescription.md)
 - [org.openapitools.server.api.model.ItemAttributeDetail](docs/ItemAttributeDetail.md)
 - [org.openapitools.server.api.model.ItemAttributeName](docs/ItemAttributeName.md)
 - [org.openapitools.server.api.model.ItemAttributeSummary](docs/ItemAttributeSummary.md)
 - [org.openapitools.server.api.model.ItemCategoryDetail](docs/ItemCategoryDetail.md)
 - [org.openapitools.server.api.model.ItemCategoryName](docs/ItemCategoryName.md)
 - [org.openapitools.server.api.model.ItemCategorySummary](docs/ItemCategorySummary.md)
 - [org.openapitools.server.api.model.ItemDetail](docs/ItemDetail.md)
 - [org.openapitools.server.api.model.ItemDetailBabyTriggerFor](docs/ItemDetailBabyTriggerFor.md)
 - [org.openapitools.server.api.model.ItemDetailHeldByPokemonInner](docs/ItemDetailHeldByPokemonInner.md)
 - [org.openapitools.server.api.model.ItemDetailHeldByPokemonInnerVersionDetailsInner](docs/ItemDetailHeldByPokemonInnerVersionDetailsInner.md)
 - [org.openapitools.server.api.model.ItemDetailMachinesInner](docs/ItemDetailMachinesInner.md)
 - [org.openapitools.server.api.model.ItemDetailSprites](docs/ItemDetailSprites.md)
 - [org.openapitools.server.api.model.ItemEffectText](docs/ItemEffectText.md)
 - [org.openapitools.server.api.model.ItemFlavorText](docs/ItemFlavorText.md)
 - [org.openapitools.server.api.model.ItemFlingEffectDetail](docs/ItemFlingEffectDetail.md)
 - [org.openapitools.server.api.model.ItemFlingEffectEffectText](docs/ItemFlingEffectEffectText.md)
 - [org.openapitools.server.api.model.ItemFlingEffectSummary](docs/ItemFlingEffectSummary.md)
 - [org.openapitools.server.api.model.ItemGameIndex](docs/ItemGameIndex.md)
 - [org.openapitools.server.api.model.ItemName](docs/ItemName.md)
 - [org.openapitools.server.api.model.ItemPocketDetail](docs/ItemPocketDetail.md)
 - [org.openapitools.server.api.model.ItemPocketName](docs/ItemPocketName.md)
 - [org.openapitools.server.api.model.ItemPocketSummary](docs/ItemPocketSummary.md)
 - [org.openapitools.server.api.model.ItemSummary](docs/ItemSummary.md)
 - [org.openapitools.server.api.model.LanguageDetail](docs/LanguageDetail.md)
 - [org.openapitools.server.api.model.LanguageName](docs/LanguageName.md)
 - [org.openapitools.server.api.model.LanguageSummary](docs/LanguageSummary.md)
 - [org.openapitools.server.api.model.LocationAreaDetail](docs/LocationAreaDetail.md)
 - [org.openapitools.server.api.model.LocationAreaDetailEncounterMethodRatesInner](docs/LocationAreaDetailEncounterMethodRatesInner.md)
 - [org.openapitools.server.api.model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner](docs/LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.md)
 - [org.openapitools.server.api.model.LocationAreaDetailPokemonEncountersInner](docs/LocationAreaDetailPokemonEncountersInner.md)
 - [org.openapitools.server.api.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner](docs/LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.md)
 - [org.openapitools.server.api.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails](docs/LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.md)
 - [org.openapitools.server.api.model.LocationAreaName](docs/LocationAreaName.md)
 - [org.openapitools.server.api.model.LocationAreaSummary](docs/LocationAreaSummary.md)
 - [org.openapitools.server.api.model.LocationDetail](docs/LocationDetail.md)
 - [org.openapitools.server.api.model.LocationGameIndex](docs/LocationGameIndex.md)
 - [org.openapitools.server.api.model.LocationName](docs/LocationName.md)
 - [org.openapitools.server.api.model.LocationSummary](docs/LocationSummary.md)
 - [org.openapitools.server.api.model.MachineDetail](docs/MachineDetail.md)
 - [org.openapitools.server.api.model.MachineSummary](docs/MachineSummary.md)
 - [org.openapitools.server.api.model.MoveBattleStyleDetail](docs/MoveBattleStyleDetail.md)
 - [org.openapitools.server.api.model.MoveBattleStyleName](docs/MoveBattleStyleName.md)
 - [org.openapitools.server.api.model.MoveBattleStyleSummary](docs/MoveBattleStyleSummary.md)
 - [org.openapitools.server.api.model.MoveChange](docs/MoveChange.md)
 - [org.openapitools.server.api.model.MoveChangeEffectEntriesInner](docs/MoveChangeEffectEntriesInner.md)
 - [org.openapitools.server.api.model.MoveDamageClassDescription](docs/MoveDamageClassDescription.md)
 - [org.openapitools.server.api.model.MoveDamageClassDetail](docs/MoveDamageClassDetail.md)
 - [org.openapitools.server.api.model.MoveDamageClassName](docs/MoveDamageClassName.md)
 - [org.openapitools.server.api.model.MoveDamageClassSummary](docs/MoveDamageClassSummary.md)
 - [org.openapitools.server.api.model.MoveDetail](docs/MoveDetail.md)
 - [org.openapitools.server.api.model.MoveDetailContestCombos](docs/MoveDetailContestCombos.md)
 - [org.openapitools.server.api.model.MoveDetailContestCombosNormal](docs/MoveDetailContestCombosNormal.md)
 - [org.openapitools.server.api.model.MoveDetailEffectChangesInner](docs/MoveDetailEffectChangesInner.md)
 - [org.openapitools.server.api.model.MoveDetailEffectChangesInnerEffectEntriesInner](docs/MoveDetailEffectChangesInnerEffectEntriesInner.md)
 - [org.openapitools.server.api.model.MoveDetailMachinesInner](docs/MoveDetailMachinesInner.md)
 - [org.openapitools.server.api.model.MoveDetailMachinesInnerMachine](docs/MoveDetailMachinesInnerMachine.md)
 - [org.openapitools.server.api.model.MoveDetailStatChangesInner](docs/MoveDetailStatChangesInner.md)
 - [org.openapitools.server.api.model.MoveFlavorText](docs/MoveFlavorText.md)
 - [org.openapitools.server.api.model.MoveLearnMethodDescription](docs/MoveLearnMethodDescription.md)
 - [org.openapitools.server.api.model.MoveLearnMethodDetail](docs/MoveLearnMethodDetail.md)
 - [org.openapitools.server.api.model.MoveLearnMethodName](docs/MoveLearnMethodName.md)
 - [org.openapitools.server.api.model.MoveLearnMethodSummary](docs/MoveLearnMethodSummary.md)
 - [org.openapitools.server.api.model.MoveMeta](docs/MoveMeta.md)
 - [org.openapitools.server.api.model.MoveMetaAilmentDetail](docs/MoveMetaAilmentDetail.md)
 - [org.openapitools.server.api.model.MoveMetaAilmentName](docs/MoveMetaAilmentName.md)
 - [org.openapitools.server.api.model.MoveMetaAilmentSummary](docs/MoveMetaAilmentSummary.md)
 - [org.openapitools.server.api.model.MoveMetaCategoryDescription](docs/MoveMetaCategoryDescription.md)
 - [org.openapitools.server.api.model.MoveMetaCategoryDetail](docs/MoveMetaCategoryDetail.md)
 - [org.openapitools.server.api.model.MoveMetaCategorySummary](docs/MoveMetaCategorySummary.md)
 - [org.openapitools.server.api.model.MoveName](docs/MoveName.md)
 - [org.openapitools.server.api.model.MoveSummary](docs/MoveSummary.md)
 - [org.openapitools.server.api.model.MoveTargetDescription](docs/MoveTargetDescription.md)
 - [org.openapitools.server.api.model.MoveTargetDetail](docs/MoveTargetDetail.md)
 - [org.openapitools.server.api.model.MoveTargetName](docs/MoveTargetName.md)
 - [org.openapitools.server.api.model.MoveTargetSummary](docs/MoveTargetSummary.md)
 - [org.openapitools.server.api.model.NatureBattleStylePreference](docs/NatureBattleStylePreference.md)
 - [org.openapitools.server.api.model.NatureDetail](docs/NatureDetail.md)
 - [org.openapitools.server.api.model.NatureDetailPokeathlonStatChangesInner](docs/NatureDetailPokeathlonStatChangesInner.md)
 - [org.openapitools.server.api.model.NatureName](docs/NatureName.md)
 - [org.openapitools.server.api.model.NatureSummary](docs/NatureSummary.md)
 - [org.openapitools.server.api.model.PaginatedAbilitySummaryList](docs/PaginatedAbilitySummaryList.md)
 - [org.openapitools.server.api.model.PaginatedBerryFirmnessSummaryList](docs/PaginatedBerryFirmnessSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedBerryFlavorSummaryList](docs/PaginatedBerryFlavorSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedBerrySummaryList](docs/PaginatedBerrySummaryList.md)
 - [org.openapitools.server.api.model.PaginatedCharacteristicSummaryList](docs/PaginatedCharacteristicSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedContestEffectSummaryList](docs/PaginatedContestEffectSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedContestTypeSummaryList](docs/PaginatedContestTypeSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedEggGroupSummaryList](docs/PaginatedEggGroupSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedEncounterConditionSummaryList](docs/PaginatedEncounterConditionSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedEncounterConditionValueSummaryList](docs/PaginatedEncounterConditionValueSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedEncounterMethodSummaryList](docs/PaginatedEncounterMethodSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedEvolutionChainSummaryList](docs/PaginatedEvolutionChainSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedEvolutionTriggerSummaryList](docs/PaginatedEvolutionTriggerSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedGenderSummaryList](docs/PaginatedGenderSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedGenerationSummaryList](docs/PaginatedGenerationSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedGrowthRateSummaryList](docs/PaginatedGrowthRateSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedItemAttributeSummaryList](docs/PaginatedItemAttributeSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedItemCategorySummaryList](docs/PaginatedItemCategorySummaryList.md)
 - [org.openapitools.server.api.model.PaginatedItemFlingEffectSummaryList](docs/PaginatedItemFlingEffectSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedItemPocketSummaryList](docs/PaginatedItemPocketSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedItemSummaryList](docs/PaginatedItemSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedLanguageSummaryList](docs/PaginatedLanguageSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedLocationAreaSummaryList](docs/PaginatedLocationAreaSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedLocationSummaryList](docs/PaginatedLocationSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedMachineSummaryList](docs/PaginatedMachineSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedMoveBattleStyleSummaryList](docs/PaginatedMoveBattleStyleSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedMoveDamageClassSummaryList](docs/PaginatedMoveDamageClassSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedMoveLearnMethodSummaryList](docs/PaginatedMoveLearnMethodSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedMoveMetaAilmentSummaryList](docs/PaginatedMoveMetaAilmentSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedMoveMetaCategorySummaryList](docs/PaginatedMoveMetaCategorySummaryList.md)
 - [org.openapitools.server.api.model.PaginatedMoveSummaryList](docs/PaginatedMoveSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedMoveTargetSummaryList](docs/PaginatedMoveTargetSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedNatureSummaryList](docs/PaginatedNatureSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPalParkAreaSummaryList](docs/PaginatedPalParkAreaSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPokeathlonStatSummaryList](docs/PaginatedPokeathlonStatSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPokedexSummaryList](docs/PaginatedPokedexSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPokemonColorSummaryList](docs/PaginatedPokemonColorSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPokemonFormSummaryList](docs/PaginatedPokemonFormSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPokemonHabitatSummaryList](docs/PaginatedPokemonHabitatSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPokemonShapeSummaryList](docs/PaginatedPokemonShapeSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPokemonSpeciesSummaryList](docs/PaginatedPokemonSpeciesSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedPokemonSummaryList](docs/PaginatedPokemonSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedRegionSummaryList](docs/PaginatedRegionSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedStatSummaryList](docs/PaginatedStatSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedSuperContestEffectSummaryList](docs/PaginatedSuperContestEffectSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedTypeSummaryList](docs/PaginatedTypeSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedVersionGroupSummaryList](docs/PaginatedVersionGroupSummaryList.md)
 - [org.openapitools.server.api.model.PaginatedVersionSummaryList](docs/PaginatedVersionSummaryList.md)
 - [org.openapitools.server.api.model.PalParkAreaDetail](docs/PalParkAreaDetail.md)
 - [org.openapitools.server.api.model.PalParkAreaDetailPokemonEncountersInner](docs/PalParkAreaDetailPokemonEncountersInner.md)
 - [org.openapitools.server.api.model.PalParkAreaName](docs/PalParkAreaName.md)
 - [org.openapitools.server.api.model.PalParkAreaSummary](docs/PalParkAreaSummary.md)
 - [org.openapitools.server.api.model.PokeathlonStatDetail](docs/PokeathlonStatDetail.md)
 - [org.openapitools.server.api.model.PokeathlonStatDetailAffectingNatures](docs/PokeathlonStatDetailAffectingNatures.md)
 - [org.openapitools.server.api.model.PokeathlonStatDetailAffectingNaturesDecreaseInner](docs/PokeathlonStatDetailAffectingNaturesDecreaseInner.md)
 - [org.openapitools.server.api.model.PokeathlonStatDetailAffectingNaturesIncreaseInner](docs/PokeathlonStatDetailAffectingNaturesIncreaseInner.md)
 - [org.openapitools.server.api.model.PokeathlonStatName](docs/PokeathlonStatName.md)
 - [org.openapitools.server.api.model.PokeathlonStatSummary](docs/PokeathlonStatSummary.md)
 - [org.openapitools.server.api.model.PokedexDescription](docs/PokedexDescription.md)
 - [org.openapitools.server.api.model.PokedexDetail](docs/PokedexDetail.md)
 - [org.openapitools.server.api.model.PokedexDetailPokemonEntriesInner](docs/PokedexDetailPokemonEntriesInner.md)
 - [org.openapitools.server.api.model.PokedexName](docs/PokedexName.md)
 - [org.openapitools.server.api.model.PokedexSummary](docs/PokedexSummary.md)
 - [org.openapitools.server.api.model.PokemonColorDetail](docs/PokemonColorDetail.md)
 - [org.openapitools.server.api.model.PokemonColorName](docs/PokemonColorName.md)
 - [org.openapitools.server.api.model.PokemonColorSummary](docs/PokemonColorSummary.md)
 - [org.openapitools.server.api.model.PokemonDetail](docs/PokemonDetail.md)
 - [org.openapitools.server.api.model.PokemonDetailAbilitiesInner](docs/PokemonDetailAbilitiesInner.md)
 - [org.openapitools.server.api.model.PokemonDetailCries](docs/PokemonDetailCries.md)
 - [org.openapitools.server.api.model.PokemonDetailHeldItems](docs/PokemonDetailHeldItems.md)
 - [org.openapitools.server.api.model.PokemonDetailMovesInner](docs/PokemonDetailMovesInner.md)
 - [org.openapitools.server.api.model.PokemonDetailMovesInnerVersionGroupDetailsInner](docs/PokemonDetailMovesInnerVersionGroupDetailsInner.md)
 - [org.openapitools.server.api.model.PokemonDetailPastAbilitiesInner](docs/PokemonDetailPastAbilitiesInner.md)
 - [org.openapitools.server.api.model.PokemonDetailPastTypesInner](docs/PokemonDetailPastTypesInner.md)
 - [org.openapitools.server.api.model.PokemonDetailSprites](docs/PokemonDetailSprites.md)
 - [org.openapitools.server.api.model.PokemonDetailTypesInner](docs/PokemonDetailTypesInner.md)
 - [org.openapitools.server.api.model.PokemonDexEntry](docs/PokemonDexEntry.md)
 - [org.openapitools.server.api.model.PokemonEncountersRetrieve200ResponseInner](docs/PokemonEncountersRetrieve200ResponseInner.md)
 - [org.openapitools.server.api.model.PokemonEncountersRetrieve200ResponseInnerLocationArea](docs/PokemonEncountersRetrieve200ResponseInnerLocationArea.md)
 - [org.openapitools.server.api.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.md)
 - [org.openapitools.server.api.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.md)
 - [org.openapitools.server.api.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner.md)
 - [org.openapitools.server.api.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod.md)
 - [org.openapitools.server.api.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion.md)
 - [org.openapitools.server.api.model.PokemonFormDetail](docs/PokemonFormDetail.md)
 - [org.openapitools.server.api.model.PokemonFormDetailFormNamesInner](docs/PokemonFormDetailFormNamesInner.md)
 - [org.openapitools.server.api.model.PokemonFormDetailSprites](docs/PokemonFormDetailSprites.md)
 - [org.openapitools.server.api.model.PokemonFormSummary](docs/PokemonFormSummary.md)
 - [org.openapitools.server.api.model.PokemonGameIndex](docs/PokemonGameIndex.md)
 - [org.openapitools.server.api.model.PokemonHabitatDetail](docs/PokemonHabitatDetail.md)
 - [org.openapitools.server.api.model.PokemonHabitatName](docs/PokemonHabitatName.md)
 - [org.openapitools.server.api.model.PokemonHabitatSummary](docs/PokemonHabitatSummary.md)
 - [org.openapitools.server.api.model.PokemonShapeDetail](docs/PokemonShapeDetail.md)
 - [org.openapitools.server.api.model.PokemonShapeDetailAwesomeNamesInner](docs/PokemonShapeDetailAwesomeNamesInner.md)
 - [org.openapitools.server.api.model.PokemonShapeDetailNamesInner](docs/PokemonShapeDetailNamesInner.md)
 - [org.openapitools.server.api.model.PokemonShapeSummary](docs/PokemonShapeSummary.md)
 - [org.openapitools.server.api.model.PokemonSpeciesDescription](docs/PokemonSpeciesDescription.md)
 - [org.openapitools.server.api.model.PokemonSpeciesDetail](docs/PokemonSpeciesDetail.md)
 - [org.openapitools.server.api.model.PokemonSpeciesDetailGeneraInner](docs/PokemonSpeciesDetailGeneraInner.md)
 - [org.openapitools.server.api.model.PokemonSpeciesDetailPalParkEncountersInner](docs/PokemonSpeciesDetailPalParkEncountersInner.md)
 - [org.openapitools.server.api.model.PokemonSpeciesDetailVarietiesInner](docs/PokemonSpeciesDetailVarietiesInner.md)
 - [org.openapitools.server.api.model.PokemonSpeciesFlavorText](docs/PokemonSpeciesFlavorText.md)
 - [org.openapitools.server.api.model.PokemonSpeciesSummary](docs/PokemonSpeciesSummary.md)
 - [org.openapitools.server.api.model.PokemonStat](docs/PokemonStat.md)
 - [org.openapitools.server.api.model.PokemonSummary](docs/PokemonSummary.md)
 - [org.openapitools.server.api.model.RegionDetail](docs/RegionDetail.md)
 - [org.openapitools.server.api.model.RegionName](docs/RegionName.md)
 - [org.openapitools.server.api.model.RegionSummary](docs/RegionSummary.md)
 - [org.openapitools.server.api.model.StatDetail](docs/StatDetail.md)
 - [org.openapitools.server.api.model.StatDetailAffectingMoves](docs/StatDetailAffectingMoves.md)
 - [org.openapitools.server.api.model.StatDetailAffectingMovesIncreaseInner](docs/StatDetailAffectingMovesIncreaseInner.md)
 - [org.openapitools.server.api.model.StatDetailAffectingNatures](docs/StatDetailAffectingNatures.md)
 - [org.openapitools.server.api.model.StatName](docs/StatName.md)
 - [org.openapitools.server.api.model.StatSummary](docs/StatSummary.md)
 - [org.openapitools.server.api.model.SuperContestEffectDetail](docs/SuperContestEffectDetail.md)
 - [org.openapitools.server.api.model.SuperContestEffectFlavorText](docs/SuperContestEffectFlavorText.md)
 - [org.openapitools.server.api.model.SuperContestEffectSummary](docs/SuperContestEffectSummary.md)
 - [org.openapitools.server.api.model.TypeDetail](docs/TypeDetail.md)
 - [org.openapitools.server.api.model.TypeDetailDamageRelations](docs/TypeDetailDamageRelations.md)
 - [org.openapitools.server.api.model.TypeDetailPastDamageRelationsInner](docs/TypeDetailPastDamageRelationsInner.md)
 - [org.openapitools.server.api.model.TypeDetailPastDamageRelationsInnerDamageRelations](docs/TypeDetailPastDamageRelationsInnerDamageRelations.md)
 - [org.openapitools.server.api.model.TypeDetailPokemonInner](docs/TypeDetailPokemonInner.md)
 - [org.openapitools.server.api.model.TypeDetailPokemonInnerPokemon](docs/TypeDetailPokemonInnerPokemon.md)
 - [org.openapitools.server.api.model.TypeDetailSpritesValueValue](docs/TypeDetailSpritesValueValue.md)
 - [org.openapitools.server.api.model.TypeGameIndex](docs/TypeGameIndex.md)
 - [org.openapitools.server.api.model.TypeSummary](docs/TypeSummary.md)
 - [org.openapitools.server.api.model.VersionDetail](docs/VersionDetail.md)
 - [org.openapitools.server.api.model.VersionGroupDetail](docs/VersionGroupDetail.md)
 - [org.openapitools.server.api.model.VersionGroupSummary](docs/VersionGroupSummary.md)
 - [org.openapitools.server.api.model.VersionName](docs/VersionName.md)
 - [org.openapitools.server.api.model.VersionSummary](docs/VersionSummary.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="basicAuth"></a>
### basicAuth

- **Type**: HTTP basic authentication

<a id="cookieAuth"></a>
### cookieAuth

- **Type**: API key
- **API key parameter name**: sessionid
- **Location**: 

