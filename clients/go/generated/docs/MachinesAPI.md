# \MachinesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MachineList**](MachinesAPI.md#MachineList) | **Get** /api/v2/machine/ | List machines
[**MachineRetrieve**](MachinesAPI.md#MachineRetrieve) | **Get** /api/v2/machine/{id}/ | Get machine



## MachineList

> PaginatedMachineSummaryList MachineList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List machines



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pokeapi-clients"
)

func main() {
	limit := int32(56) // int32 | Number of results to return per page. (optional)
	offset := int32(56) // int32 | The initial index from which to return the results. (optional)
	q := "q_example" // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MachinesAPI.MachineList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MachinesAPI.MachineList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MachineList`: PaginatedMachineSummaryList
	fmt.Fprintf(os.Stdout, "Response from `MachinesAPI.MachineList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMachineListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedMachineSummaryList**](PaginatedMachineSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MachineRetrieve

> MachineDetail MachineRetrieve(ctx, id).Execute()

Get machine



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pokeapi-clients"
)

func main() {
	id := "id_example" // string | This parameter can be a string or an integer.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MachinesAPI.MachineRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MachinesAPI.MachineRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MachineRetrieve`: MachineDetail
	fmt.Fprintf(os.Stdout, "Response from `MachinesAPI.MachineRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiMachineRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**MachineDetail**](MachineDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

