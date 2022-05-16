# OpenAPI\Server\Api\ItemApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemList**](ItemApiInterface.md#itemList) | **GET** /api/v2/item/ | 
[**itemRead**](ItemApiInterface.md#itemRead) | **GET** /api/v2/item/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.item:
        class: Acme\MyBundle\Api\ItemApi
        tags:
            - { name: "open_api_server.api", api: "item" }
    # ...
```

## **itemList**
> string itemList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemApiInterface;

class ItemApi implements ItemApiInterface
{

    // ...

    /**
     * Implementation of ItemApiInterface#itemList
     */
    public function itemList($limit = null, $offset = null)
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

## **itemRead**
> string itemRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemApiInterface;

class ItemApi implements ItemApiInterface
{

    // ...

    /**
     * Implementation of ItemApiInterface#itemRead
     */
    public function itemRead($id)
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

