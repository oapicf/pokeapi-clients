# openapi-client


- API version: 20220523

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "org.openapitools" % "openapi-client" % "1.0.0"
```

## Getting Started

## Documentation for API Endpoints

All URIs are relative to *https://pokeapi.co*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbilityApi* | **abilityList** | **GET** /api/v2/ability/ | 
*AbilityApi* | **abilityRead** | **GET** /api/v2/ability/{id}/ | 
*BerryApi* | **berryList** | **GET** /api/v2/berry/ | 
*BerryApi* | **berryRead** | **GET** /api/v2/berry/{id}/ | 
*BerryFirmnessApi* | **berryFirmnessList** | **GET** /api/v2/berry-firmness/ | 
*BerryFirmnessApi* | **berryFirmnessRead** | **GET** /api/v2/berry-firmness/{id}/ | 
*BerryFlavorApi* | **berryFlavorList** | **GET** /api/v2/berry-flavor/ | 
*BerryFlavorApi* | **berryFlavorRead** | **GET** /api/v2/berry-flavor/{id}/ | 
*CharacteristicApi* | **characteristicList** | **GET** /api/v2/characteristic/ | 
*CharacteristicApi* | **characteristicRead** | **GET** /api/v2/characteristic/{id}/ | 
*ContestEffectApi* | **contestEffectList** | **GET** /api/v2/contest-effect/ | 
*ContestEffectApi* | **contestEffectRead** | **GET** /api/v2/contest-effect/{id}/ | 
*ContestTypeApi* | **contestTypeList** | **GET** /api/v2/contest-type/ | 
*ContestTypeApi* | **contestTypeRead** | **GET** /api/v2/contest-type/{id}/ | 
*EggGroupApi* | **eggGroupList** | **GET** /api/v2/egg-group/ | 
*EggGroupApi* | **eggGroupRead** | **GET** /api/v2/egg-group/{id}/ | 
*EncounterConditionApi* | **encounterConditionList** | **GET** /api/v2/encounter-condition/ | 
*EncounterConditionApi* | **encounterConditionRead** | **GET** /api/v2/encounter-condition/{id}/ | 
*EncounterConditionValueApi* | **encounterConditionValueList** | **GET** /api/v2/encounter-condition-value/ | 
*EncounterConditionValueApi* | **encounterConditionValueRead** | **GET** /api/v2/encounter-condition-value/{id}/ | 
*EncounterMethodApi* | **encounterMethodList** | **GET** /api/v2/encounter-method/ | 
*EncounterMethodApi* | **encounterMethodRead** | **GET** /api/v2/encounter-method/{id}/ | 
*EvolutionChainApi* | **evolutionChainList** | **GET** /api/v2/evolution-chain/ | 
*EvolutionChainApi* | **evolutionChainRead** | **GET** /api/v2/evolution-chain/{id}/ | 
*EvolutionTriggerApi* | **evolutionTriggerList** | **GET** /api/v2/evolution-trigger/ | 
*EvolutionTriggerApi* | **evolutionTriggerRead** | **GET** /api/v2/evolution-trigger/{id}/ | 
*GenderApi* | **genderList** | **GET** /api/v2/gender/ | 
*GenderApi* | **genderRead** | **GET** /api/v2/gender/{id}/ | 
*GenerationApi* | **generationList** | **GET** /api/v2/generation/ | 
*GenerationApi* | **generationRead** | **GET** /api/v2/generation/{id}/ | 
*GrowthRateApi* | **growthRateList** | **GET** /api/v2/growth-rate/ | 
*GrowthRateApi* | **growthRateRead** | **GET** /api/v2/growth-rate/{id}/ | 
*ItemApi* | **itemList** | **GET** /api/v2/item/ | 
*ItemApi* | **itemRead** | **GET** /api/v2/item/{id}/ | 
*ItemAttributeApi* | **itemAttributeList** | **GET** /api/v2/item-attribute/ | 
*ItemAttributeApi* | **itemAttributeRead** | **GET** /api/v2/item-attribute/{id}/ | 
*ItemCategoryApi* | **itemCategoryList** | **GET** /api/v2/item-category/ | 
*ItemCategoryApi* | **itemCategoryRead** | **GET** /api/v2/item-category/{id}/ | 
*ItemFlingEffectApi* | **itemFlingEffectList** | **GET** /api/v2/item-fling-effect/ | 
*ItemFlingEffectApi* | **itemFlingEffectRead** | **GET** /api/v2/item-fling-effect/{id}/ | 
*ItemPocketApi* | **itemPocketList** | **GET** /api/v2/item-pocket/ | 
*ItemPocketApi* | **itemPocketRead** | **GET** /api/v2/item-pocket/{id}/ | 
*LanguageApi* | **languageList** | **GET** /api/v2/language/ | 
*LanguageApi* | **languageRead** | **GET** /api/v2/language/{id}/ | 
*LocationApi* | **locationList** | **GET** /api/v2/location/ | 
*LocationApi* | **locationRead** | **GET** /api/v2/location/{id}/ | 
*LocationAreaApi* | **locationAreaList** | **GET** /api/v2/location-area/ | 
*LocationAreaApi* | **locationAreaRead** | **GET** /api/v2/location-area/{id}/ | 
*MachineApi* | **machineList** | **GET** /api/v2/machine/ | 
*MachineApi* | **machineRead** | **GET** /api/v2/machine/{id}/ | 
*MoveApi* | **moveList** | **GET** /api/v2/move/ | 
*MoveApi* | **moveRead** | **GET** /api/v2/move/{id}/ | 
*MoveAilmentApi* | **moveAilmentList** | **GET** /api/v2/move-ailment/ | 
*MoveAilmentApi* | **moveAilmentRead** | **GET** /api/v2/move-ailment/{id}/ | 
*MoveBattleStyleApi* | **moveBattleStyleList** | **GET** /api/v2/move-battle-style/ | 
*MoveBattleStyleApi* | **moveBattleStyleRead** | **GET** /api/v2/move-battle-style/{id}/ | 
*MoveCategoryApi* | **moveCategoryList** | **GET** /api/v2/move-category/ | 
*MoveCategoryApi* | **moveCategoryRead** | **GET** /api/v2/move-category/{id}/ | 
*MoveDamageClassApi* | **moveDamageClassList** | **GET** /api/v2/move-damage-class/ | 
*MoveDamageClassApi* | **moveDamageClassRead** | **GET** /api/v2/move-damage-class/{id}/ | 
*MoveLearnMethodApi* | **moveLearnMethodList** | **GET** /api/v2/move-learn-method/ | 
*MoveLearnMethodApi* | **moveLearnMethodRead** | **GET** /api/v2/move-learn-method/{id}/ | 
*MoveTargetApi* | **moveTargetList** | **GET** /api/v2/move-target/ | 
*MoveTargetApi* | **moveTargetRead** | **GET** /api/v2/move-target/{id}/ | 
*NatureApi* | **natureList** | **GET** /api/v2/nature/ | 
*NatureApi* | **natureRead** | **GET** /api/v2/nature/{id}/ | 
*PalParkAreaApi* | **palParkAreaList** | **GET** /api/v2/pal-park-area/ | 
*PalParkAreaApi* | **palParkAreaRead** | **GET** /api/v2/pal-park-area/{id}/ | 
*PokeathlonStatApi* | **pokeathlonStatList** | **GET** /api/v2/pokeathlon-stat/ | 
*PokeathlonStatApi* | **pokeathlonStatRead** | **GET** /api/v2/pokeathlon-stat/{id}/ | 
*PokedexApi* | **pokedexList** | **GET** /api/v2/pokedex/ | 
*PokedexApi* | **pokedexRead** | **GET** /api/v2/pokedex/{id}/ | 
*PokemonApi* | **pokemonList** | **GET** /api/v2/pokemon/ | 
*PokemonApi* | **pokemonRead** | **GET** /api/v2/pokemon/{id}/ | 
*PokemonColorApi* | **pokemonColorList** | **GET** /api/v2/pokemon-color/ | 
*PokemonColorApi* | **pokemonColorRead** | **GET** /api/v2/pokemon-color/{id}/ | 
*PokemonFormApi* | **pokemonFormList** | **GET** /api/v2/pokemon-form/ | 
*PokemonFormApi* | **pokemonFormRead** | **GET** /api/v2/pokemon-form/{id}/ | 
*PokemonHabitatApi* | **pokemonHabitatList** | **GET** /api/v2/pokemon-habitat/ | 
*PokemonHabitatApi* | **pokemonHabitatRead** | **GET** /api/v2/pokemon-habitat/{id}/ | 
*PokemonShapeApi* | **pokemonShapeList** | **GET** /api/v2/pokemon-shape/ | 
*PokemonShapeApi* | **pokemonShapeRead** | **GET** /api/v2/pokemon-shape/{id}/ | 
*PokemonSpeciesApi* | **pokemonSpeciesList** | **GET** /api/v2/pokemon-species/ | 
*PokemonSpeciesApi* | **pokemonSpeciesRead** | **GET** /api/v2/pokemon-species/{id}/ | 
*RegionApi* | **regionList** | **GET** /api/v2/region/ | 
*RegionApi* | **regionRead** | **GET** /api/v2/region/{id}/ | 
*StatApi* | **statList** | **GET** /api/v2/stat/ | 
*StatApi* | **statRead** | **GET** /api/v2/stat/{id}/ | 
*SuperContestEffectApi* | **superContestEffectList** | **GET** /api/v2/super-contest-effect/ | 
*SuperContestEffectApi* | **superContestEffectRead** | **GET** /api/v2/super-contest-effect/{id}/ | 
*TypeApi* | **typeList** | **GET** /api/v2/type/ | 
*TypeApi* | **typeRead** | **GET** /api/v2/type/{id}/ | 
*VersionApi* | **versionList** | **GET** /api/v2/version/ | 
*VersionApi* | **versionRead** | **GET** /api/v2/version/{id}/ | 
*VersionGroupApi* | **versionGroupList** | **GET** /api/v2/version-group/ | 
*VersionGroupApi* | **versionGroupRead** | **GET** /api/v2/version-group/{id}/ | 


## Documentation for Models



## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Author


