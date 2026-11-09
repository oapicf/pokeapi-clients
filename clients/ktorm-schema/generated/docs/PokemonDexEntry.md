
# Table `PokemonDexEntry`
(mapped from: PokemonDexEntry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**entryNumber** | entry_number | int NOT NULL |  | **kotlin.Int** | The index number within the Pokédex. | 
**pokedex** | pokedex | long NOT NULL |  | [**PokedexSummary**](PokedexSummary.md) | The Pokédex the referenced Pokémon species can be found in. |  [foreignkey]




