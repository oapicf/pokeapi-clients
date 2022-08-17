# OpenAPI\Server\Api\AbilityApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](AbilityApiInterface.md#abilityList) | **GET** /api/v2/ability/ | 
[**abilityRead**](AbilityApiInterface.md#abilityRead) | **GET** /api/v2/ability/{id}/ | 


## Service Declaration
```yaml
# config/services.yml
services:
    # ...
    Acme\MyBundle\Api\AbilityApi:
        tags:
            - { name: "open_api_server.api", api: "ability" }
    # ...
```

## **abilityList**
> string abilityList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AbilityApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AbilityApiInterface;

class AbilityApi implements AbilityApiInterface
{

    // ...

    /**
     * Implementation of AbilityApiInterface#abilityList
     */
    public function abilityList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): array|object|null
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

## **abilityRead**
> string abilityRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AbilityApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AbilityApiInterface;

class AbilityApi implements AbilityApiInterface
{

    // ...

    /**
     * Implementation of AbilityApiInterface#abilityRead
     */
    public function abilityRead(int $id, int &$responseCode, array &$responseHeaders): array|object|null
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

