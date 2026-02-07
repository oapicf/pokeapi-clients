
# Table `PaginatedEncounterMethodSummaryList`
(mapped from: PaginatedEncounterMethodSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterMethodSummary&gt;**](EncounterMethodSummary.md) |  |  [optional]





# **Table `PaginatedEncounterMethodSummaryListEncounterMethodSummary`**
(mapped from: PaginatedEncounterMethodSummaryListEncounterMethodSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedEncounterMethodSummaryList | paginatedEncounterMethodSummaryList | long | | kotlin.Long | Primary Key | *one*
encounterMethodSummary | encounterMethodSummary | long | | kotlin.Long | Foreign Key | *many*



