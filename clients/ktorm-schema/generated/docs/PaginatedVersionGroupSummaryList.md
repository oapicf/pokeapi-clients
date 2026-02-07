
# Table `PaginatedVersionGroupSummaryList`
(mapped from: PaginatedVersionGroupSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) |  |  [optional]





# **Table `PaginatedVersionGroupSummaryListVersionGroupSummary`**
(mapped from: PaginatedVersionGroupSummaryListVersionGroupSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedVersionGroupSummaryList | paginatedVersionGroupSummaryList | long | | kotlin.Long | Primary Key | *one*
versionGroupSummary | versionGroupSummary | long | | kotlin.Long | Foreign Key | *many*



