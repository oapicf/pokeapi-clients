# MACHINES_API

All URIs are relative to *https://pokeapi.co*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**machine_list**](MACHINES_API.md#machine_list) | **Get** /api/v2/machine/ | List machines
[**machine_retrieve**](MACHINES_API.md#machine_retrieve) | **Get** /api/v2/machine/{id}/ | Get machine


# **machine_list**
> machine_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_MACHINE_SUMMARY_LIST


List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_MACHINE_SUMMARY_LIST**](PaginatedMachineSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **machine_retrieve**
> machine_retrieve (id: STRING_32 ): detachable MACHINE_DETAIL


Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MACHINE_DETAIL**](MachineDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

