# EvolutionApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](EvolutionApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**evolutionChainRetrieve**](EvolutionApi.md#evolutionChainRetrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolutionTriggerList**](EvolutionApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**evolutionTriggerRetrieve**](EvolutionApi.md#evolutionTriggerRetrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger



## evolutionChainList

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

```bash
 evolutionChainList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## evolutionChainRetrieve

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

```bash
 evolutionChainRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**EvolutionChainDetail**](EvolutionChainDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## evolutionTriggerList

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

```bash
 evolutionTriggerList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## evolutionTriggerRetrieve

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

```bash
 evolutionTriggerRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

