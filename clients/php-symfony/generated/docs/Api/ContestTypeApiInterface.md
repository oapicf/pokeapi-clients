# OpenAPI\Server\Api\ContestTypeApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestTypeList**](ContestTypeApiInterface.md#contestTypeList) | **GET** /api/v2/contest-type/ | 
[**contestTypeRead**](ContestTypeApiInterface.md#contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ContestTypeApi:
        tags:
            - { name: "open_api_server.api", api: "contestType" }
    # ...
```

## **contestTypeList**
> string contestTypeList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestTypeApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestTypeApiInterface;

class ContestTypeApi implements ContestTypeApiInterface
{

    // ...

    /**
     * Implementation of ContestTypeApiInterface#contestTypeList
     */
    public function contestTypeList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **contestTypeRead**
> string contestTypeRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestTypeApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestTypeApiInterface;

class ContestTypeApi implements ContestTypeApiInterface
{

    // ...

    /**
     * Implementation of ContestTypeApiInterface#contestTypeRead
     */
    public function contestTypeRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

