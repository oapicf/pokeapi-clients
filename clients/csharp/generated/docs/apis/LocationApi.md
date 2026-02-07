# Org.OpenAPITools.Api.LocationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**LocationAreaList**](LocationApi.md#locationarealist) | **GET** /api/v2/location-area/ | List location areas |
| [**LocationAreaRetrieve**](LocationApi.md#locationarearetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area |
| [**LocationList**](LocationApi.md#locationlist) | **GET** /api/v2/location/ | List locations |
| [**LocationRetrieve**](LocationApi.md#locationretrieve) | **GET** /api/v2/location/{id}/ | Get location |
| [**PalParkAreaList**](LocationApi.md#palparkarealist) | **GET** /api/v2/pal-park-area/ | List pal park areas |
| [**PalParkAreaRetrieve**](LocationApi.md#palparkarearetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area |
| [**RegionList**](LocationApi.md#regionlist) | **GET** /api/v2/region/ | List regions |
| [**RegionRetrieve**](LocationApi.md#regionretrieve) | **GET** /api/v2/region/{id}/ | Get region |

<a id="locationarealist"></a>
# **LocationAreaList**
> PaginatedLocationAreaSummaryList LocationAreaList (int limit = null, int offset = null)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |

### Return type

[**PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="locationarearetrieve"></a>
# **LocationAreaRetrieve**
> LocationAreaDetail LocationAreaRetrieve (int id)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **int** | A unique integer value identifying this location area. |  |

### Return type

[**LocationAreaDetail**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="locationlist"></a>
# **LocationList**
> PaginatedLocationSummaryList LocationList (int limit = null, int offset = null, string q = null)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="locationretrieve"></a>
# **LocationRetrieve**
> LocationDetail LocationRetrieve (string id)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**LocationDetail**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="palparkarealist"></a>
# **PalParkAreaList**
> PaginatedPalParkAreaSummaryList PalParkAreaList (int limit = null, int offset = null, string q = null)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="palparkarearetrieve"></a>
# **PalParkAreaRetrieve**
> PalParkAreaDetail PalParkAreaRetrieve (string id)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**PalParkAreaDetail**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="regionlist"></a>
# **RegionList**
> PaginatedRegionSummaryList RegionList (int limit = null, int offset = null, string q = null)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="regionretrieve"></a>
# **RegionRetrieve**
> RegionDetail RegionRetrieve (string id)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**RegionDetail**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

