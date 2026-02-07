# OpenAPI\Server\Api\EvolutionApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](EvolutionApiInterface.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**evolutionChainRetrieve**](EvolutionApiInterface.md#evolutionChainRetrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolutionTriggerList**](EvolutionApiInterface.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**evolutionTriggerRetrieve**](EvolutionApiInterface.md#evolutionTriggerRetrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\EvolutionApi:
        tags:
            - { name: "open_api_server.api", api: "evolution" }
    # ...
```

## **evolutionChainList**
> OpenAPI\Server\Model\PaginatedEvolutionChainSummaryList evolutionChainList($limit, $offset, $q)

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EvolutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EvolutionApiInterface;

class EvolutionApi implements EvolutionApiInterface
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
     * Implementation of EvolutionApiInterface#evolutionChainList
     */
    public function evolutionChainList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedEvolutionChainSummaryList**](../Model/PaginatedEvolutionChainSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **evolutionChainRetrieve**
> OpenAPI\Server\Model\EvolutionChainDetail evolutionChainRetrieve($id)

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EvolutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EvolutionApiInterface;

class EvolutionApi implements EvolutionApiInterface
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
     * Implementation of EvolutionApiInterface#evolutionChainRetrieve
     */
    public function evolutionChainRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\EvolutionChainDetail**](../Model/EvolutionChainDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **evolutionTriggerList**
> OpenAPI\Server\Model\PaginatedEvolutionTriggerSummaryList evolutionTriggerList($limit, $offset, $q)

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EvolutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EvolutionApiInterface;

class EvolutionApi implements EvolutionApiInterface
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
     * Implementation of EvolutionApiInterface#evolutionTriggerList
     */
    public function evolutionTriggerList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedEvolutionTriggerSummaryList**](../Model/PaginatedEvolutionTriggerSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **evolutionTriggerRetrieve**
> OpenAPI\Server\Model\EvolutionTriggerDetail evolutionTriggerRetrieve($id)

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EvolutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EvolutionApiInterface;

class EvolutionApi implements EvolutionApiInterface
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
     * Implementation of EvolutionApiInterface#evolutionTriggerRetrieve
     */
    public function evolutionTriggerRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\EvolutionTriggerDetail**](../Model/EvolutionTriggerDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

