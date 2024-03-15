# pokeapiclient.EncounterConditionValueApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounter_condition_value_list**](EncounterConditionValueApi.md#encounter_condition_value_list) | **GET** /api/v2/encounter-condition-value/ | 
[**encounter_condition_value_read**](EncounterConditionValueApi.md#encounter_condition_value_read) | **GET** /api/v2/encounter-condition-value/{id}/ | 


# **encounter_condition_value_list**
> str encounter_condition_value_list(limit=limit, offset=offset)



### Example


```python
import pokeapiclient
from pokeapiclient.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = pokeapiclient.Configuration(
    host = "https://pokeapi.co"
)


# Enter a context with an instance of the API client
with pokeapiclient.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pokeapiclient.EncounterConditionValueApi(api_client)
    limit = 56 # int |  (optional)
    offset = 56 # int |  (optional)

    try:
        api_response = api_instance.encounter_condition_value_list(limit=limit, offset=offset)
        print("The response of EncounterConditionValueApi->encounter_condition_value_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EncounterConditionValueApi->encounter_condition_value_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] 
 **offset** | **int**|  | [optional] 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_condition_value_read**
> str encounter_condition_value_read(id)



### Example


```python
import pokeapiclient
from pokeapiclient.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = pokeapiclient.Configuration(
    host = "https://pokeapi.co"
)


# Enter a context with an instance of the API client
with pokeapiclient.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pokeapiclient.EncounterConditionValueApi(api_client)
    id = 56 # int | 

    try:
        api_response = api_instance.encounter_condition_value_read(id)
        print("The response of EncounterConditionValueApi->encounter_condition_value_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EncounterConditionValueApi->encounter_condition_value_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

