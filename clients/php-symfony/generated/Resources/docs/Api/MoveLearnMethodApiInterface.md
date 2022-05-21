# OpenAPI\Server\Api\MoveLearnMethodApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveLearnMethodList**](MoveLearnMethodApiInterface.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | 
[**moveLearnMethodRead**](MoveLearnMethodApiInterface.md#moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.moveLearnMethod:
        class: Acme\MyBundle\Api\MoveLearnMethodApi
        tags:
            - { name: "open_api_server.api", api: "moveLearnMethod" }
    # ...
```

## **moveLearnMethodList**
> string moveLearnMethodList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveLearnMethodApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveLearnMethodApiInterface;

class MoveLearnMethodApi implements MoveLearnMethodApiInterface
{

    // ...

    /**
     * Implementation of MoveLearnMethodApiInterface#moveLearnMethodList
     */
    public function moveLearnMethodList($limit = null, $offset = null)
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

## **moveLearnMethodRead**
> string moveLearnMethodRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveLearnMethodApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveLearnMethodApiInterface;

class MoveLearnMethodApi implements MoveLearnMethodApiInterface
{

    // ...

    /**
     * Implementation of MoveLearnMethodApiInterface#moveLearnMethodRead
     */
    public function moveLearnMethodRead($id)
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

