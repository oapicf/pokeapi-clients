# EncounterConditionApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncounterConditionApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | 
[**encounterConditionRead**](EncounterConditionApi.md#encounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 


<a name="encounterConditionList"></a>
# **encounterConditionList**
> String encounterConditionList(limit, offset)



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

<a name="encounterConditionRead"></a>
# **encounterConditionRead**
> String encounterConditionRead(id)



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

