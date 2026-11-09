//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonEvolution {
  /// Returns a new [PokemonEvolution] instance.
  PokemonEvolution({
    required this.versionGroup,
    this.isDefault,
    required this.item,
    required this.trigger,
    this.gender,
    required this.heldItem,
    required this.knownMove,
    required this.knownMoveType,
    required this.location,
    this.minLevel,
    this.minHappiness,
    this.minBeauty,
    this.minAffection,
    this.nearSpecialRock,
    this.needsMultiplayer,
    this.needsOverworldRain,
    required this.partySpecies,
    required this.partyType,
    this.relativePhysicalStats,
    this.timeOfDay,
    required this.tradeSpecies,
    this.turnUpsideDown,
    required this.region,
    required this.requiredPokemonForm,
    required this.evolvedPokemonForm,
    required this.usedMove,
    this.minMoveCount,
    this.minSteps,
    this.minDamageTaken,
    this.allowedNatures = const [],
    required this.conditionExpression,
  });

  /// The version group in which these evolution requirements apply.
  VersionGroupSummary versionGroup;

  /// Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isDefault;

  /// The item required to cause evolution this into Pokémon species.
  ItemSummary? item;

  /// The type of event that triggers evolution into this Pokémon species.
  EvolutionTriggerSummary trigger;

  /// The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
  int? gender;

  /// The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
  ItemSummary? heldItem;

  PokemonEvolutionKnownMove knownMove;

  PokemonEvolutionKnownMove knownMoveType;

  /// The location the evolution must be triggered at.
  LocationSummary? location;

  /// The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? minLevel;

  /// The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? minHappiness;

  /// The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? minBeauty;

  /// The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? minAffection;

  /// Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? nearSpecialRock;

  /// Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? needsMultiplayer;

  /// Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? needsOverworldRain;

  /// The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
  PokemonSpeciesSummary? partySpecies;

  /// The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
  TypeSummary? partyType;

  /// The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? relativePhysicalStats;

  /// The required time of day. Day or night.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? timeOfDay;

  /// Pokémon species for which this one must be traded.
  PokemonSpeciesSummary? tradeSpecies;

  /// Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? turnUpsideDown;

  /// The required region in which this evolution can occur.
  RegionSummary? region;

  /// The Pokémon form required before evolving, or null if unrestricted.
  PokemonFormSummary? requiredPokemonForm;

  /// The Pokémon form produced by this evolution, or null if unspecified.
  PokemonFormSummary? evolvedPokemonForm;

  /// The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
  MoveSummary? usedMove;

  /// The minimum number of times a move must be used in order to evolve into this Pokémon species.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? minMoveCount;

  /// The minimum number of steps that must be taken in order to evolve into this Pokémon species.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? minSteps;

  /// The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? minDamageTaken;

  /// The natures that allow this evolution, or null if unrestricted.
  List<NatureSummary>? allowedNatures;

  /// An additional evolution condition expressed in reverse Polish notation, or null if none.
  EvolutionConditionExpression? conditionExpression;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonEvolution &&
    other.versionGroup == versionGroup &&
    other.isDefault == isDefault &&
    other.item == item &&
    other.trigger == trigger &&
    other.gender == gender &&
    other.heldItem == heldItem &&
    other.knownMove == knownMove &&
    other.knownMoveType == knownMoveType &&
    other.location == location &&
    other.minLevel == minLevel &&
    other.minHappiness == minHappiness &&
    other.minBeauty == minBeauty &&
    other.minAffection == minAffection &&
    other.nearSpecialRock == nearSpecialRock &&
    other.needsMultiplayer == needsMultiplayer &&
    other.needsOverworldRain == needsOverworldRain &&
    other.partySpecies == partySpecies &&
    other.partyType == partyType &&
    other.relativePhysicalStats == relativePhysicalStats &&
    other.timeOfDay == timeOfDay &&
    other.tradeSpecies == tradeSpecies &&
    other.turnUpsideDown == turnUpsideDown &&
    other.region == region &&
    other.requiredPokemonForm == requiredPokemonForm &&
    other.evolvedPokemonForm == evolvedPokemonForm &&
    other.usedMove == usedMove &&
    other.minMoveCount == minMoveCount &&
    other.minSteps == minSteps &&
    other.minDamageTaken == minDamageTaken &&
    _deepEquality.equals(other.allowedNatures, allowedNatures) &&
    other.conditionExpression == conditionExpression;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (versionGroup.hashCode) +
    (isDefault == null ? 0 : isDefault!.hashCode) +
    (item == null ? 0 : item!.hashCode) +
    (trigger.hashCode) +
    (gender == null ? 0 : gender!.hashCode) +
    (heldItem == null ? 0 : heldItem!.hashCode) +
    (knownMove.hashCode) +
    (knownMoveType.hashCode) +
    (location == null ? 0 : location!.hashCode) +
    (minLevel == null ? 0 : minLevel!.hashCode) +
    (minHappiness == null ? 0 : minHappiness!.hashCode) +
    (minBeauty == null ? 0 : minBeauty!.hashCode) +
    (minAffection == null ? 0 : minAffection!.hashCode) +
    (nearSpecialRock == null ? 0 : nearSpecialRock!.hashCode) +
    (needsMultiplayer == null ? 0 : needsMultiplayer!.hashCode) +
    (needsOverworldRain == null ? 0 : needsOverworldRain!.hashCode) +
    (partySpecies == null ? 0 : partySpecies!.hashCode) +
    (partyType == null ? 0 : partyType!.hashCode) +
    (relativePhysicalStats == null ? 0 : relativePhysicalStats!.hashCode) +
    (timeOfDay == null ? 0 : timeOfDay!.hashCode) +
    (tradeSpecies == null ? 0 : tradeSpecies!.hashCode) +
    (turnUpsideDown == null ? 0 : turnUpsideDown!.hashCode) +
    (region == null ? 0 : region!.hashCode) +
    (requiredPokemonForm == null ? 0 : requiredPokemonForm!.hashCode) +
    (evolvedPokemonForm == null ? 0 : evolvedPokemonForm!.hashCode) +
    (usedMove == null ? 0 : usedMove!.hashCode) +
    (minMoveCount == null ? 0 : minMoveCount!.hashCode) +
    (minSteps == null ? 0 : minSteps!.hashCode) +
    (minDamageTaken == null ? 0 : minDamageTaken!.hashCode) +
    (allowedNatures == null ? 0 : allowedNatures!.hashCode) +
    (conditionExpression == null ? 0 : conditionExpression!.hashCode);

  @override
  String toString() => 'PokemonEvolution[versionGroup=$versionGroup, isDefault=$isDefault, item=$item, trigger=$trigger, gender=$gender, heldItem=$heldItem, knownMove=$knownMove, knownMoveType=$knownMoveType, location=$location, minLevel=$minLevel, minHappiness=$minHappiness, minBeauty=$minBeauty, minAffection=$minAffection, nearSpecialRock=$nearSpecialRock, needsMultiplayer=$needsMultiplayer, needsOverworldRain=$needsOverworldRain, partySpecies=$partySpecies, partyType=$partyType, relativePhysicalStats=$relativePhysicalStats, timeOfDay=$timeOfDay, tradeSpecies=$tradeSpecies, turnUpsideDown=$turnUpsideDown, region=$region, requiredPokemonForm=$requiredPokemonForm, evolvedPokemonForm=$evolvedPokemonForm, usedMove=$usedMove, minMoveCount=$minMoveCount, minSteps=$minSteps, minDamageTaken=$minDamageTaken, allowedNatures=$allowedNatures, conditionExpression=$conditionExpression]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'version_group'] = this.versionGroup;
    if (this.isDefault != null) {
      json[r'is_default'] = this.isDefault;
    } else {
      json[r'is_default'] = null;
    }
    if (this.item != null) {
      json[r'item'] = this.item;
    } else {
      json[r'item'] = null;
    }
      json[r'trigger'] = this.trigger;
    if (this.gender != null) {
      json[r'gender'] = this.gender;
    } else {
      json[r'gender'] = null;
    }
    if (this.heldItem != null) {
      json[r'held_item'] = this.heldItem;
    } else {
      json[r'held_item'] = null;
    }
      json[r'known_move'] = this.knownMove;
      json[r'known_move_type'] = this.knownMoveType;
    if (this.location != null) {
      json[r'location'] = this.location;
    } else {
      json[r'location'] = null;
    }
    if (this.minLevel != null) {
      json[r'min_level'] = this.minLevel;
    } else {
      json[r'min_level'] = null;
    }
    if (this.minHappiness != null) {
      json[r'min_happiness'] = this.minHappiness;
    } else {
      json[r'min_happiness'] = null;
    }
    if (this.minBeauty != null) {
      json[r'min_beauty'] = this.minBeauty;
    } else {
      json[r'min_beauty'] = null;
    }
    if (this.minAffection != null) {
      json[r'min_affection'] = this.minAffection;
    } else {
      json[r'min_affection'] = null;
    }
    if (this.nearSpecialRock != null) {
      json[r'near_special_rock'] = this.nearSpecialRock;
    } else {
      json[r'near_special_rock'] = null;
    }
    if (this.needsMultiplayer != null) {
      json[r'needs_multiplayer'] = this.needsMultiplayer;
    } else {
      json[r'needs_multiplayer'] = null;
    }
    if (this.needsOverworldRain != null) {
      json[r'needs_overworld_rain'] = this.needsOverworldRain;
    } else {
      json[r'needs_overworld_rain'] = null;
    }
    if (this.partySpecies != null) {
      json[r'party_species'] = this.partySpecies;
    } else {
      json[r'party_species'] = null;
    }
    if (this.partyType != null) {
      json[r'party_type'] = this.partyType;
    } else {
      json[r'party_type'] = null;
    }
    if (this.relativePhysicalStats != null) {
      json[r'relative_physical_stats'] = this.relativePhysicalStats;
    } else {
      json[r'relative_physical_stats'] = null;
    }
    if (this.timeOfDay != null) {
      json[r'time_of_day'] = this.timeOfDay;
    } else {
      json[r'time_of_day'] = null;
    }
    if (this.tradeSpecies != null) {
      json[r'trade_species'] = this.tradeSpecies;
    } else {
      json[r'trade_species'] = null;
    }
    if (this.turnUpsideDown != null) {
      json[r'turn_upside_down'] = this.turnUpsideDown;
    } else {
      json[r'turn_upside_down'] = null;
    }
    if (this.region != null) {
      json[r'region'] = this.region;
    } else {
      json[r'region'] = null;
    }
    if (this.requiredPokemonForm != null) {
      json[r'required_pokemon_form'] = this.requiredPokemonForm;
    } else {
      json[r'required_pokemon_form'] = null;
    }
    if (this.evolvedPokemonForm != null) {
      json[r'evolved_pokemon_form'] = this.evolvedPokemonForm;
    } else {
      json[r'evolved_pokemon_form'] = null;
    }
    if (this.usedMove != null) {
      json[r'used_move'] = this.usedMove;
    } else {
      json[r'used_move'] = null;
    }
    if (this.minMoveCount != null) {
      json[r'min_move_count'] = this.minMoveCount;
    } else {
      json[r'min_move_count'] = null;
    }
    if (this.minSteps != null) {
      json[r'min_steps'] = this.minSteps;
    } else {
      json[r'min_steps'] = null;
    }
    if (this.minDamageTaken != null) {
      json[r'min_damage_taken'] = this.minDamageTaken;
    } else {
      json[r'min_damage_taken'] = null;
    }
    if (this.allowedNatures != null) {
      json[r'allowed_natures'] = this.allowedNatures;
    } else {
      json[r'allowed_natures'] = null;
    }
    if (this.conditionExpression != null) {
      json[r'condition_expression'] = this.conditionExpression;
    } else {
      json[r'condition_expression'] = null;
    }
    return json;
  }

  /// Returns a new [PokemonEvolution] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonEvolution? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'version_group'), 'Required key "PokemonEvolution[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "PokemonEvolution[version_group]" has a null value in JSON.');
        assert(json.containsKey(r'item'), 'Required key "PokemonEvolution[item]" is missing from JSON.');
        assert(json.containsKey(r'trigger'), 'Required key "PokemonEvolution[trigger]" is missing from JSON.');
        assert(json[r'trigger'] != null, 'Required key "PokemonEvolution[trigger]" has a null value in JSON.');
        assert(json.containsKey(r'held_item'), 'Required key "PokemonEvolution[held_item]" is missing from JSON.');
        assert(json.containsKey(r'known_move'), 'Required key "PokemonEvolution[known_move]" is missing from JSON.');
        assert(json[r'known_move'] != null, 'Required key "PokemonEvolution[known_move]" has a null value in JSON.');
        assert(json.containsKey(r'known_move_type'), 'Required key "PokemonEvolution[known_move_type]" is missing from JSON.');
        assert(json[r'known_move_type'] != null, 'Required key "PokemonEvolution[known_move_type]" has a null value in JSON.');
        assert(json.containsKey(r'location'), 'Required key "PokemonEvolution[location]" is missing from JSON.');
        assert(json.containsKey(r'party_species'), 'Required key "PokemonEvolution[party_species]" is missing from JSON.');
        assert(json.containsKey(r'party_type'), 'Required key "PokemonEvolution[party_type]" is missing from JSON.');
        assert(json.containsKey(r'trade_species'), 'Required key "PokemonEvolution[trade_species]" is missing from JSON.');
        assert(json.containsKey(r'region'), 'Required key "PokemonEvolution[region]" is missing from JSON.');
        assert(json.containsKey(r'required_pokemon_form'), 'Required key "PokemonEvolution[required_pokemon_form]" is missing from JSON.');
        assert(json.containsKey(r'evolved_pokemon_form'), 'Required key "PokemonEvolution[evolved_pokemon_form]" is missing from JSON.');
        assert(json.containsKey(r'used_move'), 'Required key "PokemonEvolution[used_move]" is missing from JSON.');
        assert(json.containsKey(r'allowed_natures'), 'Required key "PokemonEvolution[allowed_natures]" is missing from JSON.');
        assert(json.containsKey(r'condition_expression'), 'Required key "PokemonEvolution[condition_expression]" is missing from JSON.');
        return true;
      }());

      return PokemonEvolution(
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
        isDefault: mapValueOfType<bool>(json, r'is_default'),
        item: ItemSummary.fromJson(json[r'item']),
        trigger: EvolutionTriggerSummary.fromJson(json[r'trigger'])!,
        gender: mapValueOfType<int>(json, r'gender'),
        heldItem: ItemSummary.fromJson(json[r'held_item']),
        knownMove: PokemonEvolutionKnownMove.fromJson(json[r'known_move'])!,
        knownMoveType: PokemonEvolutionKnownMove.fromJson(json[r'known_move_type'])!,
        location: LocationSummary.fromJson(json[r'location']),
        minLevel: mapValueOfType<int>(json, r'min_level'),
        minHappiness: mapValueOfType<int>(json, r'min_happiness'),
        minBeauty: mapValueOfType<int>(json, r'min_beauty'),
        minAffection: mapValueOfType<int>(json, r'min_affection'),
        nearSpecialRock: mapValueOfType<bool>(json, r'near_special_rock'),
        needsMultiplayer: mapValueOfType<bool>(json, r'needs_multiplayer'),
        needsOverworldRain: mapValueOfType<bool>(json, r'needs_overworld_rain'),
        partySpecies: PokemonSpeciesSummary.fromJson(json[r'party_species']),
        partyType: TypeSummary.fromJson(json[r'party_type']),
        relativePhysicalStats: mapValueOfType<int>(json, r'relative_physical_stats'),
        timeOfDay: mapValueOfType<String>(json, r'time_of_day'),
        tradeSpecies: PokemonSpeciesSummary.fromJson(json[r'trade_species']),
        turnUpsideDown: mapValueOfType<bool>(json, r'turn_upside_down'),
        region: RegionSummary.fromJson(json[r'region']),
        requiredPokemonForm: PokemonFormSummary.fromJson(json[r'required_pokemon_form']),
        evolvedPokemonForm: PokemonFormSummary.fromJson(json[r'evolved_pokemon_form']),
        usedMove: MoveSummary.fromJson(json[r'used_move']),
        minMoveCount: mapValueOfType<int>(json, r'min_move_count'),
        minSteps: mapValueOfType<int>(json, r'min_steps'),
        minDamageTaken: mapValueOfType<int>(json, r'min_damage_taken'),
        allowedNatures: NatureSummary.listFromJson(json[r'allowed_natures']),
        conditionExpression: EvolutionConditionExpression.fromJson(json[r'condition_expression']),
      );
    }
    return null;
  }

  static List<PokemonEvolution> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonEvolution>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonEvolution.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonEvolution> mapFromJson(dynamic json) {
    final map = <String, PokemonEvolution>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonEvolution.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonEvolution-objects as value to a dart map
  static Map<String, List<PokemonEvolution>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonEvolution>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonEvolution.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'version_group',
    'item',
    'trigger',
    'held_item',
    'known_move',
    'known_move_type',
    'location',
    'party_species',
    'party_type',
    'trade_species',
    'region',
    'required_pokemon_form',
    'evolved_pokemon_form',
    'used_move',
    'allowed_natures',
    'condition_expression',
  };
}

