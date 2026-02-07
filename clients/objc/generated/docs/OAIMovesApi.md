# OAIMovesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](OAIMovesApi.md#moveailmentlist) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**moveAilmentRetrieve**](OAIMovesApi.md#moveailmentretrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**moveBattleStyleList**](OAIMovesApi.md#movebattlestylelist) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**moveBattleStyleRetrieve**](OAIMovesApi.md#movebattlestyleretrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**moveCategoryList**](OAIMovesApi.md#movecategorylist) | **GET** /api/v2/move-category/ | List move meta categories
[**moveCategoryRetrieve**](OAIMovesApi.md#movecategoryretrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**moveLearnMethodList**](OAIMovesApi.md#movelearnmethodlist) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**moveLearnMethodRetrieve**](OAIMovesApi.md#movelearnmethodretrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**moveList**](OAIMovesApi.md#movelist) | **GET** /api/v2/move/ | List moves
[**moveRetrieve**](OAIMovesApi.md#moveretrieve) | **GET** /api/v2/move/{id}/ | Get move
[**moveTargetList**](OAIMovesApi.md#movetargetlist) | **GET** /api/v2/move-target/ | List move targets
[**moveTargetRetrieve**](OAIMovesApi.md#movetargetretrieve) | **GET** /api/v2/move-target/{id}/ | Get move target


# **moveAilmentList**
```objc
-(NSURLSessionTask*) moveAilmentListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedMoveMetaAilmentSummaryList* output, NSError* error)) handler;
```

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// List move meta ailments
[apiInstance moveAilmentListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedMoveMetaAilmentSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveAilmentList: %@", error);
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

[**OAIPaginatedMoveMetaAilmentSummaryList***](OAIPaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveAilmentRetrieve**
```objc
-(NSURLSessionTask*) moveAilmentRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIMoveMetaAilmentDetail* output, NSError* error)) handler;
```

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// Get move meta ailment
[apiInstance moveAilmentRetrieveWithId:_id
          completionHandler: ^(OAIMoveMetaAilmentDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveAilmentRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIMoveMetaAilmentDetail***](OAIMoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveBattleStyleList**
```objc
-(NSURLSessionTask*) moveBattleStyleListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedMoveBattleStyleSummaryList* output, NSError* error)) handler;
```

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// List move battle styles
[apiInstance moveBattleStyleListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedMoveBattleStyleSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveBattleStyleList: %@", error);
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

[**OAIPaginatedMoveBattleStyleSummaryList***](OAIPaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveBattleStyleRetrieve**
```objc
-(NSURLSessionTask*) moveBattleStyleRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIMoveBattleStyleDetail* output, NSError* error)) handler;
```

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// Get move battle style
[apiInstance moveBattleStyleRetrieveWithId:_id
          completionHandler: ^(OAIMoveBattleStyleDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveBattleStyleRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIMoveBattleStyleDetail***](OAIMoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveCategoryList**
```objc
-(NSURLSessionTask*) moveCategoryListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedMoveMetaCategorySummaryList* output, NSError* error)) handler;
```

List move meta categories

Very general categories that loosely group move effects.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// List move meta categories
[apiInstance moveCategoryListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedMoveMetaCategorySummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveCategoryList: %@", error);
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

[**OAIPaginatedMoveMetaCategorySummaryList***](OAIPaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveCategoryRetrieve**
```objc
-(NSURLSessionTask*) moveCategoryRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIMoveMetaCategoryDetail* output, NSError* error)) handler;
```

Get move meta category

Very general categories that loosely group move effects.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// Get move meta category
[apiInstance moveCategoryRetrieveWithId:_id
          completionHandler: ^(OAIMoveMetaCategoryDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveCategoryRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIMoveMetaCategoryDetail***](OAIMoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveLearnMethodList**
```objc
-(NSURLSessionTask*) moveLearnMethodListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedMoveLearnMethodSummaryList* output, NSError* error)) handler;
```

List move learn methods

Methods by which Pokémon can learn moves.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// List move learn methods
[apiInstance moveLearnMethodListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedMoveLearnMethodSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveLearnMethodList: %@", error);
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

[**OAIPaginatedMoveLearnMethodSummaryList***](OAIPaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveLearnMethodRetrieve**
```objc
-(NSURLSessionTask*) moveLearnMethodRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIMoveLearnMethodDetail* output, NSError* error)) handler;
```

Get move learn method

Methods by which Pokémon can learn moves.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// Get move learn method
[apiInstance moveLearnMethodRetrieveWithId:_id
          completionHandler: ^(OAIMoveLearnMethodDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveLearnMethodRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIMoveLearnMethodDetail***](OAIMoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveList**
```objc
-(NSURLSessionTask*) moveListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedMoveSummaryList* output, NSError* error)) handler;
```

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// List moves
[apiInstance moveListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedMoveSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveList: %@", error);
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

[**OAIPaginatedMoveSummaryList***](OAIPaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveRetrieve**
```objc
-(NSURLSessionTask*) moveRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIMoveDetail* output, NSError* error)) handler;
```

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// Get move
[apiInstance moveRetrieveWithId:_id
          completionHandler: ^(OAIMoveDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIMoveDetail***](OAIMoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveTargetList**
```objc
-(NSURLSessionTask*) moveTargetListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedMoveTargetSummaryList* output, NSError* error)) handler;
```

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// List move targets
[apiInstance moveTargetListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedMoveTargetSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveTargetList: %@", error);
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

[**OAIPaginatedMoveTargetSummaryList***](OAIPaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **moveTargetRetrieve**
```objc
-(NSURLSessionTask*) moveTargetRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIMoveTargetDetail* output, NSError* error)) handler;
```

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

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

OAIMovesApi*apiInstance = [[OAIMovesApi alloc] init];

// Get move target
[apiInstance moveTargetRetrieveWithId:_id
          completionHandler: ^(OAIMoveTargetDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMovesApi->moveTargetRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIMoveTargetDetail***](OAIMoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

