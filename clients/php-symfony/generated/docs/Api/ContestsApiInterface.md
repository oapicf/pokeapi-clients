# OpenAPI\Server\Api\ContestsApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestEffectList**](ContestsApiInterface.md#contestEffectList) | **GET** /api/v2/contest-effect/ | List contest effects
[**contestEffectRetrieve**](ContestsApiInterface.md#contestEffectRetrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
[**contestTypeList**](ContestsApiInterface.md#contestTypeList) | **GET** /api/v2/contest-type/ | List contest types
[**contestTypeRetrieve**](ContestsApiInterface.md#contestTypeRetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
[**superContestEffectList**](ContestsApiInterface.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | List super contest effects
[**superContestEffectRetrieve**](ContestsApiInterface.md#superContestEffectRetrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ContestsApi:
        tags:
            - { name: "open_api_server.api", api: "contests" }
    # ...
```

## **contestEffectList**
> OpenAPI\Server\Model\PaginatedContestEffectSummaryList contestEffectList($limit, $offset, $q)

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestsApiInterface;

class ContestsApi implements ContestsApiInterface
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
     * Implementation of ContestsApiInterface#contestEffectList
     */
    public function contestEffectList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedContestEffectSummaryList**](../Model/PaginatedContestEffectSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **contestEffectRetrieve**
> OpenAPI\Server\Model\ContestEffectDetail contestEffectRetrieve($id)

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestsApiInterface;

class ContestsApi implements ContestsApiInterface
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
     * Implementation of ContestsApiInterface#contestEffectRetrieve
     */
    public function contestEffectRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\ContestEffectDetail**](../Model/ContestEffectDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **contestTypeList**
> OpenAPI\Server\Model\PaginatedContestTypeSummaryList contestTypeList($limit, $offset, $q)

List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestsApiInterface;

class ContestsApi implements ContestsApiInterface
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
     * Implementation of ContestsApiInterface#contestTypeList
     */
    public function contestTypeList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedContestTypeSummaryList**](../Model/PaginatedContestTypeSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **contestTypeRetrieve**
> OpenAPI\Server\Model\ContestTypeDetail contestTypeRetrieve($id)

Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestsApiInterface;

class ContestsApi implements ContestsApiInterface
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
     * Implementation of ContestsApiInterface#contestTypeRetrieve
     */
    public function contestTypeRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\ContestTypeDetail**](../Model/ContestTypeDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **superContestEffectList**
> OpenAPI\Server\Model\PaginatedSuperContestEffectSummaryList superContestEffectList($limit, $offset, $q)

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestsApiInterface;

class ContestsApi implements ContestsApiInterface
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
     * Implementation of ContestsApiInterface#superContestEffectList
     */
    public function superContestEffectList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedSuperContestEffectSummaryList**](../Model/PaginatedSuperContestEffectSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **superContestEffectRetrieve**
> OpenAPI\Server\Model\SuperContestEffectDetail superContestEffectRetrieve($id)

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContestsApiInterface;

class ContestsApi implements ContestsApiInterface
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
     * Implementation of ContestsApiInterface#superContestEffectRetrieve
     */
    public function superContestEffectRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\SuperContestEffectDetail**](../Model/SuperContestEffectDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

