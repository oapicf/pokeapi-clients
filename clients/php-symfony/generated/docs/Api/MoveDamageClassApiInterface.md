# OpenAPI\Server\Api\MoveDamageClassApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveDamageClassList**](MoveDamageClassApiInterface.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
[**moveDamageClassRead**](MoveDamageClassApiInterface.md#moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MoveDamageClassApi:
        tags:
            - { name: "open_api_server.api", api: "moveDamageClass" }
    # ...
```

## **moveDamageClassList**
> string moveDamageClassList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveDamageClassApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveDamageClassApiInterface;

class MoveDamageClassApi implements MoveDamageClassApiInterface
{

    // ...

    /**
     * Implementation of MoveDamageClassApiInterface#moveDamageClassList
     */
    public function moveDamageClassList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **moveDamageClassRead**
> string moveDamageClassRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveDamageClassApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveDamageClassApiInterface;

class MoveDamageClassApi implements MoveDamageClassApiInterface
{

    // ...

    /**
     * Implementation of MoveDamageClassApiInterface#moveDamageClassRead
     */
    public function moveDamageClassRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

