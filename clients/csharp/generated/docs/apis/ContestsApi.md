# Org.OpenAPITools.Api.ContestsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ContestEffectList**](ContestsApi.md#contesteffectlist) | **GET** /api/v2/contest-effect/ | List contest effects |
| [**ContestEffectRetrieve**](ContestsApi.md#contesteffectretrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect |
| [**ContestTypeList**](ContestsApi.md#contesttypelist) | **GET** /api/v2/contest-type/ | List contest types |
| [**ContestTypeRetrieve**](ContestsApi.md#contesttyperetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type |
| [**SuperContestEffectList**](ContestsApi.md#supercontesteffectlist) | **GET** /api/v2/super-contest-effect/ | List super contest effects |
| [**SuperContestEffectRetrieve**](ContestsApi.md#supercontesteffectretrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect |

<a id="contesteffectlist"></a>
# **ContestEffectList**
> PaginatedContestEffectSummaryList ContestEffectList (int limit = null, int offset = null, string q = null)

List contest effects

Contest effects refer to the effects of moves when used in contests.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedContestEffectSummaryList**](PaginatedContestEffectSummaryList.md)

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

<a id="contesteffectretrieve"></a>
# **ContestEffectRetrieve**
> ContestEffectDetail ContestEffectRetrieve (string id)

Get contest effect

Contest effects refer to the effects of moves when used in contests.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**ContestEffectDetail**](ContestEffectDetail.md)

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

<a id="contesttypelist"></a>
# **ContestTypeList**
> PaginatedContestTypeSummaryList ContestTypeList (int limit = null, int offset = null, string q = null)

List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedContestTypeSummaryList**](PaginatedContestTypeSummaryList.md)

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

<a id="contesttyperetrieve"></a>
# **ContestTypeRetrieve**
> ContestTypeDetail ContestTypeRetrieve (string id)

Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**ContestTypeDetail**](ContestTypeDetail.md)

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

<a id="supercontesteffectlist"></a>
# **SuperContestEffectList**
> PaginatedSuperContestEffectSummaryList SuperContestEffectList (int limit = null, int offset = null, string q = null)

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedSuperContestEffectSummaryList**](PaginatedSuperContestEffectSummaryList.md)

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

<a id="supercontesteffectretrieve"></a>
# **SuperContestEffectRetrieve**
> SuperContestEffectDetail SuperContestEffectRetrieve (string id)

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**SuperContestEffectDetail**](SuperContestEffectDetail.md)

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

