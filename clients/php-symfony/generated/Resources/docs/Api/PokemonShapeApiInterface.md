# OpenAPI\Server\Api\PokemonShapeApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonShapeList**](PokemonShapeApiInterface.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | 
[**pokemonShapeRead**](PokemonShapeApiInterface.md#pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\PokemonShapeApi:
        tags:
            - { name: "open_api_server.api", api: "pokemonShape" }
    # ...
```

## **pokemonShapeList**
> string pokemonShapeList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonShapeApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonShapeApiInterface;

class PokemonShapeApi implements PokemonShapeApiInterface
{

    // ...

    /**
     * Implementation of PokemonShapeApiInterface#pokemonShapeList
     */
    public function pokemonShapeList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **pokemonShapeRead**
> string pokemonShapeRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonShapeApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonShapeApiInterface;

class PokemonShapeApi implements PokemonShapeApiInterface
{

    // ...

    /**
     * Implementation of PokemonShapeApiInterface#pokemonShapeRead
     */
    public function pokemonShapeRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

