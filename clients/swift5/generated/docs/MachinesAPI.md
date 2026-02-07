# MachinesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](MachinesAPI.md#machinelist) | **GET** /api/v2/machine/ | List machines
[**machineRetrieve**](MachinesAPI.md#machineretrieve) | **GET** /api/v2/machine/{id}/ | Get machine


# **machineList**
```swift
    open class func machineList(limit: Int? = nil, offset: Int? = nil, q: String? = nil, completion: @escaping (_ data: PaginatedMachineSummaryList?, _ error: Error?) -> Void)
```

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | Number of results to return per page. (optional)
let offset = 987 // Int | The initial index from which to return the results. (optional)
let q = "q_example" // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

// List machines
MachinesAPI.machineList(limit: limit, offset: offset, q: q) { (response, error) in
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

[**PaginatedMachineSummaryList**](PaginatedMachineSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **machineRetrieve**
```swift
    open class func machineRetrieve(id: String, completion: @escaping (_ data: MachineDetail?, _ error: Error?) -> Void)
```

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | This parameter can be a string or an integer.

// Get machine
MachinesAPI.machineRetrieve(id: id) { (response, error) in
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

[**MachineDetail**](MachineDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

