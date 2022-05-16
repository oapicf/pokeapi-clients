# OpenapiJsClient.AbilityApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](AbilityApi.md#abilityList) | **GET** /api/v2/ability/ | 
[**abilityRead**](AbilityApi.md#abilityRead) | **GET** /api/v2/ability/{id}/ | 



## abilityList

> String abilityList(opts)



### Example

```javascript
import OpenapiJsClient from 'openapi-js-client';

let apiInstance = new OpenapiJsClient.AbilityApi();
let opts = {
  'limit': 56, // Number | 
  'offset': 56 // Number | 
};
apiInstance.abilityList(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Number**|  | [optional] 
 **offset** | **Number**|  | [optional] 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


## abilityRead

> String abilityRead(id)



### Example

```javascript
import OpenapiJsClient from 'openapi-js-client';

let apiInstance = new OpenapiJsClient.AbilityApi();
let id = 56; // Number | 
apiInstance.abilityRead(id, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**|  | 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

