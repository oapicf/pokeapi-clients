# OpenAPI\Server\Api\LocationApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationList**](LocationApiInterface.md#locationList) | **GET** /api/v2/location/ | 
[**locationRead**](LocationApiInterface.md#locationRead) | **GET** /api/v2/location/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\LocationApi:
        tags:
            - { name: "open_api_server.api", api: "location" }
    # ...
```

## **locationList**
> string locationList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
{

    // ...

    /**
     * Implementation of LocationApiInterface#locationList
     */
    public function locationList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
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

## **locationRead**
> string locationRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
{

    // ...

    /**
     * Implementation of LocationApiInterface#locationRead
     */
    public function locationRead(int $id, int &$responseCode, array &$responseHeaders): string
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

