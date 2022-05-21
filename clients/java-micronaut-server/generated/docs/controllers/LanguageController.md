# LanguageController

All URIs are relative to `""`

The controller class is defined in **[LanguageController.java](../../src/main/java/org/openapitools/controller/LanguageController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](#languageList) | **GET** /api/v2/language/ | 
[**languageRead**](#languageRead) | **GET** /api/v2/language/{id}/ | 

<a name="languageList"></a>
# **languageList**
```java
Mono<String> LanguageController.languageList(limitoffset)
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

<a name="languageRead"></a>
# **languageRead**
```java
Mono<String> LanguageController.languageRead(id)
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

