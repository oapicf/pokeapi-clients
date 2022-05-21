# OpenAPI\Server\Api\EvolutionChainApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](EvolutionChainApiInterface.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | 
[**evolutionChainRead**](EvolutionChainApiInterface.md#evolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.evolutionChain:
        class: Acme\MyBundle\Api\EvolutionChainApi
        tags:
            - { name: "open_api_server.api", api: "evolutionChain" }
    # ...
```

## **evolutionChainList**
> string evolutionChainList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EvolutionChainApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EvolutionChainApiInterface;

class EvolutionChainApi implements EvolutionChainApiInterface
{

    // ...

    /**
     * Implementation of EvolutionChainApiInterface#evolutionChainList
     */
    public function evolutionChainList($limit = null, $offset = null)
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

## **evolutionChainRead**
> string evolutionChainRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EvolutionChainApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EvolutionChainApiInterface;

class EvolutionChainApi implements EvolutionChainApiInterface
{

    // ...

    /**
     * Implementation of EvolutionChainApiInterface#evolutionChainRead
     */
    public function evolutionChainRead($id)
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

