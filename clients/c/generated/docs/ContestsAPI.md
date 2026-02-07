# ContestsAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ContestsAPI_contestEffectList**](ContestsAPI.md#ContestsAPI_contestEffectList) | **GET** /api/v2/contest-effect/ | List contest effects
[**ContestsAPI_contestEffectRetrieve**](ContestsAPI.md#ContestsAPI_contestEffectRetrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
[**ContestsAPI_contestTypeList**](ContestsAPI.md#ContestsAPI_contestTypeList) | **GET** /api/v2/contest-type/ | List contest types
[**ContestsAPI_contestTypeRetrieve**](ContestsAPI.md#ContestsAPI_contestTypeRetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
[**ContestsAPI_superContestEffectList**](ContestsAPI.md#ContestsAPI_superContestEffectList) | **GET** /api/v2/super-contest-effect/ | List super contest effects
[**ContestsAPI_superContestEffectRetrieve**](ContestsAPI.md#ContestsAPI_superContestEffectRetrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect


# **ContestsAPI_contestEffectList**
```c
// List contest effects
//
// Contest effects refer to the effects of moves when used in contests.
//
paginated_contest_effect_summary_list_t* ContestsAPI_contestEffectList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_contest_effect_summary_list_t](paginated_contest_effect_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContestsAPI_contestEffectRetrieve**
```c
// Get contest effect
//
// Contest effects refer to the effects of moves when used in contests.
//
contest_effect_detail_t* ContestsAPI_contestEffectRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[contest_effect_detail_t](contest_effect_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContestsAPI_contestTypeList**
```c
// List contest types
//
// Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
//
paginated_contest_type_summary_list_t* ContestsAPI_contestTypeList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_contest_type_summary_list_t](paginated_contest_type_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContestsAPI_contestTypeRetrieve**
```c
// Get contest type
//
// Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
//
contest_type_detail_t* ContestsAPI_contestTypeRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[contest_type_detail_t](contest_type_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContestsAPI_superContestEffectList**
```c
// List super contest effects
//
// Super contest effects refer to the effects of moves when used in super contests.
//
paginated_super_contest_effect_summary_list_t* ContestsAPI_superContestEffectList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_super_contest_effect_summary_list_t](paginated_super_contest_effect_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContestsAPI_superContestEffectRetrieve**
```c
// Get super contest effect
//
// Super contest effects refer to the effects of moves when used in super contests.
//
super_contest_effect_detail_t* ContestsAPI_superContestEffectRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[super_contest_effect_detail_t](super_contest_effect_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

