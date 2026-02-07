# php-base - PHP Slim 4 Server library for PokéAPI

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.
[PHP-DI](https://php-di.org/doc/frameworks/slim.html) package used as dependency container.

## Requirements

* Web server with URL rewriting
* PHP 8.1 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Add configs

[PHP-DI package](https://php-di.org/doc/getting-started.html) helps to decouple configuration from implementation. App loads configuration files in straight order(`$env` can be `prod` or `dev`):
1. `config/$env/default.inc.php` (contains safe values, can be committed to vcs)
2. `config/$env/config.inc.php` (user config, excluded from vcs, can contain sensitive values, passwords etc.)
3. `lib/App/RegisterDependencies.php`

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/public/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server/public
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 8 or 9(depends from your PHP version) for unit testing.
[Test folder](tests) contains templates which you can fill with real test assertions.
How to write tests read at [2. Writing Tests for PHPUnit - PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/textui.html#command-line-options):

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

Switch your app environment to development
- When using with some webserver => in `public/.htaccess` file:
```ini
## .htaccess
<IfModule mod_env.c>
    SetEnv APP_ENV 'development'
</IfModule>
```

- Or when using whatever else, set `APP_ENV` environment variable like this:
```bash
export APP_ENV=development
```
or simply
```bash
export APP_ENV=dev
```

## Mock Server
Since this feature should be used for development only, change environment to `development` and send additional HTTP header `X-OpenAPIServer-Mock: ping` with any request to get mocked response.
CURL example:
```console
curl --request GET \
    --url 'http://localhost:8888/v2/pet/findByStatus?status=available' \
    --header 'accept: application/json' \
    --header 'X-OpenAPIServer-Mock: ping'
[{"id":-8738629417578509312,"category":{"id":-4162503862215270400,"name":"Lorem ipsum dol"},"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem i","photoUrls":["Lor"],"tags":[{"id":-3506202845849391104,"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectet"}],"status":"pending"}]
```

Used packages:
* [Openapi Data Mocker](https://github.com/ybelenko/openapi-data-mocker) - first implementation of OAS3 fake data generator.
* [Openapi Data Mocker Server Middleware](https://github.com/ybelenko/openapi-data-mocker-server-middleware) - PSR-15 HTTP server middleware.
* [Openapi Data Mocker Interfaces](https://github.com/ybelenko/openapi-data-mocker-interfaces) - package with mocking interfaces.

## Logging

Build contains pre-configured [`monolog/monolog`](https://github.com/Seldaek/monolog) package. Make sure that `logs` folder is writable.
Add required log handlers/processors/formatters in `lib/App/RegisterDependencies.php`.

## API Endpoints

All URIs are relative to *https://pokeapi.co*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;

class PetApi extends AbstractPetApi
{
    public function addPet(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        // your implementation of addPet method here
    }
}
```

When you need to inject dependencies into API controller check [PHP-DI - Controllers as services](https://github.com/PHP-DI/Slim-Bridge#controllers-as-services) guide.

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractBerriesApi* | **berryFirmnessList** | **GET** /api/v2/berry-firmness/ | List berry firmness
*AbstractBerriesApi* | **berryFlavorList** | **GET** /api/v2/berry-flavor/ | List berry flavors
*AbstractBerriesApi* | **berryList** | **GET** /api/v2/berry/ | List berries
*AbstractBerriesApi* | **berryFirmnessRetrieve** | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
*AbstractBerriesApi* | **berryFlavorRetrieve** | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
*AbstractBerriesApi* | **berryRetrieve** | **GET** /api/v2/berry/{id}/ | Get a berry
*AbstractContestsApi* | **contestEffectList** | **GET** /api/v2/contest-effect/ | List contest effects
*AbstractContestsApi* | **contestTypeList** | **GET** /api/v2/contest-type/ | List contest types
*AbstractContestsApi* | **superContestEffectList** | **GET** /api/v2/super-contest-effect/ | List super contest effects
*AbstractContestsApi* | **contestEffectRetrieve** | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
*AbstractContestsApi* | **contestTypeRetrieve** | **GET** /api/v2/contest-type/{id}/ | Get contest type
*AbstractContestsApi* | **superContestEffectRetrieve** | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect
*AbstractEncountersApi* | **encounterConditionList** | **GET** /api/v2/encounter-condition/ | List encounter conditions
*AbstractEncountersApi* | **encounterConditionValueList** | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
*AbstractEncountersApi* | **encounterMethodList** | **GET** /api/v2/encounter-method/ | List encounter methods
*AbstractEncountersApi* | **encounterConditionRetrieve** | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
*AbstractEncountersApi* | **encounterConditionValueRetrieve** | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
*AbstractEncountersApi* | **encounterMethodRetrieve** | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
*AbstractEncountersApi* | **pokemonEncountersRetrieve** | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter
*AbstractEvolutionApi* | **evolutionChainList** | **GET** /api/v2/evolution-chain/ | List evolution chains
*AbstractEvolutionApi* | **evolutionTriggerList** | **GET** /api/v2/evolution-trigger/ | List evolution triggers
*AbstractEvolutionApi* | **evolutionChainRetrieve** | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
*AbstractEvolutionApi* | **evolutionTriggerRetrieve** | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
*AbstractGamesApi* | **generationList** | **GET** /api/v2/generation/ | List genrations
*AbstractGamesApi* | **pokedexList** | **GET** /api/v2/pokedex/ | List pokedex
*AbstractGamesApi* | **versionGroupList** | **GET** /api/v2/version-group/ | List version groups
*AbstractGamesApi* | **versionList** | **GET** /api/v2/version/ | List versions
*AbstractGamesApi* | **generationRetrieve** | **GET** /api/v2/generation/{id}/ | Get genration
*AbstractGamesApi* | **pokedexRetrieve** | **GET** /api/v2/pokedex/{id}/ | Get pokedex
*AbstractGamesApi* | **versionGroupRetrieve** | **GET** /api/v2/version-group/{id}/ | Get version group
*AbstractGamesApi* | **versionRetrieve** | **GET** /api/v2/version/{id}/ | Get version
*AbstractItemsApi* | **itemAttributeList** | **GET** /api/v2/item-attribute/ | List item attributes
*AbstractItemsApi* | **itemCategoryList** | **GET** /api/v2/item-category/ | List item categories
*AbstractItemsApi* | **itemFlingEffectList** | **GET** /api/v2/item-fling-effect/ | List item fling effects
*AbstractItemsApi* | **itemList** | **GET** /api/v2/item/ | List items
*AbstractItemsApi* | **itemPocketList** | **GET** /api/v2/item-pocket/ | List item pockets
*AbstractItemsApi* | **itemAttributeRetrieve** | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
*AbstractItemsApi* | **itemCategoryRetrieve** | **GET** /api/v2/item-category/{id}/ | Get item category
*AbstractItemsApi* | **itemFlingEffectRetrieve** | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
*AbstractItemsApi* | **itemPocketRetrieve** | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
*AbstractItemsApi* | **itemRetrieve** | **GET** /api/v2/item/{id}/ | Get item
*AbstractLocationApi* | **locationAreaList** | **GET** /api/v2/location-area/ | List location areas
*AbstractLocationApi* | **locationList** | **GET** /api/v2/location/ | List locations
*AbstractLocationApi* | **palParkAreaList** | **GET** /api/v2/pal-park-area/ | List pal park areas
*AbstractLocationApi* | **regionList** | **GET** /api/v2/region/ | List regions
*AbstractLocationApi* | **locationAreaRetrieve** | **GET** /api/v2/location-area/{id}/ | Get location area
*AbstractLocationApi* | **locationRetrieve** | **GET** /api/v2/location/{id}/ | Get location
*AbstractLocationApi* | **palParkAreaRetrieve** | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
*AbstractLocationApi* | **regionRetrieve** | **GET** /api/v2/region/{id}/ | Get region
*AbstractMachinesApi* | **machineList** | **GET** /api/v2/machine/ | List machines
*AbstractMachinesApi* | **machineRetrieve** | **GET** /api/v2/machine/{id}/ | Get machine
*AbstractMovesApi* | **moveAilmentList** | **GET** /api/v2/move-ailment/ | List move meta ailments
*AbstractMovesApi* | **moveBattleStyleList** | **GET** /api/v2/move-battle-style/ | List move battle styles
*AbstractMovesApi* | **moveCategoryList** | **GET** /api/v2/move-category/ | List move meta categories
*AbstractMovesApi* | **moveLearnMethodList** | **GET** /api/v2/move-learn-method/ | List move learn methods
*AbstractMovesApi* | **moveList** | **GET** /api/v2/move/ | List moves
*AbstractMovesApi* | **moveTargetList** | **GET** /api/v2/move-target/ | List move targets
*AbstractMovesApi* | **moveAilmentRetrieve** | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
*AbstractMovesApi* | **moveBattleStyleRetrieve** | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
*AbstractMovesApi* | **moveCategoryRetrieve** | **GET** /api/v2/move-category/{id}/ | Get move meta category
*AbstractMovesApi* | **moveLearnMethodRetrieve** | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
*AbstractMovesApi* | **moveRetrieve** | **GET** /api/v2/move/{id}/ | Get move
*AbstractMovesApi* | **moveTargetRetrieve** | **GET** /api/v2/move-target/{id}/ | Get move target
*AbstractPokemonApi* | **abilityList** | **GET** /api/v2/ability/ | 
*AbstractPokemonApi* | **characteristicList** | **GET** /api/v2/characteristic/ | List charecterictics
*AbstractPokemonApi* | **eggGroupList** | **GET** /api/v2/egg-group/ | List egg groups
*AbstractPokemonApi* | **genderList** | **GET** /api/v2/gender/ | List genders
*AbstractPokemonApi* | **growthRateList** | **GET** /api/v2/growth-rate/ | List growth rates
*AbstractPokemonApi* | **moveDamageClassList** | **GET** /api/v2/move-damage-class/ | List move damage classes
*AbstractPokemonApi* | **natureList** | **GET** /api/v2/nature/ | List natures
*AbstractPokemonApi* | **pokeathlonStatList** | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
*AbstractPokemonApi* | **pokemonColorList** | **GET** /api/v2/pokemon-color/ | List pokemon colors
*AbstractPokemonApi* | **pokemonFormList** | **GET** /api/v2/pokemon-form/ | List pokemon forms
*AbstractPokemonApi* | **pokemonHabitatList** | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
*AbstractPokemonApi* | **pokemonList** | **GET** /api/v2/pokemon/ | List pokemon
*AbstractPokemonApi* | **pokemonShapeList** | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
*AbstractPokemonApi* | **pokemonSpeciesList** | **GET** /api/v2/pokemon-species/ | List pokemon species
*AbstractPokemonApi* | **statList** | **GET** /api/v2/stat/ | List stats
*AbstractPokemonApi* | **typeList** | **GET** /api/v2/type/ | List types
*AbstractPokemonApi* | **abilityRetrieve** | **GET** /api/v2/ability/{id}/ | 
*AbstractPokemonApi* | **characteristicRetrieve** | **GET** /api/v2/characteristic/{id}/ | Get characteristic
*AbstractPokemonApi* | **eggGroupRetrieve** | **GET** /api/v2/egg-group/{id}/ | Get egg group
*AbstractPokemonApi* | **genderRetrieve** | **GET** /api/v2/gender/{id}/ | Get gender
*AbstractPokemonApi* | **growthRateRetrieve** | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
*AbstractPokemonApi* | **moveDamageClassRetrieve** | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
*AbstractPokemonApi* | **natureRetrieve** | **GET** /api/v2/nature/{id}/ | Get nature
*AbstractPokemonApi* | **pokeathlonStatRetrieve** | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
*AbstractPokemonApi* | **pokemonColorRetrieve** | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
*AbstractPokemonApi* | **pokemonFormRetrieve** | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
*AbstractPokemonApi* | **pokemonHabitatRetrieve** | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
*AbstractPokemonApi* | **pokemonRetrieve** | **GET** /api/v2/pokemon/{id}/ | Get pokemon
*AbstractPokemonApi* | **pokemonShapeRetrieve** | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
*AbstractPokemonApi* | **pokemonSpeciesRetrieve** | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
*AbstractPokemonApi* | **statRetrieve** | **GET** /api/v2/stat/{id}/ | Get stat
*AbstractPokemonApi* | **typeRetrieve** | **GET** /api/v2/type/{id}/ | Get types
*AbstractUtilityApi* | **languageList** | **GET** /api/v2/language/ | List languages
*AbstractUtilityApi* | **languageRetrieve** | **GET** /api/v2/language/{id}/ | Get language


## Models

* OpenAPIServer\Model\AbilityChange
* OpenAPIServer\Model\AbilityChangeEffectText
* OpenAPIServer\Model\AbilityDetail
* OpenAPIServer\Model\AbilityDetailPokemonInner
* OpenAPIServer\Model\AbilityDetailPokemonInnerPokemon
* OpenAPIServer\Model\AbilityEffectText
* OpenAPIServer\Model\AbilityFlavorText
* OpenAPIServer\Model\AbilityName
* OpenAPIServer\Model\AbilitySummary
* OpenAPIServer\Model\BerryDetail
* OpenAPIServer\Model\BerryDetailFlavorsInner
* OpenAPIServer\Model\BerryDetailFlavorsInnerFlavor
* OpenAPIServer\Model\BerryFirmnessDetail
* OpenAPIServer\Model\BerryFirmnessName
* OpenAPIServer\Model\BerryFirmnessSummary
* OpenAPIServer\Model\BerryFlavorDetail
* OpenAPIServer\Model\BerryFlavorDetailBerriesInner
* OpenAPIServer\Model\BerryFlavorDetailBerriesInnerBerry
* OpenAPIServer\Model\BerryFlavorName
* OpenAPIServer\Model\BerryFlavorSummary
* OpenAPIServer\Model\BerrySummary
* OpenAPIServer\Model\CharacteristicDescription
* OpenAPIServer\Model\CharacteristicDetail
* OpenAPIServer\Model\CharacteristicSummary
* OpenAPIServer\Model\ContestEffectDetail
* OpenAPIServer\Model\ContestEffectEffectText
* OpenAPIServer\Model\ContestEffectFlavorText
* OpenAPIServer\Model\ContestEffectSummary
* OpenAPIServer\Model\ContestTypeDetail
* OpenAPIServer\Model\ContestTypeName
* OpenAPIServer\Model\ContestTypeSummary
* OpenAPIServer\Model\EggGroupDetail
* OpenAPIServer\Model\EggGroupDetailPokemonSpeciesInner
* OpenAPIServer\Model\EggGroupName
* OpenAPIServer\Model\EggGroupSummary
* OpenAPIServer\Model\EncounterConditionDetail
* OpenAPIServer\Model\EncounterConditionName
* OpenAPIServer\Model\EncounterConditionSummary
* OpenAPIServer\Model\EncounterConditionValueDetail
* OpenAPIServer\Model\EncounterConditionValueName
* OpenAPIServer\Model\EncounterConditionValueSummary
* OpenAPIServer\Model\EncounterMethodDetail
* OpenAPIServer\Model\EncounterMethodName
* OpenAPIServer\Model\EncounterMethodSummary
* OpenAPIServer\Model\EvolutionChainDetail
* OpenAPIServer\Model\EvolutionChainDetailChain
* OpenAPIServer\Model\EvolutionChainDetailChainEvolvesToInner
* OpenAPIServer\Model\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
* OpenAPIServer\Model\EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
* OpenAPIServer\Model\EvolutionChainSummary
* OpenAPIServer\Model\EvolutionTriggerDetail
* OpenAPIServer\Model\EvolutionTriggerName
* OpenAPIServer\Model\EvolutionTriggerSummary
* OpenAPIServer\Model\Experience
* OpenAPIServer\Model\GenderDetail
* OpenAPIServer\Model\GenderDetailPokemonSpeciesDetailsInner
* OpenAPIServer\Model\GenderSummary
* OpenAPIServer\Model\GenerationDetail
* OpenAPIServer\Model\GenerationName
* OpenAPIServer\Model\GenerationSummary
* OpenAPIServer\Model\GrowthRateDescription
* OpenAPIServer\Model\GrowthRateDetail
* OpenAPIServer\Model\GrowthRateSummary
* OpenAPIServer\Model\ItemAttributeDescription
* OpenAPIServer\Model\ItemAttributeDetail
* OpenAPIServer\Model\ItemAttributeName
* OpenAPIServer\Model\ItemAttributeSummary
* OpenAPIServer\Model\ItemCategoryDetail
* OpenAPIServer\Model\ItemCategoryName
* OpenAPIServer\Model\ItemCategorySummary
* OpenAPIServer\Model\ItemDetail
* OpenAPIServer\Model\ItemDetailBabyTriggerFor
* OpenAPIServer\Model\ItemDetailHeldByPokemonInner
* OpenAPIServer\Model\ItemDetailHeldByPokemonInnerVersionDetailsInner
* OpenAPIServer\Model\ItemDetailMachinesInner
* OpenAPIServer\Model\ItemDetailSprites
* OpenAPIServer\Model\ItemEffectText
* OpenAPIServer\Model\ItemFlavorText
* OpenAPIServer\Model\ItemFlingEffectDetail
* OpenAPIServer\Model\ItemFlingEffectEffectText
* OpenAPIServer\Model\ItemFlingEffectSummary
* OpenAPIServer\Model\ItemGameIndex
* OpenAPIServer\Model\ItemName
* OpenAPIServer\Model\ItemPocketDetail
* OpenAPIServer\Model\ItemPocketName
* OpenAPIServer\Model\ItemPocketSummary
* OpenAPIServer\Model\ItemSummary
* OpenAPIServer\Model\LanguageDetail
* OpenAPIServer\Model\LanguageName
* OpenAPIServer\Model\LanguageSummary
* OpenAPIServer\Model\LocationAreaDetail
* OpenAPIServer\Model\LocationAreaDetailEncounterMethodRatesInner
* OpenAPIServer\Model\LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
* OpenAPIServer\Model\LocationAreaDetailPokemonEncountersInner
* OpenAPIServer\Model\LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
* OpenAPIServer\Model\LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
* OpenAPIServer\Model\LocationAreaName
* OpenAPIServer\Model\LocationAreaSummary
* OpenAPIServer\Model\LocationDetail
* OpenAPIServer\Model\LocationGameIndex
* OpenAPIServer\Model\LocationName
* OpenAPIServer\Model\LocationSummary
* OpenAPIServer\Model\MachineDetail
* OpenAPIServer\Model\MachineSummary
* OpenAPIServer\Model\MoveBattleStyleDetail
* OpenAPIServer\Model\MoveBattleStyleName
* OpenAPIServer\Model\MoveBattleStyleSummary
* OpenAPIServer\Model\MoveChange
* OpenAPIServer\Model\MoveChangeEffectEntriesInner
* OpenAPIServer\Model\MoveDamageClassDescription
* OpenAPIServer\Model\MoveDamageClassDetail
* OpenAPIServer\Model\MoveDamageClassName
* OpenAPIServer\Model\MoveDamageClassSummary
* OpenAPIServer\Model\MoveDetail
* OpenAPIServer\Model\MoveDetailContestCombos
* OpenAPIServer\Model\MoveDetailContestCombosNormal
* OpenAPIServer\Model\MoveDetailEffectChangesInner
* OpenAPIServer\Model\MoveDetailEffectChangesInnerEffectEntriesInner
* OpenAPIServer\Model\MoveDetailMachinesInner
* OpenAPIServer\Model\MoveDetailMachinesInnerMachine
* OpenAPIServer\Model\MoveDetailStatChangesInner
* OpenAPIServer\Model\MoveFlavorText
* OpenAPIServer\Model\MoveLearnMethodDescription
* OpenAPIServer\Model\MoveLearnMethodDetail
* OpenAPIServer\Model\MoveLearnMethodName
* OpenAPIServer\Model\MoveLearnMethodSummary
* OpenAPIServer\Model\MoveMeta
* OpenAPIServer\Model\MoveMetaAilmentDetail
* OpenAPIServer\Model\MoveMetaAilmentName
* OpenAPIServer\Model\MoveMetaAilmentSummary
* OpenAPIServer\Model\MoveMetaCategoryDescription
* OpenAPIServer\Model\MoveMetaCategoryDetail
* OpenAPIServer\Model\MoveMetaCategorySummary
* OpenAPIServer\Model\MoveName
* OpenAPIServer\Model\MoveSummary
* OpenAPIServer\Model\MoveTargetDescription
* OpenAPIServer\Model\MoveTargetDetail
* OpenAPIServer\Model\MoveTargetName
* OpenAPIServer\Model\MoveTargetSummary
* OpenAPIServer\Model\NatureBattleStylePreference
* OpenAPIServer\Model\NatureDetail
* OpenAPIServer\Model\NatureDetailPokeathlonStatChangesInner
* OpenAPIServer\Model\NatureName
* OpenAPIServer\Model\NatureSummary
* OpenAPIServer\Model\PaginatedAbilitySummaryList
* OpenAPIServer\Model\PaginatedBerryFirmnessSummaryList
* OpenAPIServer\Model\PaginatedBerryFlavorSummaryList
* OpenAPIServer\Model\PaginatedBerrySummaryList
* OpenAPIServer\Model\PaginatedCharacteristicSummaryList
* OpenAPIServer\Model\PaginatedContestEffectSummaryList
* OpenAPIServer\Model\PaginatedContestTypeSummaryList
* OpenAPIServer\Model\PaginatedEggGroupSummaryList
* OpenAPIServer\Model\PaginatedEncounterConditionSummaryList
* OpenAPIServer\Model\PaginatedEncounterConditionValueSummaryList
* OpenAPIServer\Model\PaginatedEncounterMethodSummaryList
* OpenAPIServer\Model\PaginatedEvolutionChainSummaryList
* OpenAPIServer\Model\PaginatedEvolutionTriggerSummaryList
* OpenAPIServer\Model\PaginatedGenderSummaryList
* OpenAPIServer\Model\PaginatedGenerationSummaryList
* OpenAPIServer\Model\PaginatedGrowthRateSummaryList
* OpenAPIServer\Model\PaginatedItemAttributeSummaryList
* OpenAPIServer\Model\PaginatedItemCategorySummaryList
* OpenAPIServer\Model\PaginatedItemFlingEffectSummaryList
* OpenAPIServer\Model\PaginatedItemPocketSummaryList
* OpenAPIServer\Model\PaginatedItemSummaryList
* OpenAPIServer\Model\PaginatedLanguageSummaryList
* OpenAPIServer\Model\PaginatedLocationAreaSummaryList
* OpenAPIServer\Model\PaginatedLocationSummaryList
* OpenAPIServer\Model\PaginatedMachineSummaryList
* OpenAPIServer\Model\PaginatedMoveBattleStyleSummaryList
* OpenAPIServer\Model\PaginatedMoveDamageClassSummaryList
* OpenAPIServer\Model\PaginatedMoveLearnMethodSummaryList
* OpenAPIServer\Model\PaginatedMoveMetaAilmentSummaryList
* OpenAPIServer\Model\PaginatedMoveMetaCategorySummaryList
* OpenAPIServer\Model\PaginatedMoveSummaryList
* OpenAPIServer\Model\PaginatedMoveTargetSummaryList
* OpenAPIServer\Model\PaginatedNatureSummaryList
* OpenAPIServer\Model\PaginatedPalParkAreaSummaryList
* OpenAPIServer\Model\PaginatedPokeathlonStatSummaryList
* OpenAPIServer\Model\PaginatedPokedexSummaryList
* OpenAPIServer\Model\PaginatedPokemonColorSummaryList
* OpenAPIServer\Model\PaginatedPokemonFormSummaryList
* OpenAPIServer\Model\PaginatedPokemonHabitatSummaryList
* OpenAPIServer\Model\PaginatedPokemonShapeSummaryList
* OpenAPIServer\Model\PaginatedPokemonSpeciesSummaryList
* OpenAPIServer\Model\PaginatedPokemonSummaryList
* OpenAPIServer\Model\PaginatedRegionSummaryList
* OpenAPIServer\Model\PaginatedStatSummaryList
* OpenAPIServer\Model\PaginatedSuperContestEffectSummaryList
* OpenAPIServer\Model\PaginatedTypeSummaryList
* OpenAPIServer\Model\PaginatedVersionGroupSummaryList
* OpenAPIServer\Model\PaginatedVersionSummaryList
* OpenAPIServer\Model\PalParkAreaDetail
* OpenAPIServer\Model\PalParkAreaDetailPokemonEncountersInner
* OpenAPIServer\Model\PalParkAreaName
* OpenAPIServer\Model\PalParkAreaSummary
* OpenAPIServer\Model\PokeathlonStatDetail
* OpenAPIServer\Model\PokeathlonStatDetailAffectingNatures
* OpenAPIServer\Model\PokeathlonStatDetailAffectingNaturesDecreaseInner
* OpenAPIServer\Model\PokeathlonStatDetailAffectingNaturesIncreaseInner
* OpenAPIServer\Model\PokeathlonStatName
* OpenAPIServer\Model\PokeathlonStatSummary
* OpenAPIServer\Model\PokedexDescription
* OpenAPIServer\Model\PokedexDetail
* OpenAPIServer\Model\PokedexDetailPokemonEntriesInner
* OpenAPIServer\Model\PokedexName
* OpenAPIServer\Model\PokedexSummary
* OpenAPIServer\Model\PokemonColorDetail
* OpenAPIServer\Model\PokemonColorName
* OpenAPIServer\Model\PokemonColorSummary
* OpenAPIServer\Model\PokemonDetail
* OpenAPIServer\Model\PokemonDetailAbilitiesInner
* OpenAPIServer\Model\PokemonDetailCries
* OpenAPIServer\Model\PokemonDetailHeldItems
* OpenAPIServer\Model\PokemonDetailMovesInner
* OpenAPIServer\Model\PokemonDetailMovesInnerVersionGroupDetailsInner
* OpenAPIServer\Model\PokemonDetailPastAbilitiesInner
* OpenAPIServer\Model\PokemonDetailPastTypesInner
* OpenAPIServer\Model\PokemonDetailSprites
* OpenAPIServer\Model\PokemonDetailTypesInner
* OpenAPIServer\Model\PokemonDexEntry
* OpenAPIServer\Model\PokemonEncountersRetrieve200ResponseInner
* OpenAPIServer\Model\PokemonEncountersRetrieve200ResponseInnerLocationArea
* OpenAPIServer\Model\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
* OpenAPIServer\Model\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
* OpenAPIServer\Model\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner
* OpenAPIServer\Model\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod
* OpenAPIServer\Model\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
* OpenAPIServer\Model\PokemonFormDetail
* OpenAPIServer\Model\PokemonFormDetailFormNamesInner
* OpenAPIServer\Model\PokemonFormDetailSprites
* OpenAPIServer\Model\PokemonFormSummary
* OpenAPIServer\Model\PokemonGameIndex
* OpenAPIServer\Model\PokemonHabitatDetail
* OpenAPIServer\Model\PokemonHabitatName
* OpenAPIServer\Model\PokemonHabitatSummary
* OpenAPIServer\Model\PokemonShapeDetail
* OpenAPIServer\Model\PokemonShapeDetailAwesomeNamesInner
* OpenAPIServer\Model\PokemonShapeDetailNamesInner
* OpenAPIServer\Model\PokemonShapeSummary
* OpenAPIServer\Model\PokemonSpeciesDescription
* OpenAPIServer\Model\PokemonSpeciesDetail
* OpenAPIServer\Model\PokemonSpeciesDetailGeneraInner
* OpenAPIServer\Model\PokemonSpeciesDetailPalParkEncountersInner
* OpenAPIServer\Model\PokemonSpeciesDetailVarietiesInner
* OpenAPIServer\Model\PokemonSpeciesFlavorText
* OpenAPIServer\Model\PokemonSpeciesSummary
* OpenAPIServer\Model\PokemonStat
* OpenAPIServer\Model\PokemonSummary
* OpenAPIServer\Model\RegionDetail
* OpenAPIServer\Model\RegionName
* OpenAPIServer\Model\RegionSummary
* OpenAPIServer\Model\StatDetail
* OpenAPIServer\Model\StatDetailAffectingMoves
* OpenAPIServer\Model\StatDetailAffectingMovesIncreaseInner
* OpenAPIServer\Model\StatDetailAffectingNatures
* OpenAPIServer\Model\StatName
* OpenAPIServer\Model\StatSummary
* OpenAPIServer\Model\SuperContestEffectDetail
* OpenAPIServer\Model\SuperContestEffectFlavorText
* OpenAPIServer\Model\SuperContestEffectSummary
* OpenAPIServer\Model\TypeDetail
* OpenAPIServer\Model\TypeDetailDamageRelations
* OpenAPIServer\Model\TypeDetailPastDamageRelationsInner
* OpenAPIServer\Model\TypeDetailPastDamageRelationsInnerDamageRelations
* OpenAPIServer\Model\TypeDetailPokemonInner
* OpenAPIServer\Model\TypeDetailPokemonInnerPokemon
* OpenAPIServer\Model\TypeDetailSpritesValueValue
* OpenAPIServer\Model\TypeGameIndex
* OpenAPIServer\Model\TypeSummary
* OpenAPIServer\Model\VersionDetail
* OpenAPIServer\Model\VersionGroupDetail
* OpenAPIServer\Model\VersionGroupSummary
* OpenAPIServer\Model\VersionName
* OpenAPIServer\Model\VersionSummary


## Authentication

### Security schema `basicAuth`
> Important! To make Basic authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BasicAuthenticator](./src/Auth/BasicAuthenticator.php) class.

### Security schema `cookieAuth`
> Important! To make ApiKey authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\ApiKeyAuthenticator](./src/Auth/ApiKeyAuthenticator.php) class.

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)
