# GenerationApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](GenerationApi.md#generationList) | **GET** /api/v2/generation/ | 
[**generationRead**](GenerationApi.md#generationRead) | **GET** /api/v2/generation/{id}/ | 



## generationList



### Example

```bash
 generationList  limit=value  offset=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** |  | [optional] [default to null]
 **offset** | **integer** |  | [optional] [default to null]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generationRead



### Example

```bash
 generationRead id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **integer** |  | [default to null]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

