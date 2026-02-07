#import "OAIStatDetail.h"

@implementation OAIStatDetail

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"gameIndex": @"game_index", @"isBattleOnly": @"is_battle_only", @"affectingMoves": @"affecting_moves", @"affectingNatures": @"affecting_natures", @"characteristics": @"characteristics", @"moveDamageClass": @"move_damage_class", @"names": @"names" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"isBattleOnly", ];
  return [optionalProperties containsObject:propertyName];
}

@end
