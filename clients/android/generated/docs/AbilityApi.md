# AbilityApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](AbilityApi.md#abilityList) | **GET** /api/v2/ability/ | 
[**abilityRead**](AbilityApi.md#abilityRead) | **GET** /api/v2/ability/{id}/ | 



## abilityList

> String abilityList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.AbilityApi;

AbilityApi apiInstance = new AbilityApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.abilityList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AbilityApi#abilityList");
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


## abilityRead

> String abilityRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.AbilityApi;

AbilityApi apiInstance = new AbilityApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.abilityRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AbilityApi#abilityRead");
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

