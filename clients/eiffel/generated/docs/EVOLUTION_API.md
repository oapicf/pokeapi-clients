# EVOLUTION_API

All URIs are relative to *https://pokeapi.co*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**evolution_chain_list**](EVOLUTION_API.md#evolution_chain_list) | **Get** /api/v2/evolution-chain/ | List evolution chains
[**evolution_chain_retrieve**](EVOLUTION_API.md#evolution_chain_retrieve) | **Get** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolution_trigger_list**](EVOLUTION_API.md#evolution_trigger_list) | **Get** /api/v2/evolution-trigger/ | List evolution triggers
[**evolution_trigger_retrieve**](EVOLUTION_API.md#evolution_trigger_retrieve) | **Get** /api/v2/evolution-trigger/{id}/ | Get evolution trigger


# **evolution_chain_list**
> evolution_chain_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_EVOLUTION_CHAIN_SUMMARY_LIST


List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_EVOLUTION_CHAIN_SUMMARY_LIST**](PaginatedEvolutionChainSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_chain_retrieve**
> evolution_chain_retrieve (id: STRING_32 ): detachable EVOLUTION_CHAIN_DETAIL


Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**EVOLUTION_CHAIN_DETAIL**](EvolutionChainDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_trigger_list**
> evolution_trigger_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_EVOLUTION_TRIGGER_SUMMARY_LIST


List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_EVOLUTION_TRIGGER_SUMMARY_LIST**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_trigger_retrieve**
> evolution_trigger_retrieve (id: STRING_32 ): detachable EVOLUTION_TRIGGER_DETAIL


Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**EVOLUTION_TRIGGER_DETAIL**](EvolutionTriggerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

