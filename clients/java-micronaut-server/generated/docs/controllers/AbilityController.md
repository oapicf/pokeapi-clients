# AbilityController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[AbilityController.java](../../src/main/java/org/openapitools/controller/AbilityController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](#abilityList) | **GET** /api/v2/ability/ | 
[**abilityRead**](#abilityRead) | **GET** /api/v2/ability/{id}/ | 

<a name="abilityList"></a>
# **abilityList**
```java
Mono<String> AbilityController.abilityList(limitoffset)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` |  | [optional parameter]
**offset** | `Integer` |  | [optional parameter]

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

<a name="abilityRead"></a>
# **abilityRead**
```java
Mono<String> AbilityController.abilityRead(id)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `Integer` |  |

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

