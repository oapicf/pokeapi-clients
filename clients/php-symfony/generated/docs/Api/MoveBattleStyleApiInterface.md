# OpenAPI\Server\Api\MoveBattleStyleApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveBattleStyleList**](MoveBattleStyleApiInterface.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**moveBattleStyleRead**](MoveBattleStyleApiInterface.md#moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MoveBattleStyleApi:
        tags:
            - { name: "open_api_server.api", api: "moveBattleStyle" }
    # ...
```

## **moveBattleStyleList**
> string moveBattleStyleList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveBattleStyleApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveBattleStyleApiInterface;

class MoveBattleStyleApi implements MoveBattleStyleApiInterface
{

    // ...

    /**
     * Implementation of MoveBattleStyleApiInterface#moveBattleStyleList
     */
    public function moveBattleStyleList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
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

## **moveBattleStyleRead**
> string moveBattleStyleRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveBattleStyleApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveBattleStyleApiInterface;

class MoveBattleStyleApi implements MoveBattleStyleApiInterface
{

    // ...

    /**
     * Implementation of MoveBattleStyleApiInterface#moveBattleStyleRead
     */
    public function moveBattleStyleRead(int $id, int &$responseCode, array &$responseHeaders): string
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

