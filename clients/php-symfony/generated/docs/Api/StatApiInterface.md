# OpenAPI\Server\Api\StatApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statList**](StatApiInterface.md#statList) | **GET** /api/v2/stat/ | 
[**statRead**](StatApiInterface.md#statRead) | **GET** /api/v2/stat/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\StatApi:
        tags:
            - { name: "open_api_server.api", api: "stat" }
    # ...
```

## **statList**
> string statList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StatApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StatApiInterface;

class StatApi implements StatApiInterface
{

    // ...

    /**
     * Implementation of StatApiInterface#statList
     */
    public function statList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **statRead**
> string statRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StatApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StatApiInterface;

class StatApi implements StatApiInterface
{

    // ...

    /**
     * Implementation of StatApiInterface#statRead
     */
    public function statRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

