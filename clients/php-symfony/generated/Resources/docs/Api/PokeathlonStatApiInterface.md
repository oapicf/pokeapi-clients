# OpenAPI\Server\Api\PokeathlonStatApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokeathlonStatList**](PokeathlonStatApiInterface.md#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | 
[**pokeathlonStatRead**](PokeathlonStatApiInterface.md#pokeathlonStatRead) | **GET** /api/v2/pokeathlon-stat/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pokeathlonStat:
        class: Acme\MyBundle\Api\PokeathlonStatApi
        tags:
            - { name: "open_api_server.api", api: "pokeathlonStat" }
    # ...
```

## **pokeathlonStatList**
> string pokeathlonStatList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokeathlonStatApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokeathlonStatApiInterface;

class PokeathlonStatApi implements PokeathlonStatApiInterface
{

    // ...

    /**
     * Implementation of PokeathlonStatApiInterface#pokeathlonStatList
     */
    public function pokeathlonStatList($limit = null, $offset = null)
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

## **pokeathlonStatRead**
> string pokeathlonStatRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokeathlonStatApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokeathlonStatApiInterface;

class PokeathlonStatApi implements PokeathlonStatApiInterface
{

    // ...

    /**
     * Implementation of PokeathlonStatApiInterface#pokeathlonStatRead
     */
    public function pokeathlonStatRead($id)
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

