# OpenAPI\Server\Api\ItemsApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](ItemsApiInterface.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes
[**itemAttributeRetrieve**](ItemsApiInterface.md#itemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**itemCategoryList**](ItemsApiInterface.md#itemCategoryList) | **GET** /api/v2/item-category/ | List item categories
[**itemCategoryRetrieve**](ItemsApiInterface.md#itemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**itemFlingEffectList**](ItemsApiInterface.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**itemFlingEffectRetrieve**](ItemsApiInterface.md#itemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**itemList**](ItemsApiInterface.md#itemList) | **GET** /api/v2/item/ | List items
[**itemPocketList**](ItemsApiInterface.md#itemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets
[**itemPocketRetrieve**](ItemsApiInterface.md#itemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**itemRetrieve**](ItemsApiInterface.md#itemRetrieve) | **GET** /api/v2/item/{id}/ | Get item


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ItemsApi:
        tags:
            - { name: "open_api_server.api", api: "items" }
    # ...
```

## **itemAttributeList**
> OpenAPI\Server\Model\PaginatedItemAttributeSummaryList itemAttributeList($limit, $offset, $q)

List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemAttributeList
     */
    public function itemAttributeList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedItemAttributeSummaryList**](../Model/PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemAttributeRetrieve**
> OpenAPI\Server\Model\ItemAttributeDetail itemAttributeRetrieve($id)

Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemAttributeRetrieve
     */
    public function itemAttributeRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\ItemAttributeDetail**](../Model/ItemAttributeDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemCategoryList**
> OpenAPI\Server\Model\PaginatedItemCategorySummaryList itemCategoryList($limit, $offset, $q)

List item categories

Item categories determine where items will be placed in the players bag.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemCategoryList
     */
    public function itemCategoryList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedItemCategorySummaryList**](../Model/PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemCategoryRetrieve**
> OpenAPI\Server\Model\ItemCategoryDetail itemCategoryRetrieve($id)

Get item category

Item categories determine where items will be placed in the players bag.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemCategoryRetrieve
     */
    public function itemCategoryRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\ItemCategoryDetail**](../Model/ItemCategoryDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemFlingEffectList**
> OpenAPI\Server\Model\PaginatedItemFlingEffectSummaryList itemFlingEffectList($limit, $offset, $q)

List item fling effects

The various effects of the move\"Fling\" when used with different items.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemFlingEffectList
     */
    public function itemFlingEffectList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedItemFlingEffectSummaryList**](../Model/PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemFlingEffectRetrieve**
> OpenAPI\Server\Model\ItemFlingEffectDetail itemFlingEffectRetrieve($id)

Get item fling effect

The various effects of the move\"Fling\" when used with different items.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemFlingEffectRetrieve
     */
    public function itemFlingEffectRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\ItemFlingEffectDetail**](../Model/ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemList**
> OpenAPI\Server\Model\PaginatedItemSummaryList itemList($limit, $offset, $q)

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemList
     */
    public function itemList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedItemSummaryList**](../Model/PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemPocketList**
> OpenAPI\Server\Model\PaginatedItemPocketSummaryList itemPocketList($limit, $offset, $q)

List item pockets

Pockets within the players bag used for storing items by category.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemPocketList
     */
    public function itemPocketList(?int $limit, ?int $offset, ?string $q, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\PaginatedItemPocketSummaryList**](../Model/PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemPocketRetrieve**
> OpenAPI\Server\Model\ItemPocketDetail itemPocketRetrieve($id)

Get item pocket

Pockets within the players bag used for storing items by category.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemPocketRetrieve
     */
    public function itemPocketRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\ItemPocketDetail**](../Model/ItemPocketDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemRetrieve**
> OpenAPI\Server\Model\ItemDetail itemRetrieve($id)

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ItemsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ItemsApiInterface;

class ItemsApi implements ItemsApiInterface
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
     * Implementation of ItemsApiInterface#itemRetrieve
     */
    public function itemRetrieve(string $id, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\ItemDetail**](../Model/ItemDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth), [cookieAuth](../../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

