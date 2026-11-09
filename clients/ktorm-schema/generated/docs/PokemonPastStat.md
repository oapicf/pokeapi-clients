
# Table `PokemonPastStat`
(mapped from: PokemonPastStat)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed stats. |  [foreignkey]
**stats** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonStat&gt;**](PokemonStat.md) | The stat the Pokémon had up to and including the listed generation. | 



# **Table `PokemonPastStatPokemonStat`**
(mapped from: PokemonPastStatPokemonStat)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonPastStat | pokemonPastStat | long | | kotlin.Long | Primary Key | *one*
pokemonStat | pokemonStat | long | | kotlin.Long | Foreign Key | *many*



