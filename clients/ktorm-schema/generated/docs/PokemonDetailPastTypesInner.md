
# Table `PokemonDetail_past_types_inner`
(mapped from: PokemonDetailPastTypesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**generation** | generation | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**types** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailTypesInner&gt;**](PokemonDetailTypesInner.md) |  | 



# **Table `PokemonDetailPastTypesInnerPokemonDetailTypesInner`**
(mapped from: PokemonDetailPastTypesInnerPokemonDetailTypesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetailPastTypesInner | pokemonDetailPastTypesInner | long | | kotlin.Long | Primary Key | *one*
pokemonDetailTypesInner | pokemonDetailTypesInner | long | | kotlin.Long | Foreign Key | *many*



