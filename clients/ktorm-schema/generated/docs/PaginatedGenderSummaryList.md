
# Table `PaginatedGenderSummaryList`
(mapped from: PaginatedGenderSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GenderSummary&gt;**](GenderSummary.md) |  |  [optional]





# **Table `PaginatedGenderSummaryListGenderSummary`**
(mapped from: PaginatedGenderSummaryListGenderSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedGenderSummaryList | paginatedGenderSummaryList | long | | kotlin.Long | Primary Key | *one*
genderSummary | genderSummary | long | | kotlin.Long | Foreign Key | *many*



