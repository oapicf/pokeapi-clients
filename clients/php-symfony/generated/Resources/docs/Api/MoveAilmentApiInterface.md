# OpenAPI\Server\Api\MoveAilmentApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MoveAilmentApiInterface.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | 
[**moveAilmentRead**](MoveAilmentApiInterface.md#moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.moveAilment:
        class: Acme\MyBundle\Api\MoveAilmentApi
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
    public function moveAilmentList($limit = null, $offset = null)
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
    public function moveAilmentRead($id)
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

