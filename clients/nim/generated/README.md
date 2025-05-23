# Nim API client for  (Package: openapiclient)

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview

This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 20220523
- Package version: 1.0.0
    - Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.NimClientCodegen
    For more information, please visit [https://github.com/oapicf/pokeapi-clients](https://github.com/oapicf/pokeapi-clients)

## Installation

Put the package under your project folder and add the following to the nimble file of your project:

```
import openapiclient
```

## Documentation for API Endpoints

All URIs are relative to *https://pokeapi.co*

Module | Proc | HTTP request | Description
------------ | ------------- | ------------- | -------------
api_ability | abilityList | **GET** /api/v2/ability/ | 
api_ability | abilityRead | **GET** /api/v2/ability/{id}/ | 
api_berry | berryList | **GET** /api/v2/berry/ | 
api_berry | berryRead | **GET** /api/v2/berry/{id}/ | 
api_berry_firmness | berryFirmnessList | **GET** /api/v2/berry-firmness/ | 
api_berry_firmness | berryFirmnessRead | **GET** /api/v2/berry-firmness/{id}/ | 
api_berry_flavor | berryFlavorList | **GET** /api/v2/berry-flavor/ | 
api_berry_flavor | berryFlavorRead | **GET** /api/v2/berry-flavor/{id}/ | 
api_characteristic | characteristicList | **GET** /api/v2/characteristic/ | 
api_characteristic | characteristicRead | **GET** /api/v2/characteristic/{id}/ | 
api_contest_effect | contestEffectList | **GET** /api/v2/contest-effect/ | 
api_contest_effect | contestEffectRead | **GET** /api/v2/contest-effect/{id}/ | 
api_contest_type | contestTypeList | **GET** /api/v2/contest-type/ | 
api_contest_type | contestTypeRead | **GET** /api/v2/contest-type/{id}/ | 
api_egg_group | eggGroupList | **GET** /api/v2/egg-group/ | 
api_egg_group | eggGroupRead | **GET** /api/v2/egg-group/{id}/ | 
api_encounter_condition | encounterConditionList | **GET** /api/v2/encounter-condition/ | 
api_encounter_condition | encounterConditionRead | **GET** /api/v2/encounter-condition/{id}/ | 
api_encounter_condition_value | encounterConditionValueList | **GET** /api/v2/encounter-condition-value/ | 
api_encounter_condition_value | encounterConditionValueRead | **GET** /api/v2/encounter-condition-value/{id}/ | 
api_encounter_method | encounterMethodList | **GET** /api/v2/encounter-method/ | 
api_encounter_method | encounterMethodRead | **GET** /api/v2/encounter-method/{id}/ | 
api_evolution_chain | evolutionChainList | **GET** /api/v2/evolution-chain/ | 
api_evolution_chain | evolutionChainRead | **GET** /api/v2/evolution-chain/{id}/ | 
api_evolution_trigger | evolutionTriggerList | **GET** /api/v2/evolution-trigger/ | 
api_evolution_trigger | evolutionTriggerRead | **GET** /api/v2/evolution-trigger/{id}/ | 
api_gender | genderList | **GET** /api/v2/gender/ | 
api_gender | genderRead | **GET** /api/v2/gender/{id}/ | 
api_generation | generationList | **GET** /api/v2/generation/ | 
api_generation | generationRead | **GET** /api/v2/generation/{id}/ | 
api_growth_rate | growthRateList | **GET** /api/v2/growth-rate/ | 
api_growth_rate | growthRateRead | **GET** /api/v2/growth-rate/{id}/ | 
api_item | itemList | **GET** /api/v2/item/ | 
api_item | itemRead | **GET** /api/v2/item/{id}/ | 
api_item_attribute | itemAttributeList | **GET** /api/v2/item-attribute/ | 
api_item_attribute | itemAttributeRead | **GET** /api/v2/item-attribute/{id}/ | 
api_item_category | itemCategoryList | **GET** /api/v2/item-category/ | 
api_item_category | itemCategoryRead | **GET** /api/v2/item-category/{id}/ | 
api_item_fling_effect | itemFlingEffectList | **GET** /api/v2/item-fling-effect/ | 
api_item_fling_effect | itemFlingEffectRead | **GET** /api/v2/item-fling-effect/{id}/ | 
api_item_pocket | itemPocketList | **GET** /api/v2/item-pocket/ | 
api_item_pocket | itemPocketRead | **GET** /api/v2/item-pocket/{id}/ | 
api_language | languageList | **GET** /api/v2/language/ | 
api_language | languageRead | **GET** /api/v2/language/{id}/ | 
api_location | locationList | **GET** /api/v2/location/ | 
api_location | locationRead | **GET** /api/v2/location/{id}/ | 
api_location_area | locationAreaList | **GET** /api/v2/location-area/ | 
api_location_area | locationAreaRead | **GET** /api/v2/location-area/{id}/ | 
api_machine | machineList | **GET** /api/v2/machine/ | 
api_machine | machineRead | **GET** /api/v2/machine/{id}/ | 
api_move | moveList | **GET** /api/v2/move/ | 
api_move | moveRead | **GET** /api/v2/move/{id}/ | 
api_move_ailment | moveAilmentList | **GET** /api/v2/move-ailment/ | 
api_move_ailment | moveAilmentRead | **GET** /api/v2/move-ailment/{id}/ | 
api_move_battle_style | moveBattleStyleList | **GET** /api/v2/move-battle-style/ | 
api_move_battle_style | moveBattleStyleRead | **GET** /api/v2/move-battle-style/{id}/ | 
api_move_category | moveCategoryList | **GET** /api/v2/move-category/ | 
api_move_category | moveCategoryRead | **GET** /api/v2/move-category/{id}/ | 
api_move_damage_class | moveDamageClassList | **GET** /api/v2/move-damage-class/ | 
api_move_damage_class | moveDamageClassRead | **GET** /api/v2/move-damage-class/{id}/ | 
api_move_learn_method | moveLearnMethodList | **GET** /api/v2/move-learn-method/ | 
api_move_learn_method | moveLearnMethodRead | **GET** /api/v2/move-learn-method/{id}/ | 
api_move_target | moveTargetList | **GET** /api/v2/move-target/ | 
api_move_target | moveTargetRead | **GET** /api/v2/move-target/{id}/ | 
api_nature | natureList | **GET** /api/v2/nature/ | 
api_nature | natureRead | **GET** /api/v2/nature/{id}/ | 
api_pal_park_area | palParkAreaList | **GET** /api/v2/pal-park-area/ | 
api_pal_park_area | palParkAreaRead | **GET** /api/v2/pal-park-area/{id}/ | 
api_pokeathlon_stat | pokeathlonStatList | **GET** /api/v2/pokeathlon-stat/ | 
api_pokeathlon_stat | pokeathlonStatRead | **GET** /api/v2/pokeathlon-stat/{id}/ | 
api_pokedex | pokedexList | **GET** /api/v2/pokedex/ | 
api_pokedex | pokedexRead | **GET** /api/v2/pokedex/{id}/ | 
api_pokemon | pokemonList | **GET** /api/v2/pokemon/ | 
api_pokemon | pokemonRead | **GET** /api/v2/pokemon/{id}/ | 
api_pokemon_color | pokemonColorList | **GET** /api/v2/pokemon-color/ | 
api_pokemon_color | pokemonColorRead | **GET** /api/v2/pokemon-color/{id}/ | 
api_pokemon_form | pokemonFormList | **GET** /api/v2/pokemon-form/ | 
api_pokemon_form | pokemonFormRead | **GET** /api/v2/pokemon-form/{id}/ | 
api_pokemon_habitat | pokemonHabitatList | **GET** /api/v2/pokemon-habitat/ | 
api_pokemon_habitat | pokemonHabitatRead | **GET** /api/v2/pokemon-habitat/{id}/ | 
api_pokemon_shape | pokemonShapeList | **GET** /api/v2/pokemon-shape/ | 
api_pokemon_shape | pokemonShapeRead | **GET** /api/v2/pokemon-shape/{id}/ | 
api_pokemon_species | pokemonSpeciesList | **GET** /api/v2/pokemon-species/ | 
api_pokemon_species | pokemonSpeciesRead | **GET** /api/v2/pokemon-species/{id}/ | 
api_region | regionList | **GET** /api/v2/region/ | 
api_region | regionRead | **GET** /api/v2/region/{id}/ | 
api_stat | statList | **GET** /api/v2/stat/ | 
api_stat | statRead | **GET** /api/v2/stat/{id}/ | 
api_super_contest_effect | superContestEffectList | **GET** /api/v2/super-contest-effect/ | 
api_super_contest_effect | superContestEffectRead | **GET** /api/v2/super-contest-effect/{id}/ | 
api_type | typeList | **GET** /api/v2/type/ | 
api_type | typeRead | **GET** /api/v2/type/{id}/ | 
api_version | versionList | **GET** /api/v2/version/ | 
api_version | versionRead | **GET** /api/v2/version/{id}/ | 
api_version_group | versionGroupList | **GET** /api/v2/version-group/ | 
api_version_group | versionGroupRead | **GET** /api/v2/version-group/{id}/ | 


To generate documentation with Nim DocGen, use:

```
nim doc --project --index:on openapiclient.nim
```
