
# Table `PokemonDetail_moves_inner`
(mapped from: PokemonDetailMovesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**move** | move | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**versionGroupDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailMovesInnerVersionGroupDetailsInner&gt;**](PokemonDetailMovesInnerVersionGroupDetailsInner.md) |  | 



# **Table `PokemonDetailMovesInnerPokemonDetailMovesInnerVersionGroupDetailsInner`**
(mapped from: PokemonDetailMovesInnerPokemonDetailMovesInnerVersionGroupDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetailMovesInner | pokemonDetailMovesInner | long | | kotlin.Long | Primary Key | *one*
pokemonDetailMovesInnerVersionGroupDetailsInner | pokemonDetailMovesInnerVersionGroupDetailsInner | long | | kotlin.Long | Foreign Key | *many*



