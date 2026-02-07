# PokéAPI Bash client

## Overview

This is a Bash client script for accessing PokéAPI service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Make POST request with form data
$  --host <hostname> <operationId> key1:=value1 key2:=value2 key3:=23

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image

You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash

The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X

On OSX you might need to install bash-completion using Homebrew:

```shell
brew install bash-completion
```

and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh

In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.

## Documentation for API Endpoints

All URIs are relative to **

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


## Documentation For Models

 - [AbilityChange](docs/AbilityChange.md)
 - [AbilityChangeEffectText](docs/AbilityChangeEffectText.md)
 - [AbilityDetail](docs/AbilityDetail.md)
 - [AbilityDetailPokemonInner](docs/AbilityDetailPokemonInner.md)
 - [AbilityDetailPokemonInnerPokemon](docs/AbilityDetailPokemonInnerPokemon.md)
 - [AbilityEffectText](docs/AbilityEffectText.md)
 - [AbilityFlavorText](docs/AbilityFlavorText.md)
 - [AbilityName](docs/AbilityName.md)
 - [AbilitySummary](docs/AbilitySummary.md)
 - [BerryDetail](docs/BerryDetail.md)
 - [BerryDetailFlavorsInner](docs/BerryDetailFlavorsInner.md)
 - [BerryDetailFlavorsInnerFlavor](docs/BerryDetailFlavorsInnerFlavor.md)
 - [BerryFirmnessDetail](docs/BerryFirmnessDetail.md)
 - [BerryFirmnessName](docs/BerryFirmnessName.md)
 - [BerryFirmnessSummary](docs/BerryFirmnessSummary.md)
 - [BerryFlavorDetail](docs/BerryFlavorDetail.md)
 - [BerryFlavorDetailBerriesInner](docs/BerryFlavorDetailBerriesInner.md)
 - [BerryFlavorDetailBerriesInnerBerry](docs/BerryFlavorDetailBerriesInnerBerry.md)
 - [BerryFlavorName](docs/BerryFlavorName.md)
 - [BerryFlavorSummary](docs/BerryFlavorSummary.md)
 - [BerrySummary](docs/BerrySummary.md)
 - [CharacteristicDescription](docs/CharacteristicDescription.md)
 - [CharacteristicDetail](docs/CharacteristicDetail.md)
 - [CharacteristicSummary](docs/CharacteristicSummary.md)
 - [ContestEffectDetail](docs/ContestEffectDetail.md)
 - [ContestEffectEffectText](docs/ContestEffectEffectText.md)
 - [ContestEffectFlavorText](docs/ContestEffectFlavorText.md)
 - [ContestEffectSummary](docs/ContestEffectSummary.md)
 - [ContestTypeDetail](docs/ContestTypeDetail.md)
 - [ContestTypeName](docs/ContestTypeName.md)
 - [ContestTypeSummary](docs/ContestTypeSummary.md)
 - [EggGroupDetail](docs/EggGroupDetail.md)
 - [EggGroupDetailPokemonSpeciesInner](docs/EggGroupDetailPokemonSpeciesInner.md)
 - [EggGroupName](docs/EggGroupName.md)
 - [EggGroupSummary](docs/EggGroupSummary.md)
 - [EncounterConditionDetail](docs/EncounterConditionDetail.md)
 - [EncounterConditionName](docs/EncounterConditionName.md)
 - [EncounterConditionSummary](docs/EncounterConditionSummary.md)
 - [EncounterConditionValueDetail](docs/EncounterConditionValueDetail.md)
 - [EncounterConditionValueName](docs/EncounterConditionValueName.md)
 - [EncounterConditionValueSummary](docs/EncounterConditionValueSummary.md)
 - [EncounterMethodDetail](docs/EncounterMethodDetail.md)
 - [EncounterMethodName](docs/EncounterMethodName.md)
 - [EncounterMethodSummary](docs/EncounterMethodSummary.md)
 - [EvolutionChainDetail](docs/EvolutionChainDetail.md)
 - [EvolutionChainDetailChain](docs/EvolutionChainDetailChain.md)
 - [EvolutionChainDetailChainEvolvesToInner](docs/EvolutionChainDetailChainEvolvesToInner.md)
 - [EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner](docs/EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.md)
 - [EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender](docs/EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md)
 - [EvolutionChainSummary](docs/EvolutionChainSummary.md)
 - [EvolutionTriggerDetail](docs/EvolutionTriggerDetail.md)
 - [EvolutionTriggerName](docs/EvolutionTriggerName.md)
 - [EvolutionTriggerSummary](docs/EvolutionTriggerSummary.md)
 - [Experience](docs/Experience.md)
 - [GenderDetail](docs/GenderDetail.md)
 - [GenderDetailPokemonSpeciesDetailsInner](docs/GenderDetailPokemonSpeciesDetailsInner.md)
 - [GenderSummary](docs/GenderSummary.md)
 - [GenerationDetail](docs/GenerationDetail.md)
 - [GenerationName](docs/GenerationName.md)
 - [GenerationSummary](docs/GenerationSummary.md)
 - [GrowthRateDescription](docs/GrowthRateDescription.md)
 - [GrowthRateDetail](docs/GrowthRateDetail.md)
 - [GrowthRateSummary](docs/GrowthRateSummary.md)
 - [ItemAttributeDescription](docs/ItemAttributeDescription.md)
 - [ItemAttributeDetail](docs/ItemAttributeDetail.md)
 - [ItemAttributeName](docs/ItemAttributeName.md)
 - [ItemAttributeSummary](docs/ItemAttributeSummary.md)
 - [ItemCategoryDetail](docs/ItemCategoryDetail.md)
 - [ItemCategoryName](docs/ItemCategoryName.md)
 - [ItemCategorySummary](docs/ItemCategorySummary.md)
 - [ItemDetail](docs/ItemDetail.md)
 - [ItemDetailBabyTriggerFor](docs/ItemDetailBabyTriggerFor.md)
 - [ItemDetailHeldByPokemonInner](docs/ItemDetailHeldByPokemonInner.md)
 - [ItemDetailHeldByPokemonInnerVersionDetailsInner](docs/ItemDetailHeldByPokemonInnerVersionDetailsInner.md)
 - [ItemDetailMachinesInner](docs/ItemDetailMachinesInner.md)
 - [ItemDetailSprites](docs/ItemDetailSprites.md)
 - [ItemEffectText](docs/ItemEffectText.md)
 - [ItemFlavorText](docs/ItemFlavorText.md)
 - [ItemFlingEffectDetail](docs/ItemFlingEffectDetail.md)
 - [ItemFlingEffectEffectText](docs/ItemFlingEffectEffectText.md)
 - [ItemFlingEffectSummary](docs/ItemFlingEffectSummary.md)
 - [ItemGameIndex](docs/ItemGameIndex.md)
 - [ItemName](docs/ItemName.md)
 - [ItemPocketDetail](docs/ItemPocketDetail.md)
 - [ItemPocketName](docs/ItemPocketName.md)
 - [ItemPocketSummary](docs/ItemPocketSummary.md)
 - [ItemSummary](docs/ItemSummary.md)
 - [LanguageDetail](docs/LanguageDetail.md)
 - [LanguageName](docs/LanguageName.md)
 - [LanguageSummary](docs/LanguageSummary.md)
 - [LocationAreaDetail](docs/LocationAreaDetail.md)
 - [LocationAreaDetailEncounterMethodRatesInner](docs/LocationAreaDetailEncounterMethodRatesInner.md)
 - [LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner](docs/LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.md)
 - [LocationAreaDetailPokemonEncountersInner](docs/LocationAreaDetailPokemonEncountersInner.md)
 - [LocationAreaDetailPokemonEncountersInnerVersionDetailsInner](docs/LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.md)
 - [LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails](docs/LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.md)
 - [LocationAreaName](docs/LocationAreaName.md)
 - [LocationAreaSummary](docs/LocationAreaSummary.md)
 - [LocationDetail](docs/LocationDetail.md)
 - [LocationGameIndex](docs/LocationGameIndex.md)
 - [LocationName](docs/LocationName.md)
 - [LocationSummary](docs/LocationSummary.md)
 - [MachineDetail](docs/MachineDetail.md)
 - [MachineSummary](docs/MachineSummary.md)
 - [MoveBattleStyleDetail](docs/MoveBattleStyleDetail.md)
 - [MoveBattleStyleName](docs/MoveBattleStyleName.md)
 - [MoveBattleStyleSummary](docs/MoveBattleStyleSummary.md)
 - [MoveChange](docs/MoveChange.md)
 - [MoveChangeEffectEntriesInner](docs/MoveChangeEffectEntriesInner.md)
 - [MoveDamageClassDescription](docs/MoveDamageClassDescription.md)
 - [MoveDamageClassDetail](docs/MoveDamageClassDetail.md)
 - [MoveDamageClassName](docs/MoveDamageClassName.md)
 - [MoveDamageClassSummary](docs/MoveDamageClassSummary.md)
 - [MoveDetail](docs/MoveDetail.md)
 - [MoveDetailContestCombos](docs/MoveDetailContestCombos.md)
 - [MoveDetailContestCombosNormal](docs/MoveDetailContestCombosNormal.md)
 - [MoveDetailEffectChangesInner](docs/MoveDetailEffectChangesInner.md)
 - [MoveDetailEffectChangesInnerEffectEntriesInner](docs/MoveDetailEffectChangesInnerEffectEntriesInner.md)
 - [MoveDetailMachinesInner](docs/MoveDetailMachinesInner.md)
 - [MoveDetailMachinesInnerMachine](docs/MoveDetailMachinesInnerMachine.md)
 - [MoveDetailStatChangesInner](docs/MoveDetailStatChangesInner.md)
 - [MoveFlavorText](docs/MoveFlavorText.md)
 - [MoveLearnMethodDescription](docs/MoveLearnMethodDescription.md)
 - [MoveLearnMethodDetail](docs/MoveLearnMethodDetail.md)
 - [MoveLearnMethodName](docs/MoveLearnMethodName.md)
 - [MoveLearnMethodSummary](docs/MoveLearnMethodSummary.md)
 - [MoveMeta](docs/MoveMeta.md)
 - [MoveMetaAilmentDetail](docs/MoveMetaAilmentDetail.md)
 - [MoveMetaAilmentName](docs/MoveMetaAilmentName.md)
 - [MoveMetaAilmentSummary](docs/MoveMetaAilmentSummary.md)
 - [MoveMetaCategoryDescription](docs/MoveMetaCategoryDescription.md)
 - [MoveMetaCategoryDetail](docs/MoveMetaCategoryDetail.md)
 - [MoveMetaCategorySummary](docs/MoveMetaCategorySummary.md)
 - [MoveName](docs/MoveName.md)
 - [MoveSummary](docs/MoveSummary.md)
 - [MoveTargetDescription](docs/MoveTargetDescription.md)
 - [MoveTargetDetail](docs/MoveTargetDetail.md)
 - [MoveTargetName](docs/MoveTargetName.md)
 - [MoveTargetSummary](docs/MoveTargetSummary.md)
 - [NatureBattleStylePreference](docs/NatureBattleStylePreference.md)
 - [NatureDetail](docs/NatureDetail.md)
 - [NatureDetailPokeathlonStatChangesInner](docs/NatureDetailPokeathlonStatChangesInner.md)
 - [NatureName](docs/NatureName.md)
 - [NatureSummary](docs/NatureSummary.md)
 - [PaginatedAbilitySummaryList](docs/PaginatedAbilitySummaryList.md)
 - [PaginatedBerryFirmnessSummaryList](docs/PaginatedBerryFirmnessSummaryList.md)
 - [PaginatedBerryFlavorSummaryList](docs/PaginatedBerryFlavorSummaryList.md)
 - [PaginatedBerrySummaryList](docs/PaginatedBerrySummaryList.md)
 - [PaginatedCharacteristicSummaryList](docs/PaginatedCharacteristicSummaryList.md)
 - [PaginatedContestEffectSummaryList](docs/PaginatedContestEffectSummaryList.md)
 - [PaginatedContestTypeSummaryList](docs/PaginatedContestTypeSummaryList.md)
 - [PaginatedEggGroupSummaryList](docs/PaginatedEggGroupSummaryList.md)
 - [PaginatedEncounterConditionSummaryList](docs/PaginatedEncounterConditionSummaryList.md)
 - [PaginatedEncounterConditionValueSummaryList](docs/PaginatedEncounterConditionValueSummaryList.md)
 - [PaginatedEncounterMethodSummaryList](docs/PaginatedEncounterMethodSummaryList.md)
 - [PaginatedEvolutionChainSummaryList](docs/PaginatedEvolutionChainSummaryList.md)
 - [PaginatedEvolutionTriggerSummaryList](docs/PaginatedEvolutionTriggerSummaryList.md)
 - [PaginatedGenderSummaryList](docs/PaginatedGenderSummaryList.md)
 - [PaginatedGenerationSummaryList](docs/PaginatedGenerationSummaryList.md)
 - [PaginatedGrowthRateSummaryList](docs/PaginatedGrowthRateSummaryList.md)
 - [PaginatedItemAttributeSummaryList](docs/PaginatedItemAttributeSummaryList.md)
 - [PaginatedItemCategorySummaryList](docs/PaginatedItemCategorySummaryList.md)
 - [PaginatedItemFlingEffectSummaryList](docs/PaginatedItemFlingEffectSummaryList.md)
 - [PaginatedItemPocketSummaryList](docs/PaginatedItemPocketSummaryList.md)
 - [PaginatedItemSummaryList](docs/PaginatedItemSummaryList.md)
 - [PaginatedLanguageSummaryList](docs/PaginatedLanguageSummaryList.md)
 - [PaginatedLocationAreaSummaryList](docs/PaginatedLocationAreaSummaryList.md)
 - [PaginatedLocationSummaryList](docs/PaginatedLocationSummaryList.md)
 - [PaginatedMachineSummaryList](docs/PaginatedMachineSummaryList.md)
 - [PaginatedMoveBattleStyleSummaryList](docs/PaginatedMoveBattleStyleSummaryList.md)
 - [PaginatedMoveDamageClassSummaryList](docs/PaginatedMoveDamageClassSummaryList.md)
 - [PaginatedMoveLearnMethodSummaryList](docs/PaginatedMoveLearnMethodSummaryList.md)
 - [PaginatedMoveMetaAilmentSummaryList](docs/PaginatedMoveMetaAilmentSummaryList.md)
 - [PaginatedMoveMetaCategorySummaryList](docs/PaginatedMoveMetaCategorySummaryList.md)
 - [PaginatedMoveSummaryList](docs/PaginatedMoveSummaryList.md)
 - [PaginatedMoveTargetSummaryList](docs/PaginatedMoveTargetSummaryList.md)
 - [PaginatedNatureSummaryList](docs/PaginatedNatureSummaryList.md)
 - [PaginatedPalParkAreaSummaryList](docs/PaginatedPalParkAreaSummaryList.md)
 - [PaginatedPokeathlonStatSummaryList](docs/PaginatedPokeathlonStatSummaryList.md)
 - [PaginatedPokedexSummaryList](docs/PaginatedPokedexSummaryList.md)
 - [PaginatedPokemonColorSummaryList](docs/PaginatedPokemonColorSummaryList.md)
 - [PaginatedPokemonFormSummaryList](docs/PaginatedPokemonFormSummaryList.md)
 - [PaginatedPokemonHabitatSummaryList](docs/PaginatedPokemonHabitatSummaryList.md)
 - [PaginatedPokemonShapeSummaryList](docs/PaginatedPokemonShapeSummaryList.md)
 - [PaginatedPokemonSpeciesSummaryList](docs/PaginatedPokemonSpeciesSummaryList.md)
 - [PaginatedPokemonSummaryList](docs/PaginatedPokemonSummaryList.md)
 - [PaginatedRegionSummaryList](docs/PaginatedRegionSummaryList.md)
 - [PaginatedStatSummaryList](docs/PaginatedStatSummaryList.md)
 - [PaginatedSuperContestEffectSummaryList](docs/PaginatedSuperContestEffectSummaryList.md)
 - [PaginatedTypeSummaryList](docs/PaginatedTypeSummaryList.md)
 - [PaginatedVersionGroupSummaryList](docs/PaginatedVersionGroupSummaryList.md)
 - [PaginatedVersionSummaryList](docs/PaginatedVersionSummaryList.md)
 - [PalParkAreaDetail](docs/PalParkAreaDetail.md)
 - [PalParkAreaDetailPokemonEncountersInner](docs/PalParkAreaDetailPokemonEncountersInner.md)
 - [PalParkAreaName](docs/PalParkAreaName.md)
 - [PalParkAreaSummary](docs/PalParkAreaSummary.md)
 - [PokeathlonStatDetail](docs/PokeathlonStatDetail.md)
 - [PokeathlonStatDetailAffectingNatures](docs/PokeathlonStatDetailAffectingNatures.md)
 - [PokeathlonStatDetailAffectingNaturesDecreaseInner](docs/PokeathlonStatDetailAffectingNaturesDecreaseInner.md)
 - [PokeathlonStatDetailAffectingNaturesIncreaseInner](docs/PokeathlonStatDetailAffectingNaturesIncreaseInner.md)
 - [PokeathlonStatName](docs/PokeathlonStatName.md)
 - [PokeathlonStatSummary](docs/PokeathlonStatSummary.md)
 - [PokedexDescription](docs/PokedexDescription.md)
 - [PokedexDetail](docs/PokedexDetail.md)
 - [PokedexDetailPokemonEntriesInner](docs/PokedexDetailPokemonEntriesInner.md)
 - [PokedexName](docs/PokedexName.md)
 - [PokedexSummary](docs/PokedexSummary.md)
 - [PokemonColorDetail](docs/PokemonColorDetail.md)
 - [PokemonColorName](docs/PokemonColorName.md)
 - [PokemonColorSummary](docs/PokemonColorSummary.md)
 - [PokemonDetail](docs/PokemonDetail.md)
 - [PokemonDetailAbilitiesInner](docs/PokemonDetailAbilitiesInner.md)
 - [PokemonDetailCries](docs/PokemonDetailCries.md)
 - [PokemonDetailHeldItems](docs/PokemonDetailHeldItems.md)
 - [PokemonDetailMovesInner](docs/PokemonDetailMovesInner.md)
 - [PokemonDetailMovesInnerVersionGroupDetailsInner](docs/PokemonDetailMovesInnerVersionGroupDetailsInner.md)
 - [PokemonDetailPastAbilitiesInner](docs/PokemonDetailPastAbilitiesInner.md)
 - [PokemonDetailPastTypesInner](docs/PokemonDetailPastTypesInner.md)
 - [PokemonDetailSprites](docs/PokemonDetailSprites.md)
 - [PokemonDetailTypesInner](docs/PokemonDetailTypesInner.md)
 - [PokemonDexEntry](docs/PokemonDexEntry.md)
 - [PokemonEncountersRetrieve200ResponseInner](docs/PokemonEncountersRetrieve200ResponseInner.md)
 - [PokemonEncountersRetrieve200ResponseInnerLocationArea](docs/PokemonEncountersRetrieve200ResponseInnerLocationArea.md)
 - [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.md)
 - [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.md)
 - [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner.md)
 - [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod.md)
 - [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion](docs/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion.md)
 - [PokemonFormDetail](docs/PokemonFormDetail.md)
 - [PokemonFormDetailFormNamesInner](docs/PokemonFormDetailFormNamesInner.md)
 - [PokemonFormDetailSprites](docs/PokemonFormDetailSprites.md)
 - [PokemonFormSummary](docs/PokemonFormSummary.md)
 - [PokemonGameIndex](docs/PokemonGameIndex.md)
 - [PokemonHabitatDetail](docs/PokemonHabitatDetail.md)
 - [PokemonHabitatName](docs/PokemonHabitatName.md)
 - [PokemonHabitatSummary](docs/PokemonHabitatSummary.md)
 - [PokemonShapeDetail](docs/PokemonShapeDetail.md)
 - [PokemonShapeDetailAwesomeNamesInner](docs/PokemonShapeDetailAwesomeNamesInner.md)
 - [PokemonShapeDetailNamesInner](docs/PokemonShapeDetailNamesInner.md)
 - [PokemonShapeSummary](docs/PokemonShapeSummary.md)
 - [PokemonSpeciesDescription](docs/PokemonSpeciesDescription.md)
 - [PokemonSpeciesDetail](docs/PokemonSpeciesDetail.md)
 - [PokemonSpeciesDetailGeneraInner](docs/PokemonSpeciesDetailGeneraInner.md)
 - [PokemonSpeciesDetailPalParkEncountersInner](docs/PokemonSpeciesDetailPalParkEncountersInner.md)
 - [PokemonSpeciesDetailVarietiesInner](docs/PokemonSpeciesDetailVarietiesInner.md)
 - [PokemonSpeciesFlavorText](docs/PokemonSpeciesFlavorText.md)
 - [PokemonSpeciesSummary](docs/PokemonSpeciesSummary.md)
 - [PokemonStat](docs/PokemonStat.md)
 - [PokemonSummary](docs/PokemonSummary.md)
 - [RegionDetail](docs/RegionDetail.md)
 - [RegionName](docs/RegionName.md)
 - [RegionSummary](docs/RegionSummary.md)
 - [StatDetail](docs/StatDetail.md)
 - [StatDetailAffectingMoves](docs/StatDetailAffectingMoves.md)
 - [StatDetailAffectingMovesIncreaseInner](docs/StatDetailAffectingMovesIncreaseInner.md)
 - [StatDetailAffectingNatures](docs/StatDetailAffectingNatures.md)
 - [StatName](docs/StatName.md)
 - [StatSummary](docs/StatSummary.md)
 - [SuperContestEffectDetail](docs/SuperContestEffectDetail.md)
 - [SuperContestEffectFlavorText](docs/SuperContestEffectFlavorText.md)
 - [SuperContestEffectSummary](docs/SuperContestEffectSummary.md)
 - [TypeDetail](docs/TypeDetail.md)
 - [TypeDetailDamageRelations](docs/TypeDetailDamageRelations.md)
 - [TypeDetailPastDamageRelationsInner](docs/TypeDetailPastDamageRelationsInner.md)
 - [TypeDetailPastDamageRelationsInnerDamageRelations](docs/TypeDetailPastDamageRelationsInnerDamageRelations.md)
 - [TypeDetailPokemonInner](docs/TypeDetailPokemonInner.md)
 - [TypeDetailPokemonInnerPokemon](docs/TypeDetailPokemonInnerPokemon.md)
 - [TypeDetailSpritesValueValue](docs/TypeDetailSpritesValueValue.md)
 - [TypeGameIndex](docs/TypeGameIndex.md)
 - [TypeSummary](docs/TypeSummary.md)
 - [VersionDetail](docs/VersionDetail.md)
 - [VersionGroupDetail](docs/VersionGroupDetail.md)
 - [VersionGroupSummary](docs/VersionGroupSummary.md)
 - [VersionName](docs/VersionName.md)
 - [VersionSummary](docs/VersionSummary.md)


## Documentation For Authorization


## basicAuth


- **Type**: HTTP basic authentication

## cookieAuth


- **Type**: API key
- **API key parameter name**: sessionid
- **Location**: 

