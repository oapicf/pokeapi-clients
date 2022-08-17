# CharacteristicApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**characteristicList**](CharacteristicApi.md#characteristicList) | **GET** /api/v2/characteristic/ |  |
| [**characteristicRead**](CharacteristicApi.md#characteristicRead) | **GET** /api/v2/characteristic/{id}/ |  |


<a name="characteristicList"></a>
# **characteristicList**
> String characteristicList(limit, offset)



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

<a name="characteristicRead"></a>
# **characteristicRead**
> String characteristicRead(id)



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

