# OpenAPI\Client\EvolutionApi

All URIs are relative to https://pokeapi.co, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**evolutionChainList()**](EvolutionApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | List evolution chains |
| [**evolutionChainRetrieve()**](EvolutionApi.md#evolutionChainRetrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain |
| [**evolutionTriggerList()**](EvolutionApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | List evolution triggers |
| [**evolutionTriggerRetrieve()**](EvolutionApi.md#evolutionTriggerRetrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger |
| [**evolutionVariableList()**](EvolutionApi.md#evolutionVariableList) | **GET** /api/v2/evolution-variable/ | List evolution variables |
| [**evolutionVariableRetrieve()**](EvolutionApi.md#evolutionVariableRetrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable |


## `evolutionChainList()`

```php
evolutionChainList($limit, $offset): \OpenAPI\Client\Model\PaginatedEvolutionChainSummaryList
```

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\EvolutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.

try {
    $result = $apiInstance->evolutionChainList($limit, $offset);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EvolutionApi->evolutionChainList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedEvolutionChainSummaryList**](../Model/PaginatedEvolutionChainSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `evolutionChainRetrieve()`

```php
evolutionChainRetrieve($id): \OpenAPI\Client\Model\EvolutionChainDetail
```

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\EvolutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 1; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->evolutionChainRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EvolutionApi->evolutionChainRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\EvolutionChainDetail**](../Model/EvolutionChainDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `evolutionTriggerList()`

```php
evolutionTriggerList($limit, $offset, $q): \OpenAPI\Client\Model\PaginatedEvolutionTriggerSummaryList
```

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\EvolutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.
$q = 'q_example'; // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.

try {
    $result = $apiInstance->evolutionTriggerList($limit, $offset, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EvolutionApi->evolutionTriggerList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |
| **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedEvolutionTriggerSummaryList**](../Model/PaginatedEvolutionTriggerSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `evolutionTriggerRetrieve()`

```php
evolutionTriggerRetrieve($id): \OpenAPI\Client\Model\EvolutionTriggerDetail
```

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\EvolutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 1; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->evolutionTriggerRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EvolutionApi->evolutionTriggerRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\EvolutionTriggerDetail**](../Model/EvolutionTriggerDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `evolutionVariableList()`

```php
evolutionVariableList($limit, $offset, $q): \OpenAPI\Client\Model\PaginatedEvolutionVariableSummaryList
```

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\EvolutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.
$q = 'q_example'; // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.

try {
    $result = $apiInstance->evolutionVariableList($limit, $offset, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EvolutionApi->evolutionVariableList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |
| **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedEvolutionVariableSummaryList**](../Model/PaginatedEvolutionVariableSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `evolutionVariableRetrieve()`

```php
evolutionVariableRetrieve($id): \OpenAPI\Client\Model\EvolutionVariableDetail
```

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\EvolutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 1; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->evolutionVariableRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EvolutionApi->evolutionVariableRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\EvolutionVariableDetail**](../Model/EvolutionVariableDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
