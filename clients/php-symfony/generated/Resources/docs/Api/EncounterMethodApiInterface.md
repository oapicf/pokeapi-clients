# OpenAPI\Server\Api\EncounterMethodApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterMethodList**](EncounterMethodApiInterface.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | 
[**encounterMethodRead**](EncounterMethodApiInterface.md#encounterMethodRead) | **GET** /api/v2/encounter-method/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\EncounterMethodApi:
        tags:
            - { name: "open_api_server.api", api: "encounterMethod" }
    # ...
```

## **encounterMethodList**
> string encounterMethodList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncounterMethodApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncounterMethodApiInterface;

class EncounterMethodApi implements EncounterMethodApiInterface
{

    // ...

    /**
     * Implementation of EncounterMethodApiInterface#encounterMethodList
     */
    public function encounterMethodList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **encounterMethodRead**
> string encounterMethodRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncounterMethodApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncounterMethodApiInterface;

class EncounterMethodApi implements EncounterMethodApiInterface
{

    // ...

    /**
     * Implementation of EncounterMethodApiInterface#encounterMethodRead
     */
    public function encounterMethodRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

