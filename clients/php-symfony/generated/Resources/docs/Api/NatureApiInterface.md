# OpenAPI\Server\Api\NatureApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**natureList**](NatureApiInterface.md#natureList) | **GET** /api/v2/nature/ | 
[**natureRead**](NatureApiInterface.md#natureRead) | **GET** /api/v2/nature/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.nature:
        class: Acme\MyBundle\Api\NatureApi
        tags:
            - { name: "open_api_server.api", api: "nature" }
    # ...
```

## **natureList**
> string natureList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/NatureApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\NatureApiInterface;

class NatureApi implements NatureApiInterface
{

    // ...

    /**
     * Implementation of NatureApiInterface#natureList
     */
    public function natureList($limit = null, $offset = null)
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

## **natureRead**
> string natureRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/NatureApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\NatureApiInterface;

class NatureApi implements NatureApiInterface
{

    // ...

    /**
     * Implementation of NatureApiInterface#natureRead
     */
    public function natureRead($id)
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

