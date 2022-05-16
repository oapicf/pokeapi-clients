# MachineController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[MachineController.java](../../src/main/java/org/openapitools/controller/MachineController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](#machineList) | **GET** /api/v2/machine/ | 
[**machineRead**](#machineRead) | **GET** /api/v2/machine/{id}/ | 

<a name="machineList"></a>
# **machineList**
```java
Mono<String> MachineController.machineList(limitoffset)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` |  | [optional parameter]
**offset** | `Integer` |  | [optional parameter]

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

<a name="machineRead"></a>
# **machineRead**
```java
Mono<String> MachineController.machineRead(id)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `Integer` |  |

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

