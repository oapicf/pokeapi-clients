# \ContestEffectAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ContestEffectList**](ContestEffectAPI.md#ContestEffectList) | **Get** /api/v2/contest-effect/ | 
[**ContestEffectRead**](ContestEffectAPI.md#ContestEffectRead) | **Get** /api/v2/contest-effect/{id}/ | 



## ContestEffectList

> string ContestEffectList(ctx).Limit(limit).Offset(offset).Execute()



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
	limit := int32(56) // int32 |  (optional)
	offset := int32(56) // int32 |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ContestEffectAPI.ContestEffectList(context.Background()).Limit(limit).Offset(offset).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ContestEffectAPI.ContestEffectList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ContestEffectList`: string
	fmt.Fprintf(os.Stdout, "Response from `ContestEffectAPI.ContestEffectList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiContestEffectListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** |  | 
 **offset** | **int32** |  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ContestEffectRead

> string ContestEffectRead(ctx, id).Execute()



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
	id := int32(56) // int32 | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ContestEffectAPI.ContestEffectRead(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ContestEffectAPI.ContestEffectRead``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ContestEffectRead`: string
	fmt.Fprintf(os.Stdout, "Response from `ContestEffectAPI.ContestEffectRead`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiContestEffectReadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

