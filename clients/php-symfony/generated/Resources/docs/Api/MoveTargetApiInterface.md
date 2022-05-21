# OpenAPI\Server\Api\MoveTargetApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveTargetList**](MoveTargetApiInterface.md#moveTargetList) | **GET** /api/v2/move-target/ | 
[**moveTargetRead**](MoveTargetApiInterface.md#moveTargetRead) | **GET** /api/v2/move-target/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.moveTarget:
        class: Acme\MyBundle\Api\MoveTargetApi
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
    public function moveTargetList($limit = null, $offset = null)
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
    public function moveTargetRead($id)
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

