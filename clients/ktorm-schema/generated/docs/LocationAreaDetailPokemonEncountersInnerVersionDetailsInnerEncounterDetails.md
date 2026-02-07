
# Table `LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details`
(mapped from: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**minLevel** | min_level | int NOT NULL |  | **kotlin.Int** |  | 
**maxLevel** | max_level | int NOT NULL |  | **kotlin.Int** |  | 
**chance** | chance | int NOT NULL |  | **kotlin.Int** |  | 
**method** | method | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**conditionValues** | condition_values | long |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [optional] [foreignkey]







