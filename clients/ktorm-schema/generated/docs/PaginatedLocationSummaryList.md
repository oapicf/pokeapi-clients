
# Table `PaginatedLocationSummaryList`
(mapped from: PaginatedLocationSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationSummary&gt;**](LocationSummary.md) |  |  [optional]





# **Table `PaginatedLocationSummaryListLocationSummary`**
(mapped from: PaginatedLocationSummaryListLocationSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedLocationSummaryList | paginatedLocationSummaryList | long | | kotlin.Long | Primary Key | *one*
locationSummary | locationSummary | long | | kotlin.Long | Foreign Key | *many*



