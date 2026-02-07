
# Table `PaginatedPokeathlonStatSummaryList`
(mapped from: PaginatedPokeathlonStatSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokeathlonStatSummary&gt;**](PokeathlonStatSummary.md) |  |  [optional]





# **Table `PaginatedPokeathlonStatSummaryListPokeathlonStatSummary`**
(mapped from: PaginatedPokeathlonStatSummaryListPokeathlonStatSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPokeathlonStatSummaryList | paginatedPokeathlonStatSummaryList | long | | kotlin.Long | Primary Key | *one*
pokeathlonStatSummary | pokeathlonStatSummary | long | | kotlin.Long | Foreign Key | *many*



