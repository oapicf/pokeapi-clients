# OpenAPI\Server\Api\CharacteristicApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**characteristicList**](CharacteristicApiInterface.md#characteristicList) | **GET** /api/v2/characteristic/ | 
[**characteristicRead**](CharacteristicApiInterface.md#characteristicRead) | **GET** /api/v2/characteristic/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\CharacteristicApi:
        tags:
            - { name: "open_api_server.api", api: "characteristic" }
    # ...
```

## **characteristicList**
> string characteristicList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CharacteristicApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CharacteristicApiInterface;

class CharacteristicApi implements CharacteristicApiInterface
{

    // ...

    /**
     * Implementation of CharacteristicApiInterface#characteristicList
     */
    public function characteristicList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **characteristicRead**
> string characteristicRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CharacteristicApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CharacteristicApiInterface;

class CharacteristicApi implements CharacteristicApiInterface
{

    // ...

    /**
     * Implementation of CharacteristicApiInterface#characteristicRead
     */
    public function characteristicRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

