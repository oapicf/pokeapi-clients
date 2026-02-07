# ItemsAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemsAPI_itemAttributeList**](ItemsAPI.md#ItemsAPI_itemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes
[**ItemsAPI_itemAttributeRetrieve**](ItemsAPI.md#ItemsAPI_itemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**ItemsAPI_itemCategoryList**](ItemsAPI.md#ItemsAPI_itemCategoryList) | **GET** /api/v2/item-category/ | List item categories
[**ItemsAPI_itemCategoryRetrieve**](ItemsAPI.md#ItemsAPI_itemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**ItemsAPI_itemFlingEffectList**](ItemsAPI.md#ItemsAPI_itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**ItemsAPI_itemFlingEffectRetrieve**](ItemsAPI.md#ItemsAPI_itemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**ItemsAPI_itemList**](ItemsAPI.md#ItemsAPI_itemList) | **GET** /api/v2/item/ | List items
[**ItemsAPI_itemPocketList**](ItemsAPI.md#ItemsAPI_itemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets
[**ItemsAPI_itemPocketRetrieve**](ItemsAPI.md#ItemsAPI_itemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**ItemsAPI_itemRetrieve**](ItemsAPI.md#ItemsAPI_itemRetrieve) | **GET** /api/v2/item/{id}/ | Get item


# **ItemsAPI_itemAttributeList**
```c
// List item attributes
//
// Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
//
paginated_item_attribute_summary_list_t* ItemsAPI_itemAttributeList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_item_attribute_summary_list_t](paginated_item_attribute_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemAttributeRetrieve**
```c
// Get item attribute
//
// Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
//
item_attribute_detail_t* ItemsAPI_itemAttributeRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[item_attribute_detail_t](item_attribute_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemCategoryList**
```c
// List item categories
//
// Item categories determine where items will be placed in the players bag.
//
paginated_item_category_summary_list_t* ItemsAPI_itemCategoryList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_item_category_summary_list_t](paginated_item_category_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemCategoryRetrieve**
```c
// Get item category
//
// Item categories determine where items will be placed in the players bag.
//
item_category_detail_t* ItemsAPI_itemCategoryRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[item_category_detail_t](item_category_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemFlingEffectList**
```c
// List item fling effects
//
// The various effects of the move\"Fling\" when used with different items.
//
paginated_item_fling_effect_summary_list_t* ItemsAPI_itemFlingEffectList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_item_fling_effect_summary_list_t](paginated_item_fling_effect_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemFlingEffectRetrieve**
```c
// Get item fling effect
//
// The various effects of the move\"Fling\" when used with different items.
//
item_fling_effect_detail_t* ItemsAPI_itemFlingEffectRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[item_fling_effect_detail_t](item_fling_effect_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemList**
```c
// List items
//
// An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
//
paginated_item_summary_list_t* ItemsAPI_itemList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_item_summary_list_t](paginated_item_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemPocketList**
```c
// List item pockets
//
// Pockets within the players bag used for storing items by category.
//
paginated_item_pocket_summary_list_t* ItemsAPI_itemPocketList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_item_pocket_summary_list_t](paginated_item_pocket_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemPocketRetrieve**
```c
// Get item pocket
//
// Pockets within the players bag used for storing items by category.
//
item_pocket_detail_t* ItemsAPI_itemPocketRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[item_pocket_detail_t](item_pocket_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemsAPI_itemRetrieve**
```c
// Get item
//
// An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
//
item_detail_t* ItemsAPI_itemRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[item_detail_t](item_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

