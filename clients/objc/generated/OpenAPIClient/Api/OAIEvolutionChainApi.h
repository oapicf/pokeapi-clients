#import <Foundation/Foundation.h>
#import "OAIApi.h"

/**
* 
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIEvolutionChainApi: NSObject <OAIApi>

extern NSString* kOAIEvolutionChainApiErrorDomain;
extern NSInteger kOAIEvolutionChainApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 
/// 
///
/// @param limit  (optional)
/// @param offset  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) evolutionChainListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// @param _id 
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) evolutionChainReadWithId: (NSNumber*) _id
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end
