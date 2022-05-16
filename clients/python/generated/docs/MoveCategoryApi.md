# openapi_client.MoveCategoryApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**move_category_list**](MoveCategoryApi.md#move_category_list) | **GET** /api/v2/move-category/ | 
[**move_category_read**](MoveCategoryApi.md#move_category_read) | **GET** /api/v2/move-category/{id}/ | 


# **move_category_list**
> str move_category_list()



### Example


```python
import time
import openapi_client
from openapi_client.api import move_category_api
from pprint import pprint
# Defining the host is optional and defaults to https://pokeapi.co/api/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co/api/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = move_category_api.MoveCategoryApi(api_client)
    limit = 1 # int |  (optional)
    offset = 1 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        api_response = api_instance.move_category_list(limit=limit, offset=offset)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling MoveCategoryApi->move_category_list: %s\n" % e)
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

# **move_category_read**
> str move_category_read(id)



### Example


```python
import time
import openapi_client
from openapi_client.api import move_category_api
from pprint import pprint
# Defining the host is optional and defaults to https://pokeapi.co/api/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co/api/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = move_category_api.MoveCategoryApi(api_client)
    id = 1 # int | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.move_category_read(id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling MoveCategoryApi->move_category_read: %s\n" % e)
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

