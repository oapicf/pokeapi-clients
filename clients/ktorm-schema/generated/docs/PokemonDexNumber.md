
# Table `PokemonDexNumber`
(mapped from: PokemonDexNumber)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**entryNumber** | entry_number | int NOT NULL |  | **kotlin.Int** | The index of this Pokémon species entry within the Pokédex. | 
**pokemonSpecies** | pokemon_species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. |  [foreignkey]




