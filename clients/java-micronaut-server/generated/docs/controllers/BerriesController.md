# BerriesController

All URIs are relative to `""`

The controller class is defined in **[BerriesController.java](../../src/main/java/org/openapitools/controller/BerriesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness
[**berryFirmnessRetrieve**](#berryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**berryFlavorList**](#berryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors
[**berryFlavorRetrieve**](#berryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**berryList**](#berryList) | **GET** /api/v2/berry/ | List berries
[**berryRetrieve**](#berryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry

<a id="berryFirmnessList"></a>
# **berryFirmnessList**
```java
Mono<PaginatedBerryFirmnessSummaryList> BerriesController.berryFirmnessList(limitoffsetq)
```

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedBerryFirmnessSummaryList**](../../docs/models/PaginatedBerryFirmnessSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="berryFirmnessRetrieve"></a>
# **berryFirmnessRetrieve**
```java
Mono<BerryFirmnessDetail> BerriesController.berryFirmnessRetrieve(id)
```

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**BerryFirmnessDetail**](../../docs/models/BerryFirmnessDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="berryFlavorList"></a>
# **berryFlavorList**
```java
Mono<PaginatedBerryFlavorSummaryList> BerriesController.berryFlavorList(limitoffsetq)
```

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedBerryFlavorSummaryList**](../../docs/models/PaginatedBerryFlavorSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="berryFlavorRetrieve"></a>
# **berryFlavorRetrieve**
```java
Mono<BerryFlavorDetail> BerriesController.berryFlavorRetrieve(id)
```

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**BerryFlavorDetail**](../../docs/models/BerryFlavorDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="berryList"></a>
# **berryList**
```java
Mono<PaginatedBerrySummaryList> BerriesController.berryList(limitoffsetq)
```

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedBerrySummaryList**](../../docs/models/PaginatedBerrySummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="berryRetrieve"></a>
# **berryRetrieve**
```java
Mono<BerryDetail> BerriesController.berryRetrieve(id)
```

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**BerryDetail**](../../docs/models/BerryDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

