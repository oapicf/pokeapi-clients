
# Table `TypePokemon`
(mapped from: TypePokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**slot** | slot | int NOT NULL |  | **kotlin.Int** | The order the Pokémon&#39;s types are listed in. | 
**pokemon** | pokemon | long NOT NULL |  | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that has the referenced type. |  [foreignkey]




