# RegionApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**regionList**](RegionApi.md#regionList) | **GET** /api/v2/region/ | 
[**regionRead**](RegionApi.md#regionRead) | **GET** /api/v2/region/{id}/ | 


<a name="regionList"></a>
# **regionList**
> String regionList(limit, offset)



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

<a name="regionRead"></a>
# **regionRead**
> String regionRead(id)



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

