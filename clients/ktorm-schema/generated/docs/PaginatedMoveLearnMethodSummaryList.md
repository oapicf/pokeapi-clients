
# Table `PaginatedMoveLearnMethodSummaryList`
(mapped from: PaginatedMoveLearnMethodSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveLearnMethodSummary&gt;**](MoveLearnMethodSummary.md) |  |  [optional]





# **Table `PaginatedMoveLearnMethodSummaryListMoveLearnMethodSummary`**
(mapped from: PaginatedMoveLearnMethodSummaryListMoveLearnMethodSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMoveLearnMethodSummaryList | paginatedMoveLearnMethodSummaryList | long | | kotlin.Long | Primary Key | *one*
moveLearnMethodSummary | moveLearnMethodSummary | long | | kotlin.Long | Foreign Key | *many*



