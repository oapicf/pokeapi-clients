//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner {
  /// Returns a new [EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner] instance.
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner({
    required this.gender,
    required this.heldItem,
    required this.item,
    required this.knownMove,
    required this.knownMoveType,
    required this.location,
    required this.minAffection,
    required this.minBeauty,
    required this.minHappiness,
    required this.minLevel,
    required this.needsOverworldRain,
    required this.partySpecies,
    required this.partyType,
    required this.relativePhysicalStats,
    required this.timeOfDay,
    required this.tradeSpecies,
    required this.trigger,
    required this.turnUpsideDown,
  });

  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender;

  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem;

  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item;

  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMove;

  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMoveType;

  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location;

  int minAffection;

  int minBeauty;

  int minHappiness;

  int minLevel;

  bool needsOverworldRain;

  String partySpecies;

  String partyType;

  String relativePhysicalStats;

  String timeOfDay;

  String tradeSpecies;

  AbilityDetailPokemonInnerPokemon trigger;

  bool turnUpsideDown;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner &&
    other.gender == gender &&
    other.heldItem == heldItem &&
    other.item == item &&
    other.knownMove == knownMove &&
    other.knownMoveType == knownMoveType &&
    other.location == location &&
    other.minAffection == minAffection &&
    other.minBeauty == minBeauty &&
    other.minHappiness == minHappiness &&
    other.minLevel == minLevel &&
    other.needsOverworldRain == needsOverworldRain &&
    other.partySpecies == partySpecies &&
    other.partyType == partyType &&
    other.relativePhysicalStats == relativePhysicalStats &&
    other.timeOfDay == timeOfDay &&
    other.tradeSpecies == tradeSpecies &&
    other.trigger == trigger &&
    other.turnUpsideDown == turnUpsideDown;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (gender.hashCode) +
    (heldItem.hashCode) +
    (item.hashCode) +
    (knownMove.hashCode) +
    (knownMoveType.hashCode) +
    (location.hashCode) +
    (minAffection.hashCode) +
    (minBeauty.hashCode) +
    (minHappiness.hashCode) +
    (minLevel.hashCode) +
    (needsOverworldRain.hashCode) +
    (partySpecies.hashCode) +
    (partyType.hashCode) +
    (relativePhysicalStats.hashCode) +
    (timeOfDay.hashCode) +
    (tradeSpecies.hashCode) +
    (trigger.hashCode) +
    (turnUpsideDown.hashCode);

  @override
  String toString() => 'EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[gender=$gender, heldItem=$heldItem, item=$item, knownMove=$knownMove, knownMoveType=$knownMoveType, location=$location, minAffection=$minAffection, minBeauty=$minBeauty, minHappiness=$minHappiness, minLevel=$minLevel, needsOverworldRain=$needsOverworldRain, partySpecies=$partySpecies, partyType=$partyType, relativePhysicalStats=$relativePhysicalStats, timeOfDay=$timeOfDay, tradeSpecies=$tradeSpecies, trigger=$trigger, turnUpsideDown=$turnUpsideDown]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'gender'] = this.gender;
      json[r'held_item'] = this.heldItem;
      json[r'item'] = this.item;
      json[r'known_move'] = this.knownMove;
      json[r'known_move_type'] = this.knownMoveType;
      json[r'location'] = this.location;
      json[r'min_affection'] = this.minAffection;
      json[r'min_beauty'] = this.minBeauty;
      json[r'min_happiness'] = this.minHappiness;
      json[r'min_level'] = this.minLevel;
      json[r'needs_overworld_rain'] = this.needsOverworldRain;
      json[r'party_species'] = this.partySpecies;
      json[r'party_type'] = this.partyType;
      json[r'relative_physical_stats'] = this.relativePhysicalStats;
      json[r'time_of_day'] = this.timeOfDay;
      json[r'trade_species'] = this.tradeSpecies;
      json[r'trigger'] = this.trigger;
      json[r'turn_upside_down'] = this.turnUpsideDown;
    return json;
  }

  /// Returns a new [EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'gender'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[gender]" is missing from JSON.');
        assert(json[r'gender'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[gender]" has a null value in JSON.');
        assert(json.containsKey(r'held_item'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[held_item]" is missing from JSON.');
        assert(json[r'held_item'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[held_item]" has a null value in JSON.');
        assert(json.containsKey(r'item'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[item]" is missing from JSON.');
        assert(json[r'item'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[item]" has a null value in JSON.');
        assert(json.containsKey(r'known_move'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[known_move]" is missing from JSON.');
        assert(json[r'known_move'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[known_move]" has a null value in JSON.');
        assert(json.containsKey(r'known_move_type'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[known_move_type]" is missing from JSON.');
        assert(json[r'known_move_type'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[known_move_type]" has a null value in JSON.');
        assert(json.containsKey(r'location'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[location]" is missing from JSON.');
        assert(json[r'location'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[location]" has a null value in JSON.');
        assert(json.containsKey(r'min_affection'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[min_affection]" is missing from JSON.');
        assert(json[r'min_affection'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[min_affection]" has a null value in JSON.');
        assert(json.containsKey(r'min_beauty'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[min_beauty]" is missing from JSON.');
        assert(json[r'min_beauty'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[min_beauty]" has a null value in JSON.');
        assert(json.containsKey(r'min_happiness'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[min_happiness]" is missing from JSON.');
        assert(json[r'min_happiness'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[min_happiness]" has a null value in JSON.');
        assert(json.containsKey(r'min_level'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[min_level]" is missing from JSON.');
        assert(json[r'min_level'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[min_level]" has a null value in JSON.');
        assert(json.containsKey(r'needs_overworld_rain'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[needs_overworld_rain]" is missing from JSON.');
        assert(json[r'needs_overworld_rain'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[needs_overworld_rain]" has a null value in JSON.');
        assert(json.containsKey(r'party_species'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[party_species]" is missing from JSON.');
        assert(json[r'party_species'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[party_species]" has a null value in JSON.');
        assert(json.containsKey(r'party_type'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[party_type]" is missing from JSON.');
        assert(json[r'party_type'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[party_type]" has a null value in JSON.');
        assert(json.containsKey(r'relative_physical_stats'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[relative_physical_stats]" is missing from JSON.');
        assert(json[r'relative_physical_stats'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[relative_physical_stats]" has a null value in JSON.');
        assert(json.containsKey(r'time_of_day'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[time_of_day]" is missing from JSON.');
        assert(json[r'time_of_day'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[time_of_day]" has a null value in JSON.');
        assert(json.containsKey(r'trade_species'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[trade_species]" is missing from JSON.');
        assert(json[r'trade_species'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[trade_species]" has a null value in JSON.');
        assert(json.containsKey(r'trigger'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[trigger]" is missing from JSON.');
        assert(json[r'trigger'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[trigger]" has a null value in JSON.');
        assert(json.containsKey(r'turn_upside_down'), 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[turn_upside_down]" is missing from JSON.');
        assert(json[r'turn_upside_down'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[turn_upside_down]" has a null value in JSON.');
        return true;
      }());

      return EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(
        gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.fromJson(json[r'gender'])!,
        heldItem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.fromJson(json[r'held_item'])!,
        item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.fromJson(json[r'item'])!,
        knownMove: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.fromJson(json[r'known_move'])!,
        knownMoveType: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.fromJson(json[r'known_move_type'])!,
        location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.fromJson(json[r'location'])!,
        minAffection: mapValueOfType<int>(json, r'min_affection')!,
        minBeauty: mapValueOfType<int>(json, r'min_beauty')!,
        minHappiness: mapValueOfType<int>(json, r'min_happiness')!,
        minLevel: mapValueOfType<int>(json, r'min_level')!,
        needsOverworldRain: mapValueOfType<bool>(json, r'needs_overworld_rain')!,
        partySpecies: mapValueOfType<String>(json, r'party_species')!,
        partyType: mapValueOfType<String>(json, r'party_type')!,
        relativePhysicalStats: mapValueOfType<String>(json, r'relative_physical_stats')!,
        timeOfDay: mapValueOfType<String>(json, r'time_of_day')!,
        tradeSpecies: mapValueOfType<String>(json, r'trade_species')!,
        trigger: AbilityDetailPokemonInnerPokemon.fromJson(json[r'trigger'])!,
        turnUpsideDown: mapValueOfType<bool>(json, r'turn_upside_down')!,
      );
    }
    return null;
  }

  static List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> mapFromJson(dynamic json) {
    final map = <String, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner-objects as value to a dart map
  static Map<String, List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'gender',
    'held_item',
    'item',
    'known_move',
    'known_move_type',
    'location',
    'min_affection',
    'min_beauty',
    'min_happiness',
    'min_level',
    'needs_overworld_rain',
    'party_species',
    'party_type',
    'relative_physical_stats',
    'time_of_day',
    'trade_species',
    'trigger',
    'turn_upside_down',
  };
}

