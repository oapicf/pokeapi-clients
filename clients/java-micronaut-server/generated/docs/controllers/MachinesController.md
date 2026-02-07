# MachinesController

All URIs are relative to `""`

The controller class is defined in **[MachinesController.java](../../src/main/java/org/openapitools/controller/MachinesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](#machineList) | **GET** /api/v2/machine/ | List machines
[**machineRetrieve**](#machineRetrieve) | **GET** /api/v2/machine/{id}/ | Get machine

<a id="machineList"></a>
# **machineList**
```java
Mono<PaginatedMachineSummaryList> MachinesController.machineList(limitoffsetq)
```

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedMachineSummaryList**](../../docs/models/PaginatedMachineSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="machineRetrieve"></a>
# **machineRetrieve**
```java
Mono<MachineDetail> MachinesController.machineRetrieve(id)
```

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**MachineDetail**](../../docs/models/MachineDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

