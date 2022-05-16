# OpenAPI\Server\Api\PokemonHabitatApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonHabitatList**](PokemonHabitatApiInterface.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | 
[**pokemonHabitatRead**](PokemonHabitatApiInterface.md#pokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pokemonHabitat:
        class: Acme\MyBundle\Api\PokemonHabitatApi
        tags:
            - { name: "open_api_server.api", api: "pokemonHabitat" }
    # ...
```

## **pokemonHabitatList**
> string pokemonHabitatList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonHabitatApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonHabitatApiInterface;

class PokemonHabitatApi implements PokemonHabitatApiInterface
{

    // ...

    /**
     * Implementation of PokemonHabitatApiInterface#pokemonHabitatList
     */
    public function pokemonHabitatList($limit = null, $offset = null)
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

## **pokemonHabitatRead**
> string pokemonHabitatRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonHabitatApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonHabitatApiInterface;

class PokemonHabitatApi implements PokemonHabitatApiInterface
{

    // ...

    /**
     * Implementation of PokemonHabitatApiInterface#pokemonHabitatRead
     */
    public function pokemonHabitatRead($id)
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

