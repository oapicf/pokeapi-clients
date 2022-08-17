# ItemPocketApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemPocketList**](ItemPocketApi.md#itemPocketList) | **GET** /api/v2/item-pocket/ |  |
| [**itemPocketRead**](ItemPocketApi.md#itemPocketRead) | **GET** /api/v2/item-pocket/{id}/ |  |


<a name="itemPocketList"></a>
# **itemPocketList**
> String itemPocketList(limit, offset)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] [default to null] |
| **offset** | **Integer**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

<a name="itemPocketRead"></a>
# **itemPocketRead**
> String itemPocketRead(id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

