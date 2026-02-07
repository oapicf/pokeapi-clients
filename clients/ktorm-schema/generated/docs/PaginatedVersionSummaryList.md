
# Table `PaginatedVersionSummaryList`
(mapped from: PaginatedVersionSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionSummary&gt;**](VersionSummary.md) |  |  [optional]





# **Table `PaginatedVersionSummaryListVersionSummary`**
(mapped from: PaginatedVersionSummaryListVersionSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedVersionSummaryList | paginatedVersionSummaryList | long | | kotlin.Long | Primary Key | *one*
versionSummary | versionSummary | long | | kotlin.Long | Foreign Key | *many*



