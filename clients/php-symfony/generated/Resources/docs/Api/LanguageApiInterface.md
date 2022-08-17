# OpenAPI\Server\Api\LanguageApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](LanguageApiInterface.md#languageList) | **GET** /api/v2/language/ | 
[**languageRead**](LanguageApiInterface.md#languageRead) | **GET** /api/v2/language/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\LanguageApi:
        tags:
            - { name: "open_api_server.api", api: "language" }
    # ...
```

## **languageList**
> string languageList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LanguageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LanguageApiInterface;

class LanguageApi implements LanguageApiInterface
{

    // ...

    /**
     * Implementation of LanguageApiInterface#languageList
     */
    public function languageList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **languageRead**
> string languageRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LanguageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LanguageApiInterface;

class LanguageApi implements LanguageApiInterface
{

    // ...

    /**
     * Implementation of LanguageApiInterface#languageRead
     */
    public function languageRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

