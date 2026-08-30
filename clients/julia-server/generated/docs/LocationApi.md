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
> `location_area_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing,) -> `PaginatedLocationAreaSummaryList`

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]

### Return type

[**`PaginatedLocationAreaSummaryList`**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **location_area_retrieve**
> `location_area_retrieve`(req::`HTTP.Request`, `id`::`Int64`;) -> `LocationAreaDetail`

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`Int64`**| A unique integer value identifying this location area. |

### Return type

[**`LocationAreaDetail`**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **location_list**
> `location_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedLocationSummaryList`

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

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

[**`PaginatedLocationSummaryList`**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **location_retrieve**
> `location_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `LocationDetail`

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`LocationDetail`**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pal_park_area_list**
> `pal_park_area_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedPalParkAreaSummaryList`

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

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

[**`PaginatedPalParkAreaSummaryList`**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pal_park_area_retrieve**
> `pal_park_area_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `PalParkAreaDetail`

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`PalParkAreaDetail`**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **region_list**
> `region_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedRegionSummaryList`

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

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

[**`PaginatedRegionSummaryList`**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **region_retrieve**
> `region_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `RegionDetail`

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`RegionDetail`**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

