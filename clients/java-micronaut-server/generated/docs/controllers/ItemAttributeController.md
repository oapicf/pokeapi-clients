# ItemAttributeController

All URIs are relative to `""`

The controller class is defined in **[ItemAttributeController.java](../../src/main/java/org/openapitools/controller/ItemAttributeController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](#itemAttributeList) | **GET** /api/v2/item-attribute/ | 
[**itemAttributeRead**](#itemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ | 

<a id="itemAttributeList"></a>
# **itemAttributeList**
```java
Mono<String> ItemAttributeController.itemAttributeList(limitoffset)
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

<a id="itemAttributeRead"></a>
# **itemAttributeRead**
```java
Mono<String> ItemAttributeController.itemAttributeRead(id)
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

