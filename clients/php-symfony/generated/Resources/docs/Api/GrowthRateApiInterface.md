# OpenAPI\Server\Api\GrowthRateApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**growthRateList**](GrowthRateApiInterface.md#growthRateList) | **GET** /api/v2/growth-rate/ | 
[**growthRateRead**](GrowthRateApiInterface.md#growthRateRead) | **GET** /api/v2/growth-rate/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\GrowthRateApi:
        tags:
            - { name: "open_api_server.api", api: "growthRate" }
    # ...
```

## **growthRateList**
> string growthRateList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GrowthRateApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GrowthRateApiInterface;

class GrowthRateApi implements GrowthRateApiInterface
{

    // ...

    /**
     * Implementation of GrowthRateApiInterface#growthRateList
     */
    public function growthRateList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **growthRateRead**
> string growthRateRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GrowthRateApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GrowthRateApiInterface;

class GrowthRateApi implements GrowthRateApiInterface
{

    // ...

    /**
     * Implementation of GrowthRateApiInterface#growthRateRead
     */
    public function growthRateRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

