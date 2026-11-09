
# Table `PokemonHeldItemSummary`
(mapped from: PokemonHeldItemSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**item** | item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) | The item the referenced Pokémon holds. |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonHeldItemVersion&gt;**](PokemonHeldItemVersion.md) | The details of the different versions in which the item is held. | 



# **Table `PokemonHeldItemSummaryPokemonHeldItemVersion`**
(mapped from: PokemonHeldItemSummaryPokemonHeldItemVersion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonHeldItemSummary | pokemonHeldItemSummary | long | | kotlin.Long | Primary Key | *one*
pokemonHeldItemVersion | pokemonHeldItemVersion | long | | kotlin.Long | Foreign Key | *many*



