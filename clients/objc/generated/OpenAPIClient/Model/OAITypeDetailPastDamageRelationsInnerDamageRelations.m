#import "OAITypeDetailPastDamageRelationsInnerDamageRelations.h"

@implementation OAITypeDetailPastDamageRelationsInnerDamageRelations

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"noDamageTo": @"no_damage_to", @"halfDamageTo": @"half_damage_to", @"doubleDamageTo": @"double_damage_to", @"noDamageFrom": @"no_damage_from", @"halfDamageFrom": @"half_damage_from", @"doubleDamageFrom": @"double_damage_from" }];
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
