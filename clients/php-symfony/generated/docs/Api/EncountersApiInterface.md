# OpenAPI\Server\Api\EncountersApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncountersApiInterface.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**encounterConditionRetrieve**](EncountersApiInterface.md#encounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounterConditionValueList**](EncountersApiInterface.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounterConditionValueRetrieve**](EncountersApiInterface.md#encounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounterMethodList**](EncountersApiInterface.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods
[**encounterMethodRetrieve**](EncountersApiInterface.md#encounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\EncountersApi:
        tags:
            - { name: "open_api_server.api", api: "encounters" }
    # ...
```

## **encounterConditionList**
> OpenAPI\Server\Model\PaginatedEncounterConditionSummaryList encounterConditionList($limit, $offset, $q)

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncountersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncountersApiInterface;

class EncountersApi implements EncountersApiInterface
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
     * Implementation of EncountersApiInterface#encounterConditionList
     */
    public function encounterConditionList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedEncounterConditionSummaryList**](../Model/PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **encounterConditionRetrieve**
> OpenAPI\Server\Model\EncounterConditionDetail encounterConditionRetrieve($id)

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncountersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncountersApiInterface;

class EncountersApi implements EncountersApiInterface
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
     * Implementation of EncountersApiInterface#encounterConditionRetrieve
     */
    public function encounterConditionRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\EncounterConditionDetail**](../Model/EncounterConditionDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **encounterConditionValueList**
> OpenAPI\Server\Model\PaginatedEncounterConditionValueSummaryList encounterConditionValueList($limit, $offset, $q)

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncountersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncountersApiInterface;

class EncountersApi implements EncountersApiInterface
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
     * Implementation of EncountersApiInterface#encounterConditionValueList
     */
    public function encounterConditionValueList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedEncounterConditionValueSummaryList**](../Model/PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **encounterConditionValueRetrieve**
> OpenAPI\Server\Model\EncounterConditionValueDetail encounterConditionValueRetrieve($id)

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncountersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncountersApiInterface;

class EncountersApi implements EncountersApiInterface
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
     * Implementation of EncountersApiInterface#encounterConditionValueRetrieve
     */
    public function encounterConditionValueRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\EncounterConditionValueDetail**](../Model/EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **encounterMethodList**
> OpenAPI\Server\Model\PaginatedEncounterMethodSummaryList encounterMethodList($limit, $offset, $q)

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncountersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncountersApiInterface;

class EncountersApi implements EncountersApiInterface
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
     * Implementation of EncountersApiInterface#encounterMethodList
     */
    public function encounterMethodList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedEncounterMethodSummaryList**](../Model/PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **encounterMethodRetrieve**
> OpenAPI\Server\Model\EncounterMethodDetail encounterMethodRetrieve($id)

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncountersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncountersApiInterface;

class EncountersApi implements EncountersApiInterface
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
     * Implementation of EncountersApiInterface#encounterMethodRetrieve
     */
    public function encounterMethodRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\EncounterMethodDetail**](../Model/EncounterMethodDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

