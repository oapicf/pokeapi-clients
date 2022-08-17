# OpenAPI\Server\Api\ItemAttributeApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](ItemAttributeApiInterface.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | 
[**itemAttributeRead**](ItemAttributeApiInterface.md#itemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\ItemAttributeApi:
        tags:
            - { name: "open_api_server.api", api: "itemAttribute" }
    # ...
```

## **itemAttributeList**
> string itemAttributeList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemAttributeApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemAttributeApiInterface;

class ItemAttributeApi implements ItemAttributeApiInterface
{

    // ...

    /**
     * Implementation of ItemAttributeApiInterface#itemAttributeList
     */
    public function itemAttributeList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **itemAttributeRead**
> string itemAttributeRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemAttributeApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemAttributeApiInterface;

class ItemAttributeApi implements ItemAttributeApiInterface
{

    // ...

    /**
     * Implementation of ItemAttributeApiInterface#itemAttributeRead
     */
    public function itemAttributeRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

