# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for PokéAPI 2.7.0 Tiny client cpp (Arduino) 

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
|*pokemonEncountersRetrieve* | *GET* /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter.|

### EvolutionApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*evolutionChainList* | *GET* /api/v2/evolution-chain/ | List evolution chains.|
|*evolutionChainRetrieve* | *GET* /api/v2/evolution-chain/{id}/ | Get evolution chain.|
|*evolutionTriggerList* | *GET* /api/v2/evolution-trigger/ | List evolution triggers.|
|*evolutionTriggerRetrieve* | *GET* /api/v2/evolution-trigger/{id}/ | Get evolution trigger.|

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
|*abilityList* | *GET* /api/v2/ability/ | .|
|*abilityRetrieve* | *GET* /api/v2/ability/{id}/ | .|
|*characteristicList* | *GET* /api/v2/characteristic/ | List charecterictics.|
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


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*AbilityChange* | |
|*AbilityChangeEffectText* | |
|*AbilityDetail* | |
|*AbilityDetail_pokemon_inner* | |
|*AbilityDetail_pokemon_inner_pokemon* | |
|*AbilityEffectText* | |
|*AbilityFlavorText* | |
|*AbilityName* | |
|*AbilitySummary* | |
|*BerryDetail* | |
|*BerryDetail_flavors_inner* | |
|*BerryDetail_flavors_inner_flavor* | |
|*BerryFirmnessDetail* | |
|*BerryFirmnessName* | |
|*BerryFirmnessSummary* | |
|*BerryFlavorDetail* | |
|*BerryFlavorDetail_berries_inner* | |
|*BerryFlavorDetail_berries_inner_berry* | |
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
|*EggGroupDetail* | |
|*EggGroupDetail_pokemon_species_inner* | |
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
|*EvolutionChainDetail* | |
|*EvolutionChainDetail_chain* | |
|*EvolutionChainDetail_chain_evolves_to_inner* | |
|*EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner* | |
|*EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* | |
|*EvolutionChainSummary* | |
|*EvolutionTriggerDetail* | |
|*EvolutionTriggerName* | |
|*EvolutionTriggerSummary* | |
|*Experience* | |
|*GenderDetail* | |
|*GenderDetail_pokemon_species_details_inner* | |
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
|*ItemDetail_baby_trigger_for* | |
|*ItemDetail_held_by_pokemon_inner* | |
|*ItemDetail_held_by_pokemon_inner_version_details_inner* | |
|*ItemDetail_machines_inner* | |
|*ItemDetail_sprites* | |
|*ItemEffectText* | |
|*ItemFlavorText* | |
|*ItemFlingEffectDetail* | |
|*ItemFlingEffectEffectText* | |
|*ItemFlingEffectSummary* | |
|*ItemGameIndex* | |
|*ItemName* | |
|*ItemPocketDetail* | |
|*ItemPocketName* | |
|*ItemPocketSummary* | |
|*ItemSummary* | |
|*LanguageDetail* | |
|*LanguageName* | |
|*LanguageSummary* | |
|*LocationAreaDetail* | |
|*LocationAreaDetail_encounter_method_rates_inner* | |
|*LocationAreaDetail_encounter_method_rates_inner_version_details_inner* | |
|*LocationAreaDetail_pokemon_encounters_inner* | |
|*LocationAreaDetail_pokemon_encounters_inner_version_details_inner* | |
|*LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details* | |
|*LocationAreaName* | |
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
|*MoveChange_effect_entries_inner* | |
|*MoveDamageClassDescription* | |
|*MoveDamageClassDetail* | |
|*MoveDamageClassName* | |
|*MoveDamageClassSummary* | |
|*MoveDetail* | |
|*MoveDetail_contest_combos* | |
|*MoveDetail_contest_combos_normal* | |
|*MoveDetail_effect_changes_inner* | |
|*MoveDetail_effect_changes_inner_effect_entries_inner* | |
|*MoveDetail_machines_inner* | |
|*MoveDetail_machines_inner_machine* | |
|*MoveDetail_stat_changes_inner* | |
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
|*MoveName* | |
|*MoveSummary* | |
|*MoveTargetDescription* | |
|*MoveTargetDetail* | |
|*MoveTargetName* | |
|*MoveTargetSummary* | |
|*NatureBattleStylePreference* | |
|*NatureDetail* | |
|*NatureDetail_pokeathlon_stat_changes_inner* | |
|*NatureName* | |
|*NatureSummary* | |
|*PaginatedAbilitySummaryList* | |
|*PaginatedBerryFirmnessSummaryList* | |
|*PaginatedBerryFlavorSummaryList* | |
|*PaginatedBerrySummaryList* | |
|*PaginatedCharacteristicSummaryList* | |
|*PaginatedContestEffectSummaryList* | |
|*PaginatedContestTypeSummaryList* | |
|*PaginatedEggGroupSummaryList* | |
|*PaginatedEncounterConditionSummaryList* | |
|*PaginatedEncounterConditionValueSummaryList* | |
|*PaginatedEncounterMethodSummaryList* | |
|*PaginatedEvolutionChainSummaryList* | |
|*PaginatedEvolutionTriggerSummaryList* | |
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
|*PalParkAreaDetail_pokemon_encounters_inner* | |
|*PalParkAreaName* | |
|*PalParkAreaSummary* | |
|*PokeathlonStatDetail* | |
|*PokeathlonStatDetail_affecting_natures* | |
|*PokeathlonStatDetail_affecting_natures_decrease_inner* | |
|*PokeathlonStatDetail_affecting_natures_increase_inner* | |
|*PokeathlonStatName* | |
|*PokeathlonStatSummary* | |
|*PokedexDescription* | |
|*PokedexDetail* | |
|*PokedexDetail_pokemon_entries_inner* | |
|*PokedexName* | |
|*PokedexSummary* | |
|*PokemonColorDetail* | |
|*PokemonColorName* | |
|*PokemonColorSummary* | |
|*PokemonDetail* | |
|*PokemonDetail_abilities_inner* | |
|*PokemonDetail_cries* | |
|*PokemonDetail_held_items* | |
|*PokemonDetail_moves_inner* | |
|*PokemonDetail_moves_inner_version_group_details_inner* | |
|*PokemonDetail_past_abilities_inner* | |
|*PokemonDetail_past_types_inner* | |
|*PokemonDetail_sprites* | |
|*PokemonDetail_types_inner* | |
|*PokemonDexEntry* | |
|*PokemonFormDetail* | |
|*PokemonFormDetail_form_names_inner* | |
|*PokemonFormDetail_sprites* | |
|*PokemonFormSummary* | |
|*PokemonGameIndex* | |
|*PokemonHabitatDetail* | |
|*PokemonHabitatName* | |
|*PokemonHabitatSummary* | |
|*PokemonShapeDetail* | |
|*PokemonShapeDetail_awesome_names_inner* | |
|*PokemonShapeDetail_names_inner* | |
|*PokemonShapeSummary* | |
|*PokemonSpeciesDescription* | |
|*PokemonSpeciesDetail* | |
|*PokemonSpeciesDetail_genera_inner* | |
|*PokemonSpeciesDetail_pal_park_encounters_inner* | |
|*PokemonSpeciesDetail_varieties_inner* | |
|*PokemonSpeciesFlavorText* | |
|*PokemonSpeciesSummary* | |
|*PokemonStat* | |
|*PokemonSummary* | |
|*Pokemon_encounters_retrieve_200_response_inner* | |
|*Pokemon_encounters_retrieve_200_response_inner_location_area* | |
|*Pokemon_encounters_retrieve_200_response_inner_version_details_inner* | |
|*Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner* | |
|*Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner* | |
|*Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method* | |
|*Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version* | |
|*RegionDetail* | |
|*RegionName* | |
|*RegionSummary* | |
|*StatDetail* | |
|*StatDetail_affecting_moves* | |
|*StatDetail_affecting_moves_increase_inner* | |
|*StatDetail_affecting_natures* | |
|*StatName* | |
|*StatSummary* | |
|*SuperContestEffectDetail* | |
|*SuperContestEffectFlavorText* | |
|*SuperContestEffectSummary* | |
|*TypeDetail* | Serializer for the Type resource|
|*TypeDetail_damage_relations* | |
|*TypeDetail_past_damage_relations_inner* | |
|*TypeDetail_past_damage_relations_inner_damage_relations* | |
|*TypeDetail_pokemon_inner* | |
|*TypeDetail_pokemon_inner_pokemon* | |
|*TypeDetail_sprites_value_value* | |
|*TypeGameIndex* | |
|*TypeSummary* | |
|*VersionDetail* | Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink|
|*VersionGroupDetail* | |
|*VersionGroupSummary* | |
|*VersionName* | |
|*VersionSummary* | |

