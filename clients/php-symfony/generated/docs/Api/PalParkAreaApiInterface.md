# OpenAPI\Server\Api\PalParkAreaApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**palParkAreaList**](PalParkAreaApiInterface.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | 
[**palParkAreaRead**](PalParkAreaApiInterface.md#palParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\PalParkAreaApi:
        tags:
            - { name: "open_api_server.api", api: "palParkArea" }
    # ...
```

## **palParkAreaList**
> string palParkAreaList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PalParkAreaApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PalParkAreaApiInterface;

class PalParkAreaApi implements PalParkAreaApiInterface
{

    // ...

    /**
     * Implementation of PalParkAreaApiInterface#palParkAreaList
     */
    public function palParkAreaList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
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

## **palParkAreaRead**
> string palParkAreaRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PalParkAreaApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PalParkAreaApiInterface;

class PalParkAreaApi implements PalParkAreaApiInterface
{

    // ...

    /**
     * Implementation of PalParkAreaApiInterface#palParkAreaRead
     */
    public function palParkAreaRead(int $id, int &$responseCode, array &$responseHeaders): string
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

