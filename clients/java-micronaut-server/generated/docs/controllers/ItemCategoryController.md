# ItemCategoryController

All URIs are relative to `""`

The controller class is defined in **[ItemCategoryController.java](../../src/main/java/org/openapitools/controller/ItemCategoryController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCategoryList**](#itemCategoryList) | **GET** /api/v2/item-category/ | 
[**itemCategoryRead**](#itemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 

<a name="itemCategoryList"></a>
# **itemCategoryList**
```java
Mono<String> ItemCategoryController.itemCategoryList(limitoffset)
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

<a name="itemCategoryRead"></a>
# **itemCategoryRead**
```java
Mono<String> ItemCategoryController.itemCategoryRead(id)
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

