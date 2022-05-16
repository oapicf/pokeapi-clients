# OpenAPI\Client\ItemCategoryApi

All URIs are relative to https://pokeapi.co/api/v2.

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCategoryList()**](ItemCategoryApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | 
[**itemCategoryRead()**](ItemCategoryApi.md#itemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 


## `itemCategoryList()`

```php
itemCategoryList($limit, $offset): string
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ItemCategoryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int
$offset = 56; // int

try {
    $result = $apiInstance->itemCategoryList($limit, $offset);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ItemCategoryApi->itemCategoryList: ', $e->getMessage(), PHP_EOL;
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

## `itemCategoryRead()`

```php
itemCategoryRead($id): string
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ItemCategoryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 56; // int

try {
    $result = $apiInstance->itemCategoryRead($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ItemCategoryApi->itemCategoryRead: ', $e->getMessage(), PHP_EOL;
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
