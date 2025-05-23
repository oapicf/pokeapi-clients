# pokeapiclient


- API version: 20220523
  - Build date: 2025-05-10T05:53:26.596936146Z[Etc/UTC]
  - Generator version: 7.12.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

  For more information, please visit [https://github.com/oapicf/pokeapi-clients](https://github.com/oapicf/pokeapi-clients)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

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
  <groupId>com.github.oapicf</groupId>
  <artifactId>pokeapiclient</artifactId>
  <version>0.9.0-pre.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'pokeapiclient' jar has been published to maven central.
    mavenLocal()       // Needed if the 'pokeapiclient' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.github.oapicf:pokeapiclient:0.9.0-pre.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/pokeapiclient-0.9.0-pre.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.model.*;
import com.github.oapicf.pokeapiclient.api.AbilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    AbilityApi apiInstance = new AbilityApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.abilityList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AbilityApi#abilityList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://pokeapi.co*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbilityApi* | [**abilityList**](docs/AbilityApi.md#abilityList) | **GET** /api/v2/ability/ | 
*AbilityApi* | [**abilityRead**](docs/AbilityApi.md#abilityRead) | **GET** /api/v2/ability/{id}/ | 
*BerryApi* | [**berryList**](docs/BerryApi.md#berryList) | **GET** /api/v2/berry/ | 
*BerryApi* | [**berryRead**](docs/BerryApi.md#berryRead) | **GET** /api/v2/berry/{id}/ | 
*BerryFirmnessApi* | [**berryFirmnessList**](docs/BerryFirmnessApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | 
*BerryFirmnessApi* | [**berryFirmnessRead**](docs/BerryFirmnessApi.md#berryFirmnessRead) | **GET** /api/v2/berry-firmness/{id}/ | 
*BerryFlavorApi* | [**berryFlavorList**](docs/BerryFlavorApi.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | 
*BerryFlavorApi* | [**berryFlavorRead**](docs/BerryFlavorApi.md#berryFlavorRead) | **GET** /api/v2/berry-flavor/{id}/ | 
*CharacteristicApi* | [**characteristicList**](docs/CharacteristicApi.md#characteristicList) | **GET** /api/v2/characteristic/ | 
*CharacteristicApi* | [**characteristicRead**](docs/CharacteristicApi.md#characteristicRead) | **GET** /api/v2/characteristic/{id}/ | 
*ContestEffectApi* | [**contestEffectList**](docs/ContestEffectApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ | 
*ContestEffectApi* | [**contestEffectRead**](docs/ContestEffectApi.md#contestEffectRead) | **GET** /api/v2/contest-effect/{id}/ | 
*ContestTypeApi* | [**contestTypeList**](docs/ContestTypeApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | 
*ContestTypeApi* | [**contestTypeRead**](docs/ContestTypeApi.md#contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 
*EggGroupApi* | [**eggGroupList**](docs/EggGroupApi.md#eggGroupList) | **GET** /api/v2/egg-group/ | 
*EggGroupApi* | [**eggGroupRead**](docs/EggGroupApi.md#eggGroupRead) | **GET** /api/v2/egg-group/{id}/ | 
*EncounterConditionApi* | [**encounterConditionList**](docs/EncounterConditionApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | 
*EncounterConditionApi* | [**encounterConditionRead**](docs/EncounterConditionApi.md#encounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 
*EncounterConditionValueApi* | [**encounterConditionValueList**](docs/EncounterConditionValueApi.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | 
*EncounterConditionValueApi* | [**encounterConditionValueRead**](docs/EncounterConditionValueApi.md#encounterConditionValueRead) | **GET** /api/v2/encounter-condition-value/{id}/ | 
*EncounterMethodApi* | [**encounterMethodList**](docs/EncounterMethodApi.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | 
*EncounterMethodApi* | [**encounterMethodRead**](docs/EncounterMethodApi.md#encounterMethodRead) | **GET** /api/v2/encounter-method/{id}/ | 
*EvolutionChainApi* | [**evolutionChainList**](docs/EvolutionChainApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | 
*EvolutionChainApi* | [**evolutionChainRead**](docs/EvolutionChainApi.md#evolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ | 
*EvolutionTriggerApi* | [**evolutionTriggerList**](docs/EvolutionTriggerApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
*EvolutionTriggerApi* | [**evolutionTriggerRead**](docs/EvolutionTriggerApi.md#evolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 
*GenderApi* | [**genderList**](docs/GenderApi.md#genderList) | **GET** /api/v2/gender/ | 
*GenderApi* | [**genderRead**](docs/GenderApi.md#genderRead) | **GET** /api/v2/gender/{id}/ | 
*GenerationApi* | [**generationList**](docs/GenerationApi.md#generationList) | **GET** /api/v2/generation/ | 
*GenerationApi* | [**generationRead**](docs/GenerationApi.md#generationRead) | **GET** /api/v2/generation/{id}/ | 
*GrowthRateApi* | [**growthRateList**](docs/GrowthRateApi.md#growthRateList) | **GET** /api/v2/growth-rate/ | 
*GrowthRateApi* | [**growthRateRead**](docs/GrowthRateApi.md#growthRateRead) | **GET** /api/v2/growth-rate/{id}/ | 
*ItemApi* | [**itemList**](docs/ItemApi.md#itemList) | **GET** /api/v2/item/ | 
*ItemApi* | [**itemRead**](docs/ItemApi.md#itemRead) | **GET** /api/v2/item/{id}/ | 
*ItemAttributeApi* | [**itemAttributeList**](docs/ItemAttributeApi.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | 
*ItemAttributeApi* | [**itemAttributeRead**](docs/ItemAttributeApi.md#itemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ | 
*ItemCategoryApi* | [**itemCategoryList**](docs/ItemCategoryApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | 
*ItemCategoryApi* | [**itemCategoryRead**](docs/ItemCategoryApi.md#itemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 
*ItemFlingEffectApi* | [**itemFlingEffectList**](docs/ItemFlingEffectApi.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | 
*ItemFlingEffectApi* | [**itemFlingEffectRead**](docs/ItemFlingEffectApi.md#itemFlingEffectRead) | **GET** /api/v2/item-fling-effect/{id}/ | 
*ItemPocketApi* | [**itemPocketList**](docs/ItemPocketApi.md#itemPocketList) | **GET** /api/v2/item-pocket/ | 
*ItemPocketApi* | [**itemPocketRead**](docs/ItemPocketApi.md#itemPocketRead) | **GET** /api/v2/item-pocket/{id}/ | 
*LanguageApi* | [**languageList**](docs/LanguageApi.md#languageList) | **GET** /api/v2/language/ | 
*LanguageApi* | [**languageRead**](docs/LanguageApi.md#languageRead) | **GET** /api/v2/language/{id}/ | 
*LocationApi* | [**locationList**](docs/LocationApi.md#locationList) | **GET** /api/v2/location/ | 
*LocationApi* | [**locationRead**](docs/LocationApi.md#locationRead) | **GET** /api/v2/location/{id}/ | 
*LocationAreaApi* | [**locationAreaList**](docs/LocationAreaApi.md#locationAreaList) | **GET** /api/v2/location-area/ | 
*LocationAreaApi* | [**locationAreaRead**](docs/LocationAreaApi.md#locationAreaRead) | **GET** /api/v2/location-area/{id}/ | 
*MachineApi* | [**machineList**](docs/MachineApi.md#machineList) | **GET** /api/v2/machine/ | 
*MachineApi* | [**machineRead**](docs/MachineApi.md#machineRead) | **GET** /api/v2/machine/{id}/ | 
*MoveApi* | [**moveList**](docs/MoveApi.md#moveList) | **GET** /api/v2/move/ | 
*MoveApi* | [**moveRead**](docs/MoveApi.md#moveRead) | **GET** /api/v2/move/{id}/ | 
*MoveAilmentApi* | [**moveAilmentList**](docs/MoveAilmentApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | 
*MoveAilmentApi* | [**moveAilmentRead**](docs/MoveAilmentApi.md#moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 
*MoveBattleStyleApi* | [**moveBattleStyleList**](docs/MoveBattleStyleApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
*MoveBattleStyleApi* | [**moveBattleStyleRead**](docs/MoveBattleStyleApi.md#moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 
*MoveCategoryApi* | [**moveCategoryList**](docs/MoveCategoryApi.md#moveCategoryList) | **GET** /api/v2/move-category/ | 
*MoveCategoryApi* | [**moveCategoryRead**](docs/MoveCategoryApi.md#moveCategoryRead) | **GET** /api/v2/move-category/{id}/ | 
*MoveDamageClassApi* | [**moveDamageClassList**](docs/MoveDamageClassApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
*MoveDamageClassApi* | [**moveDamageClassRead**](docs/MoveDamageClassApi.md#moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 
*MoveLearnMethodApi* | [**moveLearnMethodList**](docs/MoveLearnMethodApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | 
*MoveLearnMethodApi* | [**moveLearnMethodRead**](docs/MoveLearnMethodApi.md#moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ | 
*MoveTargetApi* | [**moveTargetList**](docs/MoveTargetApi.md#moveTargetList) | **GET** /api/v2/move-target/ | 
*MoveTargetApi* | [**moveTargetRead**](docs/MoveTargetApi.md#moveTargetRead) | **GET** /api/v2/move-target/{id}/ | 
*NatureApi* | [**natureList**](docs/NatureApi.md#natureList) | **GET** /api/v2/nature/ | 
*NatureApi* | [**natureRead**](docs/NatureApi.md#natureRead) | **GET** /api/v2/nature/{id}/ | 
*PalParkAreaApi* | [**palParkAreaList**](docs/PalParkAreaApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | 
*PalParkAreaApi* | [**palParkAreaRead**](docs/PalParkAreaApi.md#palParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ | 
*PokeathlonStatApi* | [**pokeathlonStatList**](docs/PokeathlonStatApi.md#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | 
*PokeathlonStatApi* | [**pokeathlonStatRead**](docs/PokeathlonStatApi.md#pokeathlonStatRead) | **GET** /api/v2/pokeathlon-stat/{id}/ | 
*PokedexApi* | [**pokedexList**](docs/PokedexApi.md#pokedexList) | **GET** /api/v2/pokedex/ | 
*PokedexApi* | [**pokedexRead**](docs/PokedexApi.md#pokedexRead) | **GET** /api/v2/pokedex/{id}/ | 
*PokemonApi* | [**pokemonList**](docs/PokemonApi.md#pokemonList) | **GET** /api/v2/pokemon/ | 
*PokemonApi* | [**pokemonRead**](docs/PokemonApi.md#pokemonRead) | **GET** /api/v2/pokemon/{id}/ | 
*PokemonColorApi* | [**pokemonColorList**](docs/PokemonColorApi.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | 
*PokemonColorApi* | [**pokemonColorRead**](docs/PokemonColorApi.md#pokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 
*PokemonFormApi* | [**pokemonFormList**](docs/PokemonFormApi.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | 
*PokemonFormApi* | [**pokemonFormRead**](docs/PokemonFormApi.md#pokemonFormRead) | **GET** /api/v2/pokemon-form/{id}/ | 
*PokemonHabitatApi* | [**pokemonHabitatList**](docs/PokemonHabitatApi.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | 
*PokemonHabitatApi* | [**pokemonHabitatRead**](docs/PokemonHabitatApi.md#pokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ | 
*PokemonShapeApi* | [**pokemonShapeList**](docs/PokemonShapeApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | 
*PokemonShapeApi* | [**pokemonShapeRead**](docs/PokemonShapeApi.md#pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ | 
*PokemonSpeciesApi* | [**pokemonSpeciesList**](docs/PokemonSpeciesApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | 
*PokemonSpeciesApi* | [**pokemonSpeciesRead**](docs/PokemonSpeciesApi.md#pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ | 
*RegionApi* | [**regionList**](docs/RegionApi.md#regionList) | **GET** /api/v2/region/ | 
*RegionApi* | [**regionRead**](docs/RegionApi.md#regionRead) | **GET** /api/v2/region/{id}/ | 
*StatApi* | [**statList**](docs/StatApi.md#statList) | **GET** /api/v2/stat/ | 
*StatApi* | [**statRead**](docs/StatApi.md#statRead) | **GET** /api/v2/stat/{id}/ | 
*SuperContestEffectApi* | [**superContestEffectList**](docs/SuperContestEffectApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
*SuperContestEffectApi* | [**superContestEffectRead**](docs/SuperContestEffectApi.md#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 
*TypeApi* | [**typeList**](docs/TypeApi.md#typeList) | **GET** /api/v2/type/ | 
*TypeApi* | [**typeRead**](docs/TypeApi.md#typeRead) | **GET** /api/v2/type/{id}/ | 
*VersionApi* | [**versionList**](docs/VersionApi.md#versionList) | **GET** /api/v2/version/ | 
*VersionApi* | [**versionRead**](docs/VersionApi.md#versionRead) | **GET** /api/v2/version/{id}/ | 
*VersionGroupApi* | [**versionGroupList**](docs/VersionGroupApi.md#versionGroupList) | **GET** /api/v2/version-group/ | 
*VersionGroupApi* | [**versionGroupRead**](docs/VersionGroupApi.md#versionGroupRead) | **GET** /api/v2/version-group/{id}/ | 


## Documentation for Models



<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

blah+oapicf@cliffano.com

