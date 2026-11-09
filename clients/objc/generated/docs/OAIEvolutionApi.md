# OAIEvolutionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](OAIEvolutionApi.md#evolutionchainlist) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**evolutionChainRetrieve**](OAIEvolutionApi.md#evolutionchainretrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolutionTriggerList**](OAIEvolutionApi.md#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**evolutionTriggerRetrieve**](OAIEvolutionApi.md#evolutiontriggerretrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
[**evolutionVariableList**](OAIEvolutionApi.md#evolutionvariablelist) | **GET** /api/v2/evolution-variable/ | List evolution variables
[**evolutionVariableRetrieve**](OAIEvolutionApi.md#evolutionvariableretrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable


# **evolutionChainList**
```objc
-(NSURLSessionTask*) evolutionChainListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(OAIPaginatedEvolutionChainSummaryList* output, NSError* error)) handler;
```

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```objc

NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)

OAIEvolutionApi*apiInstance = [[OAIEvolutionApi alloc] init];

// List evolution chains
[apiInstance evolutionChainListWithLimit:limit
              offset:offset
          completionHandler: ^(OAIPaginatedEvolutionChainSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEvolutionApi->evolutionChainList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 

### Return type

[**OAIPaginatedEvolutionChainSummaryList***](OAIPaginatedEvolutionChainSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionChainRetrieve**
```objc
-(NSURLSessionTask*) evolutionChainRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIEvolutionChainDetail* output, NSError* error)) handler;
```

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```objc

NSString* _id = 1; // This parameter can be a string or an integer.

OAIEvolutionApi*apiInstance = [[OAIEvolutionApi alloc] init];

// Get evolution chain
[apiInstance evolutionChainRetrieveWithId:_id
          completionHandler: ^(OAIEvolutionChainDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEvolutionApi->evolutionChainRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIEvolutionChainDetail***](OAIEvolutionChainDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionTriggerList**
```objc
-(NSURLSessionTask*) evolutionTriggerListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedEvolutionTriggerSummaryList* output, NSError* error)) handler;
```

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```objc

NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIEvolutionApi*apiInstance = [[OAIEvolutionApi alloc] init];

// List evolution triggers
[apiInstance evolutionTriggerListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedEvolutionTriggerSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEvolutionApi->evolutionTriggerList: %@", error);
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

[**OAIPaginatedEvolutionTriggerSummaryList***](OAIPaginatedEvolutionTriggerSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionTriggerRetrieve**
```objc
-(NSURLSessionTask*) evolutionTriggerRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIEvolutionTriggerDetail* output, NSError* error)) handler;
```

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```objc

NSString* _id = 1; // This parameter can be a string or an integer.

OAIEvolutionApi*apiInstance = [[OAIEvolutionApi alloc] init];

// Get evolution trigger
[apiInstance evolutionTriggerRetrieveWithId:_id
          completionHandler: ^(OAIEvolutionTriggerDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEvolutionApi->evolutionTriggerRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIEvolutionTriggerDetail***](OAIEvolutionTriggerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionVariableList**
```objc
-(NSURLSessionTask*) evolutionVariableListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedEvolutionVariableSummaryList* output, NSError* error)) handler;
```

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example
```objc

NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIEvolutionApi*apiInstance = [[OAIEvolutionApi alloc] init];

// List evolution variables
[apiInstance evolutionVariableListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedEvolutionVariableSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEvolutionApi->evolutionVariableList: %@", error);
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

[**OAIPaginatedEvolutionVariableSummaryList***](OAIPaginatedEvolutionVariableSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionVariableRetrieve**
```objc
-(NSURLSessionTask*) evolutionVariableRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIEvolutionVariableDetail* output, NSError* error)) handler;
```

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example
```objc

NSString* _id = 1; // This parameter can be a string or an integer.

OAIEvolutionApi*apiInstance = [[OAIEvolutionApi alloc] init];

// Get evolution variable
[apiInstance evolutionVariableRetrieveWithId:_id
          completionHandler: ^(OAIEvolutionVariableDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEvolutionApi->evolutionVariableRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIEvolutionVariableDetail***](OAIEvolutionVariableDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

