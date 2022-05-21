# OpenAPI\Server\Api\PokemonColorApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonColorList**](PokemonColorApiInterface.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | 
[**pokemonColorRead**](PokemonColorApiInterface.md#pokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pokemonColor:
        class: Acme\MyBundle\Api\PokemonColorApi
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
    public function pokemonColorList($limit = null, $offset = null)
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
    public function pokemonColorRead($id)
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

