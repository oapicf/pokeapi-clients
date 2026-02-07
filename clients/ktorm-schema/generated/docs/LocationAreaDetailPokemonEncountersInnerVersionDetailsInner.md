
# Table `LocationAreaDetail_pokemon_encounters_inner_version_details_inner`
(mapped from: LocationAreaDetailPokemonEncountersInnerVersionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**version** | version | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**maxChance** | max_chance | int NOT NULL |  | **kotlin.Int** |  | 
**encounterDetails** | encounter_details | long NOT NULL |  | [**LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails**](LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.md) |  |  [foreignkey]





