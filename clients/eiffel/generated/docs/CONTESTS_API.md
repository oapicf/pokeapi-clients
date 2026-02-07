# CONTESTS_API

All URIs are relative to *https://pokeapi.co*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**contest_effect_list**](CONTESTS_API.md#contest_effect_list) | **Get** /api/v2/contest-effect/ | List contest effects
[**contest_effect_retrieve**](CONTESTS_API.md#contest_effect_retrieve) | **Get** /api/v2/contest-effect/{id}/ | Get contest effect
[**contest_type_list**](CONTESTS_API.md#contest_type_list) | **Get** /api/v2/contest-type/ | List contest types
[**contest_type_retrieve**](CONTESTS_API.md#contest_type_retrieve) | **Get** /api/v2/contest-type/{id}/ | Get contest type
[**super_contest_effect_list**](CONTESTS_API.md#super_contest_effect_list) | **Get** /api/v2/super-contest-effect/ | List super contest effects
[**super_contest_effect_retrieve**](CONTESTS_API.md#super_contest_effect_retrieve) | **Get** /api/v2/super-contest-effect/{id}/ | Get super contest effect


# **contest_effect_list**
> contest_effect_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_CONTEST_EFFECT_SUMMARY_LIST


List contest effects

Contest effects refer to the effects of moves when used in contests.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_CONTEST_EFFECT_SUMMARY_LIST**](PaginatedContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_effect_retrieve**
> contest_effect_retrieve (id: STRING_32 ): detachable CONTEST_EFFECT_DETAIL


Get contest effect

Contest effects refer to the effects of moves when used in contests.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**CONTEST_EFFECT_DETAIL**](ContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_type_list**
> contest_type_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_CONTEST_TYPE_SUMMARY_LIST


List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_CONTEST_TYPE_SUMMARY_LIST**](PaginatedContestTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_type_retrieve**
> contest_type_retrieve (id: STRING_32 ): detachable CONTEST_TYPE_DETAIL


Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**CONTEST_TYPE_DETAIL**](ContestTypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **super_contest_effect_list**
> super_contest_effect_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_SUPER_CONTEST_EFFECT_SUMMARY_LIST


List super contest effects

Super contest effects refer to the effects of moves when used in super contests.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_SUPER_CONTEST_EFFECT_SUMMARY_LIST**](PaginatedSuperContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **super_contest_effect_retrieve**
> super_contest_effect_retrieve (id: STRING_32 ): detachable SUPER_CONTEST_EFFECT_DETAIL


Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**SUPER_CONTEST_EFFECT_DETAIL**](SuperContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

