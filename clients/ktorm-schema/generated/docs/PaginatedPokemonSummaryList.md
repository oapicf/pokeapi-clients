
# Table `PaginatedPokemonSummaryList`
(mapped from: PaginatedPokemonSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSummary&gt;**](PokemonSummary.md) |  |  [optional]





# **Table `PaginatedPokemonSummaryListPokemonSummary`**
(mapped from: PaginatedPokemonSummaryListPokemonSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPokemonSummaryList | paginatedPokemonSummaryList | long | | kotlin.Long | Primary Key | *one*
pokemonSummary | pokemonSummary | long | | kotlin.Long | Foreign Key | *many*



