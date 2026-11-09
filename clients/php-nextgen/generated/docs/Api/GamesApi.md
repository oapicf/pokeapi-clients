# OpenAPI\Client\GamesApi

All URIs are relative to https://pokeapi.co, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**generationList()**](GamesApi.md#generationList) | **GET** /api/v2/generation/ | List genrations |
| [**generationRetrieve()**](GamesApi.md#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration |
| [**pokedexList()**](GamesApi.md#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex |
| [**pokedexRetrieve()**](GamesApi.md#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex |
| [**versionGroupList()**](GamesApi.md#versionGroupList) | **GET** /api/v2/version-group/ | List version groups |
| [**versionGroupRetrieve()**](GamesApi.md#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group |
| [**versionList()**](GamesApi.md#versionList) | **GET** /api/v2/version/ | List versions |
| [**versionRetrieve()**](GamesApi.md#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version |


## `generationList()`

```php
generationList($limit, $offset, $q): \OpenAPI\Client\Model\PaginatedGenerationSummaryList
```

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\GamesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.
$q = 'q_example'; // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.

try {
    $result = $apiInstance->generationList($limit, $offset, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GamesApi->generationList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |
| **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedGenerationSummaryList**](../Model/PaginatedGenerationSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `generationRetrieve()`

```php
generationRetrieve($id): \OpenAPI\Client\Model\GenerationDetail
```

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\GamesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 1; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->generationRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GamesApi->generationRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\GenerationDetail**](../Model/GenerationDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pokedexList()`

```php
pokedexList($limit, $offset, $q): \OpenAPI\Client\Model\PaginatedPokedexSummaryList
```

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\GamesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.
$q = 'q_example'; // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.

try {
    $result = $apiInstance->pokedexList($limit, $offset, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GamesApi->pokedexList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |
| **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedPokedexSummaryList**](../Model/PaginatedPokedexSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pokedexRetrieve()`

```php
pokedexRetrieve($id): \OpenAPI\Client\Model\PokedexDetail
```

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\GamesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 1; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->pokedexRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GamesApi->pokedexRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\PokedexDetail**](../Model/PokedexDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `versionGroupList()`

```php
versionGroupList($limit, $offset, $q): \OpenAPI\Client\Model\PaginatedVersionGroupSummaryList
```

List version groups

Version groups categorize highly similar versions of the games.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\GamesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.
$q = 'q_example'; // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.

try {
    $result = $apiInstance->versionGroupList($limit, $offset, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GamesApi->versionGroupList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |
| **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedVersionGroupSummaryList**](../Model/PaginatedVersionGroupSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `versionGroupRetrieve()`

```php
versionGroupRetrieve($id): \OpenAPI\Client\Model\VersionGroupDetail
```

Get version group

Version groups categorize highly similar versions of the games.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\GamesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 1; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->versionGroupRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GamesApi->versionGroupRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\VersionGroupDetail**](../Model/VersionGroupDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `versionList()`

```php
versionList($limit, $offset, $q): \OpenAPI\Client\Model\PaginatedVersionSummaryList
```

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\GamesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.
$q = 'q_example'; // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.

try {
    $result = $apiInstance->versionList($limit, $offset, $q);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GamesApi->versionList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |
| **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedVersionSummaryList**](../Model/PaginatedVersionSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `versionRetrieve()`

```php
versionRetrieve($id): \OpenAPI\Client\Model\VersionDetail
```

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\GamesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 1; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->versionRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GamesApi->versionRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\VersionDetail**](../Model/VersionDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
