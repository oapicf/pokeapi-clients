# openapi_client.EvolutionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolution_chain_list**](EvolutionApi.md#evolution_chain_list) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**evolution_chain_retrieve**](EvolutionApi.md#evolution_chain_retrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolution_trigger_list**](EvolutionApi.md#evolution_trigger_list) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**evolution_trigger_retrieve**](EvolutionApi.md#evolution_trigger_retrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
[**evolution_variable_list**](EvolutionApi.md#evolution_variable_list) | **GET** /api/v2/evolution-variable/ | List evolution variables
[**evolution_variable_retrieve**](EvolutionApi.md#evolution_variable_retrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable


# **evolution_chain_list**
> PaginatedEvolutionChainSummaryList evolution_chain_list(limit=limit, offset=offset)

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.paginated_evolution_chain_summary_list import PaginatedEvolutionChainSummaryList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.EvolutionApi(api_client)
    limit = 56 # int | Number of results to return per page. (optional)
    offset = 56 # int | The initial index from which to return the results. (optional)

    try:
        # List evolution chains
        api_response = api_instance.evolution_chain_list(limit=limit, offset=offset)
        print("The response of EvolutionApi->evolution_chain_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EvolutionApi->evolution_chain_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 

### Return type

[**PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_chain_retrieve**
> EvolutionChainDetail evolution_chain_retrieve(id)

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.evolution_chain_detail import EvolutionChainDetail
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.EvolutionApi(api_client)
    id = '1' # str | This parameter can be a string or an integer.

    try:
        # Get evolution chain
        api_response = api_instance.evolution_chain_retrieve(id)
        print("The response of EvolutionApi->evolution_chain_retrieve:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EvolutionApi->evolution_chain_retrieve: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionChainDetail**](EvolutionChainDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_trigger_list**
> PaginatedEvolutionTriggerSummaryList evolution_trigger_list(limit=limit, offset=offset, q=q)

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.paginated_evolution_trigger_summary_list import PaginatedEvolutionTriggerSummaryList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.EvolutionApi(api_client)
    limit = 56 # int | Number of results to return per page. (optional)
    offset = 56 # int | The initial index from which to return the results. (optional)
    q = 'q_example' # str | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

    try:
        # List evolution triggers
        api_response = api_instance.evolution_trigger_list(limit=limit, offset=offset, q=q)
        print("The response of EvolutionApi->evolution_trigger_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EvolutionApi->evolution_trigger_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **str**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_trigger_retrieve**
> EvolutionTriggerDetail evolution_trigger_retrieve(id)

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.evolution_trigger_detail import EvolutionTriggerDetail
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.EvolutionApi(api_client)
    id = '1' # str | This parameter can be a string or an integer.

    try:
        # Get evolution trigger
        api_response = api_instance.evolution_trigger_retrieve(id)
        print("The response of EvolutionApi->evolution_trigger_retrieve:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EvolutionApi->evolution_trigger_retrieve: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_variable_list**
> PaginatedEvolutionVariableSummaryList evolution_variable_list(limit=limit, offset=offset, q=q)

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.paginated_evolution_variable_summary_list import PaginatedEvolutionVariableSummaryList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.EvolutionApi(api_client)
    limit = 56 # int | Number of results to return per page. (optional)
    offset = 56 # int | The initial index from which to return the results. (optional)
    q = 'q_example' # str | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

    try:
        # List evolution variables
        api_response = api_instance.evolution_variable_list(limit=limit, offset=offset, q=q)
        print("The response of EvolutionApi->evolution_variable_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EvolutionApi->evolution_variable_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **str**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEvolutionVariableSummaryList**](PaginatedEvolutionVariableSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_variable_retrieve**
> EvolutionVariableDetail evolution_variable_retrieve(id)

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.evolution_variable_detail import EvolutionVariableDetail
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.EvolutionApi(api_client)
    id = '1' # str | This parameter can be a string or an integer.

    try:
        # Get evolution variable
        api_response = api_instance.evolution_variable_retrieve(id)
        print("The response of EvolutionApi->evolution_variable_retrieve:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EvolutionApi->evolution_variable_retrieve: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionVariableDetail**](EvolutionVariableDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

