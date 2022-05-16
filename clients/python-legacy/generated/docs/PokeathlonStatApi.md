# openapi_client.PokeathlonStatApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokeathlon_stat_list**](PokeathlonStatApi.md#pokeathlon_stat_list) | **GET** /api/v2/pokeathlon-stat/ | 
[**pokeathlon_stat_read**](PokeathlonStatApi.md#pokeathlon_stat_read) | **GET** /api/v2/pokeathlon-stat/{id}/ | 


# **pokeathlon_stat_list**
> str pokeathlon_stat_list(limit=limit, offset=offset)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to https://pokeapi.co/api/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co/api/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PokeathlonStatApi(api_client)
    limit = 56 # int |  (optional)
offset = 56 # int |  (optional)

    try:
        api_response = api_instance.pokeathlon_stat_list(limit=limit, offset=offset)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PokeathlonStatApi->pokeathlon_stat_list: %s\n" % e)
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

# **pokeathlon_stat_read**
> str pokeathlon_stat_read(id)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to https://pokeapi.co/api/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co/api/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PokeathlonStatApi(api_client)
    id = 56 # int | 

    try:
        api_response = api_instance.pokeathlon_stat_read(id)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PokeathlonStatApi->pokeathlon_stat_read: %s\n" % e)
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

