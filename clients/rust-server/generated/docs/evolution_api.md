# evolution_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
**evolution_chain_list**](evolution_api.md#evolution_chain_list) | **GET** /api/v2/evolution-chain/ | List evolution chains
**evolution_trigger_list**](evolution_api.md#evolution_trigger_list) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
**evolution_variable_list**](evolution_api.md#evolution_variable_list) | **GET** /api/v2/evolution-variable/ | List evolution variables
**evolution_chain_retrieve**](evolution_api.md#evolution_chain_retrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
**evolution_trigger_retrieve**](evolution_api.md#evolution_trigger_retrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
**evolution_variable_retrieve**](evolution_api.md#evolution_variable_retrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable


# **evolution_chain_list**
> models::PaginatedEvolutionChainSummaryList evolution_chain_list(optional)
List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **i32**| Number of results to return per page. | 
 **offset** | **i32**| The initial index from which to return the results. | 

### Return type

[**models::PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_trigger_list**
> models::PaginatedEvolutionTriggerSummaryList evolution_trigger_list(optional)
List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **i32**| Number of results to return per page. | 
 **offset** | **i32**| The initial index from which to return the results. | 
 **q** | **String**| > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  | 

### Return type

[**models::PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_variable_list**
> models::PaginatedEvolutionVariableSummaryList evolution_variable_list(optional)
List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **i32**| Number of results to return per page. | 
 **offset** | **i32**| The initial index from which to return the results. | 
 **q** | **String**| > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  | 

### Return type

[**models::PaginatedEvolutionVariableSummaryList**](PaginatedEvolutionVariableSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_chain_retrieve**
> models::EvolutionChainDetail evolution_chain_retrieve(id)
Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**models::EvolutionChainDetail**](EvolutionChainDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_trigger_retrieve**
> models::EvolutionTriggerDetail evolution_trigger_retrieve(id)
Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**models::EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_variable_retrieve**
> models::EvolutionVariableDetail evolution_variable_retrieve(id)
Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**models::EvolutionVariableDetail**](EvolutionVariableDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

