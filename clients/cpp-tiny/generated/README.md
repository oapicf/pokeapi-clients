# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for PokéAPI 2.10.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://pokeapi.cohttps://pokeapi.co

### BerriesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*berryFirmnessList* | *GET* /api/v2/berry-firmness/ | List berry firmness.|
|*berryFirmnessRetrieve* | *GET* /api/v2/berry-firmness/{id}/ | Get berry by firmness.|
|*berryFlavorList* | *GET* /api/v2/berry-flavor/ | List berry flavors.|
|*berryFlavorRetrieve* | *GET* /api/v2/berry-flavor/{id}/ | Get berries by flavor.|
|*berryList* | *GET* /api/v2/berry/ | List berries.|
|*berryRetrieve* | *GET* /api/v2/berry/{id}/ | Get a berry.|

### ContestsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*contestEffectList* | *GET* /api/v2/contest-effect/ | List contest effects.|
|*contestEffectRetrieve* | *GET* /api/v2/contest-effect/{id}/ | Get contest effect.|
|*contestTypeList* | *GET* /api/v2/contest-type/ | List contest types.|
|*contestTypeRetrieve* | *GET* /api/v2/contest-type/{id}/ | Get contest type.|
|*superContestEffectList* | *GET* /api/v2/super-contest-effect/ | List super contest effects.|
|*superContestEffectRetrieve* | *GET* /api/v2/super-contest-effect/{id}/ | Get super contest effect.|

### EncountersApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*encounterConditionList* | *GET* /api/v2/encounter-condition/ | List encounter conditions.|
|*encounterConditionRetrieve* | *GET* /api/v2/encounter-condition/{id}/ | Get encounter condition.|
|*encounterConditionValueList* | *GET* /api/v2/encounter-condition-value/ | List encounter condition values.|
|*encounterConditionValueRetrieve* | *GET* /api/v2/encounter-condition-value/{id}/ | Get encounter condition value.|
|*encounterMethodList* | *GET* /api/v2/encounter-method/ | List encounter methods.|
|*encounterMethodRetrieve* | *GET* /api/v2/encounter-method/{id}/ | Get encounter method.|

### EvolutionApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*evolutionChainList* | *GET* /api/v2/evolution-chain/ | List evolution chains.|
|*evolutionChainRetrieve* | *GET* /api/v2/evolution-chain/{id}/ | Get evolution chain.|
|*evolutionTriggerList* | *GET* /api/v2/evolution-trigger/ | List evolution triggers.|
|*evolutionTriggerRetrieve* | *GET* /api/v2/evolution-trigger/{id}/ | Get evolution trigger.|
|*evolutionVariableList* | *GET* /api/v2/evolution-variable/ | List evolution variables.|
|*evolutionVariableRetrieve* | *GET* /api/v2/evolution-variable/{id}/ | Get evolution variable.|

### GamesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*generationList* | *GET* /api/v2/generation/ | List genrations.|
|*generationRetrieve* | *GET* /api/v2/generation/{id}/ | Get genration.|
|*pokedexList* | *GET* /api/v2/pokedex/ | List pokedex.|
|*pokedexRetrieve* | *GET* /api/v2/pokedex/{id}/ | Get pokedex.|
|*versionGroupList* | *GET* /api/v2/version-group/ | List version groups.|
|*versionGroupRetrieve* | *GET* /api/v2/version-group/{id}/ | Get version group.|
|*versionList* | *GET* /api/v2/version/ | List versions.|
|*versionRetrieve* | *GET* /api/v2/version/{id}/ | Get version.|

### ItemsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*currencyList* | *GET* /api/v2/currency/ | List currencies.|
|*currencyRetrieve* | *GET* /api/v2/currency/{id}/ | Get currency.|
|*itemAttributeList* | *GET* /api/v2/item-attribute/ | List item attributes.|
|*itemAttributeRetrieve* | *GET* /api/v2/item-attribute/{id}/ | Get item attribute.|
|*itemCategoryList* | *GET* /api/v2/item-category/ | List item categories.|
|*itemCategoryRetrieve* | *GET* /api/v2/item-category/{id}/ | Get item category.|
|*itemFlingEffectList* | *GET* /api/v2/item-fling-effect/ | List item fling effects.|
|*itemFlingEffectRetrieve* | *GET* /api/v2/item-fling-effect/{id}/ | Get item fling effect.|
|*itemList* | *GET* /api/v2/item/ | List items.|
|*itemPocketList* | *GET* /api/v2/item-pocket/ | List item pockets.|
|*itemPocketRetrieve* | *GET* /api/v2/item-pocket/{id}/ | Get item pocket.|
|*itemRetrieve* | *GET* /api/v2/item/{id}/ | Get item.|

### LocationApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*locationAreaList* | *GET* /api/v2/location-area/ | List location areas.|
|*locationAreaRetrieve* | *GET* /api/v2/location-area/{id}/ | Get location area.|
|*locationList* | *GET* /api/v2/location/ | List locations.|
|*locationRetrieve* | *GET* /api/v2/location/{id}/ | Get location.|
|*palParkAreaList* | *GET* /api/v2/pal-park-area/ | List pal park areas.|
|*palParkAreaRetrieve* | *GET* /api/v2/pal-park-area/{id}/ | Get pal park area.|
|*regionList* | *GET* /api/v2/region/ | List regions.|
|*regionRetrieve* | *GET* /api/v2/region/{id}/ | Get region.|

### MachinesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*machineList* | *GET* /api/v2/machine/ | List machines.|
|*machineRetrieve* | *GET* /api/v2/machine/{id}/ | Get machine.|

### MovesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*moveAilmentList* | *GET* /api/v2/move-ailment/ | List move meta ailments.|
|*moveAilmentRetrieve* | *GET* /api/v2/move-ailment/{id}/ | Get move meta ailment.|
|*moveBattleStyleList* | *GET* /api/v2/move-battle-style/ | List move battle styles.|
|*moveBattleStyleRetrieve* | *GET* /api/v2/move-battle-style/{id}/ | Get move battle style.|
|*moveCategoryList* | *GET* /api/v2/move-category/ | List move meta categories.|
|*moveCategoryRetrieve* | *GET* /api/v2/move-category/{id}/ | Get move meta category.|
|*moveLearnMethodList* | *GET* /api/v2/move-learn-method/ | List move learn methods.|
|*moveLearnMethodRetrieve* | *GET* /api/v2/move-learn-method/{id}/ | Get move learn method.|
|*moveList* | *GET* /api/v2/move/ | List moves.|
|*moveRetrieve* | *GET* /api/v2/move/{id}/ | Get move.|
|*moveTargetList* | *GET* /api/v2/move-target/ | List move targets.|
|*moveTargetRetrieve* | *GET* /api/v2/move-target/{id}/ | Get move target.|

### PokemonApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*abilityList* | *GET* /api/v2/ability/ | List abilities.|
|*abilityRetrieve* | *GET* /api/v2/ability/{id}/ | Get ability.|
|*characteristicList* | *GET* /api/v2/characteristic/ | List characteristics.|
|*characteristicRetrieve* | *GET* /api/v2/characteristic/{id}/ | Get characteristic.|
|*eggGroupList* | *GET* /api/v2/egg-group/ | List egg groups.|
|*eggGroupRetrieve* | *GET* /api/v2/egg-group/{id}/ | Get egg group.|
|*genderList* | *GET* /api/v2/gender/ | List genders.|
|*genderRetrieve* | *GET* /api/v2/gender/{id}/ | Get gender.|
|*growthRateList* | *GET* /api/v2/growth-rate/ | List growth rates.|
|*growthRateRetrieve* | *GET* /api/v2/growth-rate/{id}/ | Get growth rate.|
|*moveDamageClassList* | *GET* /api/v2/move-damage-class/ | List move damage classes.|
|*moveDamageClassRetrieve* | *GET* /api/v2/move-damage-class/{id}/ | Get move damage class.|
|*natureList* | *GET* /api/v2/nature/ | List natures.|
|*natureRetrieve* | *GET* /api/v2/nature/{id}/ | Get nature.|
|*pokeathlonStatList* | *GET* /api/v2/pokeathlon-stat/ | List pokeathlon stats.|
|*pokeathlonStatRetrieve* | *GET* /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat.|
|*pokemonColorList* | *GET* /api/v2/pokemon-color/ | List pokemon colors.|
|*pokemonColorRetrieve* | *GET* /api/v2/pokemon-color/{id}/ | Get pokemon color.|
|*pokemonFormList* | *GET* /api/v2/pokemon-form/ | List pokemon forms.|
|*pokemonFormRetrieve* | *GET* /api/v2/pokemon-form/{id}/ | Get pokemon form.|
|*pokemonHabitatList* | *GET* /api/v2/pokemon-habitat/ | List pokemom habitas.|
|*pokemonHabitatRetrieve* | *GET* /api/v2/pokemon-habitat/{id}/ | Get pokemom habita.|
|*pokemonList* | *GET* /api/v2/pokemon/ | List pokemon.|
|*pokemonRetrieve* | *GET* /api/v2/pokemon/{id}/ | Get pokemon.|
|*pokemonShapeList* | *GET* /api/v2/pokemon-shape/ | List pokemon shapes.|
|*pokemonShapeRetrieve* | *GET* /api/v2/pokemon-shape/{id}/ | Get pokemon shape.|
|*pokemonSpeciesList* | *GET* /api/v2/pokemon-species/ | List pokemon species.|
|*pokemonSpeciesRetrieve* | *GET* /api/v2/pokemon-species/{id}/ | Get pokemon species.|
|*statList* | *GET* /api/v2/stat/ | List stats.|
|*statRetrieve* | *GET* /api/v2/stat/{id}/ | Get stat.|
|*typeList* | *GET* /api/v2/type/ | List types.|
|*typeRetrieve* | *GET* /api/v2/type/{id}/ | Get types.|

### UtilityApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*languageList* | *GET* /api/v2/language/ | List languages.|
|*languageRetrieve* | *GET* /api/v2/language/{id}/ | Get language.|
|*metaRetrieve* | *GET* /api/v2/meta/ | Get API metadata.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*AbilityChange* | |
|*AbilityChangeEffectText* | |
|*AbilityDetail* | |
|*AbilityEffectText* | |
|*AbilityFlavorText* | |
|*AbilityName* | |
|*AbilityPokemonDetail* | |
|*AbilitySummary* | |
|*BerryDetail* | |
|*BerryFirmnessDetail* | |
|*BerryFirmnessName* | |
|*BerryFirmnessSummary* | |
|*BerryFlavorBerryMap* | |
|*BerryFlavorDetail* | |
|*BerryFlavorMap* | |
|*BerryFlavorName* | |
|*BerryFlavorSummary* | |
|*BerrySummary* | |
|*CharacteristicDescription* | |
|*CharacteristicDetail* | |
|*CharacteristicSummary* | |
|*ContestEffectDetail* | |
|*ContestEffectEffectText* | |
|*ContestEffectFlavorText* | |
|*ContestEffectSummary* | |
|*ContestTypeDetail* | |
|*ContestTypeName* | |
|*ContestTypeSummary* | |
|*CurrencyDetail* | |
|*CurrencyName* | |
|*CurrencySummary* | |
|*EggGroupDetail* | |
|*EggGroupName* | |
|*EggGroupSummary* | |
|*EncounterConditionDetail* | |
|*EncounterConditionName* | |
|*EncounterConditionSummary* | |
|*EncounterConditionValueDetail* | |
|*EncounterConditionValueName* | |
|*EncounterConditionValueSummary* | |
|*EncounterMethodDetail* | |
|*EncounterMethodName* | |
|*EncounterMethodSummary* | |
|*EncounterPokemonDetail* | |
|*EvolutionChainDetail* | |
|*EvolutionChainLink* | |
|*EvolutionChainSummary* | |
|*EvolutionConditionExpression* | |
|*EvolutionTriggerDetail* | |
|*EvolutionTriggerName* | |
|*EvolutionTriggerSummary* | |
|*EvolutionVariableDescription* | |
|*EvolutionVariableDetail* | |
|*EvolutionVariableName* | |
|*EvolutionVariableSummary* | |
|*Experience* | |
|*GenderDetail* | |
|*GenderPokemonSpecies* | |
|*GenderSummary* | |
|*GenerationDetail* | |
|*GenerationName* | |
|*GenerationSummary* | |
|*GrowthRateDescription* | |
|*GrowthRateDetail* | |
|*GrowthRateSummary* | |
|*ItemAttributeDescription* | |
|*ItemAttributeDetail* | |
|*ItemAttributeName* | |
|*ItemAttributeSummary* | |
|*ItemCategoryDetail* | |
|*ItemCategoryName* | |
|*ItemCategorySummary* | |
|*ItemDetail* | |
|*ItemEffectText* | |
|*ItemFlavorText* | |
|*ItemFlingEffectDetail* | |
|*ItemFlingEffectEffectText* | |
|*ItemFlingEffectSummary* | |
|*ItemGameIndex* | |
|*ItemMachine* | |
|*ItemName* | |
|*ItemPocketDetail* | |
|*ItemPocketName* | |
|*ItemPocketSummary* | |
|*ItemPrice* | |
|*ItemSprites* | |
|*ItemSummary* | |
|*LanguageDetail* | |
|*LanguageName* | |
|*LanguageSummary* | |
|*LocationAreaDetail* | |
|*LocationAreaEncounterDetail* | |
|*LocationAreaEncounterRate* | |
|*LocationAreaEncounterVersionDetail* | |
|*LocationAreaName* | |
|*LocationAreaPokemonEncounter* | |
|*LocationAreaPokemonEncounterVersion* | |
|*LocationAreaSummary* | |
|*LocationDetail* | |
|*LocationGameIndex* | |
|*LocationName* | |
|*LocationSummary* | |
|*MachineDetail* | |
|*MachineSummary* | |
|*MoveBattleStyleDetail* | |
|*MoveBattleStyleName* | |
|*MoveBattleStyleSummary* | |
|*MoveChange* | |
|*MoveComboUsage* | |
|*MoveCombos* | |
|*MoveDamageClassDescription* | |
|*MoveDamageClassDetail* | |
|*MoveDamageClassName* | |
|*MoveDamageClassSummary* | |
|*MoveDetail* | |
|*MoveEffectChange* | |
|*MoveEffectChangeEffectText* | |
|*MoveEffectEffectText* | |
|*MoveFlavorText* | |
|*MoveLearnMethodDescription* | |
|*MoveLearnMethodDetail* | |
|*MoveLearnMethodName* | |
|*MoveLearnMethodSummary* | |
|*MoveMeta* | |
|*MoveMetaAilmentDetail* | |
|*MoveMetaAilmentName* | |
|*MoveMetaAilmentSummary* | |
|*MoveMetaCategoryDescription* | |
|*MoveMetaCategoryDetail* | |
|*MoveMetaCategorySummary* | |
|*MoveMetaStatChange* | |
|*MoveName* | |
|*MoveStatChange* | |
|*MoveSummary* | |
|*MoveTargetDescription* | |
|*MoveTargetDetail* | |
|*MoveTargetName* | |
|*MoveTargetSummary* | |
|*NatureBattleStylePreference* | |
|*NatureDetail* | |
|*NatureName* | |
|*NaturePokeathlonStat* | |
|*NatureSummary* | |
|*PaginatedAbilitySummaryList* | |
|*PaginatedBerryFirmnessSummaryList* | |
|*PaginatedBerryFlavorSummaryList* | |
|*PaginatedBerrySummaryList* | |
|*PaginatedCharacteristicSummaryList* | |
|*PaginatedContestEffectSummaryList* | |
|*PaginatedContestTypeSummaryList* | |
|*PaginatedCurrencySummaryList* | |
|*PaginatedEggGroupSummaryList* | |
|*PaginatedEncounterConditionSummaryList* | |
|*PaginatedEncounterConditionValueSummaryList* | |
|*PaginatedEncounterMethodSummaryList* | |
|*PaginatedEvolutionChainSummaryList* | |
|*PaginatedEvolutionTriggerSummaryList* | |
|*PaginatedEvolutionVariableSummaryList* | |
|*PaginatedGenderSummaryList* | |
|*PaginatedGenerationSummaryList* | |
|*PaginatedGrowthRateSummaryList* | |
|*PaginatedItemAttributeSummaryList* | |
|*PaginatedItemCategorySummaryList* | |
|*PaginatedItemFlingEffectSummaryList* | |
|*PaginatedItemPocketSummaryList* | |
|*PaginatedItemSummaryList* | |
|*PaginatedLanguageSummaryList* | |
|*PaginatedLocationAreaSummaryList* | |
|*PaginatedLocationSummaryList* | |
|*PaginatedMachineSummaryList* | |
|*PaginatedMoveBattleStyleSummaryList* | |
|*PaginatedMoveDamageClassSummaryList* | |
|*PaginatedMoveLearnMethodSummaryList* | |
|*PaginatedMoveMetaAilmentSummaryList* | |
|*PaginatedMoveMetaCategorySummaryList* | |
|*PaginatedMoveSummaryList* | |
|*PaginatedMoveTargetSummaryList* | |
|*PaginatedNatureSummaryList* | |
|*PaginatedPalParkAreaSummaryList* | |
|*PaginatedPokeathlonStatSummaryList* | |
|*PaginatedPokedexSummaryList* | |
|*PaginatedPokemonColorSummaryList* | |
|*PaginatedPokemonFormSummaryList* | |
|*PaginatedPokemonHabitatSummaryList* | |
|*PaginatedPokemonShapeSummaryList* | |
|*PaginatedPokemonSpeciesSummaryList* | |
|*PaginatedPokemonSummaryList* | |
|*PaginatedRegionSummaryList* | |
|*PaginatedStatSummaryList* | |
|*PaginatedSuperContestEffectSummaryList* | |
|*PaginatedTypeSummaryList* | |
|*PaginatedVersionGroupSummaryList* | |
|*PaginatedVersionSummaryList* | |
|*PalParkAreaDetail* | |
|*PalParkAreaName* | |
|*PalParkAreaSummary* | |
|*PalParkEncounter* | |
|*PokeapiMetaResponse* | |
|*PokeathlonStatAffectingNature* | |
|*PokeathlonStatAffectingNatures* | |
|*PokeathlonStatDetail* | |
|*PokeathlonStatName* | |
|*PokeathlonStatSummary* | |
|*PokedexDescription* | |
|*PokedexDetail* | |
|*PokedexName* | |
|*PokedexSummary* | |
|*PokemonAbility* | |
|*PokemonAbilityPast* | |
|*PokemonColorDetail* | |
|*PokemonColorName* | |
|*PokemonColorSummary* | |
|*PokemonCries* | |
|*PokemonDetail* | |
|*PokemonDexEntry* | |
|*PokemonDexNumber* | |
|*PokemonEncounterDetailResponse* | |
|*PokemonEncounterResponse* | |
|*PokemonEncounterVersionDetailResponse* | |
|*PokemonEvolution* | |
|*PokemonEvolution_known_move* | |
|*PokemonFormDetail* | |
|*PokemonFormFlavorText* | |
|*PokemonFormName* | |
|*PokemonFormSprites* | |
|*PokemonFormSummary* | |
|*PokemonFormTriggerCondition* | |
|*PokemonFormType* | |
|*PokemonGameIndex* | |
|*PokemonHabitatDetail* | |
|*PokemonHabitatName* | |
|*PokemonHabitatSummary* | |
|*PokemonHeldItem* | |
|*PokemonHeldItemSummary* | |
|*PokemonHeldItemVersion* | |
|*PokemonMove* | |
|*PokemonMoveVersionGroup* | |
|*PokemonPastAbility* | |
|*PokemonPastStat* | |
|*PokemonPastType* | |
|*PokemonShapeAwesomeName* | |
|*PokemonShapeDetail* | |
|*PokemonShapeName* | |
|*PokemonShapeSummary* | |
|*PokemonSpeciesDescription* | |
|*PokemonSpeciesDetail* | |
|*PokemonSpeciesFlavorText* | |
|*PokemonSpeciesGenus* | |
|*PokemonSpeciesName* | |
|*PokemonSpeciesPalParkEncounter* | |
|*PokemonSpeciesSummary* | |
|*PokemonSpeciesVariety* | |
|*PokemonSprites* | |
|*PokemonSpritesOther* | |
|*PokemonSpritesOtherDreamWorld* | |
|*PokemonSpritesOtherHome* | |
|*PokemonSpritesOtherOfficialArtwork* | |
|*PokemonSpritesOtherShowdown* | |
|*PokemonStat* | |
|*PokemonSummary* | |
|*PokemonType* | |
|*RegionDetail* | |
|*RegionName* | |
|*RegionSummary* | |
|*StatAffectingMoves* | |
|*StatAffectingNatures* | |
|*StatDetail* | |
|*StatName* | |
|*StatSummary* | |
|*SuperContestEffectDetail* | |
|*SuperContestEffectFlavorText* | |
|*SuperContestEffectSummary* | |
|*TypeDetail* | Serializer for the Type resource|
|*TypeGameIndex* | |
|*TypeGameSprite* | |
|*TypeName* | |
|*TypePastRelationships* | |
|*TypePokemon* | |
|*TypeRelationships* | |
|*TypeSummary* | |
|*VersionDetail* | Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink|
|*VersionGroupDetail* | |
|*VersionGroupSummary* | |
|*VersionName* | |
|*VersionSummary* | |

