
# Table `PaginatedContestTypeSummaryList`
(mapped from: PaginatedContestTypeSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ContestTypeSummary&gt;**](ContestTypeSummary.md) |  |  [optional]





# **Table `PaginatedContestTypeSummaryListContestTypeSummary`**
(mapped from: PaginatedContestTypeSummaryListContestTypeSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedContestTypeSummaryList | paginatedContestTypeSummaryList | long | | kotlin.Long | Primary Key | *one*
contestTypeSummary | contestTypeSummary | long | | kotlin.Long | Foreign Key | *many*



