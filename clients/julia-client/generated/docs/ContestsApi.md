# ContestsApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contest_effect_list**](ContestsApi.md#contest_effect_list) | **GET** /api/v2/contest-effect/ | List contest effects
[**contest_effect_retrieve**](ContestsApi.md#contest_effect_retrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
[**contest_type_list**](ContestsApi.md#contest_type_list) | **GET** /api/v2/contest-type/ | List contest types
[**contest_type_retrieve**](ContestsApi.md#contest_type_retrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
[**super_contest_effect_list**](ContestsApi.md#super_contest_effect_list) | **GET** /api/v2/super-contest-effect/ | List super contest effects
[**super_contest_effect_retrieve**](ContestsApi.md#super_contest_effect_retrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect


# **contest_effect_list**
> `contest_effect_list`(_api::`ContestsApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedContestEffectSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `contest_effect_list`(_api::`ContestsApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedContestEffectSummaryList` }, `OpenAPI.Clients.ApiResponse`

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ContestsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedContestEffectSummaryList`**](PaginatedContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **contest_effect_retrieve**
> `contest_effect_retrieve`(_api::`ContestsApi`, `id`::`String`; _mediaType=nothing) -> `ContestEffectDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `contest_effect_retrieve`(_api::`ContestsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `ContestEffectDetail` }, `OpenAPI.Clients.ApiResponse`

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ContestsApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`ContestEffectDetail`**](ContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **contest_type_list**
> `contest_type_list`(_api::`ContestsApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedContestTypeSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `contest_type_list`(_api::`ContestsApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedContestTypeSummaryList` }, `OpenAPI.Clients.ApiResponse`

List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ContestsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedContestTypeSummaryList`**](PaginatedContestTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **contest_type_retrieve**
> `contest_type_retrieve`(_api::`ContestsApi`, `id`::`String`; _mediaType=nothing) -> `ContestTypeDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `contest_type_retrieve`(_api::`ContestsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `ContestTypeDetail` }, `OpenAPI.Clients.ApiResponse`

Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ContestsApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`ContestTypeDetail`**](ContestTypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **super_contest_effect_list**
> `super_contest_effect_list`(_api::`ContestsApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedSuperContestEffectSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `super_contest_effect_list`(_api::`ContestsApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedSuperContestEffectSummaryList` }, `OpenAPI.Clients.ApiResponse`

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ContestsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedSuperContestEffectSummaryList`**](PaginatedSuperContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **super_contest_effect_retrieve**
> `super_contest_effect_retrieve`(_api::`ContestsApi`, `id`::`String`; _mediaType=nothing) -> `SuperContestEffectDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `super_contest_effect_retrieve`(_api::`ContestsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `SuperContestEffectDetail` }, `OpenAPI.Clients.ApiResponse`

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ContestsApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`SuperContestEffectDetail`**](SuperContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

