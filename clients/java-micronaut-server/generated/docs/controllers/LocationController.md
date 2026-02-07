# LocationController

All URIs are relative to `""`

The controller class is defined in **[LocationController.java](../../src/main/java/org/openapitools/controller/LocationController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](#locationAreaList) | **GET** /api/v2/location-area/ | List location areas
[**locationAreaRetrieve**](#locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**locationList**](#locationList) | **GET** /api/v2/location/ | List locations
[**locationRetrieve**](#locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location
[**palParkAreaList**](#palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**palParkAreaRetrieve**](#palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**regionList**](#regionList) | **GET** /api/v2/region/ | List regions
[**regionRetrieve**](#regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region

<a id="locationAreaList"></a>
# **locationAreaList**
```java
Mono<PaginatedLocationAreaSummaryList> LocationController.locationAreaList(limitoffset)
```

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]

### Return type
[**PaginatedLocationAreaSummaryList**](../../docs/models/PaginatedLocationAreaSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="locationAreaRetrieve"></a>
# **locationAreaRetrieve**
```java
Mono<LocationAreaDetail> LocationController.locationAreaRetrieve(id)
```

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `Integer` | A unique integer value identifying this location area. |

### Return type
[**LocationAreaDetail**](../../docs/models/LocationAreaDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="locationList"></a>
# **locationList**
```java
Mono<PaginatedLocationSummaryList> LocationController.locationList(limitoffsetq)
```

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedLocationSummaryList**](../../docs/models/PaginatedLocationSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="locationRetrieve"></a>
# **locationRetrieve**
```java
Mono<LocationDetail> LocationController.locationRetrieve(id)
```

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**LocationDetail**](../../docs/models/LocationDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="palParkAreaList"></a>
# **palParkAreaList**
```java
Mono<PaginatedPalParkAreaSummaryList> LocationController.palParkAreaList(limitoffsetq)
```

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPalParkAreaSummaryList**](../../docs/models/PaginatedPalParkAreaSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="palParkAreaRetrieve"></a>
# **palParkAreaRetrieve**
```java
Mono<PalParkAreaDetail> LocationController.palParkAreaRetrieve(id)
```

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PalParkAreaDetail**](../../docs/models/PalParkAreaDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="regionList"></a>
# **regionList**
```java
Mono<PaginatedRegionSummaryList> LocationController.regionList(limitoffsetq)
```

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedRegionSummaryList**](../../docs/models/PaginatedRegionSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="regionRetrieve"></a>
# **regionRetrieve**
```java
Mono<RegionDetail> LocationController.regionRetrieve(id)
```

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**RegionDetail**](../../docs/models/RegionDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

