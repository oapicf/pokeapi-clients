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
> `contest_effect_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedContestEffectSummaryList`

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedContestEffectSummaryList`**](PaginatedContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_effect_retrieve**
> `contest_effect_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `ContestEffectDetail`

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`ContestEffectDetail`**](ContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_type_list**
> `contest_type_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedContestTypeSummaryList`

List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedContestTypeSummaryList`**](PaginatedContestTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_type_retrieve**
> `contest_type_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `ContestTypeDetail`

Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`ContestTypeDetail`**](ContestTypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **super_contest_effect_list**
> `super_contest_effect_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedSuperContestEffectSummaryList`

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedSuperContestEffectSummaryList`**](PaginatedSuperContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **super_contest_effect_retrieve**
> `super_contest_effect_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `SuperContestEffectDetail`

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`SuperContestEffectDetail`**](SuperContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

