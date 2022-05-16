# MachineApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](MachineApi.md#machineList) | **GET** /api/v2/machine/ | 
[**machineRead**](MachineApi.md#machineRead) | **GET** /api/v2/machine/{id}/ | 


<a name="machineList"></a>
# **machineList**
> String machineList(limit, offset)



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to null]
 **offset** | **Integer**|  | [optional] [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

<a name="machineRead"></a>
# **machineRead**
> String machineRead(id)



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  | [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

