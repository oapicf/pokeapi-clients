# PokéAPI API Client


All the Pokémon data you\'ll ever need in one place, easily accessible through a modern free open-source RESTful API.\n\n## What is this?\n\nThis is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.\n\nWe\'ve covered everything from Pokémon to Berry Flavors.\n\n## Where do I start?\n\nWe have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.\n\nThis API will always be publicly available and will never require any extensive setup process to consume.\n\nCreated by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASBerriesApi api = new OASBerriesApi();

Map<String, Object> params = new Map<String, Object>{
    'r_limit' => '',
    'offset' => '',
    'q' => 'null'
};

try {
    // cross your fingers
    OASPaginatedBerryFirmnessSummaryList result = api.berryFirmnessList(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://pokeapi.co*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASBerriesApi* | [**berryFirmnessList**](OASBerriesApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness
*OASBerriesApi* | [**berryFirmnessRetrieve**](OASBerriesApi.md#berryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
*OASBerriesApi* | [**berryFlavorList**](OASBerriesApi.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors
*OASBerriesApi* | [**berryFlavorRetrieve**](OASBerriesApi.md#berryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
*OASBerriesApi* | [**berryList**](OASBerriesApi.md#berryList) | **GET** /api/v2/berry/ | List berries
*OASBerriesApi* | [**berryRetrieve**](OASBerriesApi.md#berryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry
*OASContestsApi* | [**contestEffectList**](OASContestsApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ | List contest effects
*OASContestsApi* | [**contestEffectRetrieve**](OASContestsApi.md#contestEffectRetrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
*OASContestsApi* | [**contestTypeList**](OASContestsApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | List contest types
*OASContestsApi* | [**contestTypeRetrieve**](OASContestsApi.md#contestTypeRetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
*OASContestsApi* | [**superContestEffectList**](OASContestsApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | List super contest effects
*OASContestsApi* | [**superContestEffectRetrieve**](OASContestsApi.md#superContestEffectRetrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect
*OASEncountersApi* | [**encounterConditionList**](OASEncountersApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions
*OASEncountersApi* | [**encounterConditionRetrieve**](OASEncountersApi.md#encounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
*OASEncountersApi* | [**encounterConditionValueList**](OASEncountersApi.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
*OASEncountersApi* | [**encounterConditionValueRetrieve**](OASEncountersApi.md#encounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
*OASEncountersApi* | [**encounterMethodList**](OASEncountersApi.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods
*OASEncountersApi* | [**encounterMethodRetrieve**](OASEncountersApi.md#encounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
*OASEvolutionApi* | [**evolutionChainList**](OASEvolutionApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | List evolution chains
*OASEvolutionApi* | [**evolutionChainRetrieve**](OASEvolutionApi.md#evolutionChainRetrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
*OASEvolutionApi* | [**evolutionTriggerList**](OASEvolutionApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
*OASEvolutionApi* | [**evolutionTriggerRetrieve**](OASEvolutionApi.md#evolutionTriggerRetrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
*OASEvolutionApi* | [**evolutionVariableList**](OASEvolutionApi.md#evolutionVariableList) | **GET** /api/v2/evolution-variable/ | List evolution variables
*OASEvolutionApi* | [**evolutionVariableRetrieve**](OASEvolutionApi.md#evolutionVariableRetrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable
*OASGamesApi* | [**generationList**](OASGamesApi.md#generationList) | **GET** /api/v2/generation/ | List genrations
*OASGamesApi* | [**generationRetrieve**](OASGamesApi.md#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration
*OASGamesApi* | [**pokedexList**](OASGamesApi.md#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex
*OASGamesApi* | [**pokedexRetrieve**](OASGamesApi.md#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
*OASGamesApi* | [**versionGroupList**](OASGamesApi.md#versionGroupList) | **GET** /api/v2/version-group/ | List version groups
*OASGamesApi* | [**versionGroupRetrieve**](OASGamesApi.md#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
*OASGamesApi* | [**versionList**](OASGamesApi.md#versionList) | **GET** /api/v2/version/ | List versions
*OASGamesApi* | [**versionRetrieve**](OASGamesApi.md#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version
*OASItemsApi* | [**currencyList**](OASItemsApi.md#currencyList) | **GET** /api/v2/currency/ | List currencies
*OASItemsApi* | [**currencyRetrieve**](OASItemsApi.md#currencyRetrieve) | **GET** /api/v2/currency/{id}/ | Get currency
*OASItemsApi* | [**itemAttributeList**](OASItemsApi.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes
*OASItemsApi* | [**itemAttributeRetrieve**](OASItemsApi.md#itemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
*OASItemsApi* | [**itemCategoryList**](OASItemsApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | List item categories
*OASItemsApi* | [**itemCategoryRetrieve**](OASItemsApi.md#itemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
*OASItemsApi* | [**itemFlingEffectList**](OASItemsApi.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects
*OASItemsApi* | [**itemFlingEffectRetrieve**](OASItemsApi.md#itemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
*OASItemsApi* | [**itemList**](OASItemsApi.md#itemList) | **GET** /api/v2/item/ | List items
*OASItemsApi* | [**itemPocketList**](OASItemsApi.md#itemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets
*OASItemsApi* | [**itemPocketRetrieve**](OASItemsApi.md#itemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
*OASItemsApi* | [**itemRetrieve**](OASItemsApi.md#itemRetrieve) | **GET** /api/v2/item/{id}/ | Get item
*OASLocationApi* | [**locationAreaList**](OASLocationApi.md#locationAreaList) | **GET** /api/v2/location-area/ | List location areas
*OASLocationApi* | [**locationAreaRetrieve**](OASLocationApi.md#locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
*OASLocationApi* | [**locationList**](OASLocationApi.md#locationList) | **GET** /api/v2/location/ | List locations
*OASLocationApi* | [**locationRetrieve**](OASLocationApi.md#locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location
*OASLocationApi* | [**palParkAreaList**](OASLocationApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas
*OASLocationApi* | [**palParkAreaRetrieve**](OASLocationApi.md#palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
*OASLocationApi* | [**regionList**](OASLocationApi.md#regionList) | **GET** /api/v2/region/ | List regions
*OASLocationApi* | [**regionRetrieve**](OASLocationApi.md#regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region
*OASMachinesApi* | [**machineList**](OASMachinesApi.md#machineList) | **GET** /api/v2/machine/ | List machines
*OASMachinesApi* | [**machineRetrieve**](OASMachinesApi.md#machineRetrieve) | **GET** /api/v2/machine/{id}/ | Get machine
*OASMovesApi* | [**moveAilmentList**](OASMovesApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | List move meta ailments
*OASMovesApi* | [**moveAilmentRetrieve**](OASMovesApi.md#moveAilmentRetrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
*OASMovesApi* | [**moveBattleStyleList**](OASMovesApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | List move battle styles
*OASMovesApi* | [**moveBattleStyleRetrieve**](OASMovesApi.md#moveBattleStyleRetrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
*OASMovesApi* | [**moveCategoryList**](OASMovesApi.md#moveCategoryList) | **GET** /api/v2/move-category/ | List move meta categories
*OASMovesApi* | [**moveCategoryRetrieve**](OASMovesApi.md#moveCategoryRetrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
*OASMovesApi* | [**moveLearnMethodList**](OASMovesApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | List move learn methods
*OASMovesApi* | [**moveLearnMethodRetrieve**](OASMovesApi.md#moveLearnMethodRetrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
*OASMovesApi* | [**moveList**](OASMovesApi.md#moveList) | **GET** /api/v2/move/ | List moves
*OASMovesApi* | [**moveRetrieve**](OASMovesApi.md#moveRetrieve) | **GET** /api/v2/move/{id}/ | Get move
*OASMovesApi* | [**moveTargetList**](OASMovesApi.md#moveTargetList) | **GET** /api/v2/move-target/ | List move targets
*OASMovesApi* | [**moveTargetRetrieve**](OASMovesApi.md#moveTargetRetrieve) | **GET** /api/v2/move-target/{id}/ | Get move target
*OASPokemonApi* | [**abilityList**](OASPokemonApi.md#abilityList) | **GET** /api/v2/ability/ | List abilities
*OASPokemonApi* | [**abilityRetrieve**](OASPokemonApi.md#abilityRetrieve) | **GET** /api/v2/ability/{id}/ | Get ability
*OASPokemonApi* | [**characteristicList**](OASPokemonApi.md#characteristicList) | **GET** /api/v2/characteristic/ | List characteristics
*OASPokemonApi* | [**characteristicRetrieve**](OASPokemonApi.md#characteristicRetrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
*OASPokemonApi* | [**eggGroupList**](OASPokemonApi.md#eggGroupList) | **GET** /api/v2/egg-group/ | List egg groups
*OASPokemonApi* | [**eggGroupRetrieve**](OASPokemonApi.md#eggGroupRetrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
*OASPokemonApi* | [**genderList**](OASPokemonApi.md#genderList) | **GET** /api/v2/gender/ | List genders
*OASPokemonApi* | [**genderRetrieve**](OASPokemonApi.md#genderRetrieve) | **GET** /api/v2/gender/{id}/ | Get gender
*OASPokemonApi* | [**growthRateList**](OASPokemonApi.md#growthRateList) | **GET** /api/v2/growth-rate/ | List growth rates
*OASPokemonApi* | [**growthRateRetrieve**](OASPokemonApi.md#growthRateRetrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
*OASPokemonApi* | [**moveDamageClassList**](OASPokemonApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | List move damage classes
*OASPokemonApi* | [**moveDamageClassRetrieve**](OASPokemonApi.md#moveDamageClassRetrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
*OASPokemonApi* | [**natureList**](OASPokemonApi.md#natureList) | **GET** /api/v2/nature/ | List natures
*OASPokemonApi* | [**natureRetrieve**](OASPokemonApi.md#natureRetrieve) | **GET** /api/v2/nature/{id}/ | Get nature
*OASPokemonApi* | [**pokeathlonStatList**](OASPokemonApi.md#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
*OASPokemonApi* | [**pokeathlonStatRetrieve**](OASPokemonApi.md#pokeathlonStatRetrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
*OASPokemonApi* | [**pokemonColorList**](OASPokemonApi.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | List pokemon colors
*OASPokemonApi* | [**pokemonColorRetrieve**](OASPokemonApi.md#pokemonColorRetrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
*OASPokemonApi* | [**pokemonFormList**](OASPokemonApi.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | List pokemon forms
*OASPokemonApi* | [**pokemonFormRetrieve**](OASPokemonApi.md#pokemonFormRetrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
*OASPokemonApi* | [**pokemonHabitatList**](OASPokemonApi.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
*OASPokemonApi* | [**pokemonHabitatRetrieve**](OASPokemonApi.md#pokemonHabitatRetrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
*OASPokemonApi* | [**pokemonList**](OASPokemonApi.md#pokemonList) | **GET** /api/v2/pokemon/ | List pokemon
*OASPokemonApi* | [**pokemonRetrieve**](OASPokemonApi.md#pokemonRetrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
*OASPokemonApi* | [**pokemonShapeList**](OASPokemonApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
*OASPokemonApi* | [**pokemonShapeRetrieve**](OASPokemonApi.md#pokemonShapeRetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
*OASPokemonApi* | [**pokemonSpeciesList**](OASPokemonApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | List pokemon species
*OASPokemonApi* | [**pokemonSpeciesRetrieve**](OASPokemonApi.md#pokemonSpeciesRetrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
*OASPokemonApi* | [**statList**](OASPokemonApi.md#statList) | **GET** /api/v2/stat/ | List stats
*OASPokemonApi* | [**statRetrieve**](OASPokemonApi.md#statRetrieve) | **GET** /api/v2/stat/{id}/ | Get stat
*OASPokemonApi* | [**typeList**](OASPokemonApi.md#typeList) | **GET** /api/v2/type/ | List types
*OASPokemonApi* | [**typeRetrieve**](OASPokemonApi.md#typeRetrieve) | **GET** /api/v2/type/{id}/ | Get types
*OASUtilityApi* | [**languageList**](OASUtilityApi.md#languageList) | **GET** /api/v2/language/ | List languages
*OASUtilityApi* | [**languageRetrieve**](OASUtilityApi.md#languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language
*OASUtilityApi* | [**metaRetrieve**](OASUtilityApi.md#metaRetrieve) | **GET** /api/v2/meta/ | Get API metadata


## Documentation for Models

 - [OASAbilityChange](OASAbilityChange.md)
 - [OASAbilityChangeEffectText](OASAbilityChangeEffectText.md)
 - [OASAbilityDetail](OASAbilityDetail.md)
 - [OASAbilityEffectText](OASAbilityEffectText.md)
 - [OASAbilityFlavorText](OASAbilityFlavorText.md)
 - [OASAbilityName](OASAbilityName.md)
 - [OASAbilityPokemonDetail](OASAbilityPokemonDetail.md)
 - [OASAbilitySummary](OASAbilitySummary.md)
 - [OASBerryDetail](OASBerryDetail.md)
 - [OASBerryFirmnessDetail](OASBerryFirmnessDetail.md)
 - [OASBerryFirmnessName](OASBerryFirmnessName.md)
 - [OASBerryFirmnessSummary](OASBerryFirmnessSummary.md)
 - [OASBerryFlavorBerryMap](OASBerryFlavorBerryMap.md)
 - [OASBerryFlavorDetail](OASBerryFlavorDetail.md)
 - [OASBerryFlavorMap](OASBerryFlavorMap.md)
 - [OASBerryFlavorName](OASBerryFlavorName.md)
 - [OASBerryFlavorSummary](OASBerryFlavorSummary.md)
 - [OASBerrySummary](OASBerrySummary.md)
 - [OASCharacteristicDescription](OASCharacteristicDescription.md)
 - [OASCharacteristicDetail](OASCharacteristicDetail.md)
 - [OASCharacteristicSummary](OASCharacteristicSummary.md)
 - [OASContestEffectDetail](OASContestEffectDetail.md)
 - [OASContestEffectEffectText](OASContestEffectEffectText.md)
 - [OASContestEffectFlavorText](OASContestEffectFlavorText.md)
 - [OASContestEffectSummary](OASContestEffectSummary.md)
 - [OASContestTypeDetail](OASContestTypeDetail.md)
 - [OASContestTypeName](OASContestTypeName.md)
 - [OASContestTypeSummary](OASContestTypeSummary.md)
 - [OASCurrencyDetail](OASCurrencyDetail.md)
 - [OASCurrencyName](OASCurrencyName.md)
 - [OASCurrencySummary](OASCurrencySummary.md)
 - [OASEggGroupDetail](OASEggGroupDetail.md)
 - [OASEggGroupName](OASEggGroupName.md)
 - [OASEggGroupSummary](OASEggGroupSummary.md)
 - [OASEncounterConditionDetail](OASEncounterConditionDetail.md)
 - [OASEncounterConditionName](OASEncounterConditionName.md)
 - [OASEncounterConditionSummary](OASEncounterConditionSummary.md)
 - [OASEncounterConditionValueDetail](OASEncounterConditionValueDetail.md)
 - [OASEncounterConditionValueName](OASEncounterConditionValueName.md)
 - [OASEncounterConditionValueSummary](OASEncounterConditionValueSummary.md)
 - [OASEncounterMethodDetail](OASEncounterMethodDetail.md)
 - [OASEncounterMethodName](OASEncounterMethodName.md)
 - [OASEncounterMethodSummary](OASEncounterMethodSummary.md)
 - [OASEncounterPokemonDetail](OASEncounterPokemonDetail.md)
 - [OASEvolutionChainDetail](OASEvolutionChainDetail.md)
 - [OASEvolutionChainLink](OASEvolutionChainLink.md)
 - [OASEvolutionChainSummary](OASEvolutionChainSummary.md)
 - [OASEvolutionConditionExpression](OASEvolutionConditionExpression.md)
 - [OASEvolutionTriggerDetail](OASEvolutionTriggerDetail.md)
 - [OASEvolutionTriggerName](OASEvolutionTriggerName.md)
 - [OASEvolutionTriggerSummary](OASEvolutionTriggerSummary.md)
 - [OASEvolutionVariableDescription](OASEvolutionVariableDescription.md)
 - [OASEvolutionVariableDetail](OASEvolutionVariableDetail.md)
 - [OASEvolutionVariableName](OASEvolutionVariableName.md)
 - [OASEvolutionVariableSummary](OASEvolutionVariableSummary.md)
 - [OASExperience](OASExperience.md)
 - [OASGenderDetail](OASGenderDetail.md)
 - [OASGenderPokemonSpecies](OASGenderPokemonSpecies.md)
 - [OASGenderSummary](OASGenderSummary.md)
 - [OASGenerationDetail](OASGenerationDetail.md)
 - [OASGenerationName](OASGenerationName.md)
 - [OASGenerationSummary](OASGenerationSummary.md)
 - [OASGrowthRateDescription](OASGrowthRateDescription.md)
 - [OASGrowthRateDetail](OASGrowthRateDetail.md)
 - [OASGrowthRateSummary](OASGrowthRateSummary.md)
 - [OASItemAttributeDescription](OASItemAttributeDescription.md)
 - [OASItemAttributeDetail](OASItemAttributeDetail.md)
 - [OASItemAttributeName](OASItemAttributeName.md)
 - [OASItemAttributeSummary](OASItemAttributeSummary.md)
 - [OASItemCategoryDetail](OASItemCategoryDetail.md)
 - [OASItemCategoryName](OASItemCategoryName.md)
 - [OASItemCategorySummary](OASItemCategorySummary.md)
 - [OASItemDetail](OASItemDetail.md)
 - [OASItemEffectText](OASItemEffectText.md)
 - [OASItemFlavorText](OASItemFlavorText.md)
 - [OASItemFlingEffectDetail](OASItemFlingEffectDetail.md)
 - [OASItemFlingEffectEffectText](OASItemFlingEffectEffectText.md)
 - [OASItemFlingEffectSummary](OASItemFlingEffectSummary.md)
 - [OASItemGameIndex](OASItemGameIndex.md)
 - [OASItemMachine](OASItemMachine.md)
 - [OASItemName](OASItemName.md)
 - [OASItemPocketDetail](OASItemPocketDetail.md)
 - [OASItemPocketName](OASItemPocketName.md)
 - [OASItemPocketSummary](OASItemPocketSummary.md)
 - [OASItemPrice](OASItemPrice.md)
 - [OASItemSprites](OASItemSprites.md)
 - [OASItemSummary](OASItemSummary.md)
 - [OASLanguageDetail](OASLanguageDetail.md)
 - [OASLanguageName](OASLanguageName.md)
 - [OASLanguageSummary](OASLanguageSummary.md)
 - [OASLocationAreaDetail](OASLocationAreaDetail.md)
 - [OASLocationAreaEncounterDetail](OASLocationAreaEncounterDetail.md)
 - [OASLocationAreaEncounterRate](OASLocationAreaEncounterRate.md)
 - [OASLocationAreaEncounterVersionDetai](OASLocationAreaEncounterVersionDetai.md)
 - [OASLocationAreaName](OASLocationAreaName.md)
 - [OASLocationAreaPokemonEncounter](OASLocationAreaPokemonEncounter.md)
 - [OASLocationAreaPokemonEncounterVersi](OASLocationAreaPokemonEncounterVersi.md)
 - [OASLocationAreaSummary](OASLocationAreaSummary.md)
 - [OASLocationDetail](OASLocationDetail.md)
 - [OASLocationGameIndex](OASLocationGameIndex.md)
 - [OASLocationName](OASLocationName.md)
 - [OASLocationSummary](OASLocationSummary.md)
 - [OASMachineDetail](OASMachineDetail.md)
 - [OASMachineSummary](OASMachineSummary.md)
 - [OASMoveBattleStyleDetail](OASMoveBattleStyleDetail.md)
 - [OASMoveBattleStyleName](OASMoveBattleStyleName.md)
 - [OASMoveBattleStyleSummary](OASMoveBattleStyleSummary.md)
 - [OASMoveChange](OASMoveChange.md)
 - [OASMoveComboUsage](OASMoveComboUsage.md)
 - [OASMoveCombos](OASMoveCombos.md)
 - [OASMoveDamageClassDescription](OASMoveDamageClassDescription.md)
 - [OASMoveDamageClassDetail](OASMoveDamageClassDetail.md)
 - [OASMoveDamageClassName](OASMoveDamageClassName.md)
 - [OASMoveDamageClassSummary](OASMoveDamageClassSummary.md)
 - [OASMoveDetail](OASMoveDetail.md)
 - [OASMoveEffectChange](OASMoveEffectChange.md)
 - [OASMoveEffectChangeEffectText](OASMoveEffectChangeEffectText.md)
 - [OASMoveEffectEffectText](OASMoveEffectEffectText.md)
 - [OASMoveFlavorText](OASMoveFlavorText.md)
 - [OASMoveLearnMethodDescription](OASMoveLearnMethodDescription.md)
 - [OASMoveLearnMethodDetail](OASMoveLearnMethodDetail.md)
 - [OASMoveLearnMethodName](OASMoveLearnMethodName.md)
 - [OASMoveLearnMethodSummary](OASMoveLearnMethodSummary.md)
 - [OASMoveMeta](OASMoveMeta.md)
 - [OASMoveMetaAilmentDetail](OASMoveMetaAilmentDetail.md)
 - [OASMoveMetaAilmentName](OASMoveMetaAilmentName.md)
 - [OASMoveMetaAilmentSummary](OASMoveMetaAilmentSummary.md)
 - [OASMoveMetaCategoryDescription](OASMoveMetaCategoryDescription.md)
 - [OASMoveMetaCategoryDetail](OASMoveMetaCategoryDetail.md)
 - [OASMoveMetaCategorySummary](OASMoveMetaCategorySummary.md)
 - [OASMoveMetaStatChange](OASMoveMetaStatChange.md)
 - [OASMoveName](OASMoveName.md)
 - [OASMoveStatChange](OASMoveStatChange.md)
 - [OASMoveSummary](OASMoveSummary.md)
 - [OASMoveTargetDescription](OASMoveTargetDescription.md)
 - [OASMoveTargetDetail](OASMoveTargetDetail.md)
 - [OASMoveTargetName](OASMoveTargetName.md)
 - [OASMoveTargetSummary](OASMoveTargetSummary.md)
 - [OASNatureBattleStylePreference](OASNatureBattleStylePreference.md)
 - [OASNatureDetail](OASNatureDetail.md)
 - [OASNatureName](OASNatureName.md)
 - [OASNaturePokeathlonStat](OASNaturePokeathlonStat.md)
 - [OASNatureSummary](OASNatureSummary.md)
 - [OASPaginatedAbilitySummaryList](OASPaginatedAbilitySummaryList.md)
 - [OASPaginatedBerryFirmnessSummaryList](OASPaginatedBerryFirmnessSummaryList.md)
 - [OASPaginatedBerryFlavorSummaryList](OASPaginatedBerryFlavorSummaryList.md)
 - [OASPaginatedBerrySummaryList](OASPaginatedBerrySummaryList.md)
 - [OASPaginatedCharacteristicSummaryLis](OASPaginatedCharacteristicSummaryLis.md)
 - [OASPaginatedContestEffectSummaryList](OASPaginatedContestEffectSummaryList.md)
 - [OASPaginatedContestTypeSummaryList](OASPaginatedContestTypeSummaryList.md)
 - [OASPaginatedCurrencySummaryList](OASPaginatedCurrencySummaryList.md)
 - [OASPaginatedEggGroupSummaryList](OASPaginatedEggGroupSummaryList.md)
 - [OASPaginatedEncounterConditionSummar](OASPaginatedEncounterConditionSummar.md)
 - [OASPaginatedEncounterConditionValueS](OASPaginatedEncounterConditionValueS.md)
 - [OASPaginatedEncounterMethodSummaryLi](OASPaginatedEncounterMethodSummaryLi.md)
 - [OASPaginatedEvolutionChainSummaryLis](OASPaginatedEvolutionChainSummaryLis.md)
 - [OASPaginatedEvolutionTriggerSummaryL](OASPaginatedEvolutionTriggerSummaryL.md)
 - [OASPaginatedEvolutionVariableSummary](OASPaginatedEvolutionVariableSummary.md)
 - [OASPaginatedGenderSummaryList](OASPaginatedGenderSummaryList.md)
 - [OASPaginatedGenerationSummaryList](OASPaginatedGenerationSummaryList.md)
 - [OASPaginatedGrowthRateSummaryList](OASPaginatedGrowthRateSummaryList.md)
 - [OASPaginatedItemAttributeSummaryList](OASPaginatedItemAttributeSummaryList.md)
 - [OASPaginatedItemCategorySummaryList](OASPaginatedItemCategorySummaryList.md)
 - [OASPaginatedItemFlingEffectSummaryLi](OASPaginatedItemFlingEffectSummaryLi.md)
 - [OASPaginatedItemPocketSummaryList](OASPaginatedItemPocketSummaryList.md)
 - [OASPaginatedItemSummaryList](OASPaginatedItemSummaryList.md)
 - [OASPaginatedLanguageSummaryList](OASPaginatedLanguageSummaryList.md)
 - [OASPaginatedLocationAreaSummaryList](OASPaginatedLocationAreaSummaryList.md)
 - [OASPaginatedLocationSummaryList](OASPaginatedLocationSummaryList.md)
 - [OASPaginatedMachineSummaryList](OASPaginatedMachineSummaryList.md)
 - [OASPaginatedMoveBattleStyleSummaryLi](OASPaginatedMoveBattleStyleSummaryLi.md)
 - [OASPaginatedMoveDamageClassSummaryLi](OASPaginatedMoveDamageClassSummaryLi.md)
 - [OASPaginatedMoveLearnMethodSummaryLi](OASPaginatedMoveLearnMethodSummaryLi.md)
 - [OASPaginatedMoveMetaAilmentSummaryLi](OASPaginatedMoveMetaAilmentSummaryLi.md)
 - [OASPaginatedMoveMetaCategorySummaryL](OASPaginatedMoveMetaCategorySummaryL.md)
 - [OASPaginatedMoveSummaryList](OASPaginatedMoveSummaryList.md)
 - [OASPaginatedMoveTargetSummaryList](OASPaginatedMoveTargetSummaryList.md)
 - [OASPaginatedNatureSummaryList](OASPaginatedNatureSummaryList.md)
 - [OASPaginatedPalParkAreaSummaryList](OASPaginatedPalParkAreaSummaryList.md)
 - [OASPaginatedPokeathlonStatSummaryLis](OASPaginatedPokeathlonStatSummaryLis.md)
 - [OASPaginatedPokedexSummaryList](OASPaginatedPokedexSummaryList.md)
 - [OASPaginatedPokemonColorSummaryList](OASPaginatedPokemonColorSummaryList.md)
 - [OASPaginatedPokemonFormSummaryList](OASPaginatedPokemonFormSummaryList.md)
 - [OASPaginatedPokemonHabitatSummaryLis](OASPaginatedPokemonHabitatSummaryLis.md)
 - [OASPaginatedPokemonShapeSummaryList](OASPaginatedPokemonShapeSummaryList.md)
 - [OASPaginatedPokemonSpeciesSummaryLis](OASPaginatedPokemonSpeciesSummaryLis.md)
 - [OASPaginatedPokemonSummaryList](OASPaginatedPokemonSummaryList.md)
 - [OASPaginatedRegionSummaryList](OASPaginatedRegionSummaryList.md)
 - [OASPaginatedStatSummaryList](OASPaginatedStatSummaryList.md)
 - [OASPaginatedSuperContestEffectSummar](OASPaginatedSuperContestEffectSummar.md)
 - [OASPaginatedTypeSummaryList](OASPaginatedTypeSummaryList.md)
 - [OASPaginatedVersionGroupSummaryList](OASPaginatedVersionGroupSummaryList.md)
 - [OASPaginatedVersionSummaryList](OASPaginatedVersionSummaryList.md)
 - [OASPalParkAreaDetail](OASPalParkAreaDetail.md)
 - [OASPalParkAreaName](OASPalParkAreaName.md)
 - [OASPalParkAreaSummary](OASPalParkAreaSummary.md)
 - [OASPalParkEncounter](OASPalParkEncounter.md)
 - [OASPokeapiMetaResponse](OASPokeapiMetaResponse.md)
 - [OASPokeathlonStatAffectingNature](OASPokeathlonStatAffectingNature.md)
 - [OASPokeathlonStatAffectingNatures](OASPokeathlonStatAffectingNatures.md)
 - [OASPokeathlonStatDetail](OASPokeathlonStatDetail.md)
 - [OASPokeathlonStatName](OASPokeathlonStatName.md)
 - [OASPokeathlonStatSummary](OASPokeathlonStatSummary.md)
 - [OASPokedexDescription](OASPokedexDescription.md)
 - [OASPokedexDetail](OASPokedexDetail.md)
 - [OASPokedexName](OASPokedexName.md)
 - [OASPokedexSummary](OASPokedexSummary.md)
 - [OASPokemonAbility](OASPokemonAbility.md)
 - [OASPokemonAbilityPast](OASPokemonAbilityPast.md)
 - [OASPokemonColorDetail](OASPokemonColorDetail.md)
 - [OASPokemonColorName](OASPokemonColorName.md)
 - [OASPokemonColorSummary](OASPokemonColorSummary.md)
 - [OASPokemonCries](OASPokemonCries.md)
 - [OASPokemonDetail](OASPokemonDetail.md)
 - [OASPokemonDexEntry](OASPokemonDexEntry.md)
 - [OASPokemonDexNumber](OASPokemonDexNumber.md)
 - [OASPokemonEncounterDetailResponse](OASPokemonEncounterDetailResponse.md)
 - [OASPokemonEncounterResponse](OASPokemonEncounterResponse.md)
 - [OASPokemonEncounterVersionDetailResp](OASPokemonEncounterVersionDetailResp.md)
 - [OASPokemonEvolution](OASPokemonEvolution.md)
 - [OASPokemonEvolutionKnownMove](OASPokemonEvolutionKnownMove.md)
 - [OASPokemonFormDetail](OASPokemonFormDetail.md)
 - [OASPokemonFormFlavorText](OASPokemonFormFlavorText.md)
 - [OASPokemonFormName](OASPokemonFormName.md)
 - [OASPokemonFormSprites](OASPokemonFormSprites.md)
 - [OASPokemonFormSummary](OASPokemonFormSummary.md)
 - [OASPokemonFormTriggerCondition](OASPokemonFormTriggerCondition.md)
 - [OASPokemonFormType](OASPokemonFormType.md)
 - [OASPokemonGameIndex](OASPokemonGameIndex.md)
 - [OASPokemonHabitatDetail](OASPokemonHabitatDetail.md)
 - [OASPokemonHabitatName](OASPokemonHabitatName.md)
 - [OASPokemonHabitatSummary](OASPokemonHabitatSummary.md)
 - [OASPokemonHeldItem](OASPokemonHeldItem.md)
 - [OASPokemonHeldItemSummary](OASPokemonHeldItemSummary.md)
 - [OASPokemonHeldItemVersion](OASPokemonHeldItemVersion.md)
 - [OASPokemonMove](OASPokemonMove.md)
 - [OASPokemonMoveVersionGroup](OASPokemonMoveVersionGroup.md)
 - [OASPokemonPastAbility](OASPokemonPastAbility.md)
 - [OASPokemonPastStat](OASPokemonPastStat.md)
 - [OASPokemonPastType](OASPokemonPastType.md)
 - [OASPokemonShapeAwesomeName](OASPokemonShapeAwesomeName.md)
 - [OASPokemonShapeDetail](OASPokemonShapeDetail.md)
 - [OASPokemonShapeName](OASPokemonShapeName.md)
 - [OASPokemonShapeSummary](OASPokemonShapeSummary.md)
 - [OASPokemonSpeciesDescription](OASPokemonSpeciesDescription.md)
 - [OASPokemonSpeciesDetail](OASPokemonSpeciesDetail.md)
 - [OASPokemonSpeciesFlavorText](OASPokemonSpeciesFlavorText.md)
 - [OASPokemonSpeciesGenus](OASPokemonSpeciesGenus.md)
 - [OASPokemonSpeciesName](OASPokemonSpeciesName.md)
 - [OASPokemonSpeciesPalParkEncounter](OASPokemonSpeciesPalParkEncounter.md)
 - [OASPokemonSpeciesSummary](OASPokemonSpeciesSummary.md)
 - [OASPokemonSpeciesVariety](OASPokemonSpeciesVariety.md)
 - [OASPokemonSprites](OASPokemonSprites.md)
 - [OASPokemonSpritesOther](OASPokemonSpritesOther.md)
 - [OASPokemonSpritesOtherDreamWorld](OASPokemonSpritesOtherDreamWorld.md)
 - [OASPokemonSpritesOtherHome](OASPokemonSpritesOtherHome.md)
 - [OASPokemonSpritesOtherOfficialArtwor](OASPokemonSpritesOtherOfficialArtwor.md)
 - [OASPokemonSpritesOtherShowdown](OASPokemonSpritesOtherShowdown.md)
 - [OASPokemonStat](OASPokemonStat.md)
 - [OASPokemonSummary](OASPokemonSummary.md)
 - [OASPokemonType](OASPokemonType.md)
 - [OASRegionDetail](OASRegionDetail.md)
 - [OASRegionName](OASRegionName.md)
 - [OASRegionSummary](OASRegionSummary.md)
 - [OASStatAffectingMoves](OASStatAffectingMoves.md)
 - [OASStatAffectingNatures](OASStatAffectingNatures.md)
 - [OASStatDetail](OASStatDetail.md)
 - [OASStatName](OASStatName.md)
 - [OASStatSummary](OASStatSummary.md)
 - [OASSuperContestEffectDetail](OASSuperContestEffectDetail.md)
 - [OASSuperContestEffectFlavorText](OASSuperContestEffectFlavorText.md)
 - [OASSuperContestEffectSummary](OASSuperContestEffectSummary.md)
 - [OASTypeDetail](OASTypeDetail.md)
 - [OASTypeGameIndex](OASTypeGameIndex.md)
 - [OASTypeGameSprite](OASTypeGameSprite.md)
 - [OASTypeName](OASTypeName.md)
 - [OASTypePastRelationships](OASTypePastRelationships.md)
 - [OASTypePokemon](OASTypePokemon.md)
 - [OASTypeRelationships](OASTypeRelationships.md)
 - [OASTypeSummary](OASTypeSummary.md)
 - [OASVersionDetail](OASVersionDetail.md)
 - [OASVersionGroupDetail](OASVersionGroupDetail.md)
 - [OASVersionGroupSummary](OASVersionGroupSummary.md)
 - [OASVersionName](OASVersionName.md)
 - [OASVersionSummary](OASVersionSummary.md)


## Documentation for Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com

