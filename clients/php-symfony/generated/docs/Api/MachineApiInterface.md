# OpenAPI\Server\Api\MachineApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](MachineApiInterface.md#machineList) | **GET** /api/v2/machine/ | 
[**machineRead**](MachineApiInterface.md#machineRead) | **GET** /api/v2/machine/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MachineApi:
        tags:
            - { name: "open_api_server.api", api: "machine" }
    # ...
```

## **machineList**
> string machineList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MachineApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MachineApiInterface;

class MachineApi implements MachineApiInterface
{

    // ...

    /**
     * Implementation of MachineApiInterface#machineList
     */
    public function machineList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
    {
        // Implement the operation ...
    }

    // ...
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
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **machineRead**
> string machineRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MachineApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MachineApiInterface;

class MachineApi implements MachineApiInterface
{

    // ...

    /**
     * Implementation of MachineApiInterface#machineRead
     */
    public function machineRead(int $id, int &$responseCode, array &$responseHeaders): string
    {
        // Implement the operation ...
    }

    // ...
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
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

