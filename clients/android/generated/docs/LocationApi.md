# LocationApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](LocationApi.md#locationAreaList) | **GET** /api/v2/location-area/ | List location areas
[**locationAreaRetrieve**](LocationApi.md#locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**locationList**](LocationApi.md#locationList) | **GET** /api/v2/location/ | List locations
[**locationRetrieve**](LocationApi.md#locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location
[**palParkAreaList**](LocationApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**palParkAreaRetrieve**](LocationApi.md#palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**regionList**](LocationApi.md#regionList) | **GET** /api/v2/region/ | List regions
[**regionRetrieve**](LocationApi.md#regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region



## locationAreaList

> PaginatedLocationAreaSummaryList locationAreaList(limit, offset)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
try {
    PaginatedLocationAreaSummaryList result = apiInstance.locationAreaList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationAreaList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]

### Return type

[**PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## locationAreaRetrieve

> LocationAreaDetail locationAreaRetrieve(id)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
Integer id = null; // Integer | A unique integer value identifying this location area.
try {
    LocationAreaDetail result = apiInstance.locationAreaRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationAreaRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| A unique integer value identifying this location area. | [default to null]

### Return type

[**LocationAreaDetail**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## locationList

> PaginatedLocationSummaryList locationList(limit, offset, q)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedLocationSummaryList result = apiInstance.locationList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## locationRetrieve

> LocationDetail locationRetrieve(id)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    LocationDetail result = apiInstance.locationRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**LocationDetail**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## palParkAreaList

> PaginatedPalParkAreaSummaryList palParkAreaList(limit, offset, q)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedPalParkAreaSummaryList result = apiInstance.palParkAreaList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#palParkAreaList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## palParkAreaRetrieve

> PalParkAreaDetail palParkAreaRetrieve(id)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    PalParkAreaDetail result = apiInstance.palParkAreaRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#palParkAreaRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**PalParkAreaDetail**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## regionList

> PaginatedRegionSummaryList regionList(limit, offset, q)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedRegionSummaryList result = apiInstance.regionList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#regionList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## regionRetrieve

> RegionDetail regionRetrieve(id)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    RegionDetail result = apiInstance.regionRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#regionRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**RegionDetail**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

