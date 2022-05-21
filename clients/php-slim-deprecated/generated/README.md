# php-base - PHP Slim Server library for 

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim Framework Documentation](https://www.slimframework.com/docs/)

## Requirements

* Web server with URL rewriting
* PHP 7.0 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 6 or 7(depends from your PHP version) for unit testing.
[Test folder](test) contains templates which you can fill with real test assertions.
How to write tests read at [PHPUnit Manual - Chapter 2. Writing Tests for PHPUnit](https://phpunit.de/manual/6.5/en/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 7.4 Manual](https://phpunit.readthedocs.io/en/7.4/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch on option in `./index.php`:
```diff
    /**
     * When true, additional information about exceptions are displayed by the default
     * error handler.
     * Default: false
     */
--- // 'displayErrorDetails' => false,
+++ 'displayErrorDetails' => true,
```

## API Endpoints

All URIs are relative to *https://pokeapi.co*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;

class PetApi extends AbstractPetApi
{

    public function addPet($request, $response, $args)
    {
        // your implementation of addPet method here
    }
}
```

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractAbilityApi* | **abilityList** | **GET** /api/v2/ability/ | 
*AbstractAbilityApi* | **abilityRead** | **GET** /api/v2/ability/{id}/ | 
*AbstractBerryApi* | **berryList** | **GET** /api/v2/berry/ | 
*AbstractBerryApi* | **berryRead** | **GET** /api/v2/berry/{id}/ | 
*AbstractBerryFirmnessApi* | **berryFirmnessList** | **GET** /api/v2/berry-firmness/ | 
*AbstractBerryFirmnessApi* | **berryFirmnessRead** | **GET** /api/v2/berry-firmness/{id}/ | 
*AbstractBerryFlavorApi* | **berryFlavorList** | **GET** /api/v2/berry-flavor/ | 
*AbstractBerryFlavorApi* | **berryFlavorRead** | **GET** /api/v2/berry-flavor/{id}/ | 
*AbstractCharacteristicApi* | **characteristicList** | **GET** /api/v2/characteristic/ | 
*AbstractCharacteristicApi* | **characteristicRead** | **GET** /api/v2/characteristic/{id}/ | 
*AbstractContestEffectApi* | **contestEffectList** | **GET** /api/v2/contest-effect/ | 
*AbstractContestEffectApi* | **contestEffectRead** | **GET** /api/v2/contest-effect/{id}/ | 
*AbstractContestTypeApi* | **contestTypeList** | **GET** /api/v2/contest-type/ | 
*AbstractContestTypeApi* | **contestTypeRead** | **GET** /api/v2/contest-type/{id}/ | 
*AbstractEggGroupApi* | **eggGroupList** | **GET** /api/v2/egg-group/ | 
*AbstractEggGroupApi* | **eggGroupRead** | **GET** /api/v2/egg-group/{id}/ | 
*AbstractEncounterConditionApi* | **encounterConditionList** | **GET** /api/v2/encounter-condition/ | 
*AbstractEncounterConditionApi* | **encounterConditionRead** | **GET** /api/v2/encounter-condition/{id}/ | 
*AbstractEncounterConditionValueApi* | **encounterConditionValueList** | **GET** /api/v2/encounter-condition-value/ | 
*AbstractEncounterConditionValueApi* | **encounterConditionValueRead** | **GET** /api/v2/encounter-condition-value/{id}/ | 
*AbstractEncounterMethodApi* | **encounterMethodList** | **GET** /api/v2/encounter-method/ | 
*AbstractEncounterMethodApi* | **encounterMethodRead** | **GET** /api/v2/encounter-method/{id}/ | 
*AbstractEvolutionChainApi* | **evolutionChainList** | **GET** /api/v2/evolution-chain/ | 
*AbstractEvolutionChainApi* | **evolutionChainRead** | **GET** /api/v2/evolution-chain/{id}/ | 
*AbstractEvolutionTriggerApi* | **evolutionTriggerList** | **GET** /api/v2/evolution-trigger/ | 
*AbstractEvolutionTriggerApi* | **evolutionTriggerRead** | **GET** /api/v2/evolution-trigger/{id}/ | 
*AbstractGenderApi* | **genderList** | **GET** /api/v2/gender/ | 
*AbstractGenderApi* | **genderRead** | **GET** /api/v2/gender/{id}/ | 
*AbstractGenerationApi* | **generationList** | **GET** /api/v2/generation/ | 
*AbstractGenerationApi* | **generationRead** | **GET** /api/v2/generation/{id}/ | 
*AbstractGrowthRateApi* | **growthRateList** | **GET** /api/v2/growth-rate/ | 
*AbstractGrowthRateApi* | **growthRateRead** | **GET** /api/v2/growth-rate/{id}/ | 
*AbstractItemApi* | **itemList** | **GET** /api/v2/item/ | 
*AbstractItemApi* | **itemRead** | **GET** /api/v2/item/{id}/ | 
*AbstractItemAttributeApi* | **itemAttributeList** | **GET** /api/v2/item-attribute/ | 
*AbstractItemAttributeApi* | **itemAttributeRead** | **GET** /api/v2/item-attribute/{id}/ | 
*AbstractItemCategoryApi* | **itemCategoryList** | **GET** /api/v2/item-category/ | 
*AbstractItemCategoryApi* | **itemCategoryRead** | **GET** /api/v2/item-category/{id}/ | 
*AbstractItemFlingEffectApi* | **itemFlingEffectList** | **GET** /api/v2/item-fling-effect/ | 
*AbstractItemFlingEffectApi* | **itemFlingEffectRead** | **GET** /api/v2/item-fling-effect/{id}/ | 
*AbstractItemPocketApi* | **itemPocketList** | **GET** /api/v2/item-pocket/ | 
*AbstractItemPocketApi* | **itemPocketRead** | **GET** /api/v2/item-pocket/{id}/ | 
*AbstractLanguageApi* | **languageList** | **GET** /api/v2/language/ | 
*AbstractLanguageApi* | **languageRead** | **GET** /api/v2/language/{id}/ | 
*AbstractLocationApi* | **locationList** | **GET** /api/v2/location/ | 
*AbstractLocationApi* | **locationRead** | **GET** /api/v2/location/{id}/ | 
*AbstractLocationAreaApi* | **locationAreaList** | **GET** /api/v2/location-area/ | 
*AbstractLocationAreaApi* | **locationAreaRead** | **GET** /api/v2/location-area/{id}/ | 
*AbstractMachineApi* | **machineList** | **GET** /api/v2/machine/ | 
*AbstractMachineApi* | **machineRead** | **GET** /api/v2/machine/{id}/ | 
*AbstractMoveApi* | **moveList** | **GET** /api/v2/move/ | 
*AbstractMoveApi* | **moveRead** | **GET** /api/v2/move/{id}/ | 
*AbstractMoveAilmentApi* | **moveAilmentList** | **GET** /api/v2/move-ailment/ | 
*AbstractMoveAilmentApi* | **moveAilmentRead** | **GET** /api/v2/move-ailment/{id}/ | 
*AbstractMoveBattleStyleApi* | **moveBattleStyleList** | **GET** /api/v2/move-battle-style/ | 
*AbstractMoveBattleStyleApi* | **moveBattleStyleRead** | **GET** /api/v2/move-battle-style/{id}/ | 
*AbstractMoveCategoryApi* | **moveCategoryList** | **GET** /api/v2/move-category/ | 
*AbstractMoveCategoryApi* | **moveCategoryRead** | **GET** /api/v2/move-category/{id}/ | 
*AbstractMoveDamageClassApi* | **moveDamageClassList** | **GET** /api/v2/move-damage-class/ | 
*AbstractMoveDamageClassApi* | **moveDamageClassRead** | **GET** /api/v2/move-damage-class/{id}/ | 
*AbstractMoveLearnMethodApi* | **moveLearnMethodList** | **GET** /api/v2/move-learn-method/ | 
*AbstractMoveLearnMethodApi* | **moveLearnMethodRead** | **GET** /api/v2/move-learn-method/{id}/ | 
*AbstractMoveTargetApi* | **moveTargetList** | **GET** /api/v2/move-target/ | 
*AbstractMoveTargetApi* | **moveTargetRead** | **GET** /api/v2/move-target/{id}/ | 
*AbstractNatureApi* | **natureList** | **GET** /api/v2/nature/ | 
*AbstractNatureApi* | **natureRead** | **GET** /api/v2/nature/{id}/ | 
*AbstractPalParkAreaApi* | **palParkAreaList** | **GET** /api/v2/pal-park-area/ | 
*AbstractPalParkAreaApi* | **palParkAreaRead** | **GET** /api/v2/pal-park-area/{id}/ | 
*AbstractPokeathlonStatApi* | **pokeathlonStatList** | **GET** /api/v2/pokeathlon-stat/ | 
*AbstractPokeathlonStatApi* | **pokeathlonStatRead** | **GET** /api/v2/pokeathlon-stat/{id}/ | 
*AbstractPokedexApi* | **pokedexList** | **GET** /api/v2/pokedex/ | 
*AbstractPokedexApi* | **pokedexRead** | **GET** /api/v2/pokedex/{id}/ | 
*AbstractPokemonApi* | **pokemonList** | **GET** /api/v2/pokemon/ | 
*AbstractPokemonApi* | **pokemonRead** | **GET** /api/v2/pokemon/{id}/ | 
*AbstractPokemonColorApi* | **pokemonColorList** | **GET** /api/v2/pokemon-color/ | 
*AbstractPokemonColorApi* | **pokemonColorRead** | **GET** /api/v2/pokemon-color/{id}/ | 
*AbstractPokemonFormApi* | **pokemonFormList** | **GET** /api/v2/pokemon-form/ | 
*AbstractPokemonFormApi* | **pokemonFormRead** | **GET** /api/v2/pokemon-form/{id}/ | 
*AbstractPokemonHabitatApi* | **pokemonHabitatList** | **GET** /api/v2/pokemon-habitat/ | 
*AbstractPokemonHabitatApi* | **pokemonHabitatRead** | **GET** /api/v2/pokemon-habitat/{id}/ | 
*AbstractPokemonShapeApi* | **pokemonShapeList** | **GET** /api/v2/pokemon-shape/ | 
*AbstractPokemonShapeApi* | **pokemonShapeRead** | **GET** /api/v2/pokemon-shape/{id}/ | 
*AbstractPokemonSpeciesApi* | **pokemonSpeciesList** | **GET** /api/v2/pokemon-species/ | 
*AbstractPokemonSpeciesApi* | **pokemonSpeciesRead** | **GET** /api/v2/pokemon-species/{id}/ | 
*AbstractRegionApi* | **regionList** | **GET** /api/v2/region/ | 
*AbstractRegionApi* | **regionRead** | **GET** /api/v2/region/{id}/ | 
*AbstractStatApi* | **statList** | **GET** /api/v2/stat/ | 
*AbstractStatApi* | **statRead** | **GET** /api/v2/stat/{id}/ | 
*AbstractSuperContestEffectApi* | **superContestEffectList** | **GET** /api/v2/super-contest-effect/ | 
*AbstractSuperContestEffectApi* | **superContestEffectRead** | **GET** /api/v2/super-contest-effect/{id}/ | 
*AbstractTypeApi* | **typeList** | **GET** /api/v2/type/ | 
*AbstractTypeApi* | **typeRead** | **GET** /api/v2/type/{id}/ | 
*AbstractVersionApi* | **versionList** | **GET** /api/v2/version/ | 
*AbstractVersionApi* | **versionRead** | **GET** /api/v2/version/{id}/ | 
*AbstractVersionGroupApi* | **versionGroupList** | **GET** /api/v2/version-group/ | 
*AbstractVersionGroupApi* | **versionGroupRead** | **GET** /api/v2/version-group/{id}/ | 


## Models



