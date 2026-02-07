# OpenAPI\Server\Api\MovesApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MovesApiInterface.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**moveAilmentRetrieve**](MovesApiInterface.md#moveAilmentRetrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**moveBattleStyleList**](MovesApiInterface.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**moveBattleStyleRetrieve**](MovesApiInterface.md#moveBattleStyleRetrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**moveCategoryList**](MovesApiInterface.md#moveCategoryList) | **GET** /api/v2/move-category/ | List move meta categories
[**moveCategoryRetrieve**](MovesApiInterface.md#moveCategoryRetrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**moveLearnMethodList**](MovesApiInterface.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**moveLearnMethodRetrieve**](MovesApiInterface.md#moveLearnMethodRetrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**moveList**](MovesApiInterface.md#moveList) | **GET** /api/v2/move/ | List moves
[**moveRetrieve**](MovesApiInterface.md#moveRetrieve) | **GET** /api/v2/move/{id}/ | Get move
[**moveTargetList**](MovesApiInterface.md#moveTargetList) | **GET** /api/v2/move-target/ | List move targets
[**moveTargetRetrieve**](MovesApiInterface.md#moveTargetRetrieve) | **GET** /api/v2/move-target/{id}/ | Get move target


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MovesApi:
        tags:
            - { name: "open_api_server.api", api: "moves" }
    # ...
```

## **moveAilmentList**
> OpenAPI\Server\Model\PaginatedMoveMetaAilmentSummaryList moveAilmentList($limit, $offset, $q)

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveAilmentList
     */
    public function moveAilmentList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedMoveMetaAilmentSummaryList**](../Model/PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveAilmentRetrieve**
> OpenAPI\Server\Model\MoveMetaAilmentDetail moveAilmentRetrieve($id)

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveAilmentRetrieve
     */
    public function moveAilmentRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\MoveMetaAilmentDetail**](../Model/MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveBattleStyleList**
> OpenAPI\Server\Model\PaginatedMoveBattleStyleSummaryList moveBattleStyleList($limit, $offset, $q)

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveBattleStyleList
     */
    public function moveBattleStyleList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedMoveBattleStyleSummaryList**](../Model/PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveBattleStyleRetrieve**
> OpenAPI\Server\Model\MoveBattleStyleDetail moveBattleStyleRetrieve($id)

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveBattleStyleRetrieve
     */
    public function moveBattleStyleRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\MoveBattleStyleDetail**](../Model/MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveCategoryList**
> OpenAPI\Server\Model\PaginatedMoveMetaCategorySummaryList moveCategoryList($limit, $offset, $q)

List move meta categories

Very general categories that loosely group move effects.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveCategoryList
     */
    public function moveCategoryList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedMoveMetaCategorySummaryList**](../Model/PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveCategoryRetrieve**
> OpenAPI\Server\Model\MoveMetaCategoryDetail moveCategoryRetrieve($id)

Get move meta category

Very general categories that loosely group move effects.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveCategoryRetrieve
     */
    public function moveCategoryRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\MoveMetaCategoryDetail**](../Model/MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveLearnMethodList**
> OpenAPI\Server\Model\PaginatedMoveLearnMethodSummaryList moveLearnMethodList($limit, $offset, $q)

List move learn methods

Methods by which Pokémon can learn moves.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveLearnMethodList
     */
    public function moveLearnMethodList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedMoveLearnMethodSummaryList**](../Model/PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveLearnMethodRetrieve**
> OpenAPI\Server\Model\MoveLearnMethodDetail moveLearnMethodRetrieve($id)

Get move learn method

Methods by which Pokémon can learn moves.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveLearnMethodRetrieve
     */
    public function moveLearnMethodRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\MoveLearnMethodDetail**](../Model/MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveList**
> OpenAPI\Server\Model\PaginatedMoveSummaryList moveList($limit, $offset, $q)

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveList
     */
    public function moveList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedMoveSummaryList**](../Model/PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveRetrieve**
> OpenAPI\Server\Model\MoveDetail moveRetrieve($id)

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveRetrieve
     */
    public function moveRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\MoveDetail**](../Model/MoveDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveTargetList**
> OpenAPI\Server\Model\PaginatedMoveTargetSummaryList moveTargetList($limit, $offset, $q)

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveTargetList
     */
    public function moveTargetList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedMoveTargetSummaryList**](../Model/PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **moveTargetRetrieve**
> OpenAPI\Server\Model\MoveTargetDetail moveTargetRetrieve($id)

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MovesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MovesApiInterface;

class MovesApi implements MovesApiInterface
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
     * Implementation of MovesApiInterface#moveTargetRetrieve
     */
    public function moveTargetRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\MoveTargetDetail**](../Model/MoveTargetDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

