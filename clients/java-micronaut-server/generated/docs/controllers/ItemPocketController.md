# ItemPocketController

All URIs are relative to `""`

The controller class is defined in **[ItemPocketController.java](../../src/main/java/org/openapitools/controller/ItemPocketController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemPocketList**](#itemPocketList) | **GET** /api/v2/item-pocket/ | 
[**itemPocketRead**](#itemPocketRead) | **GET** /api/v2/item-pocket/{id}/ | 

<a name="itemPocketList"></a>
# **itemPocketList**
```java
Mono<String> ItemPocketController.itemPocketList(limitoffset)
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

<a name="itemPocketRead"></a>
# **itemPocketRead**
```java
Mono<String> ItemPocketController.itemPocketRead(id)
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

