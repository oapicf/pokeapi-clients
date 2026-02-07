
# Table `PaginatedPokedexSummaryList`
(mapped from: PaginatedPokedexSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokedexSummary&gt;**](PokedexSummary.md) |  |  [optional]





# **Table `PaginatedPokedexSummaryListPokedexSummary`**
(mapped from: PaginatedPokedexSummaryListPokedexSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPokedexSummaryList | paginatedPokedexSummaryList | long | | kotlin.Long | Primary Key | *one*
pokedexSummary | pokedexSummary | long | | kotlin.Long | Foreign Key | *many*



