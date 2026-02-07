# \GamesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenerationList**](GamesAPI.md#GenerationList) | **Get** /api/v2/generation/ | List genrations
[**GenerationRetrieve**](GamesAPI.md#GenerationRetrieve) | **Get** /api/v2/generation/{id}/ | Get genration
[**PokedexList**](GamesAPI.md#PokedexList) | **Get** /api/v2/pokedex/ | List pokedex
[**PokedexRetrieve**](GamesAPI.md#PokedexRetrieve) | **Get** /api/v2/pokedex/{id}/ | Get pokedex
[**VersionGroupList**](GamesAPI.md#VersionGroupList) | **Get** /api/v2/version-group/ | List version groups
[**VersionGroupRetrieve**](GamesAPI.md#VersionGroupRetrieve) | **Get** /api/v2/version-group/{id}/ | Get version group
[**VersionList**](GamesAPI.md#VersionList) | **Get** /api/v2/version/ | List versions
[**VersionRetrieve**](GamesAPI.md#VersionRetrieve) | **Get** /api/v2/version/{id}/ | Get version



## GenerationList

> PaginatedGenerationSummaryList GenerationList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List genrations



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
	resp, r, err := apiClient.GamesAPI.GenerationList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GamesAPI.GenerationList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerationList`: PaginatedGenerationSummaryList
	fmt.Fprintf(os.Stdout, "Response from `GamesAPI.GenerationList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerationListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedGenerationSummaryList**](PaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerationRetrieve

> GenerationDetail GenerationRetrieve(ctx, id).Execute()

Get genration



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
	resp, r, err := apiClient.GamesAPI.GenerationRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GamesAPI.GenerationRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerationRetrieve`: GenerationDetail
	fmt.Fprintf(os.Stdout, "Response from `GamesAPI.GenerationRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGenerationRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GenerationDetail**](GenerationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PokedexList

> PaginatedPokedexSummaryList PokedexList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List pokedex



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
	resp, r, err := apiClient.GamesAPI.PokedexList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GamesAPI.PokedexList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PokedexList`: PaginatedPokedexSummaryList
	fmt.Fprintf(os.Stdout, "Response from `GamesAPI.PokedexList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPokedexListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedPokedexSummaryList**](PaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PokedexRetrieve

> PokedexDetail PokedexRetrieve(ctx, id).Execute()

Get pokedex



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
	resp, r, err := apiClient.GamesAPI.PokedexRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GamesAPI.PokedexRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PokedexRetrieve`: PokedexDetail
	fmt.Fprintf(os.Stdout, "Response from `GamesAPI.PokedexRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPokedexRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**PokedexDetail**](PokedexDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VersionGroupList

> PaginatedVersionGroupSummaryList VersionGroupList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List version groups



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
	resp, r, err := apiClient.GamesAPI.VersionGroupList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GamesAPI.VersionGroupList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `VersionGroupList`: PaginatedVersionGroupSummaryList
	fmt.Fprintf(os.Stdout, "Response from `GamesAPI.VersionGroupList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVersionGroupListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedVersionGroupSummaryList**](PaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VersionGroupRetrieve

> VersionGroupDetail VersionGroupRetrieve(ctx, id).Execute()

Get version group



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
	resp, r, err := apiClient.GamesAPI.VersionGroupRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GamesAPI.VersionGroupRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `VersionGroupRetrieve`: VersionGroupDetail
	fmt.Fprintf(os.Stdout, "Response from `GamesAPI.VersionGroupRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiVersionGroupRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**VersionGroupDetail**](VersionGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VersionList

> PaginatedVersionSummaryList VersionList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List versions



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
	resp, r, err := apiClient.GamesAPI.VersionList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GamesAPI.VersionList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `VersionList`: PaginatedVersionSummaryList
	fmt.Fprintf(os.Stdout, "Response from `GamesAPI.VersionList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVersionListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedVersionSummaryList**](PaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VersionRetrieve

> VersionDetail VersionRetrieve(ctx, id).Execute()

Get version



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
	resp, r, err := apiClient.GamesAPI.VersionRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GamesAPI.VersionRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `VersionRetrieve`: VersionDetail
	fmt.Fprintf(os.Stdout, "Response from `GamesAPI.VersionRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiVersionRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**VersionDetail**](VersionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

