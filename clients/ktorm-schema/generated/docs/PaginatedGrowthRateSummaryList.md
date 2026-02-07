
# Table `PaginatedGrowthRateSummaryList`
(mapped from: PaginatedGrowthRateSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GrowthRateSummary&gt;**](GrowthRateSummary.md) |  |  [optional]





# **Table `PaginatedGrowthRateSummaryListGrowthRateSummary`**
(mapped from: PaginatedGrowthRateSummaryListGrowthRateSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedGrowthRateSummaryList | paginatedGrowthRateSummaryList | long | | kotlin.Long | Primary Key | *one*
growthRateSummary | growthRateSummary | long | | kotlin.Long | Foreign Key | *many*



