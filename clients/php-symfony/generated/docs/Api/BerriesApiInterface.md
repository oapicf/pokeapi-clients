# OpenAPI\Server\Api\BerriesApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerriesApiInterface.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness
[**berryFirmnessRetrieve**](BerriesApiInterface.md#berryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**berryFlavorList**](BerriesApiInterface.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors
[**berryFlavorRetrieve**](BerriesApiInterface.md#berryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**berryList**](BerriesApiInterface.md#berryList) | **GET** /api/v2/berry/ | List berries
[**berryRetrieve**](BerriesApiInterface.md#berryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BerriesApi:
        tags:
            - { name: "open_api_server.api", api: "berries" }
    # ...
```

## **berryFirmnessList**
> OpenAPI\Server\Model\PaginatedBerryFirmnessSummaryList berryFirmnessList($limit, $offset, $q)

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerriesApiInterface;

class BerriesApi implements BerriesApiInterface
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
     * Implementation of BerriesApiInterface#berryFirmnessList
     */
    public function berryFirmnessList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedBerryFirmnessSummaryList**](../Model/PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **berryFirmnessRetrieve**
> OpenAPI\Server\Model\BerryFirmnessDetail berryFirmnessRetrieve($id)

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerriesApiInterface;

class BerriesApi implements BerriesApiInterface
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
     * Implementation of BerriesApiInterface#berryFirmnessRetrieve
     */
    public function berryFirmnessRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\BerryFirmnessDetail**](../Model/BerryFirmnessDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **berryFlavorList**
> OpenAPI\Server\Model\PaginatedBerryFlavorSummaryList berryFlavorList($limit, $offset, $q)

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerriesApiInterface;

class BerriesApi implements BerriesApiInterface
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
     * Implementation of BerriesApiInterface#berryFlavorList
     */
    public function berryFlavorList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedBerryFlavorSummaryList**](../Model/PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **berryFlavorRetrieve**
> OpenAPI\Server\Model\BerryFlavorDetail berryFlavorRetrieve($id)

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerriesApiInterface;

class BerriesApi implements BerriesApiInterface
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
     * Implementation of BerriesApiInterface#berryFlavorRetrieve
     */
    public function berryFlavorRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\BerryFlavorDetail**](../Model/BerryFlavorDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **berryList**
> OpenAPI\Server\Model\PaginatedBerrySummaryList berryList($limit, $offset, $q)

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerriesApiInterface;

class BerriesApi implements BerriesApiInterface
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
     * Implementation of BerriesApiInterface#berryList
     */
    public function berryList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedBerrySummaryList**](../Model/PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **berryRetrieve**
> OpenAPI\Server\Model\BerryDetail berryRetrieve($id)

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerriesApiInterface;

class BerriesApi implements BerriesApiInterface
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
     * Implementation of BerriesApiInterface#berryRetrieve
     */
    public function berryRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\BerryDetail**](../Model/BerryDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

