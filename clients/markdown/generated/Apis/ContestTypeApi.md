# ContestTypeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestTypeList**](ContestTypeApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | 
[**contestTypeRead**](ContestTypeApi.md#contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 


<a name="contestTypeList"></a>
# **contestTypeList**
> String contestTypeList(limit, offset)



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

<a name="contestTypeRead"></a>
# **contestTypeRead**
> String contestTypeRead(id)



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

