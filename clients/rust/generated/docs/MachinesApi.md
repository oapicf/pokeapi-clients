# \MachinesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machine_list**](MachinesApi.md#machine_list) | **GET** /api/v2/machine/ | List machines
[**machine_retrieve**](MachinesApi.md#machine_retrieve) | **GET** /api/v2/machine/{id}/ | Get machine



## machine_list

> models::PaginatedMachineSummaryList machine_list(limit, offset, q)
List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedMachineSummaryList**](PaginatedMachineSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## machine_retrieve

> models::MachineDetail machine_retrieve(id)
Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::MachineDetail**](MachineDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

