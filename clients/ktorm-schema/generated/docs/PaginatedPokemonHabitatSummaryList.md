
# Table `PaginatedPokemonHabitatSummaryList`
(mapped from: PaginatedPokemonHabitatSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonHabitatSummary&gt;**](PokemonHabitatSummary.md) |  |  [optional]





# **Table `PaginatedPokemonHabitatSummaryListPokemonHabitatSummary`**
(mapped from: PaginatedPokemonHabitatSummaryListPokemonHabitatSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPokemonHabitatSummaryList | paginatedPokemonHabitatSummaryList | long | | kotlin.Long | Primary Key | *one*
pokemonHabitatSummary | pokemonHabitatSummary | long | | kotlin.Long | Foreign Key | *many*



