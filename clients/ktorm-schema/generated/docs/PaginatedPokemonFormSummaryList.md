
# Table `PaginatedPokemonFormSummaryList`
(mapped from: PaginatedPokemonFormSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) |  |  [optional]





# **Table `PaginatedPokemonFormSummaryListPokemonFormSummary`**
(mapped from: PaginatedPokemonFormSummaryListPokemonFormSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPokemonFormSummaryList | paginatedPokemonFormSummaryList | long | | kotlin.Long | Primary Key | *one*
pokemonFormSummary | pokemonFormSummary | long | | kotlin.Long | Foreign Key | *many*



