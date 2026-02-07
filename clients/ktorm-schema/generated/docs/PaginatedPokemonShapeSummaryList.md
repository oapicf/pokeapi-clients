
# Table `PaginatedPokemonShapeSummaryList`
(mapped from: PaginatedPokemonShapeSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonShapeSummary&gt;**](PokemonShapeSummary.md) |  |  [optional]





# **Table `PaginatedPokemonShapeSummaryListPokemonShapeSummary`**
(mapped from: PaginatedPokemonShapeSummaryListPokemonShapeSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPokemonShapeSummaryList | paginatedPokemonShapeSummaryList | long | | kotlin.Long | Primary Key | *one*
pokemonShapeSummary | pokemonShapeSummary | long | | kotlin.Long | Foreign Key | *many*



