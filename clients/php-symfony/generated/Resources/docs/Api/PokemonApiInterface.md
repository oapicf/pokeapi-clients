# OpenAPI\Server\Api\PokemonApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonList**](PokemonApiInterface.md#pokemonList) | **GET** /api/v2/pokemon/ | 
[**pokemonRead**](PokemonApiInterface.md#pokemonRead) | **GET** /api/v2/pokemon/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pokemon:
        class: Acme\MyBundle\Api\PokemonApi
        tags:
            - { name: "open_api_server.api", api: "pokemon" }
    # ...
```

## **pokemonList**
> string pokemonList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonList
     */
    public function pokemonList($limit = null, $offset = null)
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

## **pokemonRead**
> string pokemonRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonRead
     */
    public function pokemonRead($id)
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

