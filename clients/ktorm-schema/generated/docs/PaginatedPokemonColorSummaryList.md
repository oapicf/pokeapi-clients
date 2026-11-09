
# Table `PaginatedPokemonColorSummaryList`
(mapped from: PaginatedPokemonColorSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int NOT NULL |  | **kotlin.Int** | The total number of resources available from this API. | 
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonColorSummary&gt;**](PokemonColorSummary.md) | A list of API resources on this page. | 
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the next page in the list, or null if there is no next page. |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the previous page in the list, or null if there is no previous page. |  [optional]



# **Table `PaginatedPokemonColorSummaryListPokemonColorSummary`**
(mapped from: PaginatedPokemonColorSummaryListPokemonColorSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPokemonColorSummaryList | paginatedPokemonColorSummaryList | long | | kotlin.Long | Primary Key | *one*
pokemonColorSummary | pokemonColorSummary | long | | kotlin.Long | Foreign Key | *many*





