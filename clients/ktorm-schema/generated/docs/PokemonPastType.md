
# Table `PokemonPastType`
(mapped from: PokemonPastType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed types. |  [foreignkey]
**types** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonType&gt;**](PokemonType.md) | The types the referenced pokémon had up to and including the listed generation. | 



# **Table `PokemonPastTypePokemonType`**
(mapped from: PokemonPastTypePokemonType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonPastType | pokemonPastType | long | | kotlin.Long | Primary Key | *one*
pokemonType | pokemonType | long | | kotlin.Long | Foreign Key | *many*



