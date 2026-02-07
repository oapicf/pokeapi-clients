
# Table `PaginatedMoveBattleStyleSummaryList`
(mapped from: PaginatedMoveBattleStyleSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveBattleStyleSummary&gt;**](MoveBattleStyleSummary.md) |  |  [optional]





# **Table `PaginatedMoveBattleStyleSummaryListMoveBattleStyleSummary`**
(mapped from: PaginatedMoveBattleStyleSummaryListMoveBattleStyleSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMoveBattleStyleSummaryList | paginatedMoveBattleStyleSummaryList | long | | kotlin.Long | Primary Key | *one*
moveBattleStyleSummary | moveBattleStyleSummary | long | | kotlin.Long | Foreign Key | *many*



