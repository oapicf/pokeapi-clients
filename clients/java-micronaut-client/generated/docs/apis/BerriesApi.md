# BerriesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**berryFirmnessList**](BerriesApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness |
| [**berryFirmnessRetrieve**](BerriesApi.md#berryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness |
| [**berryFlavorList**](BerriesApi.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors |
| [**berryFlavorRetrieve**](BerriesApi.md#berryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor |
| [**berryList**](BerriesApi.md#berryList) | **GET** /api/v2/berry/ | List berries |
| [**berryRetrieve**](BerriesApi.md#berryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry |


## Creating BerriesApi

To initiate an instance of `BerriesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.BerriesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BerriesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BerriesApi berriesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="berryFirmnessList"></a>
# **berryFirmnessList**
```java
Mono<PaginatedBerryFirmnessSummaryList> BerriesApi.berryFirmnessList(limitoffsetq)
```

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="berryFirmnessRetrieve"></a>
# **berryFirmnessRetrieve**
```java
Mono<BerryFirmnessDetail> BerriesApi.berryFirmnessRetrieve(id)
```

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**BerryFirmnessDetail**](BerryFirmnessDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="berryFlavorList"></a>
# **berryFlavorList**
```java
Mono<PaginatedBerryFlavorSummaryList> BerriesApi.berryFlavorList(limitoffsetq)
```

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="berryFlavorRetrieve"></a>
# **berryFlavorRetrieve**
```java
Mono<BerryFlavorDetail> BerriesApi.berryFlavorRetrieve(id)
```

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**BerryFlavorDetail**](BerryFlavorDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="berryList"></a>
# **berryList**
```java
Mono<PaginatedBerrySummaryList> BerriesApi.berryList(limitoffsetq)
```

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="berryRetrieve"></a>
# **berryRetrieve**
```java
Mono<BerryDetail> BerriesApi.berryRetrieve(id)
```

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**BerryDetail**](BerryDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

