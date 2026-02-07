# LocationAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LocationAPI_locationAreaList**](LocationAPI.md#LocationAPI_locationAreaList) | **GET** /api/v2/location-area/ | List location areas
[**LocationAPI_locationAreaRetrieve**](LocationAPI.md#LocationAPI_locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**LocationAPI_locationList**](LocationAPI.md#LocationAPI_locationList) | **GET** /api/v2/location/ | List locations
[**LocationAPI_locationRetrieve**](LocationAPI.md#LocationAPI_locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location
[**LocationAPI_palParkAreaList**](LocationAPI.md#LocationAPI_palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**LocationAPI_palParkAreaRetrieve**](LocationAPI.md#LocationAPI_palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**LocationAPI_regionList**](LocationAPI.md#LocationAPI_regionList) | **GET** /api/v2/region/ | List regions
[**LocationAPI_regionRetrieve**](LocationAPI.md#LocationAPI_regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region


# **LocationAPI_locationAreaList**
```c
// List location areas
//
// Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
//
paginated_location_area_summary_list_t* LocationAPI_locationAreaList(apiClient_t *apiClient, int *limit, int *offset);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 

### Return type

[paginated_location_area_summary_list_t](paginated_location_area_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LocationAPI_locationAreaRetrieve**
```c
// Get location area
//
// Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
//
location_area_detail_t* LocationAPI_locationAreaRetrieve(apiClient_t *apiClient, int *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **int \*** | A unique integer value identifying this location area. | 

### Return type

[location_area_detail_t](location_area_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LocationAPI_locationList**
```c
// List locations
//
// Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
//
paginated_location_summary_list_t* LocationAPI_locationList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_location_summary_list_t](paginated_location_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LocationAPI_locationRetrieve**
```c
// Get location
//
// Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
//
location_detail_t* LocationAPI_locationRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[location_detail_t](location_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LocationAPI_palParkAreaList**
```c
// List pal park areas
//
// Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
//
paginated_pal_park_area_summary_list_t* LocationAPI_palParkAreaList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_pal_park_area_summary_list_t](paginated_pal_park_area_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LocationAPI_palParkAreaRetrieve**
```c
// Get pal park area
//
// Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
//
pal_park_area_detail_t* LocationAPI_palParkAreaRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[pal_park_area_detail_t](pal_park_area_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LocationAPI_regionList**
```c
// List regions
//
// A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
//
paginated_region_summary_list_t* LocationAPI_regionList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_region_summary_list_t](paginated_region_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LocationAPI_regionRetrieve**
```c
// Get region
//
// A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
//
region_detail_t* LocationAPI_regionRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[region_detail_t](region_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

