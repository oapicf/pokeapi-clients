# pokeapiclient.LanguageApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**language_list**](LanguageApi.md#language_list) | **GET** /api/v2/language/ | 
[**language_read**](LanguageApi.md#language_read) | **GET** /api/v2/language/{id}/ | 


# **language_list**
> str language_list(limit=limit, offset=offset)



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
    api_instance = pokeapiclient.LanguageApi(api_client)
    limit = 56 # int |  (optional)
    offset = 56 # int |  (optional)

    try:
        api_response = api_instance.language_list(limit=limit, offset=offset)
        print("The response of LanguageApi->language_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->language_list: %s\n" % e)
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

# **language_read**
> str language_read(id)



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
    api_instance = pokeapiclient.LanguageApi(api_client)
    id = 56 # int | 

    try:
        api_response = api_instance.language_read(id)
        print("The response of LanguageApi->language_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->language_read: %s\n" % e)
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

