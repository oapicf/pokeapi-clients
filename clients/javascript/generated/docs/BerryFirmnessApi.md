# OpenapiJsClient.BerryFirmnessApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerryFirmnessApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | 
[**berryFirmnessRead**](BerryFirmnessApi.md#berryFirmnessRead) | **GET** /api/v2/berry-firmness/{id}/ | 



## berryFirmnessList

> String berryFirmnessList(opts)



### Example

```javascript
import OpenapiJsClient from 'openapi-js-client';

let apiInstance = new OpenapiJsClient.BerryFirmnessApi();
let opts = {
  'limit': 56, // Number | 
  'offset': 56 // Number | 
};
apiInstance.berryFirmnessList(opts, (error, data, response) => {
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


## berryFirmnessRead

> String berryFirmnessRead(id)



### Example

```javascript
import OpenapiJsClient from 'openapi-js-client';

let apiInstance = new OpenapiJsClient.BerryFirmnessApi();
let id = 56; // Number | 
apiInstance.berryFirmnessRead(id, (error, data, response) => {
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

