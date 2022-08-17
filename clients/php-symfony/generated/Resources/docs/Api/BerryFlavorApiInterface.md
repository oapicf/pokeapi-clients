# OpenAPI\Server\Api\BerryFlavorApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFlavorList**](BerryFlavorApiInterface.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | 
[**berryFlavorRead**](BerryFlavorApiInterface.md#berryFlavorRead) | **GET** /api/v2/berry-flavor/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\BerryFlavorApi:
        tags:
            - { name: "open_api_server.api", api: "berryFlavor" }
    # ...
```

## **berryFlavorList**
> string berryFlavorList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerryFlavorApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerryFlavorApiInterface;

class BerryFlavorApi implements BerryFlavorApiInterface
{

    // ...

    /**
     * Implementation of BerryFlavorApiInterface#berryFlavorList
     */
    public function berryFlavorList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **berryFlavorRead**
> string berryFlavorRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerryFlavorApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerryFlavorApiInterface;

class BerryFlavorApi implements BerryFlavorApiInterface
{

    // ...

    /**
     * Implementation of BerryFlavorApiInterface#berryFlavorRead
     */
    public function berryFlavorRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

