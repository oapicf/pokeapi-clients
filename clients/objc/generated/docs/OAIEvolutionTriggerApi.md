# OAIEvolutionTriggerApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionTriggerList**](OAIEvolutionTriggerApi.md#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ | 
[**evolutionTriggerRead**](OAIEvolutionTriggerApi.md#evolutiontriggerread) | **GET** /api/v2/evolution-trigger/{id}/ | 


# **evolutionTriggerList**
```objc
-(NSURLSessionTask*) evolutionTriggerListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* limit = @56; //  (optional)
NSNumber* offset = @56; //  (optional)

OAIEvolutionTriggerApi*apiInstance = [[OAIEvolutionTriggerApi alloc] init];

[apiInstance evolutionTriggerListWithLimit:limit
              offset:offset
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEvolutionTriggerApi->evolutionTriggerList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***|  | [optional] 
 **offset** | **NSNumber***|  | [optional] 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolutionTriggerRead**
```objc
-(NSURLSessionTask*) evolutionTriggerReadWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* _id = @56; // 

OAIEvolutionTriggerApi*apiInstance = [[OAIEvolutionTriggerApi alloc] init];

[apiInstance evolutionTriggerReadWithId:_id
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEvolutionTriggerApi->evolutionTriggerRead: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***|  | 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

