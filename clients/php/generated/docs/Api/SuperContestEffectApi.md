# OpenAPI\Client\SuperContestEffectApi

All URIs are relative to https://pokeapi.co/api/v2.

Method | HTTP request | Description
------------- | ------------- | -------------
[**superContestEffectList()**](SuperContestEffectApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**superContestEffectRead()**](SuperContestEffectApi.md#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 


## `superContestEffectList()`

```php
superContestEffectList($limit, $offset): string
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SuperContestEffectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int
$offset = 56; // int

try {
    $result = $apiInstance->superContestEffectList($limit, $offset);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SuperContestEffectApi->superContestEffectList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional]
 **offset** | **int**|  | [optional]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `superContestEffectRead()`

```php
superContestEffectRead($id): string
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SuperContestEffectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 56; // int

try {
    $result = $apiInstance->superContestEffectRead($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SuperContestEffectApi->superContestEffectRead: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
