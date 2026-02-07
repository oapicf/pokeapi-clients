# OAIItemsApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](OAIItemsApi.md#itemattributelist) | **GET** /api/v2/item-attribute/ | List item attributes
[**itemAttributeRetrieve**](OAIItemsApi.md#itemattributeretrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**itemCategoryList**](OAIItemsApi.md#itemcategorylist) | **GET** /api/v2/item-category/ | List item categories
[**itemCategoryRetrieve**](OAIItemsApi.md#itemcategoryretrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**itemFlingEffectList**](OAIItemsApi.md#itemflingeffectlist) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**itemFlingEffectRetrieve**](OAIItemsApi.md#itemflingeffectretrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**itemList**](OAIItemsApi.md#itemlist) | **GET** /api/v2/item/ | List items
[**itemPocketList**](OAIItemsApi.md#itempocketlist) | **GET** /api/v2/item-pocket/ | List item pockets
[**itemPocketRetrieve**](OAIItemsApi.md#itempocketretrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**itemRetrieve**](OAIItemsApi.md#itemretrieve) | **GET** /api/v2/item/{id}/ | Get item


# **itemAttributeList**
```objc
-(NSURLSessionTask*) itemAttributeListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedItemAttributeSummaryList* output, NSError* error)) handler;
```

List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// List item attributes
[apiInstance itemAttributeListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedItemAttributeSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemAttributeList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 
 **q** | **NSString***| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**OAIPaginatedItemAttributeSummaryList***](OAIPaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemAttributeRetrieve**
```objc
-(NSURLSessionTask*) itemAttributeRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIItemAttributeDetail* output, NSError* error)) handler;
```

Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSString* _id = @"_id_example"; // This parameter can be a string or an integer.

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// Get item attribute
[apiInstance itemAttributeRetrieveWithId:_id
          completionHandler: ^(OAIItemAttributeDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemAttributeRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIItemAttributeDetail***](OAIItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemCategoryList**
```objc
-(NSURLSessionTask*) itemCategoryListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedItemCategorySummaryList* output, NSError* error)) handler;
```

List item categories

Item categories determine where items will be placed in the players bag.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// List item categories
[apiInstance itemCategoryListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedItemCategorySummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemCategoryList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 
 **q** | **NSString***| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**OAIPaginatedItemCategorySummaryList***](OAIPaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemCategoryRetrieve**
```objc
-(NSURLSessionTask*) itemCategoryRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIItemCategoryDetail* output, NSError* error)) handler;
```

Get item category

Item categories determine where items will be placed in the players bag.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSString* _id = @"_id_example"; // This parameter can be a string or an integer.

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// Get item category
[apiInstance itemCategoryRetrieveWithId:_id
          completionHandler: ^(OAIItemCategoryDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemCategoryRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIItemCategoryDetail***](OAIItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemFlingEffectList**
```objc
-(NSURLSessionTask*) itemFlingEffectListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedItemFlingEffectSummaryList* output, NSError* error)) handler;
```

List item fling effects

The various effects of the move\"Fling\" when used with different items.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// List item fling effects
[apiInstance itemFlingEffectListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedItemFlingEffectSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemFlingEffectList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 
 **q** | **NSString***| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**OAIPaginatedItemFlingEffectSummaryList***](OAIPaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemFlingEffectRetrieve**
```objc
-(NSURLSessionTask*) itemFlingEffectRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIItemFlingEffectDetail* output, NSError* error)) handler;
```

Get item fling effect

The various effects of the move\"Fling\" when used with different items.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSString* _id = @"_id_example"; // This parameter can be a string or an integer.

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// Get item fling effect
[apiInstance itemFlingEffectRetrieveWithId:_id
          completionHandler: ^(OAIItemFlingEffectDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemFlingEffectRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIItemFlingEffectDetail***](OAIItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemList**
```objc
-(NSURLSessionTask*) itemListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedItemSummaryList* output, NSError* error)) handler;
```

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// List items
[apiInstance itemListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedItemSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 
 **q** | **NSString***| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**OAIPaginatedItemSummaryList***](OAIPaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemPocketList**
```objc
-(NSURLSessionTask*) itemPocketListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedItemPocketSummaryList* output, NSError* error)) handler;
```

List item pockets

Pockets within the players bag used for storing items by category.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// List item pockets
[apiInstance itemPocketListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedItemPocketSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemPocketList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 
 **q** | **NSString***| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**OAIPaginatedItemPocketSummaryList***](OAIPaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemPocketRetrieve**
```objc
-(NSURLSessionTask*) itemPocketRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIItemPocketDetail* output, NSError* error)) handler;
```

Get item pocket

Pockets within the players bag used for storing items by category.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSString* _id = @"_id_example"; // This parameter can be a string or an integer.

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// Get item pocket
[apiInstance itemPocketRetrieveWithId:_id
          completionHandler: ^(OAIItemPocketDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemPocketRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIItemPocketDetail***](OAIItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemRetrieve**
```objc
-(NSURLSessionTask*) itemRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIItemDetail* output, NSError* error)) handler;
```

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSString* _id = @"_id_example"; // This parameter can be a string or an integer.

OAIItemsApi*apiInstance = [[OAIItemsApi alloc] init];

// Get item
[apiInstance itemRetrieveWithId:_id
          completionHandler: ^(OAIItemDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemsApi->itemRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIItemDetail***](OAIItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

