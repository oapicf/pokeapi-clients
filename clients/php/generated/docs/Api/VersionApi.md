# OpenAPI\Client\VersionApi

All URIs are relative to https://pokeapi.co/api/v2.

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionList()**](VersionApi.md#versionList) | **GET** /api/v2/version/ | 
[**versionRead()**](VersionApi.md#versionRead) | **GET** /api/v2/version/{id}/ | 


## `versionList()`

```php
versionList($limit, $offset): string
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\VersionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int
$offset = 56; // int

try {
    $result = $apiInstance->versionList($limit, $offset);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VersionApi->versionList: ', $e->getMessage(), PHP_EOL;
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

## `versionRead()`

```php
versionRead($id): string
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\VersionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 56; // int

try {
    $result = $apiInstance->versionRead($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VersionApi->versionRead: ', $e->getMessage(), PHP_EOL;
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
