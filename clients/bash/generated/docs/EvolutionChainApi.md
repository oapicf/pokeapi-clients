# EvolutionChainApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](EvolutionChainApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | 
[**evolutionChainRead**](EvolutionChainApi.md#evolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ | 



## evolutionChainList



### Example

```bash
 evolutionChainList  limit=value  offset=value
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


## evolutionChainRead



### Example

```bash
 evolutionChainRead id=value
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

