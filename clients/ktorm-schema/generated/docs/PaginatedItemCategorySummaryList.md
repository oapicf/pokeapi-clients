
# Table `PaginatedItemCategorySummaryList`
(mapped from: PaginatedItemCategorySummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int NOT NULL |  | **kotlin.Int** | The total number of resources available from this API. | 
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemCategorySummary&gt;**](ItemCategorySummary.md) | A list of API resources on this page. | 
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the next page in the list, or null if there is no next page. |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the previous page in the list, or null if there is no previous page. |  [optional]



# **Table `PaginatedItemCategorySummaryListItemCategorySummary`**
(mapped from: PaginatedItemCategorySummaryListItemCategorySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedItemCategorySummaryList | paginatedItemCategorySummaryList | long | | kotlin.Long | Primary Key | *one*
itemCategorySummary | itemCategorySummary | long | | kotlin.Long | Foreign Key | *many*





