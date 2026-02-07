# EvolutionAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](EvolutionAPI.md#evolutionchainlist) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**evolutionChainRetrieve**](EvolutionAPI.md#evolutionchainretrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolutionTriggerList**](EvolutionAPI.md#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**evolutionTriggerRetrieve**](EvolutionAPI.md#evolutiontriggerretrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger


# **evolutionChainList**
```swift
    open class func evolutionChainList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedEvolutionChainSummaryList?, _ error: Error?) -> Void)
```

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List evolution chains
EvolutionAPI.evolutionChainList(limit: limit, offset: offset, q: q) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int** | Number of results to return per page. | [optional] 
 **offset** | **Int** | The initial index from which to return the results. | [optional] 
 **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionChainRetrieve**
```swift
    open class func evolutionChainRetrieve(id: String, completion: @escaping (_ data: EvolutionChainDetail?, _ error: Error?) -> Void)
```

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get evolution chain
EvolutionAPI.evolutionChainRetrieve(id: id) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String** | This parameter can be a string or an integer. | 

### Return type

[**EvolutionChainDetail**](EvolutionChainDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionTriggerList**
```swift
    open class func evolutionTriggerList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedEvolutionTriggerSummaryList?, _ error: Error?) -> Void)
```

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List evolution triggers
EvolutionAPI.evolutionTriggerList(limit: limit, offset: offset, q: q) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int** | Number of results to return per page. | [optional] 
 **offset** | **Int** | The initial index from which to return the results. | [optional] 
 **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionTriggerRetrieve**
```swift
    open class func evolutionTriggerRetrieve(id: String, completion: @escaping (_ data: EvolutionTriggerDetail?, _ error: Error?) -> Void)
```

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get evolution trigger
EvolutionAPI.evolutionTriggerRetrieve(id: id) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String** | This parameter can be a string or an integer. | 

### Return type

[**EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

