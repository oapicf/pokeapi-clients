# PokeapiClient.MoveApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveList**](MoveApi.md#moveList) | **GET** /api/v2/move/ | 
[**moveRead**](MoveApi.md#moveRead) | **GET** /api/v2/move/{id}/ | 



## moveList

> String moveList(opts)



### Example

```javascript
import PokeapiClient from 'pokeapi-client';

let apiInstance = new PokeapiClient.MoveApi();
let opts = {
  'limit': 56, // Number | 
  'offset': 56 // Number | 
};
apiInstance.moveList(opts, (error, data, response) => {
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


## moveRead

> String moveRead(id)



### Example

```javascript
import PokeapiClient from 'pokeapi-client';

let apiInstance = new PokeapiClient.MoveApi();
let id = 56; // Number | 
apiInstance.moveRead(id, (error, data, response) => {
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

