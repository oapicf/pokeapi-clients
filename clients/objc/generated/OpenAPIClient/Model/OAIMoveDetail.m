#import "OAIMoveDetail.h"

@implementation OAIMoveDetail

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"accuracy": @"accuracy", @"effectChance": @"effect_chance", @"pp": @"pp", @"priority": @"priority", @"power": @"power", @"contestCombos": @"contest_combos", @"contestType": @"contest_type", @"contestEffect": @"contest_effect", @"damageClass": @"damage_class", @"effectEntries": @"effect_entries", @"effectChanges": @"effect_changes", @"generation": @"generation", @"meta": @"meta", @"names": @"names", @"pastValues": @"past_values", @"statChanges": @"stat_changes", @"superContestEffect": @"super_contest_effect", @"target": @"target", @"type": @"type", @"machines": @"machines", @"flavorTextEntries": @"flavor_text_entries", @"learnedByPokemon": @"learned_by_pokemon" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"accuracy", @"pp", @"priority", @"power", ];
  return [optionalProperties containsObject:propertyName];
}

@end
