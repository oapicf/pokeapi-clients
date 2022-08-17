# OpenAPI\Server\Api\PokemonColorApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonColorList**](PokemonColorApiInterface.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | 
[**pokemonColorRead**](PokemonColorApiInterface.md#pokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\PokemonColorApi:
        tags:
            - { name: "open_api_server.api", api: "pokemonColor" }
    # ...
```

## **pokemonColorList**
> string pokemonColorList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonColorApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonColorApiInterface;

class PokemonColorApi implements PokemonColorApiInterface
{

    // ...

    /**
     * Implementation of PokemonColorApiInterface#pokemonColorList
     */
    public function pokemonColorList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **pokemonColorRead**
> string pokemonColorRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonColorApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonColorApiInterface;

class PokemonColorApi implements PokemonColorApiInterface
{

    // ...

    /**
     * Implementation of PokemonColorApiInterface#pokemonColorRead
     */
    public function pokemonColorRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

