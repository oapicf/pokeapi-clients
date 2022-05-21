# EncounterConditionValueApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionValueList**](EncounterConditionValueApi.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | 
[**encounterConditionValueRead**](EncounterConditionValueApi.md#encounterConditionValueRead) | **GET** /api/v2/encounter-condition-value/{id}/ | 



## encounterConditionValueList

> String encounterConditionValueList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EncounterConditionValueApi;

EncounterConditionValueApi apiInstance = new EncounterConditionValueApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.encounterConditionValueList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncounterConditionValueApi#encounterConditionValueList");
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


## encounterConditionValueRead

> String encounterConditionValueRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EncounterConditionValueApi;

EncounterConditionValueApi apiInstance = new EncounterConditionValueApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.encounterConditionValueRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncounterConditionValueApi#encounterConditionValueRead");
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

