
# Table `PaginatedPokemonColorSummaryList`
(mapped from: PaginatedPokemonColorSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonColorSummary&gt;**](PokemonColorSummary.md) |  |  [optional]





# **Table `PaginatedPokemonColorSummaryListPokemonColorSummary`**
(mapped from: PaginatedPokemonColorSummaryListPokemonColorSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPokemonColorSummaryList | paginatedPokemonColorSummaryList | long | | kotlin.Long | Primary Key | *one*
pokemonColorSummary | pokemonColorSummary | long | | kotlin.Long | Foreign Key | *many*



