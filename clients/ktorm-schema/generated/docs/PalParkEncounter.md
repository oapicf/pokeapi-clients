
# Table `PalParkEncounter`
(mapped from: PalParkEncounter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rate** | rate | int NOT NULL |  | **kotlin.Int** | The base rate for encountering this Pokémon in this pal park area. | 
**pokemonSpecies** | pokemon_species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. |  [foreignkey]
**baseScore** | base_score | int |  | **kotlin.Int** | The base score given to the player when this Pokémon is caught during a pal park run. |  [optional]





