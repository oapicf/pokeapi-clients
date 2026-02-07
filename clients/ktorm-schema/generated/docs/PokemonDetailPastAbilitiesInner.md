
# Table `PokemonDetail_past_abilities_inner`
(mapped from: PokemonDetailPastAbilitiesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**abilities** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonDetailAbilitiesInner&gt;**](PokemonDetailAbilitiesInner.md) |  | 
**generation** | generation | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]


# **Table `PokemonDetailPastAbilitiesInnerPokemonDetailAbilitiesInner`**
(mapped from: PokemonDetailPastAbilitiesInnerPokemonDetailAbilitiesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetailPastAbilitiesInner | pokemonDetailPastAbilitiesInner | long | | kotlin.Long | Primary Key | *one*
pokemonDetailAbilitiesInner | pokemonDetailAbilitiesInner | long | | kotlin.Long | Foreign Key | *many*




