# pokeapiclient.SuperContestEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**super_contest_effect_list**](SuperContestEffectApi.md#super_contest_effect_list) | **GET** /api/v2/super-contest-effect/ | 
[**super_contest_effect_read**](SuperContestEffectApi.md#super_contest_effect_read) | **GET** /api/v2/super-contest-effect/{id}/ | 


# **super_contest_effect_list**
> str super_contest_effect_list()



### Example


```python
import time
import pokeapiclient
from pokeapiclient.api import super_contest_effect_api
from pprint import pprint
# Defining the host is optional and defaults to https://pokeapi.co/api/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = pokeapiclient.Configuration(
    host = "https://pokeapi.co/api/v2"
)


# Enter a context with an instance of the API client
with pokeapiclient.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = super_contest_effect_api.SuperContestEffectApi(api_client)
    limit = 1 # int |  (optional)
    offset = 1 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        api_response = api_instance.super_contest_effect_list(limit=limit, offset=offset)
        pprint(api_response)
    except pokeapiclient.ApiException as e:
        print("Exception when calling SuperContestEffectApi->super_contest_effect_list: %s\n" % e)
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

# **super_contest_effect_read**
> str super_contest_effect_read(id)



### Example


```python
import time
import pokeapiclient
from pokeapiclient.api import super_contest_effect_api
from pprint import pprint
# Defining the host is optional and defaults to https://pokeapi.co/api/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = pokeapiclient.Configuration(
    host = "https://pokeapi.co/api/v2"
)


# Enter a context with an instance of the API client
with pokeapiclient.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = super_contest_effect_api.SuperContestEffectApi(api_client)
    id = 1 # int | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.super_contest_effect_read(id)
        pprint(api_response)
    except pokeapiclient.ApiException as e:
        print("Exception when calling SuperContestEffectApi->super_contest_effect_read: %s\n" % e)
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

