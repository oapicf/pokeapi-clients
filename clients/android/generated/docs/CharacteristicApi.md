# CharacteristicApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**characteristicList**](CharacteristicApi.md#characteristicList) | **GET** /api/v2/characteristic/ | 
[**characteristicRead**](CharacteristicApi.md#characteristicRead) | **GET** /api/v2/characteristic/{id}/ | 



## characteristicList

> String characteristicList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CharacteristicApi;

CharacteristicApi apiInstance = new CharacteristicApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.characteristicList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacteristicApi#characteristicList");
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


## characteristicRead

> String characteristicRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CharacteristicApi;

CharacteristicApi apiInstance = new CharacteristicApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.characteristicRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacteristicApi#characteristicRead");
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

