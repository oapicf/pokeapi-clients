# CharacteristicController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[CharacteristicController.java](../../src/main/java/org/openapitools/controller/CharacteristicController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**characteristicList**](#characteristicList) | **GET** /api/v2/characteristic/ | 
[**characteristicRead**](#characteristicRead) | **GET** /api/v2/characteristic/{id}/ | 

<a name="characteristicList"></a>
# **characteristicList**
```java
Mono<String> CharacteristicController.characteristicList(limitoffset)
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

<a name="characteristicRead"></a>
# **characteristicRead**
```java
Mono<String> CharacteristicController.characteristicRead(id)
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

