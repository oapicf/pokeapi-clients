# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for  20220523 Tiny client cpp (Arduino) 

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

### AbilityApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*abilityList* | *GET* /api/v2/ability/ | .|
|*abilityRead* | *GET* /api/v2/ability/{id}/ | .|

### BerryApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*berryList* | *GET* /api/v2/berry/ | .|
|*berryRead* | *GET* /api/v2/berry/{id}/ | .|

### BerryFirmnessApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*berryFirmnessList* | *GET* /api/v2/berry-firmness/ | .|
|*berryFirmnessRead* | *GET* /api/v2/berry-firmness/{id}/ | .|

### BerryFlavorApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*berryFlavorList* | *GET* /api/v2/berry-flavor/ | .|
|*berryFlavorRead* | *GET* /api/v2/berry-flavor/{id}/ | .|

### CharacteristicApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*characteristicList* | *GET* /api/v2/characteristic/ | .|
|*characteristicRead* | *GET* /api/v2/characteristic/{id}/ | .|

### ContestEffectApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*contestEffectList* | *GET* /api/v2/contest-effect/ | .|
|*contestEffectRead* | *GET* /api/v2/contest-effect/{id}/ | .|

### ContestTypeApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*contestTypeList* | *GET* /api/v2/contest-type/ | .|
|*contestTypeRead* | *GET* /api/v2/contest-type/{id}/ | .|

### EggGroupApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*eggGroupList* | *GET* /api/v2/egg-group/ | .|
|*eggGroupRead* | *GET* /api/v2/egg-group/{id}/ | .|

### EncounterConditionApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*encounterConditionList* | *GET* /api/v2/encounter-condition/ | .|
|*encounterConditionRead* | *GET* /api/v2/encounter-condition/{id}/ | .|

### EncounterConditionValueApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*encounterConditionValueList* | *GET* /api/v2/encounter-condition-value/ | .|
|*encounterConditionValueRead* | *GET* /api/v2/encounter-condition-value/{id}/ | .|

### EncounterMethodApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*encounterMethodList* | *GET* /api/v2/encounter-method/ | .|
|*encounterMethodRead* | *GET* /api/v2/encounter-method/{id}/ | .|

### EvolutionChainApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*evolutionChainList* | *GET* /api/v2/evolution-chain/ | .|
|*evolutionChainRead* | *GET* /api/v2/evolution-chain/{id}/ | .|

### EvolutionTriggerApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*evolutionTriggerList* | *GET* /api/v2/evolution-trigger/ | .|
|*evolutionTriggerRead* | *GET* /api/v2/evolution-trigger/{id}/ | .|

### GenderApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*genderList* | *GET* /api/v2/gender/ | .|
|*genderRead* | *GET* /api/v2/gender/{id}/ | .|

### GenerationApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*generationList* | *GET* /api/v2/generation/ | .|
|*generationRead* | *GET* /api/v2/generation/{id}/ | .|

### GrowthRateApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*growthRateList* | *GET* /api/v2/growth-rate/ | .|
|*growthRateRead* | *GET* /api/v2/growth-rate/{id}/ | .|

### ItemApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*itemList* | *GET* /api/v2/item/ | .|
|*itemRead* | *GET* /api/v2/item/{id}/ | .|

### ItemAttributeApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*itemAttributeList* | *GET* /api/v2/item-attribute/ | .|
|*itemAttributeRead* | *GET* /api/v2/item-attribute/{id}/ | .|

### ItemCategoryApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*itemCategoryList* | *GET* /api/v2/item-category/ | .|
|*itemCategoryRead* | *GET* /api/v2/item-category/{id}/ | .|

### ItemFlingEffectApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*itemFlingEffectList* | *GET* /api/v2/item-fling-effect/ | .|
|*itemFlingEffectRead* | *GET* /api/v2/item-fling-effect/{id}/ | .|

### ItemPocketApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*itemPocketList* | *GET* /api/v2/item-pocket/ | .|
|*itemPocketRead* | *GET* /api/v2/item-pocket/{id}/ | .|

### LanguageApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*languageList* | *GET* /api/v2/language/ | .|
|*languageRead* | *GET* /api/v2/language/{id}/ | .|

### LocationApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*locationList* | *GET* /api/v2/location/ | .|
|*locationRead* | *GET* /api/v2/location/{id}/ | .|

### LocationAreaApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*locationAreaList* | *GET* /api/v2/location-area/ | .|
|*locationAreaRead* | *GET* /api/v2/location-area/{id}/ | .|

### MachineApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*machineList* | *GET* /api/v2/machine/ | .|
|*machineRead* | *GET* /api/v2/machine/{id}/ | .|

### MoveApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*moveList* | *GET* /api/v2/move/ | .|
|*moveRead* | *GET* /api/v2/move/{id}/ | .|

### MoveAilmentApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*moveAilmentList* | *GET* /api/v2/move-ailment/ | .|
|*moveAilmentRead* | *GET* /api/v2/move-ailment/{id}/ | .|

### MoveBattleStyleApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*moveBattleStyleList* | *GET* /api/v2/move-battle-style/ | .|
|*moveBattleStyleRead* | *GET* /api/v2/move-battle-style/{id}/ | .|

### MoveCategoryApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*moveCategoryList* | *GET* /api/v2/move-category/ | .|
|*moveCategoryRead* | *GET* /api/v2/move-category/{id}/ | .|

### MoveDamageClassApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*moveDamageClassList* | *GET* /api/v2/move-damage-class/ | .|
|*moveDamageClassRead* | *GET* /api/v2/move-damage-class/{id}/ | .|

### MoveLearnMethodApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*moveLearnMethodList* | *GET* /api/v2/move-learn-method/ | .|
|*moveLearnMethodRead* | *GET* /api/v2/move-learn-method/{id}/ | .|

### MoveTargetApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*moveTargetList* | *GET* /api/v2/move-target/ | .|
|*moveTargetRead* | *GET* /api/v2/move-target/{id}/ | .|

### NatureApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*natureList* | *GET* /api/v2/nature/ | .|
|*natureRead* | *GET* /api/v2/nature/{id}/ | .|

### PalParkAreaApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*palParkAreaList* | *GET* /api/v2/pal-park-area/ | .|
|*palParkAreaRead* | *GET* /api/v2/pal-park-area/{id}/ | .|

### PokeathlonStatApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pokeathlonStatList* | *GET* /api/v2/pokeathlon-stat/ | .|
|*pokeathlonStatRead* | *GET* /api/v2/pokeathlon-stat/{id}/ | .|

### PokedexApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pokedexList* | *GET* /api/v2/pokedex/ | .|
|*pokedexRead* | *GET* /api/v2/pokedex/{id}/ | .|

### PokemonApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pokemonList* | *GET* /api/v2/pokemon/ | .|
|*pokemonRead* | *GET* /api/v2/pokemon/{id}/ | .|

### PokemonColorApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pokemonColorList* | *GET* /api/v2/pokemon-color/ | .|
|*pokemonColorRead* | *GET* /api/v2/pokemon-color/{id}/ | .|

### PokemonFormApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pokemonFormList* | *GET* /api/v2/pokemon-form/ | .|
|*pokemonFormRead* | *GET* /api/v2/pokemon-form/{id}/ | .|

### PokemonHabitatApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pokemonHabitatList* | *GET* /api/v2/pokemon-habitat/ | .|
|*pokemonHabitatRead* | *GET* /api/v2/pokemon-habitat/{id}/ | .|

### PokemonShapeApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pokemonShapeList* | *GET* /api/v2/pokemon-shape/ | .|
|*pokemonShapeRead* | *GET* /api/v2/pokemon-shape/{id}/ | .|

### PokemonSpeciesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pokemonSpeciesList* | *GET* /api/v2/pokemon-species/ | .|
|*pokemonSpeciesRead* | *GET* /api/v2/pokemon-species/{id}/ | .|

### RegionApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*regionList* | *GET* /api/v2/region/ | .|
|*regionRead* | *GET* /api/v2/region/{id}/ | .|

### StatApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*statList* | *GET* /api/v2/stat/ | .|
|*statRead* | *GET* /api/v2/stat/{id}/ | .|

### SuperContestEffectApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*superContestEffectList* | *GET* /api/v2/super-contest-effect/ | .|
|*superContestEffectRead* | *GET* /api/v2/super-contest-effect/{id}/ | .|

### TypeApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*typeList* | *GET* /api/v2/type/ | .|
|*typeRead* | *GET* /api/v2/type/{id}/ | .|

### VersionApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*versionList* | *GET* /api/v2/version/ | .|
|*versionRead* | *GET* /api/v2/version/{id}/ | .|

### VersionGroupApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*versionGroupList* | *GET* /api/v2/version-group/ | .|
|*versionGroupRead* | *GET* /api/v2/version-group/{id}/ | .|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|

