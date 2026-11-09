# OpenAPIClient-php

All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.

## What is this?

This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.

We've covered everything from Pokémon to Berry Flavors.

## Where do I start?

We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.

This API will always be publicly available and will never require any extensive setup process to consume.

Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.

For more information, please visit [https://github.com/oapicf/pokeapi-clients](https://github.com/oapicf/pokeapi-clients).

## Installation & Usage

### Requirements

PHP 8.1 and later.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/oapicf/pokeapi-clients.git"
    }
  ],
  "require": {
    "oapicf/pokeapi-clients": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');




$apiInstance = new OpenAPI\Client\Api\BerriesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.
$q = 'q_example'; // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.

try {
    $result = $apiInstance->berryFirmnessList($limit, $offset, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BerriesApi->berryFirmnessList: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://pokeapi.co*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BerriesApi* | [**berryFirmnessList**](docs/Api/BerriesApi.md#berryfirmnesslist) | **GET** /api/v2/berry-firmness/ | List berry firmness
*BerriesApi* | [**berryFirmnessRetrieve**](docs/Api/BerriesApi.md#berryfirmnessretrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
*BerriesApi* | [**berryFlavorList**](docs/Api/BerriesApi.md#berryflavorlist) | **GET** /api/v2/berry-flavor/ | List berry flavors
*BerriesApi* | [**berryFlavorRetrieve**](docs/Api/BerriesApi.md#berryflavorretrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
*BerriesApi* | [**berryList**](docs/Api/BerriesApi.md#berrylist) | **GET** /api/v2/berry/ | List berries
*BerriesApi* | [**berryRetrieve**](docs/Api/BerriesApi.md#berryretrieve) | **GET** /api/v2/berry/{id}/ | Get a berry
*ContestsApi* | [**contestEffectList**](docs/Api/ContestsApi.md#contesteffectlist) | **GET** /api/v2/contest-effect/ | List contest effects
*ContestsApi* | [**contestEffectRetrieve**](docs/Api/ContestsApi.md#contesteffectretrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
*ContestsApi* | [**contestTypeList**](docs/Api/ContestsApi.md#contesttypelist) | **GET** /api/v2/contest-type/ | List contest types
*ContestsApi* | [**contestTypeRetrieve**](docs/Api/ContestsApi.md#contesttyperetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
*ContestsApi* | [**superContestEffectList**](docs/Api/ContestsApi.md#supercontesteffectlist) | **GET** /api/v2/super-contest-effect/ | List super contest effects
*ContestsApi* | [**superContestEffectRetrieve**](docs/Api/ContestsApi.md#supercontesteffectretrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect
*EncountersApi* | [**encounterConditionList**](docs/Api/EncountersApi.md#encounterconditionlist) | **GET** /api/v2/encounter-condition/ | List encounter conditions
*EncountersApi* | [**encounterConditionRetrieve**](docs/Api/EncountersApi.md#encounterconditionretrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
*EncountersApi* | [**encounterConditionValueList**](docs/Api/EncountersApi.md#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
*EncountersApi* | [**encounterConditionValueRetrieve**](docs/Api/EncountersApi.md#encounterconditionvalueretrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
*EncountersApi* | [**encounterMethodList**](docs/Api/EncountersApi.md#encountermethodlist) | **GET** /api/v2/encounter-method/ | List encounter methods
*EncountersApi* | [**encounterMethodRetrieve**](docs/Api/EncountersApi.md#encountermethodretrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
*EvolutionApi* | [**evolutionChainList**](docs/Api/EvolutionApi.md#evolutionchainlist) | **GET** /api/v2/evolution-chain/ | List evolution chains
*EvolutionApi* | [**evolutionChainRetrieve**](docs/Api/EvolutionApi.md#evolutionchainretrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
*EvolutionApi* | [**evolutionTriggerList**](docs/Api/EvolutionApi.md#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
*EvolutionApi* | [**evolutionTriggerRetrieve**](docs/Api/EvolutionApi.md#evolutiontriggerretrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
*EvolutionApi* | [**evolutionVariableList**](docs/Api/EvolutionApi.md#evolutionvariablelist) | **GET** /api/v2/evolution-variable/ | List evolution variables
*EvolutionApi* | [**evolutionVariableRetrieve**](docs/Api/EvolutionApi.md#evolutionvariableretrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable
*GamesApi* | [**generationList**](docs/Api/GamesApi.md#generationlist) | **GET** /api/v2/generation/ | List genrations
*GamesApi* | [**generationRetrieve**](docs/Api/GamesApi.md#generationretrieve) | **GET** /api/v2/generation/{id}/ | Get genration
*GamesApi* | [**pokedexList**](docs/Api/GamesApi.md#pokedexlist) | **GET** /api/v2/pokedex/ | List pokedex
*GamesApi* | [**pokedexRetrieve**](docs/Api/GamesApi.md#pokedexretrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
*GamesApi* | [**versionGroupList**](docs/Api/GamesApi.md#versiongrouplist) | **GET** /api/v2/version-group/ | List version groups
*GamesApi* | [**versionGroupRetrieve**](docs/Api/GamesApi.md#versiongroupretrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
*GamesApi* | [**versionList**](docs/Api/GamesApi.md#versionlist) | **GET** /api/v2/version/ | List versions
*GamesApi* | [**versionRetrieve**](docs/Api/GamesApi.md#versionretrieve) | **GET** /api/v2/version/{id}/ | Get version
*ItemsApi* | [**currencyList**](docs/Api/ItemsApi.md#currencylist) | **GET** /api/v2/currency/ | List currencies
*ItemsApi* | [**currencyRetrieve**](docs/Api/ItemsApi.md#currencyretrieve) | **GET** /api/v2/currency/{id}/ | Get currency
*ItemsApi* | [**itemAttributeList**](docs/Api/ItemsApi.md#itemattributelist) | **GET** /api/v2/item-attribute/ | List item attributes
*ItemsApi* | [**itemAttributeRetrieve**](docs/Api/ItemsApi.md#itemattributeretrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
*ItemsApi* | [**itemCategoryList**](docs/Api/ItemsApi.md#itemcategorylist) | **GET** /api/v2/item-category/ | List item categories
*ItemsApi* | [**itemCategoryRetrieve**](docs/Api/ItemsApi.md#itemcategoryretrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
*ItemsApi* | [**itemFlingEffectList**](docs/Api/ItemsApi.md#itemflingeffectlist) | **GET** /api/v2/item-fling-effect/ | List item fling effects
*ItemsApi* | [**itemFlingEffectRetrieve**](docs/Api/ItemsApi.md#itemflingeffectretrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
*ItemsApi* | [**itemList**](docs/Api/ItemsApi.md#itemlist) | **GET** /api/v2/item/ | List items
*ItemsApi* | [**itemPocketList**](docs/Api/ItemsApi.md#itempocketlist) | **GET** /api/v2/item-pocket/ | List item pockets
*ItemsApi* | [**itemPocketRetrieve**](docs/Api/ItemsApi.md#itempocketretrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
*ItemsApi* | [**itemRetrieve**](docs/Api/ItemsApi.md#itemretrieve) | **GET** /api/v2/item/{id}/ | Get item
*LocationApi* | [**locationAreaList**](docs/Api/LocationApi.md#locationarealist) | **GET** /api/v2/location-area/ | List location areas
*LocationApi* | [**locationAreaRetrieve**](docs/Api/LocationApi.md#locationarearetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
*LocationApi* | [**locationList**](docs/Api/LocationApi.md#locationlist) | **GET** /api/v2/location/ | List locations
*LocationApi* | [**locationRetrieve**](docs/Api/LocationApi.md#locationretrieve) | **GET** /api/v2/location/{id}/ | Get location
*LocationApi* | [**palParkAreaList**](docs/Api/LocationApi.md#palparkarealist) | **GET** /api/v2/pal-park-area/ | List pal park areas
*LocationApi* | [**palParkAreaRetrieve**](docs/Api/LocationApi.md#palparkarearetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
*LocationApi* | [**regionList**](docs/Api/LocationApi.md#regionlist) | **GET** /api/v2/region/ | List regions
*LocationApi* | [**regionRetrieve**](docs/Api/LocationApi.md#regionretrieve) | **GET** /api/v2/region/{id}/ | Get region
*MachinesApi* | [**machineList**](docs/Api/MachinesApi.md#machinelist) | **GET** /api/v2/machine/ | List machines
*MachinesApi* | [**machineRetrieve**](docs/Api/MachinesApi.md#machineretrieve) | **GET** /api/v2/machine/{id}/ | Get machine
*MovesApi* | [**moveAilmentList**](docs/Api/MovesApi.md#moveailmentlist) | **GET** /api/v2/move-ailment/ | List move meta ailments
*MovesApi* | [**moveAilmentRetrieve**](docs/Api/MovesApi.md#moveailmentretrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
*MovesApi* | [**moveBattleStyleList**](docs/Api/MovesApi.md#movebattlestylelist) | **GET** /api/v2/move-battle-style/ | List move battle styles
*MovesApi* | [**moveBattleStyleRetrieve**](docs/Api/MovesApi.md#movebattlestyleretrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
*MovesApi* | [**moveCategoryList**](docs/Api/MovesApi.md#movecategorylist) | **GET** /api/v2/move-category/ | List move meta categories
*MovesApi* | [**moveCategoryRetrieve**](docs/Api/MovesApi.md#movecategoryretrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
*MovesApi* | [**moveLearnMethodList**](docs/Api/MovesApi.md#movelearnmethodlist) | **GET** /api/v2/move-learn-method/ | List move learn methods
*MovesApi* | [**moveLearnMethodRetrieve**](docs/Api/MovesApi.md#movelearnmethodretrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
*MovesApi* | [**moveList**](docs/Api/MovesApi.md#movelist) | **GET** /api/v2/move/ | List moves
*MovesApi* | [**moveRetrieve**](docs/Api/MovesApi.md#moveretrieve) | **GET** /api/v2/move/{id}/ | Get move
*MovesApi* | [**moveTargetList**](docs/Api/MovesApi.md#movetargetlist) | **GET** /api/v2/move-target/ | List move targets
*MovesApi* | [**moveTargetRetrieve**](docs/Api/MovesApi.md#movetargetretrieve) | **GET** /api/v2/move-target/{id}/ | Get move target
*PokemonApi* | [**abilityList**](docs/Api/PokemonApi.md#abilitylist) | **GET** /api/v2/ability/ | List abilities
*PokemonApi* | [**abilityRetrieve**](docs/Api/PokemonApi.md#abilityretrieve) | **GET** /api/v2/ability/{id}/ | Get ability
*PokemonApi* | [**characteristicList**](docs/Api/PokemonApi.md#characteristiclist) | **GET** /api/v2/characteristic/ | List characteristics
*PokemonApi* | [**characteristicRetrieve**](docs/Api/PokemonApi.md#characteristicretrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
*PokemonApi* | [**eggGroupList**](docs/Api/PokemonApi.md#egggrouplist) | **GET** /api/v2/egg-group/ | List egg groups
*PokemonApi* | [**eggGroupRetrieve**](docs/Api/PokemonApi.md#egggroupretrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
*PokemonApi* | [**genderList**](docs/Api/PokemonApi.md#genderlist) | **GET** /api/v2/gender/ | List genders
*PokemonApi* | [**genderRetrieve**](docs/Api/PokemonApi.md#genderretrieve) | **GET** /api/v2/gender/{id}/ | Get gender
*PokemonApi* | [**growthRateList**](docs/Api/PokemonApi.md#growthratelist) | **GET** /api/v2/growth-rate/ | List growth rates
*PokemonApi* | [**growthRateRetrieve**](docs/Api/PokemonApi.md#growthrateretrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
*PokemonApi* | [**moveDamageClassList**](docs/Api/PokemonApi.md#movedamageclasslist) | **GET** /api/v2/move-damage-class/ | List move damage classes
*PokemonApi* | [**moveDamageClassRetrieve**](docs/Api/PokemonApi.md#movedamageclassretrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
*PokemonApi* | [**natureList**](docs/Api/PokemonApi.md#naturelist) | **GET** /api/v2/nature/ | List natures
*PokemonApi* | [**natureRetrieve**](docs/Api/PokemonApi.md#natureretrieve) | **GET** /api/v2/nature/{id}/ | Get nature
*PokemonApi* | [**pokeathlonStatList**](docs/Api/PokemonApi.md#pokeathlonstatlist) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
*PokemonApi* | [**pokeathlonStatRetrieve**](docs/Api/PokemonApi.md#pokeathlonstatretrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
*PokemonApi* | [**pokemonColorList**](docs/Api/PokemonApi.md#pokemoncolorlist) | **GET** /api/v2/pokemon-color/ | List pokemon colors
*PokemonApi* | [**pokemonColorRetrieve**](docs/Api/PokemonApi.md#pokemoncolorretrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
*PokemonApi* | [**pokemonFormList**](docs/Api/PokemonApi.md#pokemonformlist) | **GET** /api/v2/pokemon-form/ | List pokemon forms
*PokemonApi* | [**pokemonFormRetrieve**](docs/Api/PokemonApi.md#pokemonformretrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
*PokemonApi* | [**pokemonHabitatList**](docs/Api/PokemonApi.md#pokemonhabitatlist) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
*PokemonApi* | [**pokemonHabitatRetrieve**](docs/Api/PokemonApi.md#pokemonhabitatretrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
*PokemonApi* | [**pokemonList**](docs/Api/PokemonApi.md#pokemonlist) | **GET** /api/v2/pokemon/ | List pokemon
*PokemonApi* | [**pokemonRetrieve**](docs/Api/PokemonApi.md#pokemonretrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
*PokemonApi* | [**pokemonShapeList**](docs/Api/PokemonApi.md#pokemonshapelist) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
*PokemonApi* | [**pokemonShapeRetrieve**](docs/Api/PokemonApi.md#pokemonshaperetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
*PokemonApi* | [**pokemonSpeciesList**](docs/Api/PokemonApi.md#pokemonspecieslist) | **GET** /api/v2/pokemon-species/ | List pokemon species
*PokemonApi* | [**pokemonSpeciesRetrieve**](docs/Api/PokemonApi.md#pokemonspeciesretrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
*PokemonApi* | [**statList**](docs/Api/PokemonApi.md#statlist) | **GET** /api/v2/stat/ | List stats
*PokemonApi* | [**statRetrieve**](docs/Api/PokemonApi.md#statretrieve) | **GET** /api/v2/stat/{id}/ | Get stat
*PokemonApi* | [**typeList**](docs/Api/PokemonApi.md#typelist) | **GET** /api/v2/type/ | List types
*PokemonApi* | [**typeRetrieve**](docs/Api/PokemonApi.md#typeretrieve) | **GET** /api/v2/type/{id}/ | Get types
*UtilityApi* | [**languageList**](docs/Api/UtilityApi.md#languagelist) | **GET** /api/v2/language/ | List languages
*UtilityApi* | [**languageRetrieve**](docs/Api/UtilityApi.md#languageretrieve) | **GET** /api/v2/language/{id}/ | Get language
*UtilityApi* | [**metaRetrieve**](docs/Api/UtilityApi.md#metaretrieve) | **GET** /api/v2/meta/ | Get API metadata

## Models

- [AbilityChange](docs/Model/AbilityChange.md)
- [AbilityChangeEffectText](docs/Model/AbilityChangeEffectText.md)
- [AbilityDetail](docs/Model/AbilityDetail.md)
- [AbilityEffectText](docs/Model/AbilityEffectText.md)
- [AbilityFlavorText](docs/Model/AbilityFlavorText.md)
- [AbilityName](docs/Model/AbilityName.md)
- [AbilityPokemonDetail](docs/Model/AbilityPokemonDetail.md)
- [AbilitySummary](docs/Model/AbilitySummary.md)
- [BerryDetail](docs/Model/BerryDetail.md)
- [BerryFirmnessDetail](docs/Model/BerryFirmnessDetail.md)
- [BerryFirmnessName](docs/Model/BerryFirmnessName.md)
- [BerryFirmnessSummary](docs/Model/BerryFirmnessSummary.md)
- [BerryFlavorBerryMap](docs/Model/BerryFlavorBerryMap.md)
- [BerryFlavorDetail](docs/Model/BerryFlavorDetail.md)
- [BerryFlavorMap](docs/Model/BerryFlavorMap.md)
- [BerryFlavorName](docs/Model/BerryFlavorName.md)
- [BerryFlavorSummary](docs/Model/BerryFlavorSummary.md)
- [BerrySummary](docs/Model/BerrySummary.md)
- [CharacteristicDescription](docs/Model/CharacteristicDescription.md)
- [CharacteristicDetail](docs/Model/CharacteristicDetail.md)
- [CharacteristicSummary](docs/Model/CharacteristicSummary.md)
- [ContestEffectDetail](docs/Model/ContestEffectDetail.md)
- [ContestEffectEffectText](docs/Model/ContestEffectEffectText.md)
- [ContestEffectFlavorText](docs/Model/ContestEffectFlavorText.md)
- [ContestEffectSummary](docs/Model/ContestEffectSummary.md)
- [ContestTypeDetail](docs/Model/ContestTypeDetail.md)
- [ContestTypeName](docs/Model/ContestTypeName.md)
- [ContestTypeSummary](docs/Model/ContestTypeSummary.md)
- [CurrencyDetail](docs/Model/CurrencyDetail.md)
- [CurrencyName](docs/Model/CurrencyName.md)
- [CurrencySummary](docs/Model/CurrencySummary.md)
- [EggGroupDetail](docs/Model/EggGroupDetail.md)
- [EggGroupName](docs/Model/EggGroupName.md)
- [EggGroupSummary](docs/Model/EggGroupSummary.md)
- [EncounterConditionDetail](docs/Model/EncounterConditionDetail.md)
- [EncounterConditionName](docs/Model/EncounterConditionName.md)
- [EncounterConditionSummary](docs/Model/EncounterConditionSummary.md)
- [EncounterConditionValueDetail](docs/Model/EncounterConditionValueDetail.md)
- [EncounterConditionValueName](docs/Model/EncounterConditionValueName.md)
- [EncounterConditionValueSummary](docs/Model/EncounterConditionValueSummary.md)
- [EncounterMethodDetail](docs/Model/EncounterMethodDetail.md)
- [EncounterMethodName](docs/Model/EncounterMethodName.md)
- [EncounterMethodSummary](docs/Model/EncounterMethodSummary.md)
- [EncounterPokemonDetail](docs/Model/EncounterPokemonDetail.md)
- [EvolutionChainDetail](docs/Model/EvolutionChainDetail.md)
- [EvolutionChainLink](docs/Model/EvolutionChainLink.md)
- [EvolutionChainSummary](docs/Model/EvolutionChainSummary.md)
- [EvolutionConditionExpression](docs/Model/EvolutionConditionExpression.md)
- [EvolutionTriggerDetail](docs/Model/EvolutionTriggerDetail.md)
- [EvolutionTriggerName](docs/Model/EvolutionTriggerName.md)
- [EvolutionTriggerSummary](docs/Model/EvolutionTriggerSummary.md)
- [EvolutionVariableDescription](docs/Model/EvolutionVariableDescription.md)
- [EvolutionVariableDetail](docs/Model/EvolutionVariableDetail.md)
- [EvolutionVariableName](docs/Model/EvolutionVariableName.md)
- [EvolutionVariableSummary](docs/Model/EvolutionVariableSummary.md)
- [Experience](docs/Model/Experience.md)
- [GenderDetail](docs/Model/GenderDetail.md)
- [GenderPokemonSpecies](docs/Model/GenderPokemonSpecies.md)
- [GenderSummary](docs/Model/GenderSummary.md)
- [GenerationDetail](docs/Model/GenerationDetail.md)
- [GenerationName](docs/Model/GenerationName.md)
- [GenerationSummary](docs/Model/GenerationSummary.md)
- [GrowthRateDescription](docs/Model/GrowthRateDescription.md)
- [GrowthRateDetail](docs/Model/GrowthRateDetail.md)
- [GrowthRateSummary](docs/Model/GrowthRateSummary.md)
- [ItemAttributeDescription](docs/Model/ItemAttributeDescription.md)
- [ItemAttributeDetail](docs/Model/ItemAttributeDetail.md)
- [ItemAttributeName](docs/Model/ItemAttributeName.md)
- [ItemAttributeSummary](docs/Model/ItemAttributeSummary.md)
- [ItemCategoryDetail](docs/Model/ItemCategoryDetail.md)
- [ItemCategoryName](docs/Model/ItemCategoryName.md)
- [ItemCategorySummary](docs/Model/ItemCategorySummary.md)
- [ItemDetail](docs/Model/ItemDetail.md)
- [ItemEffectText](docs/Model/ItemEffectText.md)
- [ItemFlavorText](docs/Model/ItemFlavorText.md)
- [ItemFlingEffectDetail](docs/Model/ItemFlingEffectDetail.md)
- [ItemFlingEffectEffectText](docs/Model/ItemFlingEffectEffectText.md)
- [ItemFlingEffectSummary](docs/Model/ItemFlingEffectSummary.md)
- [ItemGameIndex](docs/Model/ItemGameIndex.md)
- [ItemMachine](docs/Model/ItemMachine.md)
- [ItemName](docs/Model/ItemName.md)
- [ItemPocketDetail](docs/Model/ItemPocketDetail.md)
- [ItemPocketName](docs/Model/ItemPocketName.md)
- [ItemPocketSummary](docs/Model/ItemPocketSummary.md)
- [ItemPrice](docs/Model/ItemPrice.md)
- [ItemSprites](docs/Model/ItemSprites.md)
- [ItemSummary](docs/Model/ItemSummary.md)
- [LanguageDetail](docs/Model/LanguageDetail.md)
- [LanguageName](docs/Model/LanguageName.md)
- [LanguageSummary](docs/Model/LanguageSummary.md)
- [LocationAreaDetail](docs/Model/LocationAreaDetail.md)
- [LocationAreaEncounterDetail](docs/Model/LocationAreaEncounterDetail.md)
- [LocationAreaEncounterRate](docs/Model/LocationAreaEncounterRate.md)
- [LocationAreaEncounterVersionDetail](docs/Model/LocationAreaEncounterVersionDetail.md)
- [LocationAreaName](docs/Model/LocationAreaName.md)
- [LocationAreaPokemonEncounter](docs/Model/LocationAreaPokemonEncounter.md)
- [LocationAreaPokemonEncounterVersion](docs/Model/LocationAreaPokemonEncounterVersion.md)
- [LocationAreaSummary](docs/Model/LocationAreaSummary.md)
- [LocationDetail](docs/Model/LocationDetail.md)
- [LocationGameIndex](docs/Model/LocationGameIndex.md)
- [LocationName](docs/Model/LocationName.md)
- [LocationSummary](docs/Model/LocationSummary.md)
- [MachineDetail](docs/Model/MachineDetail.md)
- [MachineSummary](docs/Model/MachineSummary.md)
- [MoveBattleStyleDetail](docs/Model/MoveBattleStyleDetail.md)
- [MoveBattleStyleName](docs/Model/MoveBattleStyleName.md)
- [MoveBattleStyleSummary](docs/Model/MoveBattleStyleSummary.md)
- [MoveChange](docs/Model/MoveChange.md)
- [MoveComboUsage](docs/Model/MoveComboUsage.md)
- [MoveCombos](docs/Model/MoveCombos.md)
- [MoveDamageClassDescription](docs/Model/MoveDamageClassDescription.md)
- [MoveDamageClassDetail](docs/Model/MoveDamageClassDetail.md)
- [MoveDamageClassName](docs/Model/MoveDamageClassName.md)
- [MoveDamageClassSummary](docs/Model/MoveDamageClassSummary.md)
- [MoveDetail](docs/Model/MoveDetail.md)
- [MoveEffectChange](docs/Model/MoveEffectChange.md)
- [MoveEffectChangeEffectText](docs/Model/MoveEffectChangeEffectText.md)
- [MoveEffectEffectText](docs/Model/MoveEffectEffectText.md)
- [MoveFlavorText](docs/Model/MoveFlavorText.md)
- [MoveLearnMethodDescription](docs/Model/MoveLearnMethodDescription.md)
- [MoveLearnMethodDetail](docs/Model/MoveLearnMethodDetail.md)
- [MoveLearnMethodName](docs/Model/MoveLearnMethodName.md)
- [MoveLearnMethodSummary](docs/Model/MoveLearnMethodSummary.md)
- [MoveMeta](docs/Model/MoveMeta.md)
- [MoveMetaAilmentDetail](docs/Model/MoveMetaAilmentDetail.md)
- [MoveMetaAilmentName](docs/Model/MoveMetaAilmentName.md)
- [MoveMetaAilmentSummary](docs/Model/MoveMetaAilmentSummary.md)
- [MoveMetaCategoryDescription](docs/Model/MoveMetaCategoryDescription.md)
- [MoveMetaCategoryDetail](docs/Model/MoveMetaCategoryDetail.md)
- [MoveMetaCategorySummary](docs/Model/MoveMetaCategorySummary.md)
- [MoveMetaStatChange](docs/Model/MoveMetaStatChange.md)
- [MoveName](docs/Model/MoveName.md)
- [MoveStatChange](docs/Model/MoveStatChange.md)
- [MoveSummary](docs/Model/MoveSummary.md)
- [MoveTargetDescription](docs/Model/MoveTargetDescription.md)
- [MoveTargetDetail](docs/Model/MoveTargetDetail.md)
- [MoveTargetName](docs/Model/MoveTargetName.md)
- [MoveTargetSummary](docs/Model/MoveTargetSummary.md)
- [NatureBattleStylePreference](docs/Model/NatureBattleStylePreference.md)
- [NatureDetail](docs/Model/NatureDetail.md)
- [NatureName](docs/Model/NatureName.md)
- [NaturePokeathlonStat](docs/Model/NaturePokeathlonStat.md)
- [NatureSummary](docs/Model/NatureSummary.md)
- [PaginatedAbilitySummaryList](docs/Model/PaginatedAbilitySummaryList.md)
- [PaginatedBerryFirmnessSummaryList](docs/Model/PaginatedBerryFirmnessSummaryList.md)
- [PaginatedBerryFlavorSummaryList](docs/Model/PaginatedBerryFlavorSummaryList.md)
- [PaginatedBerrySummaryList](docs/Model/PaginatedBerrySummaryList.md)
- [PaginatedCharacteristicSummaryList](docs/Model/PaginatedCharacteristicSummaryList.md)
- [PaginatedContestEffectSummaryList](docs/Model/PaginatedContestEffectSummaryList.md)
- [PaginatedContestTypeSummaryList](docs/Model/PaginatedContestTypeSummaryList.md)
- [PaginatedCurrencySummaryList](docs/Model/PaginatedCurrencySummaryList.md)
- [PaginatedEggGroupSummaryList](docs/Model/PaginatedEggGroupSummaryList.md)
- [PaginatedEncounterConditionSummaryList](docs/Model/PaginatedEncounterConditionSummaryList.md)
- [PaginatedEncounterConditionValueSummaryList](docs/Model/PaginatedEncounterConditionValueSummaryList.md)
- [PaginatedEncounterMethodSummaryList](docs/Model/PaginatedEncounterMethodSummaryList.md)
- [PaginatedEvolutionChainSummaryList](docs/Model/PaginatedEvolutionChainSummaryList.md)
- [PaginatedEvolutionTriggerSummaryList](docs/Model/PaginatedEvolutionTriggerSummaryList.md)
- [PaginatedEvolutionVariableSummaryList](docs/Model/PaginatedEvolutionVariableSummaryList.md)
- [PaginatedGenderSummaryList](docs/Model/PaginatedGenderSummaryList.md)
- [PaginatedGenerationSummaryList](docs/Model/PaginatedGenerationSummaryList.md)
- [PaginatedGrowthRateSummaryList](docs/Model/PaginatedGrowthRateSummaryList.md)
- [PaginatedItemAttributeSummaryList](docs/Model/PaginatedItemAttributeSummaryList.md)
- [PaginatedItemCategorySummaryList](docs/Model/PaginatedItemCategorySummaryList.md)
- [PaginatedItemFlingEffectSummaryList](docs/Model/PaginatedItemFlingEffectSummaryList.md)
- [PaginatedItemPocketSummaryList](docs/Model/PaginatedItemPocketSummaryList.md)
- [PaginatedItemSummaryList](docs/Model/PaginatedItemSummaryList.md)
- [PaginatedLanguageSummaryList](docs/Model/PaginatedLanguageSummaryList.md)
- [PaginatedLocationAreaSummaryList](docs/Model/PaginatedLocationAreaSummaryList.md)
- [PaginatedLocationSummaryList](docs/Model/PaginatedLocationSummaryList.md)
- [PaginatedMachineSummaryList](docs/Model/PaginatedMachineSummaryList.md)
- [PaginatedMoveBattleStyleSummaryList](docs/Model/PaginatedMoveBattleStyleSummaryList.md)
- [PaginatedMoveDamageClassSummaryList](docs/Model/PaginatedMoveDamageClassSummaryList.md)
- [PaginatedMoveLearnMethodSummaryList](docs/Model/PaginatedMoveLearnMethodSummaryList.md)
- [PaginatedMoveMetaAilmentSummaryList](docs/Model/PaginatedMoveMetaAilmentSummaryList.md)
- [PaginatedMoveMetaCategorySummaryList](docs/Model/PaginatedMoveMetaCategorySummaryList.md)
- [PaginatedMoveSummaryList](docs/Model/PaginatedMoveSummaryList.md)
- [PaginatedMoveTargetSummaryList](docs/Model/PaginatedMoveTargetSummaryList.md)
- [PaginatedNatureSummaryList](docs/Model/PaginatedNatureSummaryList.md)
- [PaginatedPalParkAreaSummaryList](docs/Model/PaginatedPalParkAreaSummaryList.md)
- [PaginatedPokeathlonStatSummaryList](docs/Model/PaginatedPokeathlonStatSummaryList.md)
- [PaginatedPokedexSummaryList](docs/Model/PaginatedPokedexSummaryList.md)
- [PaginatedPokemonColorSummaryList](docs/Model/PaginatedPokemonColorSummaryList.md)
- [PaginatedPokemonFormSummaryList](docs/Model/PaginatedPokemonFormSummaryList.md)
- [PaginatedPokemonHabitatSummaryList](docs/Model/PaginatedPokemonHabitatSummaryList.md)
- [PaginatedPokemonShapeSummaryList](docs/Model/PaginatedPokemonShapeSummaryList.md)
- [PaginatedPokemonSpeciesSummaryList](docs/Model/PaginatedPokemonSpeciesSummaryList.md)
- [PaginatedPokemonSummaryList](docs/Model/PaginatedPokemonSummaryList.md)
- [PaginatedRegionSummaryList](docs/Model/PaginatedRegionSummaryList.md)
- [PaginatedStatSummaryList](docs/Model/PaginatedStatSummaryList.md)
- [PaginatedSuperContestEffectSummaryList](docs/Model/PaginatedSuperContestEffectSummaryList.md)
- [PaginatedTypeSummaryList](docs/Model/PaginatedTypeSummaryList.md)
- [PaginatedVersionGroupSummaryList](docs/Model/PaginatedVersionGroupSummaryList.md)
- [PaginatedVersionSummaryList](docs/Model/PaginatedVersionSummaryList.md)
- [PalParkAreaDetail](docs/Model/PalParkAreaDetail.md)
- [PalParkAreaName](docs/Model/PalParkAreaName.md)
- [PalParkAreaSummary](docs/Model/PalParkAreaSummary.md)
- [PalParkEncounter](docs/Model/PalParkEncounter.md)
- [PokeapiMetaResponse](docs/Model/PokeapiMetaResponse.md)
- [PokeathlonStatAffectingNature](docs/Model/PokeathlonStatAffectingNature.md)
- [PokeathlonStatAffectingNatures](docs/Model/PokeathlonStatAffectingNatures.md)
- [PokeathlonStatDetail](docs/Model/PokeathlonStatDetail.md)
- [PokeathlonStatName](docs/Model/PokeathlonStatName.md)
- [PokeathlonStatSummary](docs/Model/PokeathlonStatSummary.md)
- [PokedexDescription](docs/Model/PokedexDescription.md)
- [PokedexDetail](docs/Model/PokedexDetail.md)
- [PokedexName](docs/Model/PokedexName.md)
- [PokedexSummary](docs/Model/PokedexSummary.md)
- [PokemonAbility](docs/Model/PokemonAbility.md)
- [PokemonAbilityPast](docs/Model/PokemonAbilityPast.md)
- [PokemonColorDetail](docs/Model/PokemonColorDetail.md)
- [PokemonColorName](docs/Model/PokemonColorName.md)
- [PokemonColorSummary](docs/Model/PokemonColorSummary.md)
- [PokemonCries](docs/Model/PokemonCries.md)
- [PokemonDetail](docs/Model/PokemonDetail.md)
- [PokemonDexEntry](docs/Model/PokemonDexEntry.md)
- [PokemonDexNumber](docs/Model/PokemonDexNumber.md)
- [PokemonEncounterDetailResponse](docs/Model/PokemonEncounterDetailResponse.md)
- [PokemonEncounterResponse](docs/Model/PokemonEncounterResponse.md)
- [PokemonEncounterVersionDetailResponse](docs/Model/PokemonEncounterVersionDetailResponse.md)
- [PokemonEvolution](docs/Model/PokemonEvolution.md)
- [PokemonEvolutionKnownMove](docs/Model/PokemonEvolutionKnownMove.md)
- [PokemonFormDetail](docs/Model/PokemonFormDetail.md)
- [PokemonFormFlavorText](docs/Model/PokemonFormFlavorText.md)
- [PokemonFormName](docs/Model/PokemonFormName.md)
- [PokemonFormSprites](docs/Model/PokemonFormSprites.md)
- [PokemonFormSummary](docs/Model/PokemonFormSummary.md)
- [PokemonFormTriggerCondition](docs/Model/PokemonFormTriggerCondition.md)
- [PokemonFormType](docs/Model/PokemonFormType.md)
- [PokemonGameIndex](docs/Model/PokemonGameIndex.md)
- [PokemonHabitatDetail](docs/Model/PokemonHabitatDetail.md)
- [PokemonHabitatName](docs/Model/PokemonHabitatName.md)
- [PokemonHabitatSummary](docs/Model/PokemonHabitatSummary.md)
- [PokemonHeldItem](docs/Model/PokemonHeldItem.md)
- [PokemonHeldItemSummary](docs/Model/PokemonHeldItemSummary.md)
- [PokemonHeldItemVersion](docs/Model/PokemonHeldItemVersion.md)
- [PokemonMove](docs/Model/PokemonMove.md)
- [PokemonMoveVersionGroup](docs/Model/PokemonMoveVersionGroup.md)
- [PokemonPastAbility](docs/Model/PokemonPastAbility.md)
- [PokemonPastStat](docs/Model/PokemonPastStat.md)
- [PokemonPastType](docs/Model/PokemonPastType.md)
- [PokemonShapeAwesomeName](docs/Model/PokemonShapeAwesomeName.md)
- [PokemonShapeDetail](docs/Model/PokemonShapeDetail.md)
- [PokemonShapeName](docs/Model/PokemonShapeName.md)
- [PokemonShapeSummary](docs/Model/PokemonShapeSummary.md)
- [PokemonSpeciesDescription](docs/Model/PokemonSpeciesDescription.md)
- [PokemonSpeciesDetail](docs/Model/PokemonSpeciesDetail.md)
- [PokemonSpeciesFlavorText](docs/Model/PokemonSpeciesFlavorText.md)
- [PokemonSpeciesGenus](docs/Model/PokemonSpeciesGenus.md)
- [PokemonSpeciesName](docs/Model/PokemonSpeciesName.md)
- [PokemonSpeciesPalParkEncounter](docs/Model/PokemonSpeciesPalParkEncounter.md)
- [PokemonSpeciesSummary](docs/Model/PokemonSpeciesSummary.md)
- [PokemonSpeciesVariety](docs/Model/PokemonSpeciesVariety.md)
- [PokemonSprites](docs/Model/PokemonSprites.md)
- [PokemonSpritesOther](docs/Model/PokemonSpritesOther.md)
- [PokemonSpritesOtherDreamWorld](docs/Model/PokemonSpritesOtherDreamWorld.md)
- [PokemonSpritesOtherHome](docs/Model/PokemonSpritesOtherHome.md)
- [PokemonSpritesOtherOfficialArtwork](docs/Model/PokemonSpritesOtherOfficialArtwork.md)
- [PokemonSpritesOtherShowdown](docs/Model/PokemonSpritesOtherShowdown.md)
- [PokemonStat](docs/Model/PokemonStat.md)
- [PokemonSummary](docs/Model/PokemonSummary.md)
- [PokemonType](docs/Model/PokemonType.md)
- [RegionDetail](docs/Model/RegionDetail.md)
- [RegionName](docs/Model/RegionName.md)
- [RegionSummary](docs/Model/RegionSummary.md)
- [StatAffectingMoves](docs/Model/StatAffectingMoves.md)
- [StatAffectingNatures](docs/Model/StatAffectingNatures.md)
- [StatDetail](docs/Model/StatDetail.md)
- [StatName](docs/Model/StatName.md)
- [StatSummary](docs/Model/StatSummary.md)
- [SuperContestEffectDetail](docs/Model/SuperContestEffectDetail.md)
- [SuperContestEffectFlavorText](docs/Model/SuperContestEffectFlavorText.md)
- [SuperContestEffectSummary](docs/Model/SuperContestEffectSummary.md)
- [TypeDetail](docs/Model/TypeDetail.md)
- [TypeGameIndex](docs/Model/TypeGameIndex.md)
- [TypeGameSprite](docs/Model/TypeGameSprite.md)
- [TypeName](docs/Model/TypeName.md)
- [TypePastRelationships](docs/Model/TypePastRelationships.md)
- [TypePokemon](docs/Model/TypePokemon.md)
- [TypeRelationships](docs/Model/TypeRelationships.md)
- [TypeSummary](docs/Model/TypeSummary.md)
- [VersionDetail](docs/Model/VersionDetail.md)
- [VersionGroupDetail](docs/Model/VersionGroupDetail.md)
- [VersionGroupSummary](docs/Model/VersionGroupSummary.md)
- [VersionName](docs/Model/VersionName.md)
- [VersionSummary](docs/Model/VersionSummary.md)

## Authorization
Endpoints do not require authorization.

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

blah+oapicf@cliffano.com

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `2.10.0`
    - Generator version: `7.26.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
