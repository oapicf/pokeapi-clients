# OpenAPI\Server\Api\ItemFlingEffectApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemFlingEffectList**](ItemFlingEffectApiInterface.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | 
[**itemFlingEffectRead**](ItemFlingEffectApiInterface.md#itemFlingEffectRead) | **GET** /api/v2/item-fling-effect/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\ItemFlingEffectApi:
        tags:
            - { name: "open_api_server.api", api: "itemFlingEffect" }
    # ...
```

## **itemFlingEffectList**
> string itemFlingEffectList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemFlingEffectApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemFlingEffectApiInterface;

class ItemFlingEffectApi implements ItemFlingEffectApiInterface
{

    // ...

    /**
     * Implementation of ItemFlingEffectApiInterface#itemFlingEffectList
     */
    public function itemFlingEffectList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **itemFlingEffectRead**
> string itemFlingEffectRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemFlingEffectApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemFlingEffectApiInterface;

class ItemFlingEffectApi implements ItemFlingEffectApiInterface
{

    // ...

    /**
     * Implementation of ItemFlingEffectApiInterface#itemFlingEffectRead
     */
    public function itemFlingEffectRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

