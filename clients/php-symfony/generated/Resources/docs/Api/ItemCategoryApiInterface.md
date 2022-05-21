# OpenAPI\Server\Api\ItemCategoryApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCategoryList**](ItemCategoryApiInterface.md#itemCategoryList) | **GET** /api/v2/item-category/ | 
[**itemCategoryRead**](ItemCategoryApiInterface.md#itemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.itemCategory:
        class: Acme\MyBundle\Api\ItemCategoryApi
        tags:
            - { name: "open_api_server.api", api: "itemCategory" }
    # ...
```

## **itemCategoryList**
> string itemCategoryList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemCategoryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemCategoryApiInterface;

class ItemCategoryApi implements ItemCategoryApiInterface
{

    // ...

    /**
     * Implementation of ItemCategoryApiInterface#itemCategoryList
     */
    public function itemCategoryList($limit = null, $offset = null)
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

## **itemCategoryRead**
> string itemCategoryRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemCategoryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemCategoryApiInterface;

class ItemCategoryApi implements ItemCategoryApiInterface
{

    // ...

    /**
     * Implementation of ItemCategoryApiInterface#itemCategoryRead
     */
    public function itemCategoryRead($id)
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

