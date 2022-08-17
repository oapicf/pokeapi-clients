# MoveTargetApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveTargetList**](MoveTargetApi.md#moveTargetList) | **GET** /api/v2/move-target/ |  |
| [**moveTargetRead**](MoveTargetApi.md#moveTargetRead) | **GET** /api/v2/move-target/{id}/ |  |


<a name="moveTargetList"></a>
# **moveTargetList**
> String moveTargetList(limit, offset)



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

<a name="moveTargetRead"></a>
# **moveTargetRead**
> String moveTargetRead(id)



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

