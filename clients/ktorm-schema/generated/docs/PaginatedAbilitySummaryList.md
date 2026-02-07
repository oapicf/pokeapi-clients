
# Table `PaginatedAbilitySummaryList`
(mapped from: PaginatedAbilitySummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilitySummary&gt;**](AbilitySummary.md) |  |  [optional]





# **Table `PaginatedAbilitySummaryListAbilitySummary`**
(mapped from: PaginatedAbilitySummaryListAbilitySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedAbilitySummaryList | paginatedAbilitySummaryList | long | | kotlin.Long | Primary Key | *one*
abilitySummary | abilitySummary | long | | kotlin.Long | Foreign Key | *many*



