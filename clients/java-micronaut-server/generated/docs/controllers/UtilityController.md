# UtilityController

All URIs are relative to `""`

The controller class is defined in **[UtilityController.java](../../src/main/java/org/openapitools/controller/UtilityController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](#languageList) | **GET** /api/v2/language/ | List languages
[**languageRetrieve**](#languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language
[**metaRetrieve**](#metaRetrieve) | **GET** /api/v2/meta/ | Get API metadata

<a id="languageList"></a>
# **languageList**
```java
Mono<PaginatedLanguageSummaryList> UtilityController.languageList(limitoffsetq)
```

List languages

Languages for translations of API resource information.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedLanguageSummaryList**](../../docs/models/PaginatedLanguageSummaryList.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="languageRetrieve"></a>
# **languageRetrieve**
```java
Mono<LanguageDetail> UtilityController.languageRetrieve(id)
```

Get language

Languages for translations of API resource information.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**LanguageDetail**](../../docs/models/LanguageDetail.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="metaRetrieve"></a>
# **metaRetrieve**
```java
Mono<PokeapiMetaResponse> UtilityController.metaRetrieve()
```

Get API metadata

Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).


### Return type
[**PokeapiMetaResponse**](../../docs/models/PokeapiMetaResponse.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

