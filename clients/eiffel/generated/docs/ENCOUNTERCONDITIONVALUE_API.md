# ENCOUNTERCONDITIONVALUE_API

All URIs are relative to *https://pokeapi.co/api/v2*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**encounter_condition_value_list**](ENCOUNTERCONDITIONVALUE_API.md#encounter_condition_value_list) | **Get** /api/v2/encounter-condition-value/ | 
[**encounter_condition_value_read**](ENCOUNTERCONDITIONVALUE_API.md#encounter_condition_value_read) | **Get** /api/v2/encounter-condition-value/{id}/ | 


# **encounter_condition_value_list**
> encounter_condition_value_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ): detachable STRING_32





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

# **encounter_condition_value_read**
> encounter_condition_value_read (id: INTEGER_32 ): detachable STRING_32





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

