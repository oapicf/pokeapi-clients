# MachinesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](MachinesApi.md#machineList) | **GET** /api/v2/machine/ | List machines
[**machineRetrieve**](MachinesApi.md#machineRetrieve) | **GET** /api/v2/machine/{id}/ | Get machine



## machineList

> PaginatedMachineSummaryList machineList(limit, offset, q)

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MachinesApi;

MachinesApi apiInstance = new MachinesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedMachineSummaryList result = apiInstance.machineList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machineList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedMachineSummaryList**](PaginatedMachineSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machineRetrieve

> MachineDetail machineRetrieve(id)

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MachinesApi;

MachinesApi apiInstance = new MachinesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    MachineDetail result = apiInstance.machineRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machineRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MachineDetail**](MachineDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

