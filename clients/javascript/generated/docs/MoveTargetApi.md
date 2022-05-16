# PokeapiClient.MoveTargetApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveTargetList**](MoveTargetApi.md#moveTargetList) | **GET** /api/v2/move-target/ | 
[**moveTargetRead**](MoveTargetApi.md#moveTargetRead) | **GET** /api/v2/move-target/{id}/ | 



## moveTargetList

> String moveTargetList(opts)



### Example

```javascript
import PokeapiClient from 'pokeapi-client';

let apiInstance = new PokeapiClient.MoveTargetApi();
let opts = {
  'limit': 56, // Number | 
  'offset': 56 // Number | 
};
apiInstance.moveTargetList(opts, (error, data, response) => {
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


## moveTargetRead

> String moveTargetRead(id)



### Example

```javascript
import PokeapiClient from 'pokeapi-client';

let apiInstance = new PokeapiClient.MoveTargetApi();
let id = 56; // Number | 
apiInstance.moveTargetRead(id, (error, data, response) => {
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

