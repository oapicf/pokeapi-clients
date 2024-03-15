# pokeapiclient.ItemFlingEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**item_fling_effect_list**](ItemFlingEffectApi.md#item_fling_effect_list) | **GET** /api/v2/item-fling-effect/ | 
[**item_fling_effect_read**](ItemFlingEffectApi.md#item_fling_effect_read) | **GET** /api/v2/item-fling-effect/{id}/ | 


# **item_fling_effect_list**
> str item_fling_effect_list(limit=limit, offset=offset)



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
    api_instance = pokeapiclient.ItemFlingEffectApi(api_client)
    limit = 56 # int |  (optional)
    offset = 56 # int |  (optional)

    try:
        api_response = api_instance.item_fling_effect_list(limit=limit, offset=offset)
        print("The response of ItemFlingEffectApi->item_fling_effect_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemFlingEffectApi->item_fling_effect_list: %s\n" % e)
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

# **item_fling_effect_read**
> str item_fling_effect_read(id)



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
    api_instance = pokeapiclient.ItemFlingEffectApi(api_client)
    id = 56 # int | 

    try:
        api_response = api_instance.item_fling_effect_read(id)
        print("The response of ItemFlingEffectApi->item_fling_effect_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemFlingEffectApi->item_fling_effect_read: %s\n" % e)
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

