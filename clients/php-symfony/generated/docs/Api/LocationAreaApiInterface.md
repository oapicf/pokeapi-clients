# OpenAPI\Server\Api\LocationAreaApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](LocationAreaApiInterface.md#locationAreaList) | **GET** /api/v2/location-area/ | 
[**locationAreaRead**](LocationAreaApiInterface.md#locationAreaRead) | **GET** /api/v2/location-area/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\LocationAreaApi:
        tags:
            - { name: "open_api_server.api", api: "locationArea" }
    # ...
```

## **locationAreaList**
> string locationAreaList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationAreaApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationAreaApiInterface;

class LocationAreaApi implements LocationAreaApiInterface
{

    // ...

    /**
     * Implementation of LocationAreaApiInterface#locationAreaList
     */
    public function locationAreaList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional]
 **offset** | **int**|  | [optional]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **locationAreaRead**
> string locationAreaRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationAreaApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationAreaApiInterface;

class LocationAreaApi implements LocationAreaApiInterface
{

    // ...

    /**
     * Implementation of LocationAreaApiInterface#locationAreaRead
     */
    public function locationAreaRead(int $id, int &$responseCode, array &$responseHeaders): string
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

