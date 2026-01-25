# OpenAPI\Server\Api\ContestEffectApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestEffectList**](ContestEffectApiInterface.md#contestEffectList) | **GET** /api/v2/contest-effect/ | 
[**contestEffectRead**](ContestEffectApiInterface.md#contestEffectRead) | **GET** /api/v2/contest-effect/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ContestEffectApi:
        tags:
            - { name: "open_api_server.api", api: "contestEffect" }
    # ...
```

## **contestEffectList**
> string contestEffectList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestEffectApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestEffectApiInterface;

class ContestEffectApi implements ContestEffectApiInterface
{

    // ...

    /**
     * Implementation of ContestEffectApiInterface#contestEffectList
     */
    public function contestEffectList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
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

## **contestEffectRead**
> string contestEffectRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestEffectApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestEffectApiInterface;

class ContestEffectApi implements ContestEffectApiInterface
{

    // ...

    /**
     * Implementation of ContestEffectApiInterface#contestEffectRead
     */
    public function contestEffectRead(int $id, int &$responseCode, array &$responseHeaders): string
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

