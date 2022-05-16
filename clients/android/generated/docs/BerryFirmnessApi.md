# BerryFirmnessApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerryFirmnessApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | 
[**berryFirmnessRead**](BerryFirmnessApi.md#berryFirmnessRead) | **GET** /api/v2/berry-firmness/{id}/ | 



## berryFirmnessList

> String berryFirmnessList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.BerryFirmnessApi;

BerryFirmnessApi apiInstance = new BerryFirmnessApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.berryFirmnessList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BerryFirmnessApi#berryFirmnessList");
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


## berryFirmnessRead

> String berryFirmnessRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.BerryFirmnessApi;

BerryFirmnessApi apiInstance = new BerryFirmnessApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.berryFirmnessRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BerryFirmnessApi#berryFirmnessRead");
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

