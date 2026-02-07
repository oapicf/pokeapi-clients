
# Table `PaginatedEncounterConditionSummaryList`
(mapped from: PaginatedEncounterConditionSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionSummary&gt;**](EncounterConditionSummary.md) |  |  [optional]





# **Table `PaginatedEncounterConditionSummaryListEncounterConditionSummary`**
(mapped from: PaginatedEncounterConditionSummaryListEncounterConditionSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedEncounterConditionSummaryList | paginatedEncounterConditionSummaryList | long | | kotlin.Long | Primary Key | *one*
encounterConditionSummary | encounterConditionSummary | long | | kotlin.Long | Foreign Key | *many*



