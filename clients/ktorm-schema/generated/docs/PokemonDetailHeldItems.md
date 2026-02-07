
# Table `PokemonDetail_held_items`
(mapped from: PokemonDetailHeldItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**item** | item | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemDetailHeldByPokemonInnerVersionDetailsInner&gt;**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  | 



# **Table `PokemonDetailHeldItemsItemDetailHeldByPokemonInnerVersionDetailsInner`**
(mapped from: PokemonDetailHeldItemsItemDetailHeldByPokemonInnerVersionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonDetailHeldItems | pokemonDetailHeldItems | long | | kotlin.Long | Primary Key | *one*
itemDetailHeldByPokemonInnerVersionDetailsInner | itemDetailHeldByPokemonInnerVersionDetailsInner | long | | kotlin.Long | Foreign Key | *many*



