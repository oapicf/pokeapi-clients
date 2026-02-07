# EncountersAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncountersAPI.md#encounterconditionlist) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**encounterConditionRetrieve**](EncountersAPI.md#encounterconditionretrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounterConditionValueList**](EncountersAPI.md#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounterConditionValueRetrieve**](EncountersAPI.md#encounterconditionvalueretrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounterMethodList**](EncountersAPI.md#encountermethodlist) | **GET** /api/v2/encounter-method/ | List encounter methods
[**encounterMethodRetrieve**](EncountersAPI.md#encountermethodretrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
[**pokemonEncountersRetrieve**](EncountersAPI.md#pokemonencountersretrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter


# **encounterConditionList**
```swift
    open class func encounterConditionList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedEncounterConditionSummaryList?, _ error: Error?) -> Void)
```

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List encounter conditions
EncountersAPI.encounterConditionList(limit: limit, offset: offset, q: q) { (response, error) in
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

[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounterConditionRetrieve**
```swift
    open class func encounterConditionRetrieve(id: String, completion: @escaping (_ data: EncounterConditionDetail?, _ error: Error?) -> Void)
```

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get encounter condition
EncountersAPI.encounterConditionRetrieve(id: id) { (response, error) in
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

[**EncounterConditionDetail**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounterConditionValueList**
```swift
    open class func encounterConditionValueList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedEncounterConditionValueSummaryList?, _ error: Error?) -> Void)
```

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List encounter condition values
EncountersAPI.encounterConditionValueList(limit: limit, offset: offset, q: q) { (response, error) in
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

[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounterConditionValueRetrieve**
```swift
    open class func encounterConditionValueRetrieve(id: String, completion: @escaping (_ data: EncounterConditionValueDetail?, _ error: Error?) -> Void)
```

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get encounter condition value
EncountersAPI.encounterConditionValueRetrieve(id: id) { (response, error) in
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

[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounterMethodList**
```swift
    open class func encounterMethodList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedEncounterMethodSummaryList?, _ error: Error?) -> Void)
```

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List encounter methods
EncountersAPI.encounterMethodList(limit: limit, offset: offset, q: q) { (response, error) in
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

[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounterMethodRetrieve**
```swift
    open class func encounterMethodRetrieve(id: String, completion: @escaping (_ data: EncounterMethodDetail?, _ error: Error?) -> Void)
```

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get encounter method
EncountersAPI.encounterMethodRetrieve(id: id) { (response, error) in
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

[**EncounterMethodDetail**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemonEncountersRetrieve**
```swift
    open class func pokemonEncountersRetrieve(pokemonId: String, completion: @escaping (_ data: [PokemonEncountersRetrieve200ResponseInner]?, _ error: Error?) -> Void)
```

Get pokemon encounter

Handles Pokemon Encounters as a sub-resource.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pokemonId = "pokemonId_example" // String | 

// Get pokemon encounter
EncountersAPI.pokemonEncountersRetrieve(pokemonId: pokemonId) { (response, error) in
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
 **pokemonId** | **String** |  | 

### Return type

[**[PokemonEncountersRetrieve200ResponseInner]**](PokemonEncountersRetrieve200ResponseInner.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

