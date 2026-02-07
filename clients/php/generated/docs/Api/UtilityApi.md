# OpenAPI\Client\UtilityApi



All URIs are relative to https://pokeapi.co, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**languageList()**](UtilityApi.md#languageList) | **GET** /api/v2/language/ | List languages |
| [**languageRetrieve()**](UtilityApi.md#languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language |


## `languageList()`

```php
languageList($limit, $offset, $q): \OpenAPI\Client\Model\PaginatedLanguageSummaryList
```

List languages

Languages for translations of API resource information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: basicAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

// Configure API key authorization: cookieAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('sessionid', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('sessionid', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\UtilityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.
$q = 'q_example'; // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.

try {
    $result = $apiInstance->languageList($limit, $offset, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UtilityApi->languageList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |
| **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedLanguageSummaryList**](../Model/PaginatedLanguageSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `languageRetrieve()`

```php
languageRetrieve($id): \OpenAPI\Client\Model\LanguageDetail
```

Get language

Languages for translations of API resource information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: basicAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

// Configure API key authorization: cookieAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('sessionid', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('sessionid', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\UtilityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 'id_example'; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->languageRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UtilityApi->languageRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\LanguageDetail**](../Model/LanguageDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
