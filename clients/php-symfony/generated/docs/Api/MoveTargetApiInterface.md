# OpenAPI\Server\Api\MoveTargetApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveTargetList**](MoveTargetApiInterface.md#moveTargetList) | **GET** /api/v2/move-target/ | 
[**moveTargetRead**](MoveTargetApiInterface.md#moveTargetRead) | **GET** /api/v2/move-target/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MoveTargetApi:
        tags:
            - { name: "open_api_server.api", api: "moveTarget" }
    # ...
```

## **moveTargetList**
> string moveTargetList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveTargetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveTargetApiInterface;

class MoveTargetApi implements MoveTargetApiInterface
{

    // ...

    /**
     * Implementation of MoveTargetApiInterface#moveTargetList
     */
    public function moveTargetList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **moveTargetRead**
> string moveTargetRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveTargetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveTargetApiInterface;

class MoveTargetApi implements MoveTargetApiInterface
{

    // ...

    /**
     * Implementation of MoveTargetApiInterface#moveTargetRead
     */
    public function moveTargetRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

