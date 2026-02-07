
# Table `PaginatedEvolutionChainSummaryList`
(mapped from: PaginatedEvolutionChainSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionChainSummary&gt;**](EvolutionChainSummary.md) |  |  [optional]





# **Table `PaginatedEvolutionChainSummaryListEvolutionChainSummary`**
(mapped from: PaginatedEvolutionChainSummaryListEvolutionChainSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedEvolutionChainSummaryList | paginatedEvolutionChainSummaryList | long | | kotlin.Long | Primary Key | *one*
evolutionChainSummary | evolutionChainSummary | long | | kotlin.Long | Foreign Key | *many*



