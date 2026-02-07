
# Table `PaginatedSuperContestEffectSummaryList`
(mapped from: PaginatedSuperContestEffectSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SuperContestEffectSummary&gt;**](SuperContestEffectSummary.md) |  |  [optional]





# **Table `PaginatedSuperContestEffectSummaryListSuperContestEffectSummary`**
(mapped from: PaginatedSuperContestEffectSummaryListSuperContestEffectSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedSuperContestEffectSummaryList | paginatedSuperContestEffectSummaryList | long | | kotlin.Long | Primary Key | *one*
superContestEffectSummary | superContestEffectSummary | long | | kotlin.Long | Foreign Key | *many*



