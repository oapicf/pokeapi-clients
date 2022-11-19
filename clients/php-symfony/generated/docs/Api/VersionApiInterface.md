# OpenAPI\Server\Api\VersionApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionList**](VersionApiInterface.md#versionList) | **GET** /api/v2/version/ | 
[**versionRead**](VersionApiInterface.md#versionRead) | **GET** /api/v2/version/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\VersionApi:
        tags:
            - { name: "open_api_server.api", api: "version" }
    # ...
```

## **versionList**
> string versionList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VersionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VersionApiInterface;

class VersionApi implements VersionApiInterface
{

    // ...

    /**
     * Implementation of VersionApiInterface#versionList
     */
    public function versionList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **versionRead**
> string versionRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VersionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VersionApiInterface;

class VersionApi implements VersionApiInterface
{

    // ...

    /**
     * Implementation of VersionApiInterface#versionRead
     */
    public function versionRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

