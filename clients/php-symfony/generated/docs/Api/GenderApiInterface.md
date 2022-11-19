# OpenAPI\Server\Api\GenderApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genderList**](GenderApiInterface.md#genderList) | **GET** /api/v2/gender/ | 
[**genderRead**](GenderApiInterface.md#genderRead) | **GET** /api/v2/gender/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\GenderApi:
        tags:
            - { name: "open_api_server.api", api: "gender" }
    # ...
```

## **genderList**
> string genderList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GenderApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GenderApiInterface;

class GenderApi implements GenderApiInterface
{

    // ...

    /**
     * Implementation of GenderApiInterface#genderList
     */
    public function genderList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **genderRead**
> string genderRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GenderApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GenderApiInterface;

class GenderApi implements GenderApiInterface
{

    // ...

    /**
     * Implementation of GenderApiInterface#genderRead
     */
    public function genderRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

