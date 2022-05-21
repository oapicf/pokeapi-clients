# EncounterMethodApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterMethodList**](EncounterMethodApi.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | 
[**encounterMethodRead**](EncounterMethodApi.md#encounterMethodRead) | **GET** /api/v2/encounter-method/{id}/ | 



## encounterMethodList

> String encounterMethodList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EncounterMethodApi;

EncounterMethodApi apiInstance = new EncounterMethodApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.encounterMethodList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncounterMethodApi#encounterMethodList");
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


## encounterMethodRead

> String encounterMethodRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EncounterMethodApi;

EncounterMethodApi apiInstance = new EncounterMethodApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.encounterMethodRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncounterMethodApi#encounterMethodRead");
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

