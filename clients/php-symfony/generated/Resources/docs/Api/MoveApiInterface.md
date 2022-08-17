# OpenAPI\Server\Api\MoveApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveList**](MoveApiInterface.md#moveList) | **GET** /api/v2/move/ | 
[**moveRead**](MoveApiInterface.md#moveRead) | **GET** /api/v2/move/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\MoveApi:
        tags:
            - { name: "open_api_server.api", api: "move" }
    # ...
```

## **moveList**
> string moveList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveApiInterface;

class MoveApi implements MoveApiInterface
{

    // ...

    /**
     * Implementation of MoveApiInterface#moveList
     */
    public function moveList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **moveRead**
> string moveRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveApiInterface;

class MoveApi implements MoveApiInterface
{

    // ...

    /**
     * Implementation of MoveApiInterface#moveRead
     */
    public function moveRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

