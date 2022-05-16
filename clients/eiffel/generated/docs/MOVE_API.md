# MOVE_API

All URIs are relative to *https://pokeapi.co/api/v2*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**move_list**](MOVE_API.md#move_list) | **Get** /api/v2/move/ | 
[**move_read**](MOVE_API.md#move_read) | **Get** /api/v2/move/{id}/ | 


# **move_list**
> move_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ): detachable STRING_32





### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**|  | [optional] [default to null]
 **offset** | **INTEGER_32**|  | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_read**
> move_read (id: INTEGER_32 ): detachable STRING_32





### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **INTEGER_32**|  | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

