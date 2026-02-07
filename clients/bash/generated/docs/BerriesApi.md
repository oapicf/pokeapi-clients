# BerriesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerriesApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness
[**berryFirmnessRetrieve**](BerriesApi.md#berryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**berryFlavorList**](BerriesApi.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors
[**berryFlavorRetrieve**](BerriesApi.md#berryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**berryList**](BerriesApi.md#berryList) | **GET** /api/v2/berry/ | List berries
[**berryRetrieve**](BerriesApi.md#berryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry



## berryFirmnessList

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example

```bash
 berryFirmnessList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## berryFirmnessRetrieve

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example

```bash
 berryFirmnessRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**BerryFirmnessDetail**](BerryFirmnessDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## berryFlavorList

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example

```bash
 berryFlavorList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## berryFlavorRetrieve

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example

```bash
 berryFlavorRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**BerryFlavorDetail**](BerryFlavorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## berryList

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example

```bash
 berryList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## berryRetrieve

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example

```bash
 berryRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**BerryDetail**](BerryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

