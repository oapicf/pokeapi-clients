# BerriesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerriesAPI.md#berryfirmnesslist) | **GET** /api/v2/berry-firmness/ | List berry firmness
[**berryFirmnessRetrieve**](BerriesAPI.md#berryfirmnessretrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**berryFlavorList**](BerriesAPI.md#berryflavorlist) | **GET** /api/v2/berry-flavor/ | List berry flavors
[**berryFlavorRetrieve**](BerriesAPI.md#berryflavorretrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**berryList**](BerriesAPI.md#berrylist) | **GET** /api/v2/berry/ | List berries
[**berryRetrieve**](BerriesAPI.md#berryretrieve) | **GET** /api/v2/berry/{id}/ | Get a berry


# **berryFirmnessList**
```swift
    open class func berryFirmnessList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedBerryFirmnessSummaryList?, _ error: Error?) -> Void)
```

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List berry firmness
BerriesAPI.berryFirmnessList(limit: limit, offset: offset, q: q) { (response, error) in
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

[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **berryFirmnessRetrieve**
```swift
    open class func berryFirmnessRetrieve(id: String, completion: @escaping (_ data: BerryFirmnessDetail?, _ error: Error?) -> Void)
```

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get berry by firmness
BerriesAPI.berryFirmnessRetrieve(id: id) { (response, error) in
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

[**BerryFirmnessDetail**](BerryFirmnessDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **berryFlavorList**
```swift
    open class func berryFlavorList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedBerryFlavorSummaryList?, _ error: Error?) -> Void)
```

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List berry flavors
BerriesAPI.berryFlavorList(limit: limit, offset: offset, q: q) { (response, error) in
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

[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **berryFlavorRetrieve**
```swift
    open class func berryFlavorRetrieve(id: String, completion: @escaping (_ data: BerryFlavorDetail?, _ error: Error?) -> Void)
```

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get berries by flavor
BerriesAPI.berryFlavorRetrieve(id: id) { (response, error) in
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

[**BerryFlavorDetail**](BerryFlavorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **berryList**
```swift
    open class func berryList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedBerrySummaryList?, _ error: Error?) -> Void)
```

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List berries
BerriesAPI.berryList(limit: limit, offset: offset, q: q) { (response, error) in
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

[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **berryRetrieve**
```swift
    open class func berryRetrieve(id: String, completion: @escaping (_ data: BerryDetail?, _ error: Error?) -> Void)
```

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get a berry
BerriesAPI.berryRetrieve(id: id) { (response, error) in
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

[**BerryDetail**](BerryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

