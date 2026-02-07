
# Table `PaginatedLanguageSummaryList`
(mapped from: PaginatedLanguageSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LanguageSummary&gt;**](LanguageSummary.md) |  |  [optional]





# **Table `PaginatedLanguageSummaryListLanguageSummary`**
(mapped from: PaginatedLanguageSummaryListLanguageSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedLanguageSummaryList | paginatedLanguageSummaryList | long | | kotlin.Long | Primary Key | *one*
languageSummary | languageSummary | long | | kotlin.Long | Foreign Key | *many*



