# MachineApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](MachineApi.md#machineList) | **GET** /api/v2/machine/ | 
[**machineRead**](MachineApi.md#machineRead) | **GET** /api/v2/machine/{id}/ | 



## machineList

> String machineList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MachineApi;

MachineApi apiInstance = new MachineApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.machineList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineApi#machineList");
    e.printStackTrace();
}
```

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


## machineRead

> String machineRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MachineApi;

MachineApi apiInstance = new MachineApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.machineRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineApi#machineRead");
    e.printStackTrace();
}
```

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

