
# Table `PaginatedContestEffectSummaryList`
(mapped from: PaginatedContestEffectSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ContestEffectSummary&gt;**](ContestEffectSummary.md) |  |  [optional]





# **Table `PaginatedContestEffectSummaryListContestEffectSummary`**
(mapped from: PaginatedContestEffectSummaryListContestEffectSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedContestEffectSummaryList | paginatedContestEffectSummaryList | long | | kotlin.Long | Primary Key | *one*
contestEffectSummary | contestEffectSummary | long | | kotlin.Long | Foreign Key | *many*



