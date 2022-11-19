# OpenAPI\Server\Api\VersionGroupApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionGroupList**](VersionGroupApiInterface.md#versionGroupList) | **GET** /api/v2/version-group/ | 
[**versionGroupRead**](VersionGroupApiInterface.md#versionGroupRead) | **GET** /api/v2/version-group/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\VersionGroupApi:
        tags:
            - { name: "open_api_server.api", api: "versionGroup" }
    # ...
```

## **versionGroupList**
> string versionGroupList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VersionGroupApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VersionGroupApiInterface;

class VersionGroupApi implements VersionGroupApiInterface
{

    // ...

    /**
     * Implementation of VersionGroupApiInterface#versionGroupList
     */
    public function versionGroupList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **versionGroupRead**
> string versionGroupRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VersionGroupApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VersionGroupApiInterface;

class VersionGroupApi implements VersionGroupApiInterface
{

    // ...

    /**
     * Implementation of VersionGroupApiInterface#versionGroupRead
     */
    public function versionGroupRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

