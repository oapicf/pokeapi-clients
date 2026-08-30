# MachinesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machine_list**](MachinesApi.md#machine_list) | **GET** /api/v2/machine/ | List machines
[**machine_retrieve**](MachinesApi.md#machine_retrieve) | **GET** /api/v2/machine/{id}/ | Get machine


# **machine_list**
> `machine_list`(_api::`MachinesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedMachineSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `machine_list`(_api::`MachinesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedMachineSummaryList` }, `OpenAPI.Clients.ApiResponse`

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MachinesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedMachineSummaryList`**](PaginatedMachineSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **machine_retrieve**
> `machine_retrieve`(_api::`MachinesApi`, `id`::`String`; _mediaType=nothing) -> `MachineDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `machine_retrieve`(_api::`MachinesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `MachineDetail` }, `OpenAPI.Clients.ApiResponse`

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MachinesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`MachineDetail`**](MachineDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

