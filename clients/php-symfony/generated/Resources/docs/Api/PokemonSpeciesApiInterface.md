# OpenAPI\Server\Api\PokemonSpeciesApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonSpeciesList**](PokemonSpeciesApiInterface.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | 
[**pokemonSpeciesRead**](PokemonSpeciesApiInterface.md#pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pokemonSpecies:
        class: Acme\MyBundle\Api\PokemonSpeciesApi
        tags:
            - { name: "open_api_server.api", api: "pokemonSpecies" }
    # ...
```

## **pokemonSpeciesList**
> string pokemonSpeciesList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonSpeciesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonSpeciesApiInterface;

class PokemonSpeciesApi implements PokemonSpeciesApiInterface
{

    // ...

    /**
     * Implementation of PokemonSpeciesApiInterface#pokemonSpeciesList
     */
    public function pokemonSpeciesList($limit = null, $offset = null)
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

## **pokemonSpeciesRead**
> string pokemonSpeciesRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonSpeciesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonSpeciesApiInterface;

class PokemonSpeciesApi implements PokemonSpeciesApiInterface
{

    // ...

    /**
     * Implementation of PokemonSpeciesApiInterface#pokemonSpeciesRead
     */
    public function pokemonSpeciesRead($id)
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

