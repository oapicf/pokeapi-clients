# OpenAPI\Server\Api\PokedexApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokedexList**](PokedexApiInterface.md#pokedexList) | **GET** /api/v2/pokedex/ | 
[**pokedexRead**](PokedexApiInterface.md#pokedexRead) | **GET** /api/v2/pokedex/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pokedex:
        class: Acme\MyBundle\Api\PokedexApi
        tags:
            - { name: "open_api_server.api", api: "pokedex" }
    # ...
```

## **pokedexList**
> string pokedexList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokedexApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokedexApiInterface;

class PokedexApi implements PokedexApiInterface
{

    // ...

    /**
     * Implementation of PokedexApiInterface#pokedexList
     */
    public function pokedexList($limit = null, $offset = null)
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

## **pokedexRead**
> string pokedexRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokedexApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokedexApiInterface;

class PokedexApi implements PokedexApiInterface
{

    // ...

    /**
     * Implementation of PokedexApiInterface#pokedexRead
     */
    public function pokedexRead($id)
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

