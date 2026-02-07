# OpenAPI\Server\Api\MachinesApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](MachinesApiInterface.md#machineList) | **GET** /api/v2/machine/ | List machines
[**machineRetrieve**](MachinesApiInterface.md#machineRetrieve) | **GET** /api/v2/machine/{id}/ | Get machine


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MachinesApi:
        tags:
            - { name: "open_api_server.api", api: "machines" }
    # ...
```

## **machineList**
> OpenAPI\Server\Model\PaginatedMachineSummaryList machineList($limit, $offset, $q)

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MachinesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MachinesApiInterface;

class MachinesApi implements MachinesApiInterface
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
     * Implementation of MachinesApiInterface#machineList
     */
    public function machineList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedMachineSummaryList**](../Model/PaginatedMachineSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **machineRetrieve**
> OpenAPI\Server\Model\MachineDetail machineRetrieve($id)

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MachinesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MachinesApiInterface;

class MachinesApi implements MachinesApiInterface
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
     * Implementation of MachinesApiInterface#machineRetrieve
     */
    public function machineRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\MachineDetail**](../Model/MachineDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

