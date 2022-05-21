# EvolutionTriggerApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionTriggerList**](EvolutionTriggerApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
[**evolutionTriggerRead**](EvolutionTriggerApi.md#evolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 



## evolutionTriggerList

> String evolutionTriggerList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EvolutionTriggerApi;

EvolutionTriggerApi apiInstance = new EvolutionTriggerApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.evolutionTriggerList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvolutionTriggerApi#evolutionTriggerList");
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


## evolutionTriggerRead

> String evolutionTriggerRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EvolutionTriggerApi;

EvolutionTriggerApi apiInstance = new EvolutionTriggerApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.evolutionTriggerRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvolutionTriggerApi#evolutionTriggerRead");
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

