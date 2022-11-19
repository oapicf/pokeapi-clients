# OpenAPI\Server\Api\PokemonFormApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonFormList**](PokemonFormApiInterface.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | 
[**pokemonFormRead**](PokemonFormApiInterface.md#pokemonFormRead) | **GET** /api/v2/pokemon-form/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\PokemonFormApi:
        tags:
            - { name: "open_api_server.api", api: "pokemonForm" }
    # ...
```

## **pokemonFormList**
> string pokemonFormList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonFormApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonFormApiInterface;

class PokemonFormApi implements PokemonFormApiInterface
{

    // ...

    /**
     * Implementation of PokemonFormApiInterface#pokemonFormList
     */
    public function pokemonFormList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **pokemonFormRead**
> string pokemonFormRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonFormApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonFormApiInterface;

class PokemonFormApi implements PokemonFormApiInterface
{

    // ...

    /**
     * Implementation of PokemonFormApiInterface#pokemonFormRead
     */
    public function pokemonFormRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

