# ItemFlingEffectController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[ItemFlingEffectController.java](../../src/main/java/org/openapitools/controller/ItemFlingEffectController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemFlingEffectList**](#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | 
[**itemFlingEffectRead**](#itemFlingEffectRead) | **GET** /api/v2/item-fling-effect/{id}/ | 

<a name="itemFlingEffectList"></a>
# **itemFlingEffectList**
```java
Mono<String> ItemFlingEffectController.itemFlingEffectList(limitoffset)
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

<a name="itemFlingEffectRead"></a>
# **itemFlingEffectRead**
```java
Mono<String> ItemFlingEffectController.itemFlingEffectRead(id)
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

