
# Table `PaginatedEncounterConditionValueSummaryList`
(mapped from: PaginatedEncounterConditionValueSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) |  |  [optional]





# **Table `PaginatedEncounterConditionValueSummaryListEncounterConditionValueSummary`**
(mapped from: PaginatedEncounterConditionValueSummaryListEncounterConditionValueSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedEncounterConditionValueSummaryList | paginatedEncounterConditionValueSummaryList | long | | kotlin.Long | Primary Key | *one*
encounterConditionValueSummary | encounterConditionValueSummary | long | | kotlin.Long | Foreign Key | *many*



