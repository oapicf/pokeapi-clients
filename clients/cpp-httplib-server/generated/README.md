# cpp-httplib-server - C++ Server

## Overview

This server was generated using the [OpenAPI Generator](https://openapi-generator.tech) project.
It uses the [cpp-httplib](https://github.com/yhirose/cpp-httplib) library to implement a lightweight HTTP server
with JSON request/response handling via [nlohmann/json](https://github.com/nlohmann/json).

## Requirements

- C++17 compatible compiler
- CMake (3.14 or higher)
- OpenSSL (for HTTPS support)
- ZLIB (for compression support)

**Note:** The following libraries are automatically downloaded via CMake FetchContent:
- [cpp-httplib](https://github.com/yhirose/cpp-httplib) v0.15.3
- [nlohmann/json](https://github.com/nlohmann/json) v3.11.3

### Platform-Specific Installation

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get update
sudo apt-get install -y libssl-dev zlib1g-dev cmake build-essential
```

**macOS:**
```bash
brew install openssl zlib cmake
```

**Windows:**
```powershell
# Using vcpkg
vcpkg install openssl:x64-windows zlib:x64-windows

# Then configure CMake with vcpkg toolchain:
cmake -B build -DCMAKE_TOOLCHAIN_FILE=[vcpkg_root]/scripts/buildsystems/vcpkg.cmake
```

## Project Structure

```
├── CMakeLists.txt          # Project build configuration
├── README.md               # This file
├── models/                  # Generated model classes
└── api/                    # Generated API handler classes
```

## Building the Project

```bash
mkdir build
cd build
cmake ..
make
```

## Working with Models

### Model Classes

#### models::AbilityChange

```cpp
// Create a model
auto model = models::AbilityChange();
model.setVersionGroup(/* value */);  // Set version_group
model.setEffectEntries(/* value */);  // Set effect_entries

// Serialize to JSON
nlohmann::json json = models::AbilityChange::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AbilityChange::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AbilityChangeEffectText

```cpp
// Create a model
auto model = models::AbilityChangeEffectText();
model.setEffect(/* value */);  // Set effect
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::AbilityChangeEffectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AbilityChangeEffectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AbilityDetail

```cpp
// Create a model
auto model = models::AbilityDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setIsMainSeries(/* value */);  // Set is_main_series
model.setGeneration(/* value */);  // Set generation
model.setNames(/* value */);  // Set names
model.setEffectEntries(/* value */);  // Set effect_entries
model.setEffectChanges(/* value */);  // Set effect_changes
model.setFlavorTextEntries(/* value */);  // Set flavor_text_entries
model.setPokemon(/* value */);  // Set pokemon

// Serialize to JSON
nlohmann::json json = models::AbilityDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AbilityDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AbilityEffectText

```cpp
// Create a model
auto model = models::AbilityEffectText();
model.setEffect(/* value */);  // Set effect
model.setShortEffect(/* value */);  // Set short_effect
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::AbilityEffectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AbilityEffectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AbilityFlavorText

```cpp
// Create a model
auto model = models::AbilityFlavorText();
model.setFlavorText(/* value */);  // Set flavor_text
model.setLanguage(/* value */);  // Set language
model.setVersionGroup(/* value */);  // Set version_group

// Serialize to JSON
nlohmann::json json = models::AbilityFlavorText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AbilityFlavorText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AbilityName

```cpp
// Create a model
auto model = models::AbilityName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::AbilityName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AbilityName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AbilityPokemonDetail

```cpp
// Create a model
auto model = models::AbilityPokemonDetail();
model.setIsHidden(/* value */);  // Set is_hidden
model.setSlot(/* value */);  // Set slot
model.setPokemon(/* value */);  // Set pokemon

// Serialize to JSON
nlohmann::json json = models::AbilityPokemonDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AbilityPokemonDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AbilitySummary

```cpp
// Create a model
auto model = models::AbilitySummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::AbilitySummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AbilitySummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryDetail

```cpp
// Create a model
auto model = models::BerryDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setGrowthTime(/* value */);  // Set growth_time
model.setMaxHarvest(/* value */);  // Set max_harvest
model.setNaturalGiftPower(/* value */);  // Set natural_gift_power
model.setSize(/* value */);  // Set size
model.setSmoothness(/* value */);  // Set smoothness
model.setSoilDryness(/* value */);  // Set soil_dryness
model.setFirmness(/* value */);  // Set firmness
model.setFlavors(/* value */);  // Set flavors
model.setItem(/* value */);  // Set item
model.setNaturalGiftType(/* value */);  // Set natural_gift_type

// Serialize to JSON
nlohmann::json json = models::BerryDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryFirmnessDetail

```cpp
// Create a model
auto model = models::BerryFirmnessDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setBerries(/* value */);  // Set berries
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::BerryFirmnessDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryFirmnessDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryFirmnessName

```cpp
// Create a model
auto model = models::BerryFirmnessName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::BerryFirmnessName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryFirmnessName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryFirmnessSummary

```cpp
// Create a model
auto model = models::BerryFirmnessSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::BerryFirmnessSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryFirmnessSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryFlavorBerryMap

```cpp
// Create a model
auto model = models::BerryFlavorBerryMap();
model.setPotency(/* value */);  // Set potency
model.setBerry(/* value */);  // Set berry

// Serialize to JSON
nlohmann::json json = models::BerryFlavorBerryMap::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryFlavorBerryMap::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryFlavorDetail

```cpp
// Create a model
auto model = models::BerryFlavorDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setBerries(/* value */);  // Set berries
model.setContestType(/* value */);  // Set contest_type
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::BerryFlavorDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryFlavorDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryFlavorMap

```cpp
// Create a model
auto model = models::BerryFlavorMap();
model.setPotency(/* value */);  // Set potency
model.setFlavor(/* value */);  // Set flavor

// Serialize to JSON
nlohmann::json json = models::BerryFlavorMap::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryFlavorMap::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryFlavorName

```cpp
// Create a model
auto model = models::BerryFlavorName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::BerryFlavorName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryFlavorName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerryFlavorSummary

```cpp
// Create a model
auto model = models::BerryFlavorSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::BerryFlavorSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerryFlavorSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BerrySummary

```cpp
// Create a model
auto model = models::BerrySummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::BerrySummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BerrySummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CharacteristicDescription

```cpp
// Create a model
auto model = models::CharacteristicDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::CharacteristicDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CharacteristicDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CharacteristicDetail

```cpp
// Create a model
auto model = models::CharacteristicDetail();
model.setId(/* value */);  // Set id
model.setGeneModulo(/* value */);  // Set gene_modulo
model.setPossibleValues(/* value */);  // Set possible_values
model.setHighestStat(/* value */);  // Set highest_stat
model.setDescriptions(/* value */);  // Set descriptions

// Serialize to JSON
nlohmann::json json = models::CharacteristicDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CharacteristicDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CharacteristicSummary

```cpp
// Create a model
auto model = models::CharacteristicSummary();
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::CharacteristicSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CharacteristicSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ContestEffectDetail

```cpp
// Create a model
auto model = models::ContestEffectDetail();
model.setId(/* value */);  // Set id
model.setAppeal(/* value */);  // Set appeal
model.setJam(/* value */);  // Set jam
model.setEffectEntries(/* value */);  // Set effect_entries
model.setFlavorTextEntries(/* value */);  // Set flavor_text_entries

// Serialize to JSON
nlohmann::json json = models::ContestEffectDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ContestEffectDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ContestEffectEffectText

```cpp
// Create a model
auto model = models::ContestEffectEffectText();
model.setEffect(/* value */);  // Set effect
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ContestEffectEffectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ContestEffectEffectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ContestEffectFlavorText

```cpp
// Create a model
auto model = models::ContestEffectFlavorText();
model.setFlavorText(/* value */);  // Set flavor_text
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ContestEffectFlavorText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ContestEffectFlavorText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ContestEffectSummary

```cpp
// Create a model
auto model = models::ContestEffectSummary();
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ContestEffectSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ContestEffectSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ContestTypeDetail

```cpp
// Create a model
auto model = models::ContestTypeDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setBerryFlavor(/* value */);  // Set berry_flavor
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::ContestTypeDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ContestTypeDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ContestTypeName

```cpp
// Create a model
auto model = models::ContestTypeName();
model.setName(/* value */);  // Set name
model.setColor(/* value */);  // Set color
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ContestTypeName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ContestTypeName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ContestTypeSummary

```cpp
// Create a model
auto model = models::ContestTypeSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ContestTypeSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ContestTypeSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CurrencyDetail

```cpp
// Create a model
auto model = models::CurrencyDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::CurrencyDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CurrencyDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CurrencyName

```cpp
// Create a model
auto model = models::CurrencyName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::CurrencyName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CurrencyName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CurrencySummary

```cpp
// Create a model
auto model = models::CurrencySummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::CurrencySummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CurrencySummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EggGroupDetail

```cpp
// Create a model
auto model = models::EggGroupDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::EggGroupDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EggGroupDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EggGroupName

```cpp
// Create a model
auto model = models::EggGroupName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::EggGroupName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EggGroupName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EggGroupSummary

```cpp
// Create a model
auto model = models::EggGroupSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::EggGroupSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EggGroupSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterConditionDetail

```cpp
// Create a model
auto model = models::EncounterConditionDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setValues(/* value */);  // Set values
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::EncounterConditionDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterConditionDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterConditionName

```cpp
// Create a model
auto model = models::EncounterConditionName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::EncounterConditionName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterConditionName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterConditionSummary

```cpp
// Create a model
auto model = models::EncounterConditionSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::EncounterConditionSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterConditionSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterConditionValueDetail

```cpp
// Create a model
auto model = models::EncounterConditionValueDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setCondition(/* value */);  // Set condition
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::EncounterConditionValueDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterConditionValueDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterConditionValueName

```cpp
// Create a model
auto model = models::EncounterConditionValueName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::EncounterConditionValueName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterConditionValueName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterConditionValueSummary

```cpp
// Create a model
auto model = models::EncounterConditionValueSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::EncounterConditionValueSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterConditionValueSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterMethodDetail

```cpp
// Create a model
auto model = models::EncounterMethodDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setOrder(/* value */);  // Set order
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::EncounterMethodDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterMethodDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterMethodName

```cpp
// Create a model
auto model = models::EncounterMethodName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::EncounterMethodName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterMethodName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterMethodSummary

```cpp
// Create a model
auto model = models::EncounterMethodSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::EncounterMethodSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterMethodSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EncounterPokemonDetail

```cpp
// Create a model
auto model = models::EncounterPokemonDetail();
model.setMinPerfectIvs(/* value */);  // Set min_perfect_ivs
model.setAlwaysShiny(/* value */);  // Set always_shiny
model.setNeverShiny(/* value */);  // Set never_shiny
model.setIsAlpha(/* value */);  // Set is_alpha

// Serialize to JSON
nlohmann::json json = models::EncounterPokemonDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EncounterPokemonDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionChainDetail

```cpp
// Create a model
auto model = models::EvolutionChainDetail();
model.setId(/* value */);  // Set id
model.setBabyTriggerItem(/* value */);  // Set baby_trigger_item
model.setChain(/* value */);  // Set chain

// Serialize to JSON
nlohmann::json json = models::EvolutionChainDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionChainDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionChainLink

```cpp
// Create a model
auto model = models::EvolutionChainLink();
model.setIsBaby(/* value */);  // Set is_baby
model.setSpecies(/* value */);  // Set species
model.setEvolutionDetails(/* value */);  // Set evolution_details
model.setEvolvesTo(/* value */);  // Set evolves_to

// Serialize to JSON
nlohmann::json json = models::EvolutionChainLink::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionChainLink::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionChainSummary

```cpp
// Create a model
auto model = models::EvolutionChainSummary();
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::EvolutionChainSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionChainSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionConditionExpression

```cpp
// Create a model
auto model = models::EvolutionConditionExpression();
model.setExpression(/* value */);  // Set expression
model.setPercentageChance(/* value */);  // Set percentage_chance
model.setVariables(/* value */);  // Set variables

// Serialize to JSON
nlohmann::json json = models::EvolutionConditionExpression::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionConditionExpression::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionTriggerDetail

```cpp
// Create a model
auto model = models::EvolutionTriggerDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::EvolutionTriggerDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionTriggerDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionTriggerName

```cpp
// Create a model
auto model = models::EvolutionTriggerName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::EvolutionTriggerName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionTriggerName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionTriggerSummary

```cpp
// Create a model
auto model = models::EvolutionTriggerSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::EvolutionTriggerSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionTriggerSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionVariableDescription

```cpp
// Create a model
auto model = models::EvolutionVariableDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::EvolutionVariableDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionVariableDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionVariableDetail

```cpp
// Create a model
auto model = models::EvolutionVariableDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setSymbol(/* value */);  // Set symbol
model.setDataType(/* value */);  // Set data_type
model.setSource(/* value */);  // Set source
model.setVersionGroup(/* value */);  // Set version_group
model.setNames(/* value */);  // Set names
model.setDescriptions(/* value */);  // Set descriptions

// Serialize to JSON
nlohmann::json json = models::EvolutionVariableDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionVariableDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionVariableName

```cpp
// Create a model
auto model = models::EvolutionVariableName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::EvolutionVariableName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionVariableName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EvolutionVariableSummary

```cpp
// Create a model
auto model = models::EvolutionVariableSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::EvolutionVariableSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EvolutionVariableSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Experience

```cpp
// Create a model
auto model = models::Experience();
model.setLevel(/* value */);  // Set level
model.setExperience(/* value */);  // Set experience

// Serialize to JSON
nlohmann::json json = models::Experience::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Experience::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenderDetail

```cpp
// Create a model
auto model = models::GenderDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setPokemonSpeciesDetails(/* value */);  // Set pokemon_species_details
model.setRequiredForEvolution(/* value */);  // Set required_for_evolution

// Serialize to JSON
nlohmann::json json = models::GenderDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenderDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenderPokemonSpecies

```cpp
// Create a model
auto model = models::GenderPokemonSpecies();
model.setRate(/* value */);  // Set rate
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::GenderPokemonSpecies::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenderPokemonSpecies::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenderSummary

```cpp
// Create a model
auto model = models::GenderSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::GenderSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenderSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenerationDetail

```cpp
// Create a model
auto model = models::GenerationDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setAbilities(/* value */);  // Set abilities
model.setMainRegion(/* value */);  // Set main_region
model.setMoves(/* value */);  // Set moves
model.setNames(/* value */);  // Set names
model.setPokemonSpecies(/* value */);  // Set pokemon_species
model.setTypes(/* value */);  // Set types
model.setVersionGroups(/* value */);  // Set version_groups

// Serialize to JSON
nlohmann::json json = models::GenerationDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenerationDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenerationName

```cpp
// Create a model
auto model = models::GenerationName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::GenerationName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenerationName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenerationSummary

```cpp
// Create a model
auto model = models::GenerationSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::GenerationSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenerationSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GrowthRateDescription

```cpp
// Create a model
auto model = models::GrowthRateDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::GrowthRateDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GrowthRateDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GrowthRateDetail

```cpp
// Create a model
auto model = models::GrowthRateDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setFormula(/* value */);  // Set formula
model.setDescriptions(/* value */);  // Set descriptions
model.setLevels(/* value */);  // Set levels
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::GrowthRateDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GrowthRateDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GrowthRateSummary

```cpp
// Create a model
auto model = models::GrowthRateSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::GrowthRateSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GrowthRateSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemAttributeDescription

```cpp
// Create a model
auto model = models::ItemAttributeDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ItemAttributeDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemAttributeDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemAttributeDetail

```cpp
// Create a model
auto model = models::ItemAttributeDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setDescriptions(/* value */);  // Set descriptions
model.setItems(/* value */);  // Set items
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::ItemAttributeDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemAttributeDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemAttributeName

```cpp
// Create a model
auto model = models::ItemAttributeName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ItemAttributeName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemAttributeName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemAttributeSummary

```cpp
// Create a model
auto model = models::ItemAttributeSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ItemAttributeSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemAttributeSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemCategoryDetail

```cpp
// Create a model
auto model = models::ItemCategoryDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setItems(/* value */);  // Set items
model.setNames(/* value */);  // Set names
model.setPocket(/* value */);  // Set pocket

// Serialize to JSON
nlohmann::json json = models::ItemCategoryDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemCategoryDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemCategoryName

```cpp
// Create a model
auto model = models::ItemCategoryName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ItemCategoryName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemCategoryName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemCategorySummary

```cpp
// Create a model
auto model = models::ItemCategorySummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ItemCategorySummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemCategorySummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemDetail

```cpp
// Create a model
auto model = models::ItemDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setFlingPower(/* value */);  // Set fling_power
model.setFlingEffect(/* value */);  // Set fling_effect
model.setAttributes(/* value */);  // Set attributes
model.setCategory(/* value */);  // Set category
model.setEffectEntries(/* value */);  // Set effect_entries
model.setFlavorTextEntries(/* value */);  // Set flavor_text_entries
model.setGameIndices(/* value */);  // Set game_indices
model.setPrices(/* value */);  // Set prices
model.setNames(/* value */);  // Set names
model.setHeldByPokemon(/* value */);  // Set held_by_pokemon
model.setSprites(/* value */);  // Set sprites
model.setBabyTriggerFor(/* value */);  // Set baby_trigger_for
model.setMachines(/* value */);  // Set machines

// Serialize to JSON
nlohmann::json json = models::ItemDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemEffectText

```cpp
// Create a model
auto model = models::ItemEffectText();
model.setEffect(/* value */);  // Set effect
model.setShortEffect(/* value */);  // Set short_effect
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ItemEffectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemEffectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemFlavorText

```cpp
// Create a model
auto model = models::ItemFlavorText();
model.setText(/* value */);  // Set text
model.setVersionGroup(/* value */);  // Set version_group
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ItemFlavorText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemFlavorText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemFlingEffectDetail

```cpp
// Create a model
auto model = models::ItemFlingEffectDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setEffectEntries(/* value */);  // Set effect_entries
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ItemFlingEffectDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemFlingEffectDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemFlingEffectEffectText

```cpp
// Create a model
auto model = models::ItemFlingEffectEffectText();
model.setEffect(/* value */);  // Set effect
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ItemFlingEffectEffectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemFlingEffectEffectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemFlingEffectSummary

```cpp
// Create a model
auto model = models::ItemFlingEffectSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ItemFlingEffectSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemFlingEffectSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemGameIndex

```cpp
// Create a model
auto model = models::ItemGameIndex();
model.setGameIndex(/* value */);  // Set game_index
model.setGeneration(/* value */);  // Set generation

// Serialize to JSON
nlohmann::json json = models::ItemGameIndex::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemGameIndex::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemMachine

```cpp
// Create a model
auto model = models::ItemMachine();
model.setMachine(/* value */);  // Set machine
model.setVersionGroup(/* value */);  // Set version_group

// Serialize to JSON
nlohmann::json json = models::ItemMachine::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemMachine::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemName

```cpp
// Create a model
auto model = models::ItemName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ItemName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemPocketDetail

```cpp
// Create a model
auto model = models::ItemPocketDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setCategories(/* value */);  // Set categories
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::ItemPocketDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemPocketDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemPocketName

```cpp
// Create a model
auto model = models::ItemPocketName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::ItemPocketName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemPocketName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemPocketSummary

```cpp
// Create a model
auto model = models::ItemPocketSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ItemPocketSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemPocketSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemPrice

```cpp
// Create a model
auto model = models::ItemPrice();
model.setPurchasePrice(/* value */);  // Set purchase_price
model.setSellPrice(/* value */);  // Set sell_price
model.setCurrency(/* value */);  // Set currency
model.setVersionGroup(/* value */);  // Set version_group

// Serialize to JSON
nlohmann::json json = models::ItemPrice::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemPrice::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemSprites

```cpp
// Create a model
auto model = models::ItemSprites();
model.setRDefault(/* value */);  // Set default

// Serialize to JSON
nlohmann::json json = models::ItemSprites::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemSprites::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemSummary

```cpp
// Create a model
auto model = models::ItemSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ItemSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LanguageDetail

```cpp
// Create a model
auto model = models::LanguageDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setOfficial(/* value */);  // Set official
model.setIso639(/* value */);  // Set iso639
model.setIso3166(/* value */);  // Set iso3166
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::LanguageDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LanguageDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LanguageName

```cpp
// Create a model
auto model = models::LanguageName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::LanguageName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LanguageName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LanguageSummary

```cpp
// Create a model
auto model = models::LanguageSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::LanguageSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LanguageSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationAreaDetail

```cpp
// Create a model
auto model = models::LocationAreaDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setGameIndex(/* value */);  // Set game_index
model.setEncounterMethodRates(/* value */);  // Set encounter_method_rates
model.setLocation(/* value */);  // Set location
model.setNames(/* value */);  // Set names
model.setPokemonEncounters(/* value */);  // Set pokemon_encounters

// Serialize to JSON
nlohmann::json json = models::LocationAreaDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationAreaDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationAreaEncounterDetail

```cpp
// Create a model
auto model = models::LocationAreaEncounterDetail();
model.setMinLevel(/* value */);  // Set min_level
model.setMaxLevel(/* value */);  // Set max_level
model.setChance(/* value */);  // Set chance
model.setMethod(/* value */);  // Set method
model.setConditionValues(/* value */);  // Set condition_values
model.setPokemonDetails(/* value */);  // Set pokemon_details

// Serialize to JSON
nlohmann::json json = models::LocationAreaEncounterDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationAreaEncounterDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationAreaEncounterRate

```cpp
// Create a model
auto model = models::LocationAreaEncounterRate();
model.setEncounterMethod(/* value */);  // Set encounter_method
model.setVersionDetails(/* value */);  // Set version_details

// Serialize to JSON
nlohmann::json json = models::LocationAreaEncounterRate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationAreaEncounterRate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationAreaEncounterVersionDetail

```cpp
// Create a model
auto model = models::LocationAreaEncounterVersionDetail();
model.setRate(/* value */);  // Set rate
model.setVersion(/* value */);  // Set version

// Serialize to JSON
nlohmann::json json = models::LocationAreaEncounterVersionDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationAreaEncounterVersionDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationAreaName

```cpp
// Create a model
auto model = models::LocationAreaName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::LocationAreaName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationAreaName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationAreaPokemonEncounter

```cpp
// Create a model
auto model = models::LocationAreaPokemonEncounter();
model.setPokemon(/* value */);  // Set pokemon
model.setVersionDetails(/* value */);  // Set version_details

// Serialize to JSON
nlohmann::json json = models::LocationAreaPokemonEncounter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationAreaPokemonEncounter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationAreaPokemonEncounterVersion

```cpp
// Create a model
auto model = models::LocationAreaPokemonEncounterVersion();
model.setVersion(/* value */);  // Set version
model.setMaxChance(/* value */);  // Set max_chance
model.setEncounterDetails(/* value */);  // Set encounter_details

// Serialize to JSON
nlohmann::json json = models::LocationAreaPokemonEncounterVersion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationAreaPokemonEncounterVersion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationAreaSummary

```cpp
// Create a model
auto model = models::LocationAreaSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::LocationAreaSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationAreaSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationDetail

```cpp
// Create a model
auto model = models::LocationDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setRegion(/* value */);  // Set region
model.setNames(/* value */);  // Set names
model.setGameIndices(/* value */);  // Set game_indices
model.setAreas(/* value */);  // Set areas

// Serialize to JSON
nlohmann::json json = models::LocationDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationGameIndex

```cpp
// Create a model
auto model = models::LocationGameIndex();
model.setGameIndex(/* value */);  // Set game_index
model.setGeneration(/* value */);  // Set generation

// Serialize to JSON
nlohmann::json json = models::LocationGameIndex::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationGameIndex::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationName

```cpp
// Create a model
auto model = models::LocationName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::LocationName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocationSummary

```cpp
// Create a model
auto model = models::LocationSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::LocationSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocationSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MachineDetail

```cpp
// Create a model
auto model = models::MachineDetail();
model.setId(/* value */);  // Set id
model.setItem(/* value */);  // Set item
model.setVersionGroup(/* value */);  // Set version_group
model.setMove(/* value */);  // Set move

// Serialize to JSON
nlohmann::json json = models::MachineDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MachineDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MachineSummary

```cpp
// Create a model
auto model = models::MachineSummary();
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MachineSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MachineSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveBattleStyleDetail

```cpp
// Create a model
auto model = models::MoveBattleStyleDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::MoveBattleStyleDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveBattleStyleDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveBattleStyleName

```cpp
// Create a model
auto model = models::MoveBattleStyleName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveBattleStyleName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveBattleStyleName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveBattleStyleSummary

```cpp
// Create a model
auto model = models::MoveBattleStyleSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MoveBattleStyleSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveBattleStyleSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveChange

```cpp
// Create a model
auto model = models::MoveChange();
model.setAccuracy(/* value */);  // Set accuracy
model.setPower(/* value */);  // Set power
model.setPp(/* value */);  // Set pp
model.setEffectChance(/* value */);  // Set effect_chance
model.setEffectEntries(/* value */);  // Set effect_entries
model.setType(/* value */);  // Set type
model.setVersionGroup(/* value */);  // Set version_group

// Serialize to JSON
nlohmann::json json = models::MoveChange::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveChange::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveComboUsage

```cpp
// Create a model
auto model = models::MoveComboUsage();
model.setUseBefore(/* value */);  // Set use_before
model.setUseAfter(/* value */);  // Set use_after

// Serialize to JSON
nlohmann::json json = models::MoveComboUsage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveComboUsage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveCombos

```cpp
// Create a model
auto model = models::MoveCombos();
model.setNormal(/* value */);  // Set normal
model.setSuper(/* value */);  // Set super

// Serialize to JSON
nlohmann::json json = models::MoveCombos::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveCombos::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveDamageClassDescription

```cpp
// Create a model
auto model = models::MoveDamageClassDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveDamageClassDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveDamageClassDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveDamageClassDetail

```cpp
// Create a model
auto model = models::MoveDamageClassDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setDescriptions(/* value */);  // Set descriptions
model.setMoves(/* value */);  // Set moves
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::MoveDamageClassDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveDamageClassDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveDamageClassName

```cpp
// Create a model
auto model = models::MoveDamageClassName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveDamageClassName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveDamageClassName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveDamageClassSummary

```cpp
// Create a model
auto model = models::MoveDamageClassSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MoveDamageClassSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveDamageClassSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveDetail

```cpp
// Create a model
auto model = models::MoveDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setAccuracy(/* value */);  // Set accuracy
model.setEffectChance(/* value */);  // Set effect_chance
model.setPp(/* value */);  // Set pp
model.setPriority(/* value */);  // Set priority
model.setPower(/* value */);  // Set power
model.setContestCombos(/* value */);  // Set contest_combos
model.setContestType(/* value */);  // Set contest_type
model.setContestEffect(/* value */);  // Set contest_effect
model.setDamageClass(/* value */);  // Set damage_class
model.setEffectEntries(/* value */);  // Set effect_entries
model.setEffectChanges(/* value */);  // Set effect_changes
model.setGeneration(/* value */);  // Set generation
model.setMeta(/* value */);  // Set meta
model.setNames(/* value */);  // Set names
model.setPastValues(/* value */);  // Set past_values
model.setStatChanges(/* value */);  // Set stat_changes
model.setSuperContestEffect(/* value */);  // Set super_contest_effect
model.setTarget(/* value */);  // Set target
model.setType(/* value */);  // Set type
model.setMachines(/* value */);  // Set machines
model.setFlavorTextEntries(/* value */);  // Set flavor_text_entries
model.setLearnedByPokemon(/* value */);  // Set learned_by_pokemon

// Serialize to JSON
nlohmann::json json = models::MoveDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveEffectChange

```cpp
// Create a model
auto model = models::MoveEffectChange();
model.setVersionGroup(/* value */);  // Set version_group
model.setEffectEntries(/* value */);  // Set effect_entries

// Serialize to JSON
nlohmann::json json = models::MoveEffectChange::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveEffectChange::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveEffectChangeEffectText

```cpp
// Create a model
auto model = models::MoveEffectChangeEffectText();
model.setEffect(/* value */);  // Set effect
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveEffectChangeEffectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveEffectChangeEffectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveEffectEffectText

```cpp
// Create a model
auto model = models::MoveEffectEffectText();
model.setEffect(/* value */);  // Set effect
model.setShortEffect(/* value */);  // Set short_effect
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveEffectEffectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveEffectEffectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveFlavorText

```cpp
// Create a model
auto model = models::MoveFlavorText();
model.setFlavorText(/* value */);  // Set flavor_text
model.setLanguage(/* value */);  // Set language
model.setVersionGroup(/* value */);  // Set version_group

// Serialize to JSON
nlohmann::json json = models::MoveFlavorText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveFlavorText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveLearnMethodDescription

```cpp
// Create a model
auto model = models::MoveLearnMethodDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveLearnMethodDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveLearnMethodDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveLearnMethodDetail

```cpp
// Create a model
auto model = models::MoveLearnMethodDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names
model.setDescriptions(/* value */);  // Set descriptions
model.setVersionGroups(/* value */);  // Set version_groups

// Serialize to JSON
nlohmann::json json = models::MoveLearnMethodDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveLearnMethodDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveLearnMethodName

```cpp
// Create a model
auto model = models::MoveLearnMethodName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveLearnMethodName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveLearnMethodName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveLearnMethodSummary

```cpp
// Create a model
auto model = models::MoveLearnMethodSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MoveLearnMethodSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveLearnMethodSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveMeta

```cpp
// Create a model
auto model = models::MoveMeta();
model.setAilment(/* value */);  // Set ailment
model.setCategory(/* value */);  // Set category
model.setMinHits(/* value */);  // Set min_hits
model.setMaxHits(/* value */);  // Set max_hits
model.setMinTurns(/* value */);  // Set min_turns
model.setMaxTurns(/* value */);  // Set max_turns
model.setDrain(/* value */);  // Set drain
model.setHealing(/* value */);  // Set healing
model.setCritRate(/* value */);  // Set crit_rate
model.setAilmentChance(/* value */);  // Set ailment_chance
model.setFlinchChance(/* value */);  // Set flinch_chance
model.setStatChance(/* value */);  // Set stat_chance

// Serialize to JSON
nlohmann::json json = models::MoveMeta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveMeta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveMetaAilmentDetail

```cpp
// Create a model
auto model = models::MoveMetaAilmentDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setMoves(/* value */);  // Set moves
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::MoveMetaAilmentDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveMetaAilmentDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveMetaAilmentName

```cpp
// Create a model
auto model = models::MoveMetaAilmentName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveMetaAilmentName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveMetaAilmentName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveMetaAilmentSummary

```cpp
// Create a model
auto model = models::MoveMetaAilmentSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MoveMetaAilmentSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveMetaAilmentSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveMetaCategoryDescription

```cpp
// Create a model
auto model = models::MoveMetaCategoryDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveMetaCategoryDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveMetaCategoryDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveMetaCategoryDetail

```cpp
// Create a model
auto model = models::MoveMetaCategoryDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setDescriptions(/* value */);  // Set descriptions
model.setMoves(/* value */);  // Set moves

// Serialize to JSON
nlohmann::json json = models::MoveMetaCategoryDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveMetaCategoryDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveMetaCategorySummary

```cpp
// Create a model
auto model = models::MoveMetaCategorySummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MoveMetaCategorySummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveMetaCategorySummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveMetaStatChange

```cpp
// Create a model
auto model = models::MoveMetaStatChange();
model.setChange(/* value */);  // Set change
model.setStat(/* value */);  // Set stat

// Serialize to JSON
nlohmann::json json = models::MoveMetaStatChange::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveMetaStatChange::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveName

```cpp
// Create a model
auto model = models::MoveName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveStatChange

```cpp
// Create a model
auto model = models::MoveStatChange();
model.setChange(/* value */);  // Set change
model.setMove(/* value */);  // Set move

// Serialize to JSON
nlohmann::json json = models::MoveStatChange::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveStatChange::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveSummary

```cpp
// Create a model
auto model = models::MoveSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MoveSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveTargetDescription

```cpp
// Create a model
auto model = models::MoveTargetDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveTargetDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveTargetDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveTargetDetail

```cpp
// Create a model
auto model = models::MoveTargetDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setDescriptions(/* value */);  // Set descriptions
model.setMoves(/* value */);  // Set moves
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::MoveTargetDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveTargetDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveTargetName

```cpp
// Create a model
auto model = models::MoveTargetName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::MoveTargetName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveTargetName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MoveTargetSummary

```cpp
// Create a model
auto model = models::MoveTargetSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MoveTargetSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MoveTargetSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NatureBattleStylePreference

```cpp
// Create a model
auto model = models::NatureBattleStylePreference();
model.setLowHpPreference(/* value */);  // Set low_hp_preference
model.setHighHpPreference(/* value */);  // Set high_hp_preference
model.setMoveBattleStyle(/* value */);  // Set move_battle_style

// Serialize to JSON
nlohmann::json json = models::NatureBattleStylePreference::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NatureBattleStylePreference::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NatureDetail

```cpp
// Create a model
auto model = models::NatureDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setDecreasedStat(/* value */);  // Set decreased_stat
model.setIncreasedStat(/* value */);  // Set increased_stat
model.setLikesFlavor(/* value */);  // Set likes_flavor
model.setHatesFlavor(/* value */);  // Set hates_flavor
model.setPokeathlonStatChanges(/* value */);  // Set pokeathlon_stat_changes
model.setMoveBattleStylePreferences(/* value */);  // Set move_battle_style_preferences
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::NatureDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NatureDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NatureName

```cpp
// Create a model
auto model = models::NatureName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::NatureName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NatureName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NaturePokeathlonStat

```cpp
// Create a model
auto model = models::NaturePokeathlonStat();
model.setMaxChange(/* value */);  // Set max_change
model.setPokeathlonStat(/* value */);  // Set pokeathlon_stat

// Serialize to JSON
nlohmann::json json = models::NaturePokeathlonStat::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NaturePokeathlonStat::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NatureSummary

```cpp
// Create a model
auto model = models::NatureSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::NatureSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NatureSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedAbilitySummaryList

```cpp
// Create a model
auto model = models::PaginatedAbilitySummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedAbilitySummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedAbilitySummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedBerryFirmnessSummaryList

```cpp
// Create a model
auto model = models::PaginatedBerryFirmnessSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedBerryFirmnessSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedBerryFirmnessSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedBerryFlavorSummaryList

```cpp
// Create a model
auto model = models::PaginatedBerryFlavorSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedBerryFlavorSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedBerryFlavorSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedBerrySummaryList

```cpp
// Create a model
auto model = models::PaginatedBerrySummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedBerrySummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedBerrySummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedCharacteristicSummaryList

```cpp
// Create a model
auto model = models::PaginatedCharacteristicSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedCharacteristicSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedCharacteristicSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedContestEffectSummaryList

```cpp
// Create a model
auto model = models::PaginatedContestEffectSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedContestEffectSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedContestEffectSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedContestTypeSummaryList

```cpp
// Create a model
auto model = models::PaginatedContestTypeSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedContestTypeSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedContestTypeSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedCurrencySummaryList

```cpp
// Create a model
auto model = models::PaginatedCurrencySummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedCurrencySummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedCurrencySummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedEggGroupSummaryList

```cpp
// Create a model
auto model = models::PaginatedEggGroupSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedEggGroupSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedEggGroupSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedEncounterConditionSummaryList

```cpp
// Create a model
auto model = models::PaginatedEncounterConditionSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedEncounterConditionSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedEncounterConditionSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedEncounterConditionValueSummaryList

```cpp
// Create a model
auto model = models::PaginatedEncounterConditionValueSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedEncounterConditionValueSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedEncounterConditionValueSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedEncounterMethodSummaryList

```cpp
// Create a model
auto model = models::PaginatedEncounterMethodSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedEncounterMethodSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedEncounterMethodSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedEvolutionChainSummaryList

```cpp
// Create a model
auto model = models::PaginatedEvolutionChainSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedEvolutionChainSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedEvolutionChainSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedEvolutionTriggerSummaryList

```cpp
// Create a model
auto model = models::PaginatedEvolutionTriggerSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedEvolutionTriggerSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedEvolutionTriggerSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedEvolutionVariableSummaryList

```cpp
// Create a model
auto model = models::PaginatedEvolutionVariableSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedEvolutionVariableSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedEvolutionVariableSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedGenderSummaryList

```cpp
// Create a model
auto model = models::PaginatedGenderSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedGenderSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedGenderSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedGenerationSummaryList

```cpp
// Create a model
auto model = models::PaginatedGenerationSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedGenerationSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedGenerationSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedGrowthRateSummaryList

```cpp
// Create a model
auto model = models::PaginatedGrowthRateSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedGrowthRateSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedGrowthRateSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedItemAttributeSummaryList

```cpp
// Create a model
auto model = models::PaginatedItemAttributeSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedItemAttributeSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedItemAttributeSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedItemCategorySummaryList

```cpp
// Create a model
auto model = models::PaginatedItemCategorySummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedItemCategorySummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedItemCategorySummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedItemFlingEffectSummaryList

```cpp
// Create a model
auto model = models::PaginatedItemFlingEffectSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedItemFlingEffectSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedItemFlingEffectSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedItemPocketSummaryList

```cpp
// Create a model
auto model = models::PaginatedItemPocketSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedItemPocketSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedItemPocketSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedItemSummaryList

```cpp
// Create a model
auto model = models::PaginatedItemSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedItemSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedItemSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedLanguageSummaryList

```cpp
// Create a model
auto model = models::PaginatedLanguageSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedLanguageSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedLanguageSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedLocationAreaSummaryList

```cpp
// Create a model
auto model = models::PaginatedLocationAreaSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedLocationAreaSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedLocationAreaSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedLocationSummaryList

```cpp
// Create a model
auto model = models::PaginatedLocationSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedLocationSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedLocationSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedMachineSummaryList

```cpp
// Create a model
auto model = models::PaginatedMachineSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedMachineSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedMachineSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedMoveBattleStyleSummaryList

```cpp
// Create a model
auto model = models::PaginatedMoveBattleStyleSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedMoveBattleStyleSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedMoveBattleStyleSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedMoveDamageClassSummaryList

```cpp
// Create a model
auto model = models::PaginatedMoveDamageClassSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedMoveDamageClassSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedMoveDamageClassSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedMoveLearnMethodSummaryList

```cpp
// Create a model
auto model = models::PaginatedMoveLearnMethodSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedMoveLearnMethodSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedMoveLearnMethodSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedMoveMetaAilmentSummaryList

```cpp
// Create a model
auto model = models::PaginatedMoveMetaAilmentSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedMoveMetaAilmentSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedMoveMetaAilmentSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedMoveMetaCategorySummaryList

```cpp
// Create a model
auto model = models::PaginatedMoveMetaCategorySummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedMoveMetaCategorySummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedMoveMetaCategorySummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedMoveSummaryList

```cpp
// Create a model
auto model = models::PaginatedMoveSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedMoveSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedMoveSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedMoveTargetSummaryList

```cpp
// Create a model
auto model = models::PaginatedMoveTargetSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedMoveTargetSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedMoveTargetSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedNatureSummaryList

```cpp
// Create a model
auto model = models::PaginatedNatureSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedNatureSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedNatureSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPalParkAreaSummaryList

```cpp
// Create a model
auto model = models::PaginatedPalParkAreaSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPalParkAreaSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPalParkAreaSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPokeathlonStatSummaryList

```cpp
// Create a model
auto model = models::PaginatedPokeathlonStatSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPokeathlonStatSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPokeathlonStatSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPokedexSummaryList

```cpp
// Create a model
auto model = models::PaginatedPokedexSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPokedexSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPokedexSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPokemonColorSummaryList

```cpp
// Create a model
auto model = models::PaginatedPokemonColorSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPokemonColorSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPokemonColorSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPokemonFormSummaryList

```cpp
// Create a model
auto model = models::PaginatedPokemonFormSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPokemonFormSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPokemonFormSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPokemonHabitatSummaryList

```cpp
// Create a model
auto model = models::PaginatedPokemonHabitatSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPokemonHabitatSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPokemonHabitatSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPokemonShapeSummaryList

```cpp
// Create a model
auto model = models::PaginatedPokemonShapeSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPokemonShapeSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPokemonShapeSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPokemonSpeciesSummaryList

```cpp
// Create a model
auto model = models::PaginatedPokemonSpeciesSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPokemonSpeciesSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPokemonSpeciesSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedPokemonSummaryList

```cpp
// Create a model
auto model = models::PaginatedPokemonSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedPokemonSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedPokemonSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedRegionSummaryList

```cpp
// Create a model
auto model = models::PaginatedRegionSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedRegionSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedRegionSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedStatSummaryList

```cpp
// Create a model
auto model = models::PaginatedStatSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedStatSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedStatSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedSuperContestEffectSummaryList

```cpp
// Create a model
auto model = models::PaginatedSuperContestEffectSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedSuperContestEffectSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedSuperContestEffectSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedTypeSummaryList

```cpp
// Create a model
auto model = models::PaginatedTypeSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedTypeSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedTypeSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedVersionGroupSummaryList

```cpp
// Create a model
auto model = models::PaginatedVersionGroupSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedVersionGroupSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedVersionGroupSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PaginatedVersionSummaryList

```cpp
// Create a model
auto model = models::PaginatedVersionSummaryList();
model.setCount(/* value */);  // Set count
model.setNext(/* value */);  // Set next
model.setPrevious(/* value */);  // Set previous
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::PaginatedVersionSummaryList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PaginatedVersionSummaryList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PalParkAreaDetail

```cpp
// Create a model
auto model = models::PalParkAreaDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names
model.setPokemonEncounters(/* value */);  // Set pokemon_encounters

// Serialize to JSON
nlohmann::json json = models::PalParkAreaDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PalParkAreaDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PalParkAreaName

```cpp
// Create a model
auto model = models::PalParkAreaName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PalParkAreaName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PalParkAreaName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PalParkAreaSummary

```cpp
// Create a model
auto model = models::PalParkAreaSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PalParkAreaSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PalParkAreaSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PalParkEncounter

```cpp
// Create a model
auto model = models::PalParkEncounter();
model.setBaseScore(/* value */);  // Set base_score
model.setRate(/* value */);  // Set rate
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::PalParkEncounter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PalParkEncounter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokeapiMetaResponse

```cpp
// Create a model
auto model = models::PokeapiMetaResponse();
model.setDeployDate(/* value */);  // Set deploy_date
model.setHash(/* value */);  // Set hash
model.setTag(/* value */);  // Set tag

// Serialize to JSON
nlohmann::json json = models::PokeapiMetaResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokeapiMetaResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokeathlonStatAffectingNature

```cpp
// Create a model
auto model = models::PokeathlonStatAffectingNature();
model.setMaxChange(/* value */);  // Set max_change
model.setNature(/* value */);  // Set nature

// Serialize to JSON
nlohmann::json json = models::PokeathlonStatAffectingNature::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokeathlonStatAffectingNature::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokeathlonStatAffectingNatures

```cpp
// Create a model
auto model = models::PokeathlonStatAffectingNatures();
model.setIncrease(/* value */);  // Set increase
model.setDecrease(/* value */);  // Set decrease

// Serialize to JSON
nlohmann::json json = models::PokeathlonStatAffectingNatures::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokeathlonStatAffectingNatures::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokeathlonStatDetail

```cpp
// Create a model
auto model = models::PokeathlonStatDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setAffectingNatures(/* value */);  // Set affecting_natures
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::PokeathlonStatDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokeathlonStatDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokeathlonStatName

```cpp
// Create a model
auto model = models::PokeathlonStatName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokeathlonStatName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokeathlonStatName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokeathlonStatSummary

```cpp
// Create a model
auto model = models::PokeathlonStatSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokeathlonStatSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokeathlonStatSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokedexDescription

```cpp
// Create a model
auto model = models::PokedexDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokedexDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokedexDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokedexDetail

```cpp
// Create a model
auto model = models::PokedexDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setIsMainSeries(/* value */);  // Set is_main_series
model.setDescriptions(/* value */);  // Set descriptions
model.setNames(/* value */);  // Set names
model.setPokemonEntries(/* value */);  // Set pokemon_entries
model.setRegion(/* value */);  // Set region
model.setVersionGroups(/* value */);  // Set version_groups

// Serialize to JSON
nlohmann::json json = models::PokedexDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokedexDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokedexName

```cpp
// Create a model
auto model = models::PokedexName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokedexName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokedexName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokedexSummary

```cpp
// Create a model
auto model = models::PokedexSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokedexSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokedexSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonAbility

```cpp
// Create a model
auto model = models::PokemonAbility();
model.setIsHidden(/* value */);  // Set is_hidden
model.setSlot(/* value */);  // Set slot
model.setAbility(/* value */);  // Set ability

// Serialize to JSON
nlohmann::json json = models::PokemonAbility::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonAbility::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonAbilityPast

```cpp
// Create a model
auto model = models::PokemonAbilityPast();
model.setIsHidden(/* value */);  // Set is_hidden
model.setSlot(/* value */);  // Set slot
model.setAbility(/* value */);  // Set ability

// Serialize to JSON
nlohmann::json json = models::PokemonAbilityPast::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonAbilityPast::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonColorDetail

```cpp
// Create a model
auto model = models::PokemonColorDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::PokemonColorDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonColorDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonColorName

```cpp
// Create a model
auto model = models::PokemonColorName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokemonColorName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonColorName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonColorSummary

```cpp
// Create a model
auto model = models::PokemonColorSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokemonColorSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonColorSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonCries

```cpp
// Create a model
auto model = models::PokemonCries();
model.setLatest(/* value */);  // Set latest
model.setLegacy(/* value */);  // Set legacy

// Serialize to JSON
nlohmann::json json = models::PokemonCries::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonCries::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonDetail

```cpp
// Create a model
auto model = models::PokemonDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setBaseExperience(/* value */);  // Set base_experience
model.setHeight(/* value */);  // Set height
model.setIsDefault(/* value */);  // Set is_default
model.setOrder(/* value */);  // Set order
model.setWeight(/* value */);  // Set weight
model.setAbilities(/* value */);  // Set abilities
model.setPastAbilities(/* value */);  // Set past_abilities
model.setForms(/* value */);  // Set forms
model.setGameIndices(/* value */);  // Set game_indices
model.setHeldItems(/* value */);  // Set held_items
model.setLocationAreaEncounters(/* value */);  // Set location_area_encounters
model.setMoves(/* value */);  // Set moves
model.setSpecies(/* value */);  // Set species
model.setSprites(/* value */);  // Set sprites
model.setCries(/* value */);  // Set cries
model.setStats(/* value */);  // Set stats
model.setPastStats(/* value */);  // Set past_stats
model.setTypes(/* value */);  // Set types
model.setPastTypes(/* value */);  // Set past_types

// Serialize to JSON
nlohmann::json json = models::PokemonDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonDexEntry

```cpp
// Create a model
auto model = models::PokemonDexEntry();
model.setEntryNumber(/* value */);  // Set entry_number
model.setPokedex(/* value */);  // Set pokedex

// Serialize to JSON
nlohmann::json json = models::PokemonDexEntry::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonDexEntry::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonDexNumber

```cpp
// Create a model
auto model = models::PokemonDexNumber();
model.setEntryNumber(/* value */);  // Set entry_number
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::PokemonDexNumber::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonDexNumber::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonEncounterDetailResponse

```cpp
// Create a model
auto model = models::PokemonEncounterDetailResponse();
model.setChance(/* value */);  // Set chance
model.setConditionValues(/* value */);  // Set condition_values
model.setMaxLevel(/* value */);  // Set max_level
model.setMethod(/* value */);  // Set method
model.setMinLevel(/* value */);  // Set min_level

// Serialize to JSON
nlohmann::json json = models::PokemonEncounterDetailResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonEncounterDetailResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonEncounterResponse

```cpp
// Create a model
auto model = models::PokemonEncounterResponse();
model.setLocationArea(/* value */);  // Set location_area
model.setVersionDetails(/* value */);  // Set version_details

// Serialize to JSON
nlohmann::json json = models::PokemonEncounterResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonEncounterResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonEncounterVersionDetailResponse

```cpp
// Create a model
auto model = models::PokemonEncounterVersionDetailResponse();
model.setVersion(/* value */);  // Set version
model.setMaxChance(/* value */);  // Set max_chance
model.setEncounterDetails(/* value */);  // Set encounter_details

// Serialize to JSON
nlohmann::json json = models::PokemonEncounterVersionDetailResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonEncounterVersionDetailResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonEvolution

```cpp
// Create a model
auto model = models::PokemonEvolution();
model.setVersionGroup(/* value */);  // Set version_group
model.setIsDefault(/* value */);  // Set is_default
model.setItem(/* value */);  // Set item
model.setTrigger(/* value */);  // Set trigger
model.setGender(/* value */);  // Set gender
model.setHeldItem(/* value */);  // Set held_item
model.setKnownMove(/* value */);  // Set known_move
model.setKnownMoveType(/* value */);  // Set known_move_type
model.setLocation(/* value */);  // Set location
model.setMinLevel(/* value */);  // Set min_level
model.setMinHappiness(/* value */);  // Set min_happiness
model.setMinBeauty(/* value */);  // Set min_beauty
model.setMinAffection(/* value */);  // Set min_affection
model.setNearSpecialRock(/* value */);  // Set near_special_rock
model.setNeedsMultiplayer(/* value */);  // Set needs_multiplayer
model.setNeedsOverworldRain(/* value */);  // Set needs_overworld_rain
model.setPartySpecies(/* value */);  // Set party_species
model.setPartyType(/* value */);  // Set party_type
model.setRelativePhysicalStats(/* value */);  // Set relative_physical_stats
model.setTimeOfDay(/* value */);  // Set time_of_day
model.setTradeSpecies(/* value */);  // Set trade_species
model.setTurnUpsideDown(/* value */);  // Set turn_upside_down
model.setRegion(/* value */);  // Set region
model.setRequiredPokemonForm(/* value */);  // Set required_pokemon_form
model.setEvolvedPokemonForm(/* value */);  // Set evolved_pokemon_form
model.setUsedMove(/* value */);  // Set used_move
model.setMinMoveCount(/* value */);  // Set min_move_count
model.setMinSteps(/* value */);  // Set min_steps
model.setMinDamageTaken(/* value */);  // Set min_damage_taken
model.setAllowedNatures(/* value */);  // Set allowed_natures
model.setConditionExpression(/* value */);  // Set condition_expression

// Serialize to JSON
nlohmann::json json = models::PokemonEvolution::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonEvolution::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonEvolutionKnownMove

```cpp
// Create a model
auto model = models::PokemonEvolutionKnownMove();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokemonEvolutionKnownMove::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonEvolutionKnownMove::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonEvolutionKnownMoveType

```cpp
// Create a model
auto model = models::PokemonEvolutionKnownMoveType();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokemonEvolutionKnownMoveType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonEvolutionKnownMoveType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonFormDetail

```cpp
// Create a model
auto model = models::PokemonFormDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setOrder(/* value */);  // Set order
model.setFormOrder(/* value */);  // Set form_order
model.setIsDefault(/* value */);  // Set is_default
model.setIsBattleOnly(/* value */);  // Set is_battle_only
model.setIsMega(/* value */);  // Set is_mega
model.setFormName(/* value */);  // Set form_name
model.setPokemon(/* value */);  // Set pokemon
model.setSprites(/* value */);  // Set sprites
model.setVersionGroup(/* value */);  // Set version_group
model.setFormNames(/* value */);  // Set form_names
model.setNames(/* value */);  // Set names
model.setTypes(/* value */);  // Set types
model.setTriggerConditions(/* value */);  // Set trigger_conditions
model.setFlavorTextEntries(/* value */);  // Set flavor_text_entries

// Serialize to JSON
nlohmann::json json = models::PokemonFormDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonFormDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonFormFlavorText

```cpp
// Create a model
auto model = models::PokemonFormFlavorText();
model.setFlavorText(/* value */);  // Set flavor_text
model.setLanguage(/* value */);  // Set language
model.setVersion(/* value */);  // Set version

// Serialize to JSON
nlohmann::json json = models::PokemonFormFlavorText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonFormFlavorText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonFormName

```cpp
// Create a model
auto model = models::PokemonFormName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokemonFormName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonFormName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonFormSprites

```cpp
// Create a model
auto model = models::PokemonFormSprites();
model.setFrontDefault(/* value */);  // Set front_default
model.setFrontShiny(/* value */);  // Set front_shiny
model.setFrontFemale(/* value */);  // Set front_female
model.setFrontShinyFemale(/* value */);  // Set front_shiny_female
model.setBackDefault(/* value */);  // Set back_default
model.setBackShiny(/* value */);  // Set back_shiny
model.setBackFemale(/* value */);  // Set back_female
model.setBackShinyFemale(/* value */);  // Set back_shiny_female
model.setOther(/* value */);  // Set other
model.setVersions(/* value */);  // Set versions

// Serialize to JSON
nlohmann::json json = models::PokemonFormSprites::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonFormSprites::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonFormSummary

```cpp
// Create a model
auto model = models::PokemonFormSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokemonFormSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonFormSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonFormTriggerCondition

```cpp
// Create a model
auto model = models::PokemonFormTriggerCondition();
model.setTrigger(/* value */);  // Set trigger
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url
model.setBaseForm(/* value */);  // Set base_form

// Serialize to JSON
nlohmann::json json = models::PokemonFormTriggerCondition::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonFormTriggerCondition::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonFormType

```cpp
// Create a model
auto model = models::PokemonFormType();
model.setSlot(/* value */);  // Set slot
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::PokemonFormType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonFormType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonGameIndex

```cpp
// Create a model
auto model = models::PokemonGameIndex();
model.setGameIndex(/* value */);  // Set game_index
model.setVersion(/* value */);  // Set version

// Serialize to JSON
nlohmann::json json = models::PokemonGameIndex::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonGameIndex::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonHabitatDetail

```cpp
// Create a model
auto model = models::PokemonHabitatDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::PokemonHabitatDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonHabitatDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonHabitatName

```cpp
// Create a model
auto model = models::PokemonHabitatName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokemonHabitatName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonHabitatName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonHabitatSummary

```cpp
// Create a model
auto model = models::PokemonHabitatSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokemonHabitatSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonHabitatSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonHeldItem

```cpp
// Create a model
auto model = models::PokemonHeldItem();
model.setPokemon(/* value */);  // Set pokemon
model.setVersionDetails(/* value */);  // Set version_details

// Serialize to JSON
nlohmann::json json = models::PokemonHeldItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonHeldItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonHeldItemSummary

```cpp
// Create a model
auto model = models::PokemonHeldItemSummary();
model.setItem(/* value */);  // Set item
model.setVersionDetails(/* value */);  // Set version_details

// Serialize to JSON
nlohmann::json json = models::PokemonHeldItemSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonHeldItemSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonHeldItemVersion

```cpp
// Create a model
auto model = models::PokemonHeldItemVersion();
model.setRarity(/* value */);  // Set rarity
model.setVersion(/* value */);  // Set version

// Serialize to JSON
nlohmann::json json = models::PokemonHeldItemVersion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonHeldItemVersion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonMove

```cpp
// Create a model
auto model = models::PokemonMove();
model.setMove(/* value */);  // Set move
model.setVersionGroupDetails(/* value */);  // Set version_group_details

// Serialize to JSON
nlohmann::json json = models::PokemonMove::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonMove::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonMoveVersionGroup

```cpp
// Create a model
auto model = models::PokemonMoveVersionGroup();
model.setLevelLearnedAt(/* value */);  // Set level_learned_at
model.setMoveLearnMethod(/* value */);  // Set move_learn_method
model.setVersionGroup(/* value */);  // Set version_group
model.setOrder(/* value */);  // Set order

// Serialize to JSON
nlohmann::json json = models::PokemonMoveVersionGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonMoveVersionGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonPastAbility

```cpp
// Create a model
auto model = models::PokemonPastAbility();
model.setAbilities(/* value */);  // Set abilities
model.setGeneration(/* value */);  // Set generation

// Serialize to JSON
nlohmann::json json = models::PokemonPastAbility::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonPastAbility::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonPastStat

```cpp
// Create a model
auto model = models::PokemonPastStat();
model.setGeneration(/* value */);  // Set generation
model.setStats(/* value */);  // Set stats

// Serialize to JSON
nlohmann::json json = models::PokemonPastStat::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonPastStat::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonPastType

```cpp
// Create a model
auto model = models::PokemonPastType();
model.setGeneration(/* value */);  // Set generation
model.setTypes(/* value */);  // Set types

// Serialize to JSON
nlohmann::json json = models::PokemonPastType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonPastType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonShapeAwesomeName

```cpp
// Create a model
auto model = models::PokemonShapeAwesomeName();
model.setAwesomeName(/* value */);  // Set awesome_name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokemonShapeAwesomeName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonShapeAwesomeName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonShapeDetail

```cpp
// Create a model
auto model = models::PokemonShapeDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setAwesomeNames(/* value */);  // Set awesome_names
model.setNames(/* value */);  // Set names
model.setPokemonSpecies(/* value */);  // Set pokemon_species

// Serialize to JSON
nlohmann::json json = models::PokemonShapeDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonShapeDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonShapeName

```cpp
// Create a model
auto model = models::PokemonShapeName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokemonShapeName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonShapeName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonShapeSummary

```cpp
// Create a model
auto model = models::PokemonShapeSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokemonShapeSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonShapeSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpeciesDescription

```cpp
// Create a model
auto model = models::PokemonSpeciesDescription();
model.setDescription(/* value */);  // Set description
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokemonSpeciesDescription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpeciesDescription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpeciesDetail

```cpp
// Create a model
auto model = models::PokemonSpeciesDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setOrder(/* value */);  // Set order
model.setGenderRate(/* value */);  // Set gender_rate
model.setCaptureRate(/* value */);  // Set capture_rate
model.setBaseHappiness(/* value */);  // Set base_happiness
model.setIsBaby(/* value */);  // Set is_baby
model.setIsLegendary(/* value */);  // Set is_legendary
model.setIsMythical(/* value */);  // Set is_mythical
model.setHatchCounter(/* value */);  // Set hatch_counter
model.setHasGenderDifferences(/* value */);  // Set has_gender_differences
model.setFormsSwitchable(/* value */);  // Set forms_switchable
model.setGrowthRate(/* value */);  // Set growth_rate
model.setPokedexNumbers(/* value */);  // Set pokedex_numbers
model.setEggGroups(/* value */);  // Set egg_groups
model.setColor(/* value */);  // Set color
model.setShape(/* value */);  // Set shape
model.setEvolvesFromSpecies(/* value */);  // Set evolves_from_species
model.setEvolutionChain(/* value */);  // Set evolution_chain
model.setHabitat(/* value */);  // Set habitat
model.setGeneration(/* value */);  // Set generation
model.setNames(/* value */);  // Set names
model.setPalParkEncounters(/* value */);  // Set pal_park_encounters
model.setFormDescriptions(/* value */);  // Set form_descriptions
model.setFlavorTextEntries(/* value */);  // Set flavor_text_entries
model.setGenera(/* value */);  // Set genera
model.setVarieties(/* value */);  // Set varieties

// Serialize to JSON
nlohmann::json json = models::PokemonSpeciesDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpeciesDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpeciesFlavorText

```cpp
// Create a model
auto model = models::PokemonSpeciesFlavorText();
model.setFlavorText(/* value */);  // Set flavor_text
model.setLanguage(/* value */);  // Set language
model.setVersion(/* value */);  // Set version

// Serialize to JSON
nlohmann::json json = models::PokemonSpeciesFlavorText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpeciesFlavorText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpeciesGenus

```cpp
// Create a model
auto model = models::PokemonSpeciesGenus();
model.setGenus(/* value */);  // Set genus
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokemonSpeciesGenus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpeciesGenus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpeciesName

```cpp
// Create a model
auto model = models::PokemonSpeciesName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::PokemonSpeciesName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpeciesName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpeciesPalParkEncounter

```cpp
// Create a model
auto model = models::PokemonSpeciesPalParkEncounter();
model.setBaseScore(/* value */);  // Set base_score
model.setRate(/* value */);  // Set rate
model.setArea(/* value */);  // Set area

// Serialize to JSON
nlohmann::json json = models::PokemonSpeciesPalParkEncounter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpeciesPalParkEncounter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpeciesSummary

```cpp
// Create a model
auto model = models::PokemonSpeciesSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokemonSpeciesSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpeciesSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpeciesVariety

```cpp
// Create a model
auto model = models::PokemonSpeciesVariety();
model.setIsDefault(/* value */);  // Set is_default
model.setPokemon(/* value */);  // Set pokemon

// Serialize to JSON
nlohmann::json json = models::PokemonSpeciesVariety::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpeciesVariety::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSprites

```cpp
// Create a model
auto model = models::PokemonSprites();
model.setFrontDefault(/* value */);  // Set front_default
model.setFrontShiny(/* value */);  // Set front_shiny
model.setFrontFemale(/* value */);  // Set front_female
model.setFrontShinyFemale(/* value */);  // Set front_shiny_female
model.setBackDefault(/* value */);  // Set back_default
model.setBackShiny(/* value */);  // Set back_shiny
model.setBackFemale(/* value */);  // Set back_female
model.setBackShinyFemale(/* value */);  // Set back_shiny_female
model.setOther(/* value */);  // Set other
model.setVersions(/* value */);  // Set versions

// Serialize to JSON
nlohmann::json json = models::PokemonSprites::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSprites::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpritesOther

```cpp
// Create a model
auto model = models::PokemonSpritesOther();
model.setDreamWorld(/* value */);  // Set dream_world
model.setHome(/* value */);  // Set home
model.setShowdown(/* value */);  // Set showdown
model.setOfficialArtwork(/* value */);  // Set official-artwork

// Serialize to JSON
nlohmann::json json = models::PokemonSpritesOther::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpritesOther::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpritesOtherDreamWorld

```cpp
// Create a model
auto model = models::PokemonSpritesOtherDreamWorld();
model.setFrontDefault(/* value */);  // Set front_default
model.setFrontFemale(/* value */);  // Set front_female

// Serialize to JSON
nlohmann::json json = models::PokemonSpritesOtherDreamWorld::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpritesOtherDreamWorld::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpritesOtherHome

```cpp
// Create a model
auto model = models::PokemonSpritesOtherHome();
model.setFrontDefault(/* value */);  // Set front_default
model.setFrontFemale(/* value */);  // Set front_female
model.setFrontShiny(/* value */);  // Set front_shiny
model.setFrontShinyFemale(/* value */);  // Set front_shiny_female

// Serialize to JSON
nlohmann::json json = models::PokemonSpritesOtherHome::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpritesOtherHome::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpritesOtherOfficialArtwork

```cpp
// Create a model
auto model = models::PokemonSpritesOtherOfficialArtwork();
model.setFrontDefault(/* value */);  // Set front_default
model.setFrontShiny(/* value */);  // Set front_shiny
model.setVersions(/* value */);  // Set versions

// Serialize to JSON
nlohmann::json json = models::PokemonSpritesOtherOfficialArtwork::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpritesOtherOfficialArtwork::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSpritesOtherShowdown

```cpp
// Create a model
auto model = models::PokemonSpritesOtherShowdown();
model.setFrontDefault(/* value */);  // Set front_default
model.setFrontFemale(/* value */);  // Set front_female
model.setFrontShiny(/* value */);  // Set front_shiny
model.setFrontShinyFemale(/* value */);  // Set front_shiny_female
model.setBackDefault(/* value */);  // Set back_default
model.setBackFemale(/* value */);  // Set back_female
model.setBackShiny(/* value */);  // Set back_shiny
model.setBackShinyFemale(/* value */);  // Set back_shiny_female

// Serialize to JSON
nlohmann::json json = models::PokemonSpritesOtherShowdown::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSpritesOtherShowdown::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonStat

```cpp
// Create a model
auto model = models::PokemonStat();
model.setBaseStat(/* value */);  // Set base_stat
model.setEffort(/* value */);  // Set effort
model.setStat(/* value */);  // Set stat

// Serialize to JSON
nlohmann::json json = models::PokemonStat::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonStat::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonSummary

```cpp
// Create a model
auto model = models::PokemonSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PokemonSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PokemonType

```cpp
// Create a model
auto model = models::PokemonType();
model.setSlot(/* value */);  // Set slot
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::PokemonType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PokemonType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RegionDetail

```cpp
// Create a model
auto model = models::RegionDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setLocations(/* value */);  // Set locations
model.setMainGeneration(/* value */);  // Set main_generation
model.setNames(/* value */);  // Set names
model.setPokedexes(/* value */);  // Set pokedexes
model.setVersionGroups(/* value */);  // Set version_groups

// Serialize to JSON
nlohmann::json json = models::RegionDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RegionDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RegionName

```cpp
// Create a model
auto model = models::RegionName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::RegionName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RegionName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RegionSummary

```cpp
// Create a model
auto model = models::RegionSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::RegionSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RegionSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StatAffectingMoves

```cpp
// Create a model
auto model = models::StatAffectingMoves();
model.setIncrease(/* value */);  // Set increase
model.setDecrease(/* value */);  // Set decrease

// Serialize to JSON
nlohmann::json json = models::StatAffectingMoves::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StatAffectingMoves::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StatAffectingNatures

```cpp
// Create a model
auto model = models::StatAffectingNatures();
model.setIncrease(/* value */);  // Set increase
model.setDecrease(/* value */);  // Set decrease

// Serialize to JSON
nlohmann::json json = models::StatAffectingNatures::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StatAffectingNatures::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StatDetail

```cpp
// Create a model
auto model = models::StatDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setGameIndex(/* value */);  // Set game_index
model.setIsBattleOnly(/* value */);  // Set is_battle_only
model.setAffectingMoves(/* value */);  // Set affecting_moves
model.setAffectingNatures(/* value */);  // Set affecting_natures
model.setAffectingItems(/* value */);  // Set affecting_items
model.setCharacteristics(/* value */);  // Set characteristics
model.setMoveDamageClass(/* value */);  // Set move_damage_class
model.setNames(/* value */);  // Set names

// Serialize to JSON
nlohmann::json json = models::StatDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StatDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StatName

```cpp
// Create a model
auto model = models::StatName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::StatName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StatName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StatSummary

```cpp
// Create a model
auto model = models::StatSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::StatSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StatSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SuperContestEffectDetail

```cpp
// Create a model
auto model = models::SuperContestEffectDetail();
model.setId(/* value */);  // Set id
model.setAppeal(/* value */);  // Set appeal
model.setFlavorTextEntries(/* value */);  // Set flavor_text_entries
model.setMoves(/* value */);  // Set moves

// Serialize to JSON
nlohmann::json json = models::SuperContestEffectDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SuperContestEffectDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SuperContestEffectFlavorText

```cpp
// Create a model
auto model = models::SuperContestEffectFlavorText();
model.setFlavorText(/* value */);  // Set flavor_text
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::SuperContestEffectFlavorText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SuperContestEffectFlavorText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SuperContestEffectSummary

```cpp
// Create a model
auto model = models::SuperContestEffectSummary();
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::SuperContestEffectSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SuperContestEffectSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TypeDetail

```cpp
// Create a model
auto model = models::TypeDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setDamageRelations(/* value */);  // Set damage_relations
model.setPastDamageRelations(/* value */);  // Set past_damage_relations
model.setGameIndices(/* value */);  // Set game_indices
model.setGeneration(/* value */);  // Set generation
model.setMoveDamageClass(/* value */);  // Set move_damage_class
model.setNames(/* value */);  // Set names
model.setPokemon(/* value */);  // Set pokemon
model.setMoves(/* value */);  // Set moves
model.setSprites(/* value */);  // Set sprites

// Serialize to JSON
nlohmann::json json = models::TypeDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TypeDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TypeGameIndex

```cpp
// Create a model
auto model = models::TypeGameIndex();
model.setGameIndex(/* value */);  // Set game_index
model.setGeneration(/* value */);  // Set generation

// Serialize to JSON
nlohmann::json json = models::TypeGameIndex::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TypeGameIndex::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TypeGameSprite

```cpp
// Create a model
auto model = models::TypeGameSprite();
model.setNameIcon(/* value */);  // Set name_icon
model.setSymbolIcon(/* value */);  // Set symbol_icon

// Serialize to JSON
nlohmann::json json = models::TypeGameSprite::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TypeGameSprite::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TypeName

```cpp
// Create a model
auto model = models::TypeName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::TypeName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TypeName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TypePastRelationships

```cpp
// Create a model
auto model = models::TypePastRelationships();
model.setGeneration(/* value */);  // Set generation
model.setDamageRelations(/* value */);  // Set damage_relations

// Serialize to JSON
nlohmann::json json = models::TypePastRelationships::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TypePastRelationships::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TypePokemon

```cpp
// Create a model
auto model = models::TypePokemon();
model.setSlot(/* value */);  // Set slot
model.setPokemon(/* value */);  // Set pokemon

// Serialize to JSON
nlohmann::json json = models::TypePokemon::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TypePokemon::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TypeRelationships

```cpp
// Create a model
auto model = models::TypeRelationships();
model.setNoDamageTo(/* value */);  // Set no_damage_to
model.setHalfDamageTo(/* value */);  // Set half_damage_to
model.setDoubleDamageTo(/* value */);  // Set double_damage_to
model.setNoDamageFrom(/* value */);  // Set no_damage_from
model.setHalfDamageFrom(/* value */);  // Set half_damage_from
model.setDoubleDamageFrom(/* value */);  // Set double_damage_from

// Serialize to JSON
nlohmann::json json = models::TypeRelationships::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TypeRelationships::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TypeSummary

```cpp
// Create a model
auto model = models::TypeSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::TypeSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TypeSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionDetail

```cpp
// Create a model
auto model = models::VersionDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setNames(/* value */);  // Set names
model.setVersionGroup(/* value */);  // Set version_group

// Serialize to JSON
nlohmann::json json = models::VersionDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionGroupDetail

```cpp
// Create a model
auto model = models::VersionGroupDetail();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setOrder(/* value */);  // Set order
model.setGeneration(/* value */);  // Set generation
model.setMoveLearnMethods(/* value */);  // Set move_learn_methods
model.setPokedexes(/* value */);  // Set pokedexes
model.setRegions(/* value */);  // Set regions
model.setVersions(/* value */);  // Set versions

// Serialize to JSON
nlohmann::json json = models::VersionGroupDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionGroupDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionGroupSummary

```cpp
// Create a model
auto model = models::VersionGroupSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::VersionGroupSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionGroupSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionName

```cpp
// Create a model
auto model = models::VersionName();
model.setName(/* value */);  // Set name
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::VersionName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionSummary

```cpp
// Create a model
auto model = models::VersionSummary();
model.setName(/* value */);  // Set name
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::VersionSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionSummary::fromJson(nlohmann::json::parse(jsonString));
```

## Implementing API Handlers

### API Classes

Each API is generated as an abstract base class with pure virtual methods that you must implement.

#### Berries

Create a class that inherits from the generated base class:

```cpp
#include "api/BerriesApi.h"

class BerriesImpl : public Api::Berries {
public:
    Apiv2berryFirmnessGetResponse handleGetForApiv2berryFirmness(const Apiv2berryFirmnessGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_BERRY_FIRMNESS_SUMMARY_LIST):
        models::PaginatedBerryFirmnessSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2berryFirmnessidGetResponse handleGetForApiv2berryFirmnessid(const Apiv2berryFirmnessidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BERRY_FIRMNESS_DETAIL):
        models::BerryFirmnessDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2berryFlavorGetResponse handleGetForApiv2berryFlavor(const Apiv2berryFlavorGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_BERRY_FLAVOR_SUMMARY_LIST):
        models::PaginatedBerryFlavorSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2berryFlavoridGetResponse handleGetForApiv2berryFlavorid(const Apiv2berryFlavoridGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BERRY_FLAVOR_DETAIL):
        models::BerryFlavorDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2berryGetResponse handleGetForApiv2berry(const Apiv2berryGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_BERRY_SUMMARY_LIST):
        models::PaginatedBerrySummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2berryidGetResponse handleGetForApiv2berryid(const Apiv2berryidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BERRY_DETAIL):
        models::BerryDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Contests

Create a class that inherits from the generated base class:

```cpp
#include "api/ContestsApi.h"

class ContestsImpl : public Api::Contests {
public:
    Apiv2contestEffectGetResponse handleGetForApiv2contestEffect(const Apiv2contestEffectGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_CONTEST_EFFECT_SUMMARY_LIST):
        models::PaginatedContestEffectSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2contestEffectidGetResponse handleGetForApiv2contestEffectid(const Apiv2contestEffectidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONTEST_EFFECT_DETAIL):
        models::ContestEffectDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2contestTypeGetResponse handleGetForApiv2contestType(const Apiv2contestTypeGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_CONTEST_TYPE_SUMMARY_LIST):
        models::PaginatedContestTypeSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2contestTypeidGetResponse handleGetForApiv2contestTypeid(const Apiv2contestTypeidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONTEST_TYPE_DETAIL):
        models::ContestTypeDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2superContestEffectGetResponse handleGetForApiv2superContestEffect(const Apiv2superContestEffectGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_SUPER_CONTEST_EFFECT_SUMMARY_LIST):
        models::PaginatedSuperContestEffectSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2superContestEffectidGetResponse handleGetForApiv2superContestEffectid(const Apiv2superContestEffectidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SUPER_CONTEST_EFFECT_DETAIL):
        models::SuperContestEffectDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Encounters

Create a class that inherits from the generated base class:

```cpp
#include "api/EncountersApi.h"

class EncountersImpl : public Api::Encounters {
public:
    Apiv2encounterConditionGetResponse handleGetForApiv2encounterCondition(const Apiv2encounterConditionGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ENCOUNTER_CONDITION_SUMMARY_LIST):
        models::PaginatedEncounterConditionSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2encounterConditionidGetResponse handleGetForApiv2encounterConditionid(const Apiv2encounterConditionidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ENCOUNTER_CONDITION_DETAIL):
        models::EncounterConditionDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2encounterConditionValueGetResponse handleGetForApiv2encounterConditionValue(const Apiv2encounterConditionValueGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ENCOUNTER_CONDITION_VALUE_SUMMARY_LIST):
        models::PaginatedEncounterConditionValueSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2encounterConditionValueidGetResponse handleGetForApiv2encounterConditionValueid(const Apiv2encounterConditionValueidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ENCOUNTER_CONDITION_VALUE_DETAIL):
        models::EncounterConditionValueDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2encounterMethodGetResponse handleGetForApiv2encounterMethod(const Apiv2encounterMethodGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ENCOUNTER_METHOD_SUMMARY_LIST):
        models::PaginatedEncounterMethodSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2encounterMethodidGetResponse handleGetForApiv2encounterMethodid(const Apiv2encounterMethodidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ENCOUNTER_METHOD_DETAIL):
        models::EncounterMethodDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Evolution

Create a class that inherits from the generated base class:

```cpp
#include "api/EvolutionApi.h"

class EvolutionImpl : public Api::Evolution {
public:
    Apiv2evolutionChainGetResponse handleGetForApiv2evolutionChain(const Apiv2evolutionChainGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_EVOLUTION_CHAIN_SUMMARY_LIST):
        models::PaginatedEvolutionChainSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2evolutionChainidGetResponse handleGetForApiv2evolutionChainid(const Apiv2evolutionChainidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_EVOLUTION_CHAIN_DETAIL):
        models::EvolutionChainDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2evolutionTriggerGetResponse handleGetForApiv2evolutionTrigger(const Apiv2evolutionTriggerGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_EVOLUTION_TRIGGER_SUMMARY_LIST):
        models::PaginatedEvolutionTriggerSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2evolutionTriggeridGetResponse handleGetForApiv2evolutionTriggerid(const Apiv2evolutionTriggeridGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_EVOLUTION_TRIGGER_DETAIL):
        models::EvolutionTriggerDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2evolutionVariableGetResponse handleGetForApiv2evolutionVariable(const Apiv2evolutionVariableGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_EVOLUTION_VARIABLE_SUMMARY_LIST):
        models::PaginatedEvolutionVariableSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2evolutionVariableidGetResponse handleGetForApiv2evolutionVariableid(const Apiv2evolutionVariableidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_EVOLUTION_VARIABLE_DETAIL):
        models::EvolutionVariableDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Games

Create a class that inherits from the generated base class:

```cpp
#include "api/GamesApi.h"

class GamesImpl : public Api::Games {
public:
    Apiv2generationGetResponse handleGetForApiv2generation(const Apiv2generationGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_GENERATION_SUMMARY_LIST):
        models::PaginatedGenerationSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2generationidGetResponse handleGetForApiv2generationid(const Apiv2generationidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_GENERATION_DETAIL):
        models::GenerationDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokedexGetResponse handleGetForApiv2pokedex(const Apiv2pokedexGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_POKEDEX_SUMMARY_LIST):
        models::PaginatedPokedexSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokedexidGetResponse handleGetForApiv2pokedexid(const Apiv2pokedexidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEDEX_DETAIL):
        models::PokedexDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2versionGroupGetResponse handleGetForApiv2versionGroup(const Apiv2versionGroupGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_VERSION_GROUP_SUMMARY_LIST):
        models::PaginatedVersionGroupSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2versionGroupidGetResponse handleGetForApiv2versionGroupid(const Apiv2versionGroupidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VERSION_GROUP_DETAIL):
        models::VersionGroupDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2versionGetResponse handleGetForApiv2version(const Apiv2versionGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_VERSION_SUMMARY_LIST):
        models::PaginatedVersionSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2versionidGetResponse handleGetForApiv2versionid(const Apiv2versionidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VERSION_DETAIL):
        models::VersionDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Items

Create a class that inherits from the generated base class:

```cpp
#include "api/ItemsApi.h"

class ItemsImpl : public Api::Items {
public:
    Apiv2currencyGetResponse handleGetForApiv2currency(const Apiv2currencyGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_CURRENCY_SUMMARY_LIST):
        models::PaginatedCurrencySummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2currencyidGetResponse handleGetForApiv2currencyid(const Apiv2currencyidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CURRENCY_DETAIL):
        models::CurrencyDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemAttributeGetResponse handleGetForApiv2itemAttribute(const Apiv2itemAttributeGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ITEM_ATTRIBUTE_SUMMARY_LIST):
        models::PaginatedItemAttributeSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemAttributeidGetResponse handleGetForApiv2itemAttributeid(const Apiv2itemAttributeidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ITEM_ATTRIBUTE_DETAIL):
        models::ItemAttributeDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemCategoryGetResponse handleGetForApiv2itemCategory(const Apiv2itemCategoryGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ITEM_CATEGORY_SUMMARY_LIST):
        models::PaginatedItemCategorySummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemCategoryidGetResponse handleGetForApiv2itemCategoryid(const Apiv2itemCategoryidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ITEM_CATEGORY_DETAIL):
        models::ItemCategoryDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemFlingEffectGetResponse handleGetForApiv2itemFlingEffect(const Apiv2itemFlingEffectGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ITEM_FLING_EFFECT_SUMMARY_LIST):
        models::PaginatedItemFlingEffectSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemFlingEffectidGetResponse handleGetForApiv2itemFlingEffectid(const Apiv2itemFlingEffectidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ITEM_FLING_EFFECT_DETAIL):
        models::ItemFlingEffectDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemGetResponse handleGetForApiv2item(const Apiv2itemGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ITEM_SUMMARY_LIST):
        models::PaginatedItemSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemPocketGetResponse handleGetForApiv2itemPocket(const Apiv2itemPocketGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ITEM_POCKET_SUMMARY_LIST):
        models::PaginatedItemPocketSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemPocketidGetResponse handleGetForApiv2itemPocketid(const Apiv2itemPocketidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ITEM_POCKET_DETAIL):
        models::ItemPocketDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2itemidGetResponse handleGetForApiv2itemid(const Apiv2itemidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ITEM_DETAIL):
        models::ItemDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Location

Create a class that inherits from the generated base class:

```cpp
#include "api/LocationApi.h"

class LocationImpl : public Api::Location {
public:
    Apiv2locationAreaGetResponse handleGetForApiv2locationArea(const Apiv2locationAreaGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_LOCATION_AREA_SUMMARY_LIST):
        models::PaginatedLocationAreaSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2locationAreaidGetResponse handleGetForApiv2locationAreaid(const Apiv2locationAreaidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LOCATION_AREA_DETAIL):
        models::LocationAreaDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2locationGetResponse handleGetForApiv2location(const Apiv2locationGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_LOCATION_SUMMARY_LIST):
        models::PaginatedLocationSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2locationidGetResponse handleGetForApiv2locationid(const Apiv2locationidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LOCATION_DETAIL):
        models::LocationDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2palParkAreaGetResponse handleGetForApiv2palParkArea(const Apiv2palParkAreaGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_PAL_PARK_AREA_SUMMARY_LIST):
        models::PaginatedPalParkAreaSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2palParkAreaidGetResponse handleGetForApiv2palParkAreaid(const Apiv2palParkAreaidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAL_PARK_AREA_DETAIL):
        models::PalParkAreaDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2regionGetResponse handleGetForApiv2region(const Apiv2regionGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_REGION_SUMMARY_LIST):
        models::PaginatedRegionSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2regionidGetResponse handleGetForApiv2regionid(const Apiv2regionidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_REGION_DETAIL):
        models::RegionDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Machines

Create a class that inherits from the generated base class:

```cpp
#include "api/MachinesApi.h"

class MachinesImpl : public Api::Machines {
public:
    Apiv2machineGetResponse handleGetForApiv2machine(const Apiv2machineGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_MACHINE_SUMMARY_LIST):
        models::PaginatedMachineSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2machineidGetResponse handleGetForApiv2machineid(const Apiv2machineidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MACHINE_DETAIL):
        models::MachineDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Moves

Create a class that inherits from the generated base class:

```cpp
#include "api/MovesApi.h"

class MovesImpl : public Api::Moves {
public:
    Apiv2moveAilmentGetResponse handleGetForApiv2moveAilment(const Apiv2moveAilmentGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_MOVE_META_AILMENT_SUMMARY_LIST):
        models::PaginatedMoveMetaAilmentSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveAilmentidGetResponse handleGetForApiv2moveAilmentid(const Apiv2moveAilmentidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MOVE_META_AILMENT_DETAIL):
        models::MoveMetaAilmentDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveBattleStyleGetResponse handleGetForApiv2moveBattleStyle(const Apiv2moveBattleStyleGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_MOVE_BATTLE_STYLE_SUMMARY_LIST):
        models::PaginatedMoveBattleStyleSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveBattleStyleidGetResponse handleGetForApiv2moveBattleStyleid(const Apiv2moveBattleStyleidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MOVE_BATTLE_STYLE_DETAIL):
        models::MoveBattleStyleDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveCategoryGetResponse handleGetForApiv2moveCategory(const Apiv2moveCategoryGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_MOVE_META_CATEGORY_SUMMARY_LIST):
        models::PaginatedMoveMetaCategorySummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveCategoryidGetResponse handleGetForApiv2moveCategoryid(const Apiv2moveCategoryidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MOVE_META_CATEGORY_DETAIL):
        models::MoveMetaCategoryDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveLearnMethodGetResponse handleGetForApiv2moveLearnMethod(const Apiv2moveLearnMethodGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_MOVE_LEARN_METHOD_SUMMARY_LIST):
        models::PaginatedMoveLearnMethodSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveLearnMethodidGetResponse handleGetForApiv2moveLearnMethodid(const Apiv2moveLearnMethodidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MOVE_LEARN_METHOD_DETAIL):
        models::MoveLearnMethodDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveGetResponse handleGetForApiv2move(const Apiv2moveGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_MOVE_SUMMARY_LIST):
        models::PaginatedMoveSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveidGetResponse handleGetForApiv2moveid(const Apiv2moveidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MOVE_DETAIL):
        models::MoveDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveTargetGetResponse handleGetForApiv2moveTarget(const Apiv2moveTargetGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_MOVE_TARGET_SUMMARY_LIST):
        models::PaginatedMoveTargetSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveTargetidGetResponse handleGetForApiv2moveTargetid(const Apiv2moveTargetidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MOVE_TARGET_DETAIL):
        models::MoveTargetDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Pokemon

Create a class that inherits from the generated base class:

```cpp
#include "api/PokemonApi.h"

class PokemonImpl : public Api::Pokemon {
public:
    Apiv2abilityGetResponse handleGetForApiv2ability(const Apiv2abilityGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_ABILITY_SUMMARY_LIST):
        models::PaginatedAbilitySummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2abilityidGetResponse handleGetForApiv2abilityid(const Apiv2abilityidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ABILITY_DETAIL):
        models::AbilityDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2characteristicGetResponse handleGetForApiv2characteristic(const Apiv2characteristicGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_CHARACTERISTIC_SUMMARY_LIST):
        models::PaginatedCharacteristicSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2characteristicidGetResponse handleGetForApiv2characteristicid(const Apiv2characteristicidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CHARACTERISTIC_DETAIL):
        models::CharacteristicDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2eggGroupGetResponse handleGetForApiv2eggGroup(const Apiv2eggGroupGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_EGG_GROUP_SUMMARY_LIST):
        models::PaginatedEggGroupSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2eggGroupidGetResponse handleGetForApiv2eggGroupid(const Apiv2eggGroupidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_EGG_GROUP_DETAIL):
        models::EggGroupDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2genderGetResponse handleGetForApiv2gender(const Apiv2genderGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_GENDER_SUMMARY_LIST):
        models::PaginatedGenderSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2genderidGetResponse handleGetForApiv2genderid(const Apiv2genderidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_GENDER_DETAIL):
        models::GenderDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2growthRateGetResponse handleGetForApiv2growthRate(const Apiv2growthRateGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_GROWTH_RATE_SUMMARY_LIST):
        models::PaginatedGrowthRateSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2growthRateidGetResponse handleGetForApiv2growthRateid(const Apiv2growthRateidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_GROWTH_RATE_DETAIL):
        models::GrowthRateDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveDamageClassGetResponse handleGetForApiv2moveDamageClass(const Apiv2moveDamageClassGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_MOVE_DAMAGE_CLASS_SUMMARY_LIST):
        models::PaginatedMoveDamageClassSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2moveDamageClassidGetResponse handleGetForApiv2moveDamageClassid(const Apiv2moveDamageClassidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MOVE_DAMAGE_CLASS_DETAIL):
        models::MoveDamageClassDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2natureGetResponse handleGetForApiv2nature(const Apiv2natureGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_NATURE_SUMMARY_LIST):
        models::PaginatedNatureSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2natureidGetResponse handleGetForApiv2natureid(const Apiv2natureidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_NATURE_DETAIL):
        models::NatureDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokeathlonStatGetResponse handleGetForApiv2pokeathlonStat(const Apiv2pokeathlonStatGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_POKEATHLON_STAT_SUMMARY_LIST):
        models::PaginatedPokeathlonStatSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokeathlonStatidGetResponse handleGetForApiv2pokeathlonStatid(const Apiv2pokeathlonStatidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEATHLON_STAT_DETAIL):
        models::PokeathlonStatDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonColorGetResponse handleGetForApiv2pokemonColor(const Apiv2pokemonColorGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_POKEMON_COLOR_SUMMARY_LIST):
        models::PaginatedPokemonColorSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonColoridGetResponse handleGetForApiv2pokemonColorid(const Apiv2pokemonColoridGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEMON_COLOR_DETAIL):
        models::PokemonColorDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonFormGetResponse handleGetForApiv2pokemonForm(const Apiv2pokemonFormGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_POKEMON_FORM_SUMMARY_LIST):
        models::PaginatedPokemonFormSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonFormidGetResponse handleGetForApiv2pokemonFormid(const Apiv2pokemonFormidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEMON_FORM_DETAIL):
        models::PokemonFormDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonHabitatGetResponse handleGetForApiv2pokemonHabitat(const Apiv2pokemonHabitatGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_POKEMON_HABITAT_SUMMARY_LIST):
        models::PaginatedPokemonHabitatSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonHabitatidGetResponse handleGetForApiv2pokemonHabitatid(const Apiv2pokemonHabitatidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEMON_HABITAT_DETAIL):
        models::PokemonHabitatDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonGetResponse handleGetForApiv2pokemon(const Apiv2pokemonGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_POKEMON_SUMMARY_LIST):
        models::PaginatedPokemonSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonidGetResponse handleGetForApiv2pokemonid(const Apiv2pokemonidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEMON_DETAIL):
        models::PokemonDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonShapeGetResponse handleGetForApiv2pokemonShape(const Apiv2pokemonShapeGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_POKEMON_SHAPE_SUMMARY_LIST):
        models::PaginatedPokemonShapeSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonShapeidGetResponse handleGetForApiv2pokemonShapeid(const Apiv2pokemonShapeidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEMON_SHAPE_DETAIL):
        models::PokemonShapeDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonSpeciesGetResponse handleGetForApiv2pokemonSpecies(const Apiv2pokemonSpeciesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_POKEMON_SPECIES_SUMMARY_LIST):
        models::PaginatedPokemonSpeciesSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2pokemonSpeciesidGetResponse handleGetForApiv2pokemonSpeciesid(const Apiv2pokemonSpeciesidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEMON_SPECIES_DETAIL):
        models::PokemonSpeciesDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2statGetResponse handleGetForApiv2stat(const Apiv2statGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_STAT_SUMMARY_LIST):
        models::PaginatedStatSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2statidGetResponse handleGetForApiv2statid(const Apiv2statidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_STAT_DETAIL):
        models::StatDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2typeGetResponse handleGetForApiv2type(const Apiv2typeGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_TYPE_SUMMARY_LIST):
        models::PaginatedTypeSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2typeidGetResponse handleGetForApiv2typeid(const Apiv2typeidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TYPE_DETAIL):
        models::TypeDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Utility

Create a class that inherits from the generated base class:

```cpp
#include "api/UtilityApi.h"

class UtilityImpl : public Api::Utility {
public:
    Apiv2languageGetResponse handleGetForApiv2language(const Apiv2languageGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_offset (optional)
        // Query: params.m_q (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGINATED_LANGUAGE_SUMMARY_LIST):
        models::PaginatedLanguageSummaryList successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2languageidGetResponse handleGetForApiv2languageid(const Apiv2languageidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LANGUAGE_DETAIL):
        models::LanguageDetail successResponse;
        // ... populate response ...
        return successResponse;
    }

    Apiv2metaGetResponse handleGetForApiv2meta() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_POKEAPI_META_RESPONSE):
        models::PokeapiMetaResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```

## Running the Server

Here's a complete example of setting up and running the server:

```cpp
#include <httplib.h>
#include <memory>

#include "api/BerriesApi.h"

#include "api/ContestsApi.h"

#include "api/EncountersApi.h"

#include "api/EvolutionApi.h"

#include "api/GamesApi.h"

#include "api/ItemsApi.h"

#include "api/LocationApi.h"

#include "api/MachinesApi.h"

#include "api/MovesApi.h"

#include "api/PokemonApi.h"

#include "api/UtilityApi.h"


int main() {
    httplib::Server server;

    // Create API implementations

    BerriesImpl berries;

    ContestsImpl contests;

    EncountersImpl encounters;

    EvolutionImpl evolution;

    GamesImpl games;

    ItemsImpl items;

    LocationImpl location;

    MachinesImpl machines;

    MovesImpl moves;

    PokemonImpl pokemon;

    UtilityImpl utility;


    // Register routes

    berries.registerRoutes(server);

    contests.registerRoutes(server);

    encounters.registerRoutes(server);

    evolution.registerRoutes(server);

    games.registerRoutes(server);

    items.registerRoutes(server);

    location.registerRoutes(server);

    machines.registerRoutes(server);

    moves.registerRoutes(server);

    pokemon.registerRoutes(server);

    utility.registerRoutes(server);


    // Start server
    std::cout << "Server starting on http://localhost:8080" << std::endl;
    server.listen("localhost", 8080);

    return 0;
}
```

### Without Authentication

This API does not require authentication. Simply create your API implementations and register them with the server.


## Authentication

This API does not require authentication.


## Error Handling

### Response Variants

Each API endpoint that returns data uses `std::variant` to represent multiple possible response types (success and errors):

```cpp
// Example: endpoint returns success (User) or errors (NotFound, ServerError)
using GetUserResponse = std::variant<User, NotFound, ServerError>;

GetUserResponse handleGetUser(const GetUserRequest& params) override {
    if (userExists(params.m_userId)) {
        User user = fetchUser(params.m_userId);
        return user;  // Automatically sets HTTP 200
    } else {
        NotFound error;
        error.setMessage("User not found");
        return error;  // Automatically sets HTTP 404
    }
}
```

The server automatically:
- Detects which type is returned from the variant
- Sets the appropriate HTTP status code
- Serializes the response to JSON

### HTTP Status Codes

Status codes are automatically set based on the response type you return. Each model type is associated with a specific HTTP status code defined in your OpenAPI specification.

**Optimized Status Code Constants:**
The generator only creates HTTP status code constants (e.g., `HTTP_RESPONSE_CODE_200`, `HTTP_RESPONSE_CODE_404`) for codes actually used by your API operations. This reduces code bloat and compilation time compared to generating all possible HTTP status codes.

### Parameter Validation

The generated code automatically validates:
- **Required parameters**: Returns HTTP 400 if missing
- **Type conversion**: Returns HTTP 400 if parameter cannot be converted to expected type
- **JSON parsing**: Returns HTTP 400 if request body is invalid JSON

Custom validation logic should be implemented in your handler methods.

### Working with Optional Parameters

Optional parameters and model fields use `std::optional`:

```cpp
void handleRequest(const RequestParams& params) override {
    // Check if optional query parameter is present
    if (params.m_optionalParam) {
        auto value = *params.m_optionalParam;  // Dereference to get value
        // Use value...
    }

    // Check if optional request body is present
    if (params.m_request) {
        auto body = *params.m_request;  // Dereference to get body
        // Use body...
    }
}
```

## Advanced Features

### Parameter Serialization Styles

The generator supports various parameter serialization styles as defined in OpenAPI:

- **simple**: Comma-separated values (default for path/header)
- **form**: Ampersand-separated values (default for query)
- **spaceDelimited**: Space-separated values
- **pipeDelimited**: Pipe-separated values
- **deepObject**: Nested object notation for query parameters

These are automatically handled during parameter parsing.

### Enum Handling

All generated enums automatically include an `UNSPECIFIED` value as the first enum entry for safe initialization:

```cpp
enum class Status {
    UNSPECIFIED = 0,  // Added automatically for safety
    PENDING,
    APPROVED,
    REJECTED
};

// Safe default initialization
Status status;  // Defaults to UNSPECIFIED (0)

// Explicit initialization
Status activeStatus = Status::APPROVED;

// Enum serialization/deserialization
// UNSPECIFIED is not a valid API value and indicates uninitialized state
```

**Why UNSPECIFIED?**
- Provides a safe default value for uninitialized enums
- Prevents undefined behavior from using uninitialized enum values
- Makes it clear when an enum hasn't been set vs. having a valid API value
- Does not appear in OpenAPI spec - internal C++ implementation detail

### Union Types (anyOf/oneOf)

When your OpenAPI spec uses `anyOf` or `oneOf`, the generated code uses `std::variant`:

```cpp
// OpenAPI: { "anyOf": [{"type": "string"}, {"type": "number"}] }
using MyUnionType = std::variant<std::string, double>;

// In your model:
MyUnionType value;

// Use std::visit to handle different types:
std::visit([](const auto& v) {
    using T = std::decay_t<decltype(v)>;
    if constexpr (std::is_same_v<T, std::string>) {
        std::cout << "String: " << v << std::endl;
    } else if constexpr (std::is_same_v<T, double>) {
        std::cout << "Number: " << v << std::endl;
    }
}, value);
```

## Additional Resources

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/cpp-httplib-server)
- [OpenAPI Specification](https://swagger.io/specification/)

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/)
