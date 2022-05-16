# ContestTypeApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestTypeList**](ContestTypeApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | 
[**contestTypeRead**](ContestTypeApi.md#contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 



## contestTypeList



### Example

```bash
 contestTypeList  limit=value  offset=value
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


## contestTypeRead



### Example

```bash
 contestTypeRead id=value
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

