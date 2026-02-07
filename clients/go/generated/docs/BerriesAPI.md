# \BerriesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BerryFirmnessList**](BerriesAPI.md#BerryFirmnessList) | **Get** /api/v2/berry-firmness/ | List berry firmness
[**BerryFirmnessRetrieve**](BerriesAPI.md#BerryFirmnessRetrieve) | **Get** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**BerryFlavorList**](BerriesAPI.md#BerryFlavorList) | **Get** /api/v2/berry-flavor/ | List berry flavors
[**BerryFlavorRetrieve**](BerriesAPI.md#BerryFlavorRetrieve) | **Get** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**BerryList**](BerriesAPI.md#BerryList) | **Get** /api/v2/berry/ | List berries
[**BerryRetrieve**](BerriesAPI.md#BerryRetrieve) | **Get** /api/v2/berry/{id}/ | Get a berry



## BerryFirmnessList

> PaginatedBerryFirmnessSummaryList BerryFirmnessList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List berry firmness



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
	resp, r, err := apiClient.BerriesAPI.BerryFirmnessList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BerriesAPI.BerryFirmnessList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BerryFirmnessList`: PaginatedBerryFirmnessSummaryList
	fmt.Fprintf(os.Stdout, "Response from `BerriesAPI.BerryFirmnessList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBerryFirmnessListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BerryFirmnessRetrieve

> BerryFirmnessDetail BerryFirmnessRetrieve(ctx, id).Execute()

Get berry by firmness



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
	resp, r, err := apiClient.BerriesAPI.BerryFirmnessRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BerriesAPI.BerryFirmnessRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BerryFirmnessRetrieve`: BerryFirmnessDetail
	fmt.Fprintf(os.Stdout, "Response from `BerriesAPI.BerryFirmnessRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBerryFirmnessRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**BerryFirmnessDetail**](BerryFirmnessDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BerryFlavorList

> PaginatedBerryFlavorSummaryList BerryFlavorList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List berry flavors



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
	resp, r, err := apiClient.BerriesAPI.BerryFlavorList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BerriesAPI.BerryFlavorList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BerryFlavorList`: PaginatedBerryFlavorSummaryList
	fmt.Fprintf(os.Stdout, "Response from `BerriesAPI.BerryFlavorList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBerryFlavorListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BerryFlavorRetrieve

> BerryFlavorDetail BerryFlavorRetrieve(ctx, id).Execute()

Get berries by flavor



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
	resp, r, err := apiClient.BerriesAPI.BerryFlavorRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BerriesAPI.BerryFlavorRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BerryFlavorRetrieve`: BerryFlavorDetail
	fmt.Fprintf(os.Stdout, "Response from `BerriesAPI.BerryFlavorRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBerryFlavorRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**BerryFlavorDetail**](BerryFlavorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BerryList

> PaginatedBerrySummaryList BerryList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List berries



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
	resp, r, err := apiClient.BerriesAPI.BerryList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BerriesAPI.BerryList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BerryList`: PaginatedBerrySummaryList
	fmt.Fprintf(os.Stdout, "Response from `BerriesAPI.BerryList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBerryListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BerryRetrieve

> BerryDetail BerryRetrieve(ctx, id).Execute()

Get a berry



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
	resp, r, err := apiClient.BerriesAPI.BerryRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BerriesAPI.BerryRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BerryRetrieve`: BerryDetail
	fmt.Fprintf(os.Stdout, "Response from `BerriesAPI.BerryRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBerryRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**BerryDetail**](BerryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

