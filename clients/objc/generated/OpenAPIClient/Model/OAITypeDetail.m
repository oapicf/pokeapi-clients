#import "OAITypeDetail.h"

@implementation OAITypeDetail

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"damageRelations": @"damage_relations", @"pastDamageRelations": @"past_damage_relations", @"gameIndices": @"game_indices", @"generation": @"generation", @"moveDamageClass": @"move_damage_class", @"names": @"names", @"pokemon": @"pokemon", @"moves": @"moves", @"sprites": @"sprites" }];
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
