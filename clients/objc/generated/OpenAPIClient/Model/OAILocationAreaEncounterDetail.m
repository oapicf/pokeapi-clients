#import "OAILocationAreaEncounterDetail.h"

@implementation OAILocationAreaEncounterDetail

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.chance = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"minLevel": @"min_level", @"maxLevel": @"max_level", @"chance": @"chance", @"method": @"method", @"conditionValues": @"condition_values", @"pokemonDetails": @"pokemon_details" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"chance", @"method", ];
  return [optionalProperties containsObject:propertyName];
}

@end
