# OpenAPI\Server\Api\GenerationApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](GenerationApiInterface.md#generationList) | **GET** /api/v2/generation/ | 
[**generationRead**](GenerationApiInterface.md#generationRead) | **GET** /api/v2/generation/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\GenerationApi:
        tags:
            - { name: "open_api_server.api", api: "generation" }
    # ...
```

## **generationList**
> string generationList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GenerationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GenerationApiInterface;

class GenerationApi implements GenerationApiInterface
{

    // ...

    /**
     * Implementation of GenerationApiInterface#generationList
     */
    public function generationList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **generationRead**
> string generationRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GenerationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GenerationApiInterface;

class GenerationApi implements GenerationApiInterface
{

    // ...

    /**
     * Implementation of GenerationApiInterface#generationRead
     */
    public function generationRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

