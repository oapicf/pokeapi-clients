# ITEMATTRIBUTE_API

All URIs are relative to *https://pokeapi.co/api/v2*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**item_attribute_list**](ITEMATTRIBUTE_API.md#item_attribute_list) | **Get** /api/v2/item-attribute/ | 
[**item_attribute_read**](ITEMATTRIBUTE_API.md#item_attribute_read) | **Get** /api/v2/item-attribute/{id}/ | 


# **item_attribute_list**
> item_attribute_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ): detachable STRING_32





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

# **item_attribute_read**
> item_attribute_read (id: INTEGER_32 ): detachable STRING_32





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

