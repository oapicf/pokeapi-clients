# openapi_client.PokemonColorApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemon_color_list**](PokemonColorApi.md#pokemon_color_list) | **GET** /api/v2/pokemon-color/ | 
[**pokemon_color_read**](PokemonColorApi.md#pokemon_color_read) | **GET** /api/v2/pokemon-color/{id}/ | 

# **pokemon_color_list**
> str pokemon_color_list()



### Example

```python
import openapi_client
from openapi_client.api import pokemon_color_api
from pprint import pprint
# Defining the host is optional and defaults to https://pokeapi.co/api/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co/api/v2"
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pokemon_color_api.PokemonColorApi(api_client)

    # example passing only optional values
    query_params = {
        'limit': 1,
        'offset': 1,
    }
    try:
        api_response = api_instance.pokemon_color_list(
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling PokemonColorApi->pokemon_color_list: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('text/plain', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
limit | LimitSchema | | optional
offset | OffsetSchema | | optional


#### LimitSchema

Number of results to return per page.

Type | Description | Notes
------------- | ------------- | -------------
**int** | Number of results to return per page. | 

#### OffsetSchema

The initial index from which to return the results.

Type | Description | Notes
------------- | ------------- | -------------
**int** | The initial index from which to return the results. | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
default | ApiResponseForDefault | Default response 

#### ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyTextPlain, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor0ResponseBodyTextPlain

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 


**str**

### Authorization

No authorization required

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_color_read**
> str pokemon_color_read(id)



### Example

```python
import openapi_client
from openapi_client.api import pokemon_color_api
from pprint import pprint
# Defining the host is optional and defaults to https://pokeapi.co/api/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://pokeapi.co/api/v2"
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pokemon_color_api.PokemonColorApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'id': 1,
    }
    try:
        api_response = api_instance.pokemon_color_read(
            path_params=path_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling PokemonColorApi->pokemon_color_read: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('text/plain', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
id | IdSchema | | 

#### IdSchema

A unique integer value identifying this pokemon color.

Type | Description | Notes
------------- | ------------- | -------------
**int** | A unique integer value identifying this pokemon color. | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
default | ApiResponseForDefault | Default response 

#### ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyTextPlain, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor0ResponseBodyTextPlain

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 


**str**

### Authorization

No authorization required

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

