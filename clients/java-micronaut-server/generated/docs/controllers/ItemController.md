# ItemController

All URIs are relative to `""`

The controller class is defined in **[ItemController.java](../../src/main/java/org/openapitools/controller/ItemController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemList**](#itemList) | **GET** /api/v2/item/ | 
[**itemRead**](#itemRead) | **GET** /api/v2/item/{id}/ | 

<a id="itemList"></a>
# **itemList**
```java
Mono<String> ItemController.itemList(limitoffset)
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

<a id="itemRead"></a>
# **itemRead**
```java
Mono<String> ItemController.itemRead(id)
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

