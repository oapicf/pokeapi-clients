
# Table `PaginatedEncounterConditionValueSummaryList`
(mapped from: PaginatedEncounterConditionValueSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int NOT NULL |  | **kotlin.Int** | The total number of resources available from this API. | 
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of API resources on this page. | 
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the next page in the list, or null if there is no next page. |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the previous page in the list, or null if there is no previous page. |  [optional]



# **Table `PaginatedEncounterConditionValueSummaryListEncounterConditionValueSummary`**
(mapped from: PaginatedEncounterConditionValueSummaryListEncounterConditionValueSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedEncounterConditionValueSummaryList | paginatedEncounterConditionValueSummaryList | long | | kotlin.Long | Primary Key | *one*
encounterConditionValueSummary | encounterConditionValueSummary | long | | kotlin.Long | Foreign Key | *many*





