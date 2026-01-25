# OpenAPI\Server\Api\BerryApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryList**](BerryApiInterface.md#berryList) | **GET** /api/v2/berry/ | 
[**berryRead**](BerryApiInterface.md#berryRead) | **GET** /api/v2/berry/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BerryApi:
        tags:
            - { name: "open_api_server.api", api: "berry" }
    # ...
```

## **berryList**
> string berryList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerryApiInterface;

class BerryApi implements BerryApiInterface
{

    // ...

    /**
     * Implementation of BerryApiInterface#berryList
     */
    public function berryList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
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

## **berryRead**
> string berryRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerryApiInterface;

class BerryApi implements BerryApiInterface
{

    // ...

    /**
     * Implementation of BerryApiInterface#berryRead
     */
    public function berryRead(int $id, int &$responseCode, array &$responseHeaders): string
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

