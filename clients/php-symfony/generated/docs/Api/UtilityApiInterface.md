# OpenAPI\Server\Api\UtilityApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](UtilityApiInterface.md#languageList) | **GET** /api/v2/language/ | List languages
[**languageRetrieve**](UtilityApiInterface.md#languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\UtilityApi:
        tags:
            - { name: "open_api_server.api", api: "utility" }
    # ...
```

## **languageList**
> OpenAPI\Server\Model\PaginatedLanguageSummaryList languageList($limit, $offset, $q)

List languages

Languages for translations of API resource information.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UtilityApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UtilityApiInterface;

class UtilityApi implements UtilityApiInterface
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
     * Implementation of UtilityApiInterface#languageList
     */
    public function languageList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedLanguageSummaryList**](../Model/PaginatedLanguageSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **languageRetrieve**
> OpenAPI\Server\Model\LanguageDetail languageRetrieve($id)

Get language

Languages for translations of API resource information.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UtilityApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UtilityApiInterface;

class UtilityApi implements UtilityApiInterface
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
     * Implementation of UtilityApiInterface#languageRetrieve
     */
    public function languageRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\LanguageDetail**](../Model/LanguageDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

