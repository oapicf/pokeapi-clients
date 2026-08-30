# EvolutionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolution_chain_list**](EvolutionApi.md#evolution_chain_list) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**evolution_chain_retrieve**](EvolutionApi.md#evolution_chain_retrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolution_trigger_list**](EvolutionApi.md#evolution_trigger_list) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**evolution_trigger_retrieve**](EvolutionApi.md#evolution_trigger_retrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger


# **evolution_chain_list**
> `evolution_chain_list`(_api::`EvolutionApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedEvolutionChainSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `evolution_chain_list`(_api::`EvolutionApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedEvolutionChainSummaryList` }, `OpenAPI.Clients.ApiResponse`

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EvolutionApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEvolutionChainSummaryList`**](PaginatedEvolutionChainSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **evolution_chain_retrieve**
> `evolution_chain_retrieve`(_api::`EvolutionApi`, `id`::`String`; _mediaType=nothing) -> `EvolutionChainDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `evolution_chain_retrieve`(_api::`EvolutionApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `EvolutionChainDetail` }, `OpenAPI.Clients.ApiResponse`

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EvolutionApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`EvolutionChainDetail`**](EvolutionChainDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **evolution_trigger_list**
> `evolution_trigger_list`(_api::`EvolutionApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedEvolutionTriggerSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `evolution_trigger_list`(_api::`EvolutionApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedEvolutionTriggerSummaryList` }, `OpenAPI.Clients.ApiResponse`

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EvolutionApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEvolutionTriggerSummaryList`**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **evolution_trigger_retrieve**
> `evolution_trigger_retrieve`(_api::`EvolutionApi`, `id`::`String`; _mediaType=nothing) -> `EvolutionTriggerDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `evolution_trigger_retrieve`(_api::`EvolutionApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `EvolutionTriggerDetail` }, `OpenAPI.Clients.ApiResponse`

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EvolutionApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`EvolutionTriggerDetail`**](EvolutionTriggerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

