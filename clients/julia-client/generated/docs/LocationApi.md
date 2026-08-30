# LocationApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**location_area_list**](LocationApi.md#location_area_list) | **GET** /api/v2/location-area/ | List location areas
[**location_area_retrieve**](LocationApi.md#location_area_retrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**location_list**](LocationApi.md#location_list) | **GET** /api/v2/location/ | List locations
[**location_retrieve**](LocationApi.md#location_retrieve) | **GET** /api/v2/location/{id}/ | Get location
[**pal_park_area_list**](LocationApi.md#pal_park_area_list) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**pal_park_area_retrieve**](LocationApi.md#pal_park_area_retrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**region_list**](LocationApi.md#region_list) | **GET** /api/v2/region/ | List regions
[**region_retrieve**](LocationApi.md#region_retrieve) | **GET** /api/v2/region/{id}/ | Get region


# **location_area_list**
> `location_area_list`(_api::`LocationApi`; `limit`=nothing, `offset`=nothing, _mediaType=nothing) -> `PaginatedLocationAreaSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `location_area_list`(_api::`LocationApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedLocationAreaSummaryList` }, `OpenAPI.Clients.ApiResponse`

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LocationApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]

### Return type

[**`PaginatedLocationAreaSummaryList`**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **location_area_retrieve**
> `location_area_retrieve`(_api::`LocationApi`, `id`::`Int64`; _mediaType=nothing) -> `LocationAreaDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `location_area_retrieve`(_api::`LocationApi`, response_stream::`Channel`, `id`::`Int64`; _mediaType=nothing) -> `Channel`{ `LocationAreaDetail` }, `OpenAPI.Clients.ApiResponse`

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LocationApi`** | API context | 
**`id`** | **`Int64`** | A unique integer value identifying this location area. |

### Return type

[**`LocationAreaDetail`**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **location_list**
> `location_list`(_api::`LocationApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedLocationSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `location_list`(_api::`LocationApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedLocationSummaryList` }, `OpenAPI.Clients.ApiResponse`

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LocationApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedLocationSummaryList`**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **location_retrieve**
> `location_retrieve`(_api::`LocationApi`, `id`::`String`; _mediaType=nothing) -> `LocationDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `location_retrieve`(_api::`LocationApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `LocationDetail` }, `OpenAPI.Clients.ApiResponse`

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LocationApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`LocationDetail`**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pal_park_area_list**
> `pal_park_area_list`(_api::`LocationApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPalParkAreaSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pal_park_area_list`(_api::`LocationApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPalParkAreaSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LocationApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPalParkAreaSummaryList`**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pal_park_area_retrieve**
> `pal_park_area_retrieve`(_api::`LocationApi`, `id`::`String`; _mediaType=nothing) -> `PalParkAreaDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pal_park_area_retrieve`(_api::`LocationApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PalParkAreaDetail` }, `OpenAPI.Clients.ApiResponse`

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LocationApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PalParkAreaDetail`**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **region_list**
> `region_list`(_api::`LocationApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedRegionSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `region_list`(_api::`LocationApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedRegionSummaryList` }, `OpenAPI.Clients.ApiResponse`

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LocationApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedRegionSummaryList`**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **region_retrieve**
> `region_retrieve`(_api::`LocationApi`, `id`::`String`; _mediaType=nothing) -> `RegionDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `region_retrieve`(_api::`LocationApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `RegionDetail` }, `OpenAPI.Clients.ApiResponse`

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LocationApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`RegionDetail`**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

