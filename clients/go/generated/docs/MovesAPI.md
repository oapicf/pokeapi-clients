# \MovesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveAilmentList**](MovesAPI.md#MoveAilmentList) | **Get** /api/v2/move-ailment/ | List move meta ailments
[**MoveAilmentRetrieve**](MovesAPI.md#MoveAilmentRetrieve) | **Get** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**MoveBattleStyleList**](MovesAPI.md#MoveBattleStyleList) | **Get** /api/v2/move-battle-style/ | List move battle styles
[**MoveBattleStyleRetrieve**](MovesAPI.md#MoveBattleStyleRetrieve) | **Get** /api/v2/move-battle-style/{id}/ | Get move battle style
[**MoveCategoryList**](MovesAPI.md#MoveCategoryList) | **Get** /api/v2/move-category/ | List move meta categories
[**MoveCategoryRetrieve**](MovesAPI.md#MoveCategoryRetrieve) | **Get** /api/v2/move-category/{id}/ | Get move meta category
[**MoveLearnMethodList**](MovesAPI.md#MoveLearnMethodList) | **Get** /api/v2/move-learn-method/ | List move learn methods
[**MoveLearnMethodRetrieve**](MovesAPI.md#MoveLearnMethodRetrieve) | **Get** /api/v2/move-learn-method/{id}/ | Get move learn method
[**MoveList**](MovesAPI.md#MoveList) | **Get** /api/v2/move/ | List moves
[**MoveRetrieve**](MovesAPI.md#MoveRetrieve) | **Get** /api/v2/move/{id}/ | Get move
[**MoveTargetList**](MovesAPI.md#MoveTargetList) | **Get** /api/v2/move-target/ | List move targets
[**MoveTargetRetrieve**](MovesAPI.md#MoveTargetRetrieve) | **Get** /api/v2/move-target/{id}/ | Get move target



## MoveAilmentList

> PaginatedMoveMetaAilmentSummaryList MoveAilmentList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List move meta ailments



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
	resp, r, err := apiClient.MovesAPI.MoveAilmentList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveAilmentList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveAilmentList`: PaginatedMoveMetaAilmentSummaryList
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveAilmentList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMoveAilmentListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedMoveMetaAilmentSummaryList**](PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveAilmentRetrieve

> MoveMetaAilmentDetail MoveAilmentRetrieve(ctx, id).Execute()

Get move meta ailment



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
	resp, r, err := apiClient.MovesAPI.MoveAilmentRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveAilmentRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveAilmentRetrieve`: MoveMetaAilmentDetail
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveAilmentRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiMoveAilmentRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**MoveMetaAilmentDetail**](MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveBattleStyleList

> PaginatedMoveBattleStyleSummaryList MoveBattleStyleList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List move battle styles



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
	resp, r, err := apiClient.MovesAPI.MoveBattleStyleList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveBattleStyleList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveBattleStyleList`: PaginatedMoveBattleStyleSummaryList
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveBattleStyleList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMoveBattleStyleListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedMoveBattleStyleSummaryList**](PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveBattleStyleRetrieve

> MoveBattleStyleDetail MoveBattleStyleRetrieve(ctx, id).Execute()

Get move battle style



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
	resp, r, err := apiClient.MovesAPI.MoveBattleStyleRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveBattleStyleRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveBattleStyleRetrieve`: MoveBattleStyleDetail
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveBattleStyleRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiMoveBattleStyleRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**MoveBattleStyleDetail**](MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveCategoryList

> PaginatedMoveMetaCategorySummaryList MoveCategoryList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List move meta categories



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
	resp, r, err := apiClient.MovesAPI.MoveCategoryList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveCategoryList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveCategoryList`: PaginatedMoveMetaCategorySummaryList
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveCategoryList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMoveCategoryListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedMoveMetaCategorySummaryList**](PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveCategoryRetrieve

> MoveMetaCategoryDetail MoveCategoryRetrieve(ctx, id).Execute()

Get move meta category



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
	resp, r, err := apiClient.MovesAPI.MoveCategoryRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveCategoryRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveCategoryRetrieve`: MoveMetaCategoryDetail
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveCategoryRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiMoveCategoryRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**MoveMetaCategoryDetail**](MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveLearnMethodList

> PaginatedMoveLearnMethodSummaryList MoveLearnMethodList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List move learn methods



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
	resp, r, err := apiClient.MovesAPI.MoveLearnMethodList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveLearnMethodList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveLearnMethodList`: PaginatedMoveLearnMethodSummaryList
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveLearnMethodList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMoveLearnMethodListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedMoveLearnMethodSummaryList**](PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveLearnMethodRetrieve

> MoveLearnMethodDetail MoveLearnMethodRetrieve(ctx, id).Execute()

Get move learn method



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
	resp, r, err := apiClient.MovesAPI.MoveLearnMethodRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveLearnMethodRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveLearnMethodRetrieve`: MoveLearnMethodDetail
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveLearnMethodRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiMoveLearnMethodRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**MoveLearnMethodDetail**](MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveList

> PaginatedMoveSummaryList MoveList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List moves



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
	resp, r, err := apiClient.MovesAPI.MoveList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveList`: PaginatedMoveSummaryList
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMoveListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedMoveSummaryList**](PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveRetrieve

> MoveDetail MoveRetrieve(ctx, id).Execute()

Get move



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
	resp, r, err := apiClient.MovesAPI.MoveRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveRetrieve`: MoveDetail
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiMoveRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**MoveDetail**](MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveTargetList

> PaginatedMoveTargetSummaryList MoveTargetList(ctx).Limit(limit).Offset(offset).Q(q).Execute()

List move targets



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
	resp, r, err := apiClient.MovesAPI.MoveTargetList(context.Background()).Limit(limit).Offset(offset).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveTargetList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveTargetList`: PaginatedMoveTargetSummaryList
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveTargetList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMoveTargetListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Number of results to return per page. | 
 **offset** | **int32** | The initial index from which to return the results. | 
 **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | 

### Return type

[**PaginatedMoveTargetSummaryList**](PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MoveTargetRetrieve

> MoveTargetDetail MoveTargetRetrieve(ctx, id).Execute()

Get move target



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
	resp, r, err := apiClient.MovesAPI.MoveTargetRetrieve(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MovesAPI.MoveTargetRetrieve``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MoveTargetRetrieve`: MoveTargetDetail
	fmt.Fprintf(os.Stdout, "Response from `MovesAPI.MoveTargetRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | This parameter can be a string or an integer. | 

### Other Parameters

Other parameters are passed through a pointer to a apiMoveTargetRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**MoveTargetDetail**](MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

