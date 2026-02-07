# LocationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**locationAreaList**](LocationApi.md#locationAreaList) | **GET** /api/v2/location-area/ | List location areas |
| [**locationAreaRetrieve**](LocationApi.md#locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area |
| [**locationList**](LocationApi.md#locationList) | **GET** /api/v2/location/ | List locations |
| [**locationRetrieve**](LocationApi.md#locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location |
| [**palParkAreaList**](LocationApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas |
| [**palParkAreaRetrieve**](LocationApi.md#palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area |
| [**regionList**](LocationApi.md#regionList) | **GET** /api/v2/region/ | List regions |
| [**regionRetrieve**](LocationApi.md#regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region |


<a name="locationAreaList"></a>
# **locationAreaList**
> PaginatedLocationAreaSummaryList locationAreaList(limit, offset)

List location areas

    Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |

### Return type

[**PaginatedLocationAreaSummaryList**](../Models/PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="locationAreaRetrieve"></a>
# **locationAreaRetrieve**
> LocationAreaDetail locationAreaRetrieve(id)

Get location area

    Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this location area. | [default to null] |

### Return type

[**LocationAreaDetail**](../Models/LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="locationList"></a>
# **locationList**
> PaginatedLocationSummaryList locationList(limit, offset, q)

List locations

    Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedLocationSummaryList**](../Models/PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="locationRetrieve"></a>
# **locationRetrieve**
> LocationDetail locationRetrieve(id)

Get location

    Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**LocationDetail**](../Models/LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="palParkAreaList"></a>
# **palParkAreaList**
> PaginatedPalParkAreaSummaryList palParkAreaList(limit, offset, q)

List pal park areas

    Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPalParkAreaSummaryList**](../Models/PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="palParkAreaRetrieve"></a>
# **palParkAreaRetrieve**
> PalParkAreaDetail palParkAreaRetrieve(id)

Get pal park area

    Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PalParkAreaDetail**](../Models/PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="regionList"></a>
# **regionList**
> PaginatedRegionSummaryList regionList(limit, offset, q)

List regions

    A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedRegionSummaryList**](../Models/PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="regionRetrieve"></a>
# **regionRetrieve**
> RegionDetail regionRetrieve(id)

Get region

    A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**RegionDetail**](../Models/RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

