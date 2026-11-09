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
Mono<PaginatedMachineSummaryList> MachinesController.machineList(limitoffset)
```

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]

### Return type
[**PaginatedMachineSummaryList**](../../docs/models/PaginatedMachineSummaryList.md)


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


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

