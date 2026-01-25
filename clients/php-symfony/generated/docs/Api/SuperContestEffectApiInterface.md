# OpenAPI\Server\Api\SuperContestEffectApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**superContestEffectList**](SuperContestEffectApiInterface.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**superContestEffectRead**](SuperContestEffectApiInterface.md#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\SuperContestEffectApi:
        tags:
            - { name: "open_api_server.api", api: "superContestEffect" }
    # ...
```

## **superContestEffectList**
> string superContestEffectList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SuperContestEffectApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SuperContestEffectApiInterface;

class SuperContestEffectApi implements SuperContestEffectApiInterface
{

    // ...

    /**
     * Implementation of SuperContestEffectApiInterface#superContestEffectList
     */
    public function superContestEffectList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
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

## **superContestEffectRead**
> string superContestEffectRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SuperContestEffectApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SuperContestEffectApiInterface;

class SuperContestEffectApi implements SuperContestEffectApiInterface
{

    // ...

    /**
     * Implementation of SuperContestEffectApiInterface#superContestEffectRead
     */
    public function superContestEffectRead(int $id, int &$responseCode, array &$responseHeaders): string
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

