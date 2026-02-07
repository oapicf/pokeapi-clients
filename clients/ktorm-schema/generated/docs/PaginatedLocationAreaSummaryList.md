
# Table `PaginatedLocationAreaSummaryList`
(mapped from: PaginatedLocationAreaSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaSummary&gt;**](LocationAreaSummary.md) |  |  [optional]





# **Table `PaginatedLocationAreaSummaryListLocationAreaSummary`**
(mapped from: PaginatedLocationAreaSummaryListLocationAreaSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedLocationAreaSummaryList | paginatedLocationAreaSummaryList | long | | kotlin.Long | Primary Key | *one*
locationAreaSummary | locationAreaSummary | long | | kotlin.Long | Foreign Key | *many*



