
# Table `PaginatedEvolutionTriggerSummaryList`
(mapped from: PaginatedEvolutionTriggerSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionTriggerSummary&gt;**](EvolutionTriggerSummary.md) |  |  [optional]





# **Table `PaginatedEvolutionTriggerSummaryListEvolutionTriggerSummary`**
(mapped from: PaginatedEvolutionTriggerSummaryListEvolutionTriggerSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedEvolutionTriggerSummaryList | paginatedEvolutionTriggerSummaryList | long | | kotlin.Long | Primary Key | *one*
evolutionTriggerSummary | evolutionTriggerSummary | long | | kotlin.Long | Foreign Key | *many*



