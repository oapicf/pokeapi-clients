# OpenapiJsClient.MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveBattleStyleList**](MoveBattleStyleApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**moveBattleStyleRead**](MoveBattleStyleApi.md#moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 



## moveBattleStyleList

> String moveBattleStyleList(opts)



### Example

```javascript
import OpenapiJsClient from 'openapi-js-client';

let apiInstance = new OpenapiJsClient.MoveBattleStyleApi();
let opts = {
  'limit': 56, // Number | 
  'offset': 56 // Number | 
};
apiInstance.moveBattleStyleList(opts, (error, data, response) => {
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


## moveBattleStyleRead

> String moveBattleStyleRead(id)



### Example

```javascript
import OpenapiJsClient from 'openapi-js-client';

let apiInstance = new OpenapiJsClient.MoveBattleStyleApi();
let id = 56; // Number | 
apiInstance.moveBattleStyleRead(id, (error, data, response) => {
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

