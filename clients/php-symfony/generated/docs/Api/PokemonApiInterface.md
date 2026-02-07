# OpenAPI\Server\Api\PokemonApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](PokemonApiInterface.md#abilityList) | **GET** /api/v2/ability/ | 
[**abilityRetrieve**](PokemonApiInterface.md#abilityRetrieve) | **GET** /api/v2/ability/{id}/ | 
[**characteristicList**](PokemonApiInterface.md#characteristicList) | **GET** /api/v2/characteristic/ | List charecterictics
[**characteristicRetrieve**](PokemonApiInterface.md#characteristicRetrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
[**eggGroupList**](PokemonApiInterface.md#eggGroupList) | **GET** /api/v2/egg-group/ | List egg groups
[**eggGroupRetrieve**](PokemonApiInterface.md#eggGroupRetrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
[**genderList**](PokemonApiInterface.md#genderList) | **GET** /api/v2/gender/ | List genders
[**genderRetrieve**](PokemonApiInterface.md#genderRetrieve) | **GET** /api/v2/gender/{id}/ | Get gender
[**growthRateList**](PokemonApiInterface.md#growthRateList) | **GET** /api/v2/growth-rate/ | List growth rates
[**growthRateRetrieve**](PokemonApiInterface.md#growthRateRetrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
[**moveDamageClassList**](PokemonApiInterface.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | List move damage classes
[**moveDamageClassRetrieve**](PokemonApiInterface.md#moveDamageClassRetrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
[**natureList**](PokemonApiInterface.md#natureList) | **GET** /api/v2/nature/ | List natures
[**natureRetrieve**](PokemonApiInterface.md#natureRetrieve) | **GET** /api/v2/nature/{id}/ | Get nature
[**pokeathlonStatList**](PokemonApiInterface.md#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**pokeathlonStatRetrieve**](PokemonApiInterface.md#pokeathlonStatRetrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**pokemonColorList**](PokemonApiInterface.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | List pokemon colors
[**pokemonColorRetrieve**](PokemonApiInterface.md#pokemonColorRetrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**pokemonFormList**](PokemonApiInterface.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | List pokemon forms
[**pokemonFormRetrieve**](PokemonApiInterface.md#pokemonFormRetrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**pokemonHabitatList**](PokemonApiInterface.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
[**pokemonHabitatRetrieve**](PokemonApiInterface.md#pokemonHabitatRetrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**pokemonList**](PokemonApiInterface.md#pokemonList) | **GET** /api/v2/pokemon/ | List pokemon
[**pokemonRetrieve**](PokemonApiInterface.md#pokemonRetrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
[**pokemonShapeList**](PokemonApiInterface.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
[**pokemonShapeRetrieve**](PokemonApiInterface.md#pokemonShapeRetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**pokemonSpeciesList**](PokemonApiInterface.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | List pokemon species
[**pokemonSpeciesRetrieve**](PokemonApiInterface.md#pokemonSpeciesRetrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**statList**](PokemonApiInterface.md#statList) | **GET** /api/v2/stat/ | List stats
[**statRetrieve**](PokemonApiInterface.md#statRetrieve) | **GET** /api/v2/stat/{id}/ | Get stat
[**typeList**](PokemonApiInterface.md#typeList) | **GET** /api/v2/type/ | List types
[**typeRetrieve**](PokemonApiInterface.md#typeRetrieve) | **GET** /api/v2/type/{id}/ | Get types


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\PokemonApi:
        tags:
            - { name: "open_api_server.api", api: "pokemon" }
    # ...
```

## **abilityList**
> OpenAPI\Server\Model\PaginatedAbilitySummaryList abilityList($limit, $offset, $q)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#abilityList
     */
    public function abilityList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedAbilitySummaryList**](../Model/PaginatedAbilitySummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **abilityRetrieve**
> OpenAPI\Server\Model\AbilityDetail abilityRetrieve($id)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#abilityRetrieve
     */
    public function abilityRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\AbilityDetail**](../Model/AbilityDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **characteristicList**
> OpenAPI\Server\Model\PaginatedCharacteristicSummaryList characteristicList($limit, $offset, $q)

List charecterictics

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#characteristicList
     */
    public function characteristicList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedCharacteristicSummaryList**](../Model/PaginatedCharacteristicSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **characteristicRetrieve**
> OpenAPI\Server\Model\CharacteristicDetail characteristicRetrieve($id)

Get characteristic

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#characteristicRetrieve
     */
    public function characteristicRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\CharacteristicDetail**](../Model/CharacteristicDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **eggGroupList**
> OpenAPI\Server\Model\PaginatedEggGroupSummaryList eggGroupList($limit, $offset, $q)

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#eggGroupList
     */
    public function eggGroupList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedEggGroupSummaryList**](../Model/PaginatedEggGroupSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **eggGroupRetrieve**
> OpenAPI\Server\Model\EggGroupDetail eggGroupRetrieve($id)

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#eggGroupRetrieve
     */
    public function eggGroupRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\EggGroupDetail**](../Model/EggGroupDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **genderList**
> OpenAPI\Server\Model\PaginatedGenderSummaryList genderList($limit, $offset, $q)

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#genderList
     */
    public function genderList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedGenderSummaryList**](../Model/PaginatedGenderSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **genderRetrieve**
> OpenAPI\Server\Model\GenderDetail genderRetrieve($id)

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#genderRetrieve
     */
    public function genderRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\GenderDetail**](../Model/GenderDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **growthRateList**
> OpenAPI\Server\Model\PaginatedGrowthRateSummaryList growthRateList($limit, $offset, $q)

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#growthRateList
     */
    public function growthRateList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedGrowthRateSummaryList**](../Model/PaginatedGrowthRateSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **growthRateRetrieve**
> OpenAPI\Server\Model\GrowthRateDetail growthRateRetrieve($id)

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#growthRateRetrieve
     */
    public function growthRateRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\GrowthRateDetail**](../Model/GrowthRateDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveDamageClassList**
> OpenAPI\Server\Model\PaginatedMoveDamageClassSummaryList moveDamageClassList($limit, $offset, $q)

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#moveDamageClassList
     */
    public function moveDamageClassList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedMoveDamageClassSummaryList**](../Model/PaginatedMoveDamageClassSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveDamageClassRetrieve**
> OpenAPI\Server\Model\MoveDamageClassDetail moveDamageClassRetrieve($id)

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#moveDamageClassRetrieve
     */
    public function moveDamageClassRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\MoveDamageClassDetail**](../Model/MoveDamageClassDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **natureList**
> OpenAPI\Server\Model\PaginatedNatureSummaryList natureList($limit, $offset, $q)

List natures

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#natureList
     */
    public function natureList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedNatureSummaryList**](../Model/PaginatedNatureSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **natureRetrieve**
> OpenAPI\Server\Model\NatureDetail natureRetrieve($id)

Get nature

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#natureRetrieve
     */
    public function natureRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\NatureDetail**](../Model/NatureDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokeathlonStatList**
> OpenAPI\Server\Model\PaginatedPokeathlonStatSummaryList pokeathlonStatList($limit, $offset, $q)

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokeathlonStatList
     */
    public function pokeathlonStatList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedPokeathlonStatSummaryList**](../Model/PaginatedPokeathlonStatSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokeathlonStatRetrieve**
> OpenAPI\Server\Model\PokeathlonStatDetail pokeathlonStatRetrieve($id)

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokeathlonStatRetrieve
     */
    public function pokeathlonStatRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\PokeathlonStatDetail**](../Model/PokeathlonStatDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonColorList**
> OpenAPI\Server\Model\PaginatedPokemonColorSummaryList pokemonColorList($limit, $offset, $q)

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonColorList
     */
    public function pokemonColorList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedPokemonColorSummaryList**](../Model/PaginatedPokemonColorSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonColorRetrieve**
> OpenAPI\Server\Model\PokemonColorDetail pokemonColorRetrieve($id)

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonColorRetrieve
     */
    public function pokemonColorRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\PokemonColorDetail**](../Model/PokemonColorDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonFormList**
> OpenAPI\Server\Model\PaginatedPokemonFormSummaryList pokemonFormList($limit, $offset, $q)

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonFormList
     */
    public function pokemonFormList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedPokemonFormSummaryList**](../Model/PaginatedPokemonFormSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonFormRetrieve**
> OpenAPI\Server\Model\PokemonFormDetail pokemonFormRetrieve($id)

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonFormRetrieve
     */
    public function pokemonFormRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\PokemonFormDetail**](../Model/PokemonFormDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonHabitatList**
> OpenAPI\Server\Model\PaginatedPokemonHabitatSummaryList pokemonHabitatList($limit, $offset, $q)

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonHabitatList
     */
    public function pokemonHabitatList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedPokemonHabitatSummaryList**](../Model/PaginatedPokemonHabitatSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonHabitatRetrieve**
> OpenAPI\Server\Model\PokemonHabitatDetail pokemonHabitatRetrieve($id)

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonHabitatRetrieve
     */
    public function pokemonHabitatRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\PokemonHabitatDetail**](../Model/PokemonHabitatDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonList**
> OpenAPI\Server\Model\PaginatedPokemonSummaryList pokemonList($limit, $offset, $q)

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonList
     */
    public function pokemonList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedPokemonSummaryList**](../Model/PaginatedPokemonSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonRetrieve**
> OpenAPI\Server\Model\PokemonDetail pokemonRetrieve($id)

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonRetrieve
     */
    public function pokemonRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\PokemonDetail**](../Model/PokemonDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonShapeList**
> OpenAPI\Server\Model\PaginatedPokemonShapeSummaryList pokemonShapeList($limit, $offset, $q)

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonShapeList
     */
    public function pokemonShapeList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedPokemonShapeSummaryList**](../Model/PaginatedPokemonShapeSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonShapeRetrieve**
> OpenAPI\Server\Model\PokemonShapeDetail pokemonShapeRetrieve($id)

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonShapeRetrieve
     */
    public function pokemonShapeRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\PokemonShapeDetail**](../Model/PokemonShapeDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonSpeciesList**
> OpenAPI\Server\Model\PaginatedPokemonSpeciesSummaryList pokemonSpeciesList($limit, $offset, $q)

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonSpeciesList
     */
    public function pokemonSpeciesList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedPokemonSpeciesSummaryList**](../Model/PaginatedPokemonSpeciesSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokemonSpeciesRetrieve**
> OpenAPI\Server\Model\PokemonSpeciesDetail pokemonSpeciesRetrieve($id)

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#pokemonSpeciesRetrieve
     */
    public function pokemonSpeciesRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\PokemonSpeciesDetail**](../Model/PokemonSpeciesDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **statList**
> OpenAPI\Server\Model\PaginatedStatSummaryList statList($limit, $offset, $q)

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#statList
     */
    public function statList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedStatSummaryList**](../Model/PaginatedStatSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **statRetrieve**
> OpenAPI\Server\Model\StatDetail statRetrieve($id)

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#statRetrieve
     */
    public function statRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\StatDetail**](../Model/StatDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **typeList**
> OpenAPI\Server\Model\PaginatedTypeSummaryList typeList($limit, $offset, $q)

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#typeList
     */
    public function typeList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional]
 **offset** | **int**| The initial index from which to return the results. | [optional]
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional]

### Return type

[**OpenAPI\Server\Model\PaginatedTypeSummaryList**](../Model/PaginatedTypeSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **typeRetrieve**
> OpenAPI\Server\Model\TypeDetail typeRetrieve($id)

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PokemonApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PokemonApiInterface;

class PokemonApi implements PokemonApiInterface
{

    /**
     * Configure API key authorization: cookieAuth
     */
    public function setcookieAuth($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of PokemonApiInterface#typeRetrieve
     */
    public function typeRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. |

### Return type

[**OpenAPI\Server\Model\TypeDetail**](../Model/TypeDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

