#import "OAIItemDetail.h"

@implementation OAIItemDetail

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"cost": @"cost", @"flingPower": @"fling_power", @"flingEffect": @"fling_effect", @"attributes": @"attributes", @"category": @"category", @"effectEntries": @"effect_entries", @"flavorTextEntries": @"flavor_text_entries", @"gameIndices": @"game_indices", @"names": @"names", @"heldByPokemon": @"held_by_pokemon", @"sprites": @"sprites", @"babyTriggerFor": @"baby_trigger_for", @"machines": @"machines" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cost", @"flingPower", ];
  return [optionalProperties containsObject:propertyName];
}

@end
