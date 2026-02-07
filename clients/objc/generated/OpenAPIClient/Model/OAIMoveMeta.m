#import "OAIMoveMeta.h"

@implementation OAIMoveMeta

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"ailment": @"ailment", @"category": @"category", @"minHits": @"min_hits", @"maxHits": @"max_hits", @"minTurns": @"min_turns", @"maxTurns": @"max_turns", @"drain": @"drain", @"healing": @"healing", @"critRate": @"crit_rate", @"ailmentChance": @"ailment_chance", @"flinchChance": @"flinch_chance", @"statChance": @"stat_chance" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"minHits", @"maxHits", @"minTurns", @"maxTurns", @"drain", @"healing", @"critRate", @"ailmentChance", @"flinchChance", @"statChance"];
  return [optionalProperties containsObject:propertyName];
}

@end
