# OpenAPI\Server\Api\GamesApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](GamesApiInterface.md#generationList) | **GET** /api/v2/generation/ | List genrations
[**generationRetrieve**](GamesApiInterface.md#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**pokedexList**](GamesApiInterface.md#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex
[**pokedexRetrieve**](GamesApiInterface.md#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**versionGroupList**](GamesApiInterface.md#versionGroupList) | **GET** /api/v2/version-group/ | List version groups
[**versionGroupRetrieve**](GamesApiInterface.md#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**versionList**](GamesApiInterface.md#versionList) | **GET** /api/v2/version/ | List versions
[**versionRetrieve**](GamesApiInterface.md#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\GamesApi:
        tags:
            - { name: "open_api_server.api", api: "games" }
    # ...
```

## **generationList**
> OpenAPI\Server\Model\PaginatedGenerationSummaryList generationList($limit, $offset, $q)

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GamesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GamesApiInterface;

class GamesApi implements GamesApiInterface
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
     * Implementation of GamesApiInterface#generationList
     */
    public function generationList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedGenerationSummaryList**](../Model/PaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generationRetrieve**
> OpenAPI\Server\Model\GenerationDetail generationRetrieve($id)

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GamesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GamesApiInterface;

class GamesApi implements GamesApiInterface
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
     * Implementation of GamesApiInterface#generationRetrieve
     */
    public function generationRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\GenerationDetail**](../Model/GenerationDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokedexList**
> OpenAPI\Server\Model\PaginatedPokedexSummaryList pokedexList($limit, $offset, $q)

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GamesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GamesApiInterface;

class GamesApi implements GamesApiInterface
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
     * Implementation of GamesApiInterface#pokedexList
     */
    public function pokedexList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedPokedexSummaryList**](../Model/PaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pokedexRetrieve**
> OpenAPI\Server\Model\PokedexDetail pokedexRetrieve($id)

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GamesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GamesApiInterface;

class GamesApi implements GamesApiInterface
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
     * Implementation of GamesApiInterface#pokedexRetrieve
     */
    public function pokedexRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PokedexDetail**](../Model/PokedexDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **versionGroupList**
> OpenAPI\Server\Model\PaginatedVersionGroupSummaryList versionGroupList($limit, $offset, $q)

List version groups

Version groups categorize highly similar versions of the games.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GamesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GamesApiInterface;

class GamesApi implements GamesApiInterface
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
     * Implementation of GamesApiInterface#versionGroupList
     */
    public function versionGroupList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedVersionGroupSummaryList**](../Model/PaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **versionGroupRetrieve**
> OpenAPI\Server\Model\VersionGroupDetail versionGroupRetrieve($id)

Get version group

Version groups categorize highly similar versions of the games.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GamesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GamesApiInterface;

class GamesApi implements GamesApiInterface
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
     * Implementation of GamesApiInterface#versionGroupRetrieve
     */
    public function versionGroupRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\VersionGroupDetail**](../Model/VersionGroupDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **versionList**
> OpenAPI\Server\Model\PaginatedVersionSummaryList versionList($limit, $offset, $q)

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GamesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GamesApiInterface;

class GamesApi implements GamesApiInterface
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
     * Implementation of GamesApiInterface#versionList
     */
    public function versionList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedVersionSummaryList**](../Model/PaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **versionRetrieve**
> OpenAPI\Server\Model\VersionDetail versionRetrieve($id)

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GamesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GamesApiInterface;

class GamesApi implements GamesApiInterface
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
     * Implementation of GamesApiInterface#versionRetrieve
     */
    public function versionRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\VersionDetail**](../Model/VersionDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

