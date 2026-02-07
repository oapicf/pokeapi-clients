# ContestsController

All URIs are relative to `""`

The controller class is defined in **[ContestsController.java](../../src/main/java/org/openapitools/controller/ContestsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestEffectList**](#contestEffectList) | **GET** /api/v2/contest-effect/ | List contest effects
[**contestEffectRetrieve**](#contestEffectRetrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
[**contestTypeList**](#contestTypeList) | **GET** /api/v2/contest-type/ | List contest types
[**contestTypeRetrieve**](#contestTypeRetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
[**superContestEffectList**](#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | List super contest effects
[**superContestEffectRetrieve**](#superContestEffectRetrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect

<a id="contestEffectList"></a>
# **contestEffectList**
```java
Mono<PaginatedContestEffectSummaryList> ContestsController.contestEffectList(limitoffsetq)
```

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedContestEffectSummaryList**](../../docs/models/PaginatedContestEffectSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="contestEffectRetrieve"></a>
# **contestEffectRetrieve**
```java
Mono<ContestEffectDetail> ContestsController.contestEffectRetrieve(id)
```

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**ContestEffectDetail**](../../docs/models/ContestEffectDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="contestTypeList"></a>
# **contestTypeList**
```java
Mono<PaginatedContestTypeSummaryList> ContestsController.contestTypeList(limitoffsetq)
```

List contest types

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedContestTypeSummaryList**](../../docs/models/PaginatedContestTypeSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="contestTypeRetrieve"></a>
# **contestTypeRetrieve**
```java
Mono<ContestTypeDetail> ContestsController.contestTypeRetrieve(id)
```

Get contest type

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**ContestTypeDetail**](../../docs/models/ContestTypeDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="superContestEffectList"></a>
# **superContestEffectList**
```java
Mono<PaginatedSuperContestEffectSummaryList> ContestsController.superContestEffectList(limitoffsetq)
```

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedSuperContestEffectSummaryList**](../../docs/models/PaginatedSuperContestEffectSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="superContestEffectRetrieve"></a>
# **superContestEffectRetrieve**
```java
Mono<SuperContestEffectDetail> ContestsController.superContestEffectRetrieve(id)
```

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**SuperContestEffectDetail**](../../docs/models/SuperContestEffectDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

