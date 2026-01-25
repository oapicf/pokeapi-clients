# OpenAPI\Server\Api\EvolutionTriggerApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionTriggerList**](EvolutionTriggerApiInterface.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
[**evolutionTriggerRead**](EvolutionTriggerApiInterface.md#evolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\EvolutionTriggerApi:
        tags:
            - { name: "open_api_server.api", api: "evolutionTrigger" }
    # ...
```

## **evolutionTriggerList**
> string evolutionTriggerList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EvolutionTriggerApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EvolutionTriggerApiInterface;

class EvolutionTriggerApi implements EvolutionTriggerApiInterface
{

    // ...

    /**
     * Implementation of EvolutionTriggerApiInterface#evolutionTriggerList
     */
    public function evolutionTriggerList(?int $limit, ?int $offset, int &$responseCode, array &$responseHeaders): string
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

## **evolutionTriggerRead**
> string evolutionTriggerRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EvolutionTriggerApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EvolutionTriggerApiInterface;

class EvolutionTriggerApi implements EvolutionTriggerApiInterface
{

    // ...

    /**
     * Implementation of EvolutionTriggerApiInterface#evolutionTriggerRead
     */
    public function evolutionTriggerRead(int $id, int &$responseCode, array &$responseHeaders): string
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

