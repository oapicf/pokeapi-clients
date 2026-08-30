# PokéAPI - Jetbrains API Client

## General API description

All the Pokémon data you&#39;ll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We&#39;ve covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     

* API basepath : [https://pokeapi.co](https://pokeapi.co)
* Version : 2.7.0

## Documentation for API Endpoints

All URIs are relative to *https://pokeapi.co*, but will link to the `.http` file that contains the endpoint definition.
There may be multiple requests for a single endpoint, one for each example described in the OpenAPI specification.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BerriesApi* | [**berryFirmnessList**](Apis/BerriesApi.http#berryfirmnesslist) | **GET** /api/v2/berry-firmness/ | List berry firmness
*BerriesApi* | [**berryFirmnessRetrieve**](Apis/BerriesApi.http#berryfirmnessretrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
*BerriesApi* | [**berryFlavorList**](Apis/BerriesApi.http#berryflavorlist) | **GET** /api/v2/berry-flavor/ | List berry flavors
*BerriesApi* | [**berryFlavorRetrieve**](Apis/BerriesApi.http#berryflavorretrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
*BerriesApi* | [**berryList**](Apis/BerriesApi.http#berrylist) | **GET** /api/v2/berry/ | List berries
*BerriesApi* | [**berryRetrieve**](Apis/BerriesApi.http#berryretrieve) | **GET** /api/v2/berry/{id}/ | Get a berry
*ContestsApi* | [**contestEffectList**](Apis/ContestsApi.http#contesteffectlist) | **GET** /api/v2/contest-effect/ | List contest effects
*ContestsApi* | [**contestEffectRetrieve**](Apis/ContestsApi.http#contesteffectretrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
*ContestsApi* | [**contestTypeList**](Apis/ContestsApi.http#contesttypelist) | **GET** /api/v2/contest-type/ | List contest types
*ContestsApi* | [**contestTypeRetrieve**](Apis/ContestsApi.http#contesttyperetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
*ContestsApi* | [**superContestEffectList**](Apis/ContestsApi.http#supercontesteffectlist) | **GET** /api/v2/super-contest-effect/ | List super contest effects
*ContestsApi* | [**superContestEffectRetrieve**](Apis/ContestsApi.http#supercontesteffectretrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect
*EncountersApi* | [**encounterConditionList**](Apis/EncountersApi.http#encounterconditionlist) | **GET** /api/v2/encounter-condition/ | List encounter conditions
*EncountersApi* | [**encounterConditionRetrieve**](Apis/EncountersApi.http#encounterconditionretrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
*EncountersApi* | [**encounterConditionValueList**](Apis/EncountersApi.http#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
*EncountersApi* | [**encounterConditionValueRetrieve**](Apis/EncountersApi.http#encounterconditionvalueretrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
*EncountersApi* | [**encounterMethodList**](Apis/EncountersApi.http#encountermethodlist) | **GET** /api/v2/encounter-method/ | List encounter methods
*EncountersApi* | [**encounterMethodRetrieve**](Apis/EncountersApi.http#encountermethodretrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
*EvolutionApi* | [**evolutionChainList**](Apis/EvolutionApi.http#evolutionchainlist) | **GET** /api/v2/evolution-chain/ | List evolution chains
*EvolutionApi* | [**evolutionChainRetrieve**](Apis/EvolutionApi.http#evolutionchainretrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
*EvolutionApi* | [**evolutionTriggerList**](Apis/EvolutionApi.http#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
*EvolutionApi* | [**evolutionTriggerRetrieve**](Apis/EvolutionApi.http#evolutiontriggerretrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
*GamesApi* | [**generationList**](Apis/GamesApi.http#generationlist) | **GET** /api/v2/generation/ | List genrations
*GamesApi* | [**generationRetrieve**](Apis/GamesApi.http#generationretrieve) | **GET** /api/v2/generation/{id}/ | Get genration
*GamesApi* | [**pokedexList**](Apis/GamesApi.http#pokedexlist) | **GET** /api/v2/pokedex/ | List pokedex
*GamesApi* | [**pokedexRetrieve**](Apis/GamesApi.http#pokedexretrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
*GamesApi* | [**versionGroupList**](Apis/GamesApi.http#versiongrouplist) | **GET** /api/v2/version-group/ | List version groups
*GamesApi* | [**versionGroupRetrieve**](Apis/GamesApi.http#versiongroupretrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
*GamesApi* | [**versionList**](Apis/GamesApi.http#versionlist) | **GET** /api/v2/version/ | List versions
*GamesApi* | [**versionRetrieve**](Apis/GamesApi.http#versionretrieve) | **GET** /api/v2/version/{id}/ | Get version
*ItemsApi* | [**itemAttributeList**](Apis/ItemsApi.http#itemattributelist) | **GET** /api/v2/item-attribute/ | List item attributes
*ItemsApi* | [**itemAttributeRetrieve**](Apis/ItemsApi.http#itemattributeretrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
*ItemsApi* | [**itemCategoryList**](Apis/ItemsApi.http#itemcategorylist) | **GET** /api/v2/item-category/ | List item categories
*ItemsApi* | [**itemCategoryRetrieve**](Apis/ItemsApi.http#itemcategoryretrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
*ItemsApi* | [**itemFlingEffectList**](Apis/ItemsApi.http#itemflingeffectlist) | **GET** /api/v2/item-fling-effect/ | List item fling effects
*ItemsApi* | [**itemFlingEffectRetrieve**](Apis/ItemsApi.http#itemflingeffectretrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
*ItemsApi* | [**itemList**](Apis/ItemsApi.http#itemlist) | **GET** /api/v2/item/ | List items
*ItemsApi* | [**itemPocketList**](Apis/ItemsApi.http#itempocketlist) | **GET** /api/v2/item-pocket/ | List item pockets
*ItemsApi* | [**itemPocketRetrieve**](Apis/ItemsApi.http#itempocketretrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
*ItemsApi* | [**itemRetrieve**](Apis/ItemsApi.http#itemretrieve) | **GET** /api/v2/item/{id}/ | Get item
*LocationApi* | [**locationAreaList**](Apis/LocationApi.http#locationarealist) | **GET** /api/v2/location-area/ | List location areas
*LocationApi* | [**locationAreaRetrieve**](Apis/LocationApi.http#locationarearetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
*LocationApi* | [**locationList**](Apis/LocationApi.http#locationlist) | **GET** /api/v2/location/ | List locations
*LocationApi* | [**locationRetrieve**](Apis/LocationApi.http#locationretrieve) | **GET** /api/v2/location/{id}/ | Get location
*LocationApi* | [**palParkAreaList**](Apis/LocationApi.http#palparkarealist) | **GET** /api/v2/pal-park-area/ | List pal park areas
*LocationApi* | [**palParkAreaRetrieve**](Apis/LocationApi.http#palparkarearetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
*LocationApi* | [**regionList**](Apis/LocationApi.http#regionlist) | **GET** /api/v2/region/ | List regions
*LocationApi* | [**regionRetrieve**](Apis/LocationApi.http#regionretrieve) | **GET** /api/v2/region/{id}/ | Get region
*MachinesApi* | [**machineList**](Apis/MachinesApi.http#machinelist) | **GET** /api/v2/machine/ | List machines
*MachinesApi* | [**machineRetrieve**](Apis/MachinesApi.http#machineretrieve) | **GET** /api/v2/machine/{id}/ | Get machine
*MovesApi* | [**moveAilmentList**](Apis/MovesApi.http#moveailmentlist) | **GET** /api/v2/move-ailment/ | List move meta ailments
*MovesApi* | [**moveAilmentRetrieve**](Apis/MovesApi.http#moveailmentretrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
*MovesApi* | [**moveBattleStyleList**](Apis/MovesApi.http#movebattlestylelist) | **GET** /api/v2/move-battle-style/ | List move battle styles
*MovesApi* | [**moveBattleStyleRetrieve**](Apis/MovesApi.http#movebattlestyleretrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
*MovesApi* | [**moveCategoryList**](Apis/MovesApi.http#movecategorylist) | **GET** /api/v2/move-category/ | List move meta categories
*MovesApi* | [**moveCategoryRetrieve**](Apis/MovesApi.http#movecategoryretrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
*MovesApi* | [**moveLearnMethodList**](Apis/MovesApi.http#movelearnmethodlist) | **GET** /api/v2/move-learn-method/ | List move learn methods
*MovesApi* | [**moveLearnMethodRetrieve**](Apis/MovesApi.http#movelearnmethodretrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
*MovesApi* | [**moveList**](Apis/MovesApi.http#movelist) | **GET** /api/v2/move/ | List moves
*MovesApi* | [**moveRetrieve**](Apis/MovesApi.http#moveretrieve) | **GET** /api/v2/move/{id}/ | Get move
*MovesApi* | [**moveTargetList**](Apis/MovesApi.http#movetargetlist) | **GET** /api/v2/move-target/ | List move targets
*MovesApi* | [**moveTargetRetrieve**](Apis/MovesApi.http#movetargetretrieve) | **GET** /api/v2/move-target/{id}/ | Get move target
*PokemonApi* | [**abilityList**](Apis/PokemonApi.http#abilitylist) | **GET** /api/v2/ability/ | 
*PokemonApi* | [**abilityRetrieve**](Apis/PokemonApi.http#abilityretrieve) | **GET** /api/v2/ability/{id}/ | 
*PokemonApi* | [**characteristicList**](Apis/PokemonApi.http#characteristiclist) | **GET** /api/v2/characteristic/ | List charecterictics
*PokemonApi* | [**characteristicRetrieve**](Apis/PokemonApi.http#characteristicretrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
*PokemonApi* | [**eggGroupList**](Apis/PokemonApi.http#egggrouplist) | **GET** /api/v2/egg-group/ | List egg groups
*PokemonApi* | [**eggGroupRetrieve**](Apis/PokemonApi.http#egggroupretrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
*PokemonApi* | [**genderList**](Apis/PokemonApi.http#genderlist) | **GET** /api/v2/gender/ | List genders
*PokemonApi* | [**genderRetrieve**](Apis/PokemonApi.http#genderretrieve) | **GET** /api/v2/gender/{id}/ | Get gender
*PokemonApi* | [**growthRateList**](Apis/PokemonApi.http#growthratelist) | **GET** /api/v2/growth-rate/ | List growth rates
*PokemonApi* | [**growthRateRetrieve**](Apis/PokemonApi.http#growthrateretrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
*PokemonApi* | [**moveDamageClassList**](Apis/PokemonApi.http#movedamageclasslist) | **GET** /api/v2/move-damage-class/ | List move damage classes
*PokemonApi* | [**moveDamageClassRetrieve**](Apis/PokemonApi.http#movedamageclassretrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
*PokemonApi* | [**natureList**](Apis/PokemonApi.http#naturelist) | **GET** /api/v2/nature/ | List natures
*PokemonApi* | [**natureRetrieve**](Apis/PokemonApi.http#natureretrieve) | **GET** /api/v2/nature/{id}/ | Get nature
*PokemonApi* | [**pokeathlonStatList**](Apis/PokemonApi.http#pokeathlonstatlist) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
*PokemonApi* | [**pokeathlonStatRetrieve**](Apis/PokemonApi.http#pokeathlonstatretrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
*PokemonApi* | [**pokemonColorList**](Apis/PokemonApi.http#pokemoncolorlist) | **GET** /api/v2/pokemon-color/ | List pokemon colors
*PokemonApi* | [**pokemonColorRetrieve**](Apis/PokemonApi.http#pokemoncolorretrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
*PokemonApi* | [**pokemonFormList**](Apis/PokemonApi.http#pokemonformlist) | **GET** /api/v2/pokemon-form/ | List pokemon forms
*PokemonApi* | [**pokemonFormRetrieve**](Apis/PokemonApi.http#pokemonformretrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
*PokemonApi* | [**pokemonHabitatList**](Apis/PokemonApi.http#pokemonhabitatlist) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
*PokemonApi* | [**pokemonHabitatRetrieve**](Apis/PokemonApi.http#pokemonhabitatretrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
*PokemonApi* | [**pokemonList**](Apis/PokemonApi.http#pokemonlist) | **GET** /api/v2/pokemon/ | List pokemon
*PokemonApi* | [**pokemonRetrieve**](Apis/PokemonApi.http#pokemonretrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
*PokemonApi* | [**pokemonShapeList**](Apis/PokemonApi.http#pokemonshapelist) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
*PokemonApi* | [**pokemonShapeRetrieve**](Apis/PokemonApi.http#pokemonshaperetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
*PokemonApi* | [**pokemonSpeciesList**](Apis/PokemonApi.http#pokemonspecieslist) | **GET** /api/v2/pokemon-species/ | List pokemon species
*PokemonApi* | [**pokemonSpeciesRetrieve**](Apis/PokemonApi.http#pokemonspeciesretrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
*PokemonApi* | [**statList**](Apis/PokemonApi.http#statlist) | **GET** /api/v2/stat/ | List stats
*PokemonApi* | [**statRetrieve**](Apis/PokemonApi.http#statretrieve) | **GET** /api/v2/stat/{id}/ | Get stat
*PokemonApi* | [**typeList**](Apis/PokemonApi.http#typelist) | **GET** /api/v2/type/ | List types
*PokemonApi* | [**typeRetrieve**](Apis/PokemonApi.http#typeretrieve) | **GET** /api/v2/type/{id}/ | Get types
*UtilityApi* | [**languageList**](Apis/UtilityApi.http#languagelist) | **GET** /api/v2/language/ | List languages
*UtilityApi* | [**languageRetrieve**](Apis/UtilityApi.http#languageretrieve) | **GET** /api/v2/language/{id}/ | Get language


## Usage

### Prerequisites

You need [IntelliJ](https://www.jetbrains.com/idea/) to be able to run those queries. More information can be found [here](https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html).
You may have some luck running queries using the [Code REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) as well, but your mileage may vary.

### Variables and Environment files

* Generally speaking, you want queries to be specific using custom variables. All variables in the `.http` files have the `` format.
* You can create [public or private environment files](https://www.jetbrains.com/help/idea/exploring-http-syntax.html#environment-variables) to dynamically replace the variables at runtime.

_Note: don't commit private environment files! They typically will contain sensitive information like API Keys._

### Customizations

If you have control over the generation of the files here, there are two main things you can do

* Select elements to replace as variables during generation. The process is case-sensitive. For example, API_KEY -> 
    * For this, run the generation with the `bodyVariables` property, followed by a "-" separated list of variables
    * Example: `--additional-properties bodyVariables=YOUR_MERCHANT_ACCOUNT-YOUR_COMPANY_ACCOUNT-YOUR_BALANCE_PLATFORM`
* Add custom headers to _all_ requests. This can be useful for example if your specifications are missing [security schemes](https://github.com/github/rest-api-description/issues/237).
    * For this, run the generation with the `customHeaders` property, followed by a "&" separated list of variables
    * Example : `--additional-properties=customHeaders="Cookie:X-API-KEY="&"Accept-Encoding=gzip"`

_This client was generated by the [jetbrains-http-client](https://openapi-generator.tech/docs/generators/jetbrains-http-client) generator of OpenAPI Generator_