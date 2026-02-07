
# Table `PaginatedStatSummaryList`
(mapped from: PaginatedStatSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;StatSummary&gt;**](StatSummary.md) |  |  [optional]





# **Table `PaginatedStatSummaryListStatSummary`**
(mapped from: PaginatedStatSummaryListStatSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedStatSummaryList | paginatedStatSummaryList | long | | kotlin.Long | Primary Key | *one*
statSummary | statSummary | long | | kotlin.Long | Foreign Key | *many*



