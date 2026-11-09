
# Table `PaginatedItemPocketSummaryList`
(mapped from: PaginatedItemPocketSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int NOT NULL |  | **kotlin.Int** | The total number of resources available from this API. | 
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemPocketSummary&gt;**](ItemPocketSummary.md) | A list of API resources on this page. | 
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the next page in the list, or null if there is no next page. |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the previous page in the list, or null if there is no previous page. |  [optional]



# **Table `PaginatedItemPocketSummaryListItemPocketSummary`**
(mapped from: PaginatedItemPocketSummaryListItemPocketSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedItemPocketSummaryList | paginatedItemPocketSummaryList | long | | kotlin.Long | Primary Key | *one*
itemPocketSummary | itemPocketSummary | long | | kotlin.Long | Foreign Key | *many*





