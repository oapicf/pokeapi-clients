# BerryApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**berryList**](BerryApi.md#berryList) | **GET** /api/v2/berry/ |  |
| [**berryRead**](BerryApi.md#berryRead) | **GET** /api/v2/berry/{id}/ |  |


<a name="berryList"></a>
# **berryList**
> String berryList(limit, offset)



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

<a name="berryRead"></a>
# **berryRead**
> String berryRead(id)



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

