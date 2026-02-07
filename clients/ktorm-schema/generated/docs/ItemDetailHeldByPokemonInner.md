
# Table `ItemDetail_held_by_pokemon_inner`
(mapped from: ItemDetailHeldByPokemonInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**pokemon** | pokemon | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemDetailHeldByPokemonInnerVersionDetailsInner&gt;**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  | 



# **Table `ItemDetailHeldByPokemonInnerItemDetailHeldByPokemonInnerVersionDetailsInner`**
(mapped from: ItemDetailHeldByPokemonInnerItemDetailHeldByPokemonInnerVersionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetailHeldByPokemonInner | itemDetailHeldByPokemonInner | long | | kotlin.Long | Primary Key | *one*
itemDetailHeldByPokemonInnerVersionDetailsInner | itemDetailHeldByPokemonInnerVersionDetailsInner | long | | kotlin.Long | Foreign Key | *many*



