
# Table `PaginatedGenerationSummaryList`
(mapped from: PaginatedGenerationSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GenerationSummary&gt;**](GenerationSummary.md) |  |  [optional]





# **Table `PaginatedGenerationSummaryListGenerationSummary`**
(mapped from: PaginatedGenerationSummaryListGenerationSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedGenerationSummaryList | paginatedGenerationSummaryList | long | | kotlin.Long | Primary Key | *one*
generationSummary | generationSummary | long | | kotlin.Long | Foreign Key | *many*



