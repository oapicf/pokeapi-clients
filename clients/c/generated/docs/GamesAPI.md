# GamesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GamesAPI_generationList**](GamesAPI.md#GamesAPI_generationList) | **GET** /api/v2/generation/ | List genrations
[**GamesAPI_generationRetrieve**](GamesAPI.md#GamesAPI_generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**GamesAPI_pokedexList**](GamesAPI.md#GamesAPI_pokedexList) | **GET** /api/v2/pokedex/ | List pokedex
[**GamesAPI_pokedexRetrieve**](GamesAPI.md#GamesAPI_pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**GamesAPI_versionGroupList**](GamesAPI.md#GamesAPI_versionGroupList) | **GET** /api/v2/version-group/ | List version groups
[**GamesAPI_versionGroupRetrieve**](GamesAPI.md#GamesAPI_versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**GamesAPI_versionList**](GamesAPI.md#GamesAPI_versionList) | **GET** /api/v2/version/ | List versions
[**GamesAPI_versionRetrieve**](GamesAPI.md#GamesAPI_versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version


# **GamesAPI_generationList**
```c
// List genrations
//
// A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
//
paginated_generation_summary_list_t* GamesAPI_generationList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_generation_summary_list_t](paginated_generation_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GamesAPI_generationRetrieve**
```c
// Get genration
//
// A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
//
generation_detail_t* GamesAPI_generationRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[generation_detail_t](generation_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GamesAPI_pokedexList**
```c
// List pokedex
//
// A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
//
paginated_pokedex_summary_list_t* GamesAPI_pokedexList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_pokedex_summary_list_t](paginated_pokedex_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GamesAPI_pokedexRetrieve**
```c
// Get pokedex
//
// A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
//
pokedex_detail_t* GamesAPI_pokedexRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[pokedex_detail_t](pokedex_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GamesAPI_versionGroupList**
```c
// List version groups
//
// Version groups categorize highly similar versions of the games.
//
paginated_version_group_summary_list_t* GamesAPI_versionGroupList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_version_group_summary_list_t](paginated_version_group_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GamesAPI_versionGroupRetrieve**
```c
// Get version group
//
// Version groups categorize highly similar versions of the games.
//
version_group_detail_t* GamesAPI_versionGroupRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[version_group_detail_t](version_group_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GamesAPI_versionList**
```c
// List versions
//
// Versions of the games, e.g., Red, Blue or Yellow.
//
paginated_version_summary_list_t* GamesAPI_versionList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_version_summary_list_t](paginated_version_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GamesAPI_versionRetrieve**
```c
// Get version
//
// Versions of the games, e.g., Red, Blue or Yellow.
//
version_detail_t* GamesAPI_versionRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[version_detail_t](version_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

