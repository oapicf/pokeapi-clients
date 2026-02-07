# OpenAPI\Server\Api\LocationApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](LocationApiInterface.md#locationAreaList) | **GET** /api/v2/location-area/ | List location areas
[**locationAreaRetrieve**](LocationApiInterface.md#locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**locationList**](LocationApiInterface.md#locationList) | **GET** /api/v2/location/ | List locations
[**locationRetrieve**](LocationApiInterface.md#locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location
[**palParkAreaList**](LocationApiInterface.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**palParkAreaRetrieve**](LocationApiInterface.md#palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**regionList**](LocationApiInterface.md#regionList) | **GET** /api/v2/region/ | List regions
[**regionRetrieve**](LocationApiInterface.md#regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\LocationApi:
        tags:
            - { name: "open_api_server.api", api: "location" }
    # ...
```

## **locationAreaList**
> OpenAPI\Server\Model\PaginatedLocationAreaSummaryList locationAreaList($limit, $offset)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
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
     * Implementation of LocationApiInterface#locationAreaList
     */
    public function locationAreaList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\PaginatedLocationAreaSummaryList**](../Model/PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **locationAreaRetrieve**
> OpenAPI\Server\Model\LocationAreaDetail locationAreaRetrieve($id)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
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
     * Implementation of LocationApiInterface#locationAreaRetrieve
     */
    public function locationAreaRetrieve(int $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| A unique integer value identifying this location area. |

### Return type

[**OpenAPI\Server\Model\LocationAreaDetail**](../Model/LocationAreaDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **locationList**
> OpenAPI\Server\Model\PaginatedLocationSummaryList locationList($limit, $offset, $q)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
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
     * Implementation of LocationApiInterface#locationList
     */
    public function locationList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedLocationSummaryList**](../Model/PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **locationRetrieve**
> OpenAPI\Server\Model\LocationDetail locationRetrieve($id)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
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
     * Implementation of LocationApiInterface#locationRetrieve
     */
    public function locationRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\LocationDetail**](../Model/LocationDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **palParkAreaList**
> OpenAPI\Server\Model\PaginatedPalParkAreaSummaryList palParkAreaList($limit, $offset, $q)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
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
     * Implementation of LocationApiInterface#palParkAreaList
     */
    public function palParkAreaList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedPalParkAreaSummaryList**](../Model/PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **palParkAreaRetrieve**
> OpenAPI\Server\Model\PalParkAreaDetail palParkAreaRetrieve($id)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
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
     * Implementation of LocationApiInterface#palParkAreaRetrieve
     */
    public function palParkAreaRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PalParkAreaDetail**](../Model/PalParkAreaDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **regionList**
> OpenAPI\Server\Model\PaginatedRegionSummaryList regionList($limit, $offset, $q)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
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
     * Implementation of LocationApiInterface#regionList
     */
    public function regionList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedRegionSummaryList**](../Model/PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **regionRetrieve**
> OpenAPI\Server\Model\RegionDetail regionRetrieve($id)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LocationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LocationApiInterface;

class LocationApi implements LocationApiInterface
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
     * Implementation of LocationApiInterface#regionRetrieve
     */
    public function regionRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\RegionDetail**](../Model/RegionDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

