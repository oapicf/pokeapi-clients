
# Table `PokemonHeldItem`
(mapped from: PokemonHeldItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**pokemon** | pokemon | long NOT NULL |  | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that holds this item. |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonHeldItemVersion&gt;**](PokemonHeldItemVersion.md) | The details for the version that this item is held in by the Pokémon. | 



# **Table `PokemonHeldItemPokemonHeldItemVersion`**
(mapped from: PokemonHeldItemPokemonHeldItemVersion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonHeldItem | pokemonHeldItem | long | | kotlin.Long | Primary Key | *one*
pokemonHeldItemVersion | pokemonHeldItemVersion | long | | kotlin.Long | Foreign Key | *many*



