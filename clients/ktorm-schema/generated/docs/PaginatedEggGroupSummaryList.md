
# Table `PaginatedEggGroupSummaryList`
(mapped from: PaginatedEggGroupSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EggGroupSummary&gt;**](EggGroupSummary.md) |  |  [optional]





# **Table `PaginatedEggGroupSummaryListEggGroupSummary`**
(mapped from: PaginatedEggGroupSummaryListEggGroupSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedEggGroupSummaryList | paginatedEggGroupSummaryList | long | | kotlin.Long | Primary Key | *one*
eggGroupSummary | eggGroupSummary | long | | kotlin.Long | Foreign Key | *many*



