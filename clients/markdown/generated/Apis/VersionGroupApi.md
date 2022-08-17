# VersionGroupApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**versionGroupList**](VersionGroupApi.md#versionGroupList) | **GET** /api/v2/version-group/ |  |
| [**versionGroupRead**](VersionGroupApi.md#versionGroupRead) | **GET** /api/v2/version-group/{id}/ |  |


<a name="versionGroupList"></a>
# **versionGroupList**
> String versionGroupList(limit, offset)



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

<a name="versionGroupRead"></a>
# **versionGroupRead**
> String versionGroupRead(id)



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

