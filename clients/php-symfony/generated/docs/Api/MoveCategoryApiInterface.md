# OpenAPI\Server\Api\MoveCategoryApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveCategoryList**](MoveCategoryApiInterface.md#moveCategoryList) | **GET** /api/v2/move-category/ | 
[**moveCategoryRead**](MoveCategoryApiInterface.md#moveCategoryRead) | **GET** /api/v2/move-category/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MoveCategoryApi:
        tags:
            - { name: "open_api_server.api", api: "moveCategory" }
    # ...
```

## **moveCategoryList**
> string moveCategoryList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveCategoryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveCategoryApiInterface;

class MoveCategoryApi implements MoveCategoryApiInterface
{

    // ...

    /**
     * Implementation of MoveCategoryApiInterface#moveCategoryList
     */
    public function moveCategoryList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
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

## **moveCategoryRead**
> string moveCategoryRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MoveCategoryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MoveCategoryApiInterface;

class MoveCategoryApi implements MoveCategoryApiInterface
{

    // ...

    /**
     * Implementation of MoveCategoryApiInterface#moveCategoryRead
     */
    public function moveCategoryRead(int $id, int &$responseCode, array &$responseHeaders): string
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

