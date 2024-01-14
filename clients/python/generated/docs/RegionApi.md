# pokeapiclient.RegionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**region_list**](RegionApi.md#region_list) | **GET** /api/v2/region/ | 
[**region_read**](RegionApi.md#region_read) | **GET** /api/v2/region/{id}/ | 


# **region_list**
> str region_list(limit=limit, offset=offset)



### Example


```python
import time
import os
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
    api_instance = pokeapiclient.RegionApi(api_client)
    limit = 56 # int |  (optional)
    offset = 56 # int |  (optional)

    try:
        api_response = api_instance.region_list(limit=limit, offset=offset)
        print("The response of RegionApi->region_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RegionApi->region_list: %s\n" % e)
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

# **region_read**
> str region_read(id)



### Example


```python
import time
import os
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
    api_instance = pokeapiclient.RegionApi(api_client)
    id = 56 # int | 

    try:
        api_response = api_instance.region_read(id)
        print("The response of RegionApi->region_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RegionApi->region_read: %s\n" % e)
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

