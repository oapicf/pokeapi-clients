
# Table `GenderPokemonSpecies`
(mapped from: GenderPokemonSpecies)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rate** | rate | int NOT NULL |  | **kotlin.Int** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | 
**pokemonSpecies** | pokemon_species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | A Pokémon species that can be the referenced gender. |  [foreignkey]




