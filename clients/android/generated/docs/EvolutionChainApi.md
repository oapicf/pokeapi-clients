# EvolutionChainApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](EvolutionChainApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | 
[**evolutionChainRead**](EvolutionChainApi.md#evolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ | 



## evolutionChainList

> String evolutionChainList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EvolutionChainApi;

EvolutionChainApi apiInstance = new EvolutionChainApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.evolutionChainList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvolutionChainApi#evolutionChainList");
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


## evolutionChainRead

> String evolutionChainRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EvolutionChainApi;

EvolutionChainApi apiInstance = new EvolutionChainApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.evolutionChainRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvolutionChainApi#evolutionChainRead");
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

