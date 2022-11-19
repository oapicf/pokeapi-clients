# OpenAPI\Server\Api\MoveAilmentApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MoveAilmentApiInterface.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | 
[**moveAilmentRead**](MoveAilmentApiInterface.md#moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MoveAilmentApi:
        tags:
            - { name: "open_api_server.api", api: "moveAilment" }
    # ...
```

## **moveAilmentList**
> string moveAilmentList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveAilmentApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveAilmentApiInterface;

class MoveAilmentApi implements MoveAilmentApiInterface
{

    // ...

    /**
     * Implementation of MoveAilmentApiInterface#moveAilmentList
     */
    public function moveAilmentList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **moveAilmentRead**
> string moveAilmentRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveAilmentApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveAilmentApiInterface;

class MoveAilmentApi implements MoveAilmentApiInterface
{

    // ...

    /**
     * Implementation of MoveAilmentApiInterface#moveAilmentRead
     */
    public function moveAilmentRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

