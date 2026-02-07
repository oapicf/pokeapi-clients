
# Table `PaginatedRegionSummaryList`
(mapped from: PaginatedRegionSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RegionSummary&gt;**](RegionSummary.md) |  |  [optional]





# **Table `PaginatedRegionSummaryListRegionSummary`**
(mapped from: PaginatedRegionSummaryListRegionSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedRegionSummaryList | paginatedRegionSummaryList | long | | kotlin.Long | Primary Key | *one*
regionSummary | regionSummary | long | | kotlin.Long | Foreign Key | *many*



