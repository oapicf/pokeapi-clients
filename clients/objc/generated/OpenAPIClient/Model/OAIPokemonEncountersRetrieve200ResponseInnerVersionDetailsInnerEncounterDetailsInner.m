#import "OAIPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.h"

@implementation OAIPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"chance": @"chance", @"conditionValues": @"condition_values", @"maxLevel": @"max_level", @"method": @"method", @"minLevel": @"min_level" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end
