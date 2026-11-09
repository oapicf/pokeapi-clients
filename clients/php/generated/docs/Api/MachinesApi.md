# OpenAPI\Client\MachinesApi

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

All URIs are relative to https://pokeapi.co, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**machineList()**](MachinesApi.md#machineList) | **GET** /api/v2/machine/ | List machines |
| [**machineRetrieve()**](MachinesApi.md#machineRetrieve) | **GET** /api/v2/machine/{id}/ | Get machine |


## `machineList()`

```php
machineList($limit, $offset): \OpenAPI\Client\Model\PaginatedMachineSummaryList
```

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\MachinesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$limit = 56; // int | Number of results to return per page.
$offset = 56; // int | The initial index from which to return the results.

try {
    $result = $apiInstance->machineList($limit, $offset);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MachinesApi->machineList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| Number of results to return per page. | [optional] |
| **offset** | **int**| The initial index from which to return the results. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaginatedMachineSummaryList**](../Model/PaginatedMachineSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `machineRetrieve()`

```php
machineRetrieve($id): \OpenAPI\Client\Model\MachineDetail
```

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\MachinesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 1; // string | This parameter can be a string or an integer.

try {
    $result = $apiInstance->machineRetrieve($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MachinesApi->machineRetrieve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| This parameter can be a string or an integer. | |

### Return type

[**\OpenAPI\Client\Model\MachineDetail**](../Model/MachineDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
