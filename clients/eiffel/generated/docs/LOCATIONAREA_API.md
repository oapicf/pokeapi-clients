# LOCATIONAREA_API

All URIs are relative to *https://pokeapi.co/api/v2*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**location_area_list**](LOCATIONAREA_API.md#location_area_list) | **Get** /api/v2/location-area/ | 
[**location_area_read**](LOCATIONAREA_API.md#location_area_read) | **Get** /api/v2/location-area/{id}/ | 


# **location_area_list**
> location_area_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ): detachable STRING_32





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

# **location_area_read**
> location_area_read (id: INTEGER_32 ): detachable STRING_32





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

