# BerriesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berry_firmness_list**](BerriesApi.md#berry_firmness_list) | **GET** /api/v2/berry-firmness/ | List berry firmness
[**berry_firmness_retrieve**](BerriesApi.md#berry_firmness_retrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**berry_flavor_list**](BerriesApi.md#berry_flavor_list) | **GET** /api/v2/berry-flavor/ | List berry flavors
[**berry_flavor_retrieve**](BerriesApi.md#berry_flavor_retrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**berry_list**](BerriesApi.md#berry_list) | **GET** /api/v2/berry/ | List berries
[**berry_retrieve**](BerriesApi.md#berry_retrieve) | **GET** /api/v2/berry/{id}/ | Get a berry


# **berry_firmness_list**
> `berry_firmness_list`(_api::`BerriesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedBerryFirmnessSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `berry_firmness_list`(_api::`BerriesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedBerryFirmnessSummaryList` }, `OpenAPI.Clients.ApiResponse`

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BerriesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedBerryFirmnessSummaryList`**](PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **berry_firmness_retrieve**
> `berry_firmness_retrieve`(_api::`BerriesApi`, `id`::`String`; _mediaType=nothing) -> `BerryFirmnessDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `berry_firmness_retrieve`(_api::`BerriesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `BerryFirmnessDetail` }, `OpenAPI.Clients.ApiResponse`

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BerriesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`BerryFirmnessDetail`**](BerryFirmnessDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **berry_flavor_list**
> `berry_flavor_list`(_api::`BerriesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedBerryFlavorSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `berry_flavor_list`(_api::`BerriesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedBerryFlavorSummaryList` }, `OpenAPI.Clients.ApiResponse`

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BerriesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedBerryFlavorSummaryList`**](PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **berry_flavor_retrieve**
> `berry_flavor_retrieve`(_api::`BerriesApi`, `id`::`String`; _mediaType=nothing) -> `BerryFlavorDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `berry_flavor_retrieve`(_api::`BerriesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `BerryFlavorDetail` }, `OpenAPI.Clients.ApiResponse`

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BerriesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`BerryFlavorDetail`**](BerryFlavorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **berry_list**
> `berry_list`(_api::`BerriesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedBerrySummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `berry_list`(_api::`BerriesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedBerrySummaryList` }, `OpenAPI.Clients.ApiResponse`

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BerriesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedBerrySummaryList`**](PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **berry_retrieve**
> `berry_retrieve`(_api::`BerriesApi`, `id`::`String`; _mediaType=nothing) -> `BerryDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `berry_retrieve`(_api::`BerriesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `BerryDetail` }, `OpenAPI.Clients.ApiResponse`

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BerriesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`BerryDetail`**](BerryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

