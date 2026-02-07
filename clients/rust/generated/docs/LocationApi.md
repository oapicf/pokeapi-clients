# \LocationApi

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



## location_area_list

> models::PaginatedLocationAreaSummaryList location_area_list(limit, offset)
List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |

### Return type

[**models::PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## location_area_retrieve

> models::LocationAreaDetail location_area_retrieve(id)
Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **i32** | A unique integer value identifying this location area. | [required] |

### Return type

[**models::LocationAreaDetail**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## location_list

> models::PaginatedLocationSummaryList location_list(limit, offset, q)
List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## location_retrieve

> models::LocationDetail location_retrieve(id)
Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::LocationDetail**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## pal_park_area_list

> models::PaginatedPalParkAreaSummaryList pal_park_area_list(limit, offset, q)
List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## pal_park_area_retrieve

> models::PalParkAreaDetail pal_park_area_retrieve(id)
Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::PalParkAreaDetail**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## region_list

> models::PaginatedRegionSummaryList region_list(limit, offset, q)
List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## region_retrieve

> models::RegionDetail region_retrieve(id)
Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::RegionDetail**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

