# EncounterConditionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncounterConditionApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | 
[**encounterConditionRead**](EncounterConditionApi.md#encounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 



## encounterConditionList

> String encounterConditionList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EncounterConditionApi;

EncounterConditionApi apiInstance = new EncounterConditionApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.encounterConditionList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncounterConditionApi#encounterConditionList");
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


## encounterConditionRead

> String encounterConditionRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EncounterConditionApi;

EncounterConditionApi apiInstance = new EncounterConditionApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.encounterConditionRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncounterConditionApi#encounterConditionRead");
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

