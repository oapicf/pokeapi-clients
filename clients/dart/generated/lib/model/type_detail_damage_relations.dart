//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TypeDetailDamageRelations {
  /// Returns a new [TypeDetailDamageRelations] instance.
  TypeDetailDamageRelations({
    this.noDamageTo = const [],
    this.halfDamageTo = const [],
    this.doubleDamageTo = const [],
    this.noDamageFrom = const [],
    this.halfDamageFrom = const [],
    this.doubleDamageFrom = const [],
  });

  List<AbilityDetailPokemonInnerPokemon> noDamageTo;

  List<AbilityDetailPokemonInnerPokemon> halfDamageTo;

  List<AbilityDetailPokemonInnerPokemon> doubleDamageTo;

  List<AbilityDetailPokemonInnerPokemon> noDamageFrom;

  List<AbilityDetailPokemonInnerPokemon> halfDamageFrom;

  List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TypeDetailDamageRelations &&
    _deepEquality.equals(other.noDamageTo, noDamageTo) &&
    _deepEquality.equals(other.halfDamageTo, halfDamageTo) &&
    _deepEquality.equals(other.doubleDamageTo, doubleDamageTo) &&
    _deepEquality.equals(other.noDamageFrom, noDamageFrom) &&
    _deepEquality.equals(other.halfDamageFrom, halfDamageFrom) &&
    _deepEquality.equals(other.doubleDamageFrom, doubleDamageFrom);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (noDamageTo.hashCode) +
    (halfDamageTo.hashCode) +
    (doubleDamageTo.hashCode) +
    (noDamageFrom.hashCode) +
    (halfDamageFrom.hashCode) +
    (doubleDamageFrom.hashCode);

  @override
  String toString() => 'TypeDetailDamageRelations[noDamageTo=$noDamageTo, halfDamageTo=$halfDamageTo, doubleDamageTo=$doubleDamageTo, noDamageFrom=$noDamageFrom, halfDamageFrom=$halfDamageFrom, doubleDamageFrom=$doubleDamageFrom]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'no_damage_to'] = this.noDamageTo;
      json[r'half_damage_to'] = this.halfDamageTo;
      json[r'double_damage_to'] = this.doubleDamageTo;
      json[r'no_damage_from'] = this.noDamageFrom;
      json[r'half_damage_from'] = this.halfDamageFrom;
      json[r'double_damage_from'] = this.doubleDamageFrom;
    return json;
  }

  /// Returns a new [TypeDetailDamageRelations] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TypeDetailDamageRelations? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TypeDetailDamageRelations[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TypeDetailDamageRelations[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TypeDetailDamageRelations(
        noDamageTo: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'no_damage_to']),
        halfDamageTo: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'half_damage_to']),
        doubleDamageTo: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'double_damage_to']),
        noDamageFrom: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'no_damage_from']),
        halfDamageFrom: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'half_damage_from']),
        doubleDamageFrom: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'double_damage_from']),
      );
    }
    return null;
  }

  static List<TypeDetailDamageRelations> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TypeDetailDamageRelations>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TypeDetailDamageRelations.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TypeDetailDamageRelations> mapFromJson(dynamic json) {
    final map = <String, TypeDetailDamageRelations>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TypeDetailDamageRelations.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TypeDetailDamageRelations-objects as value to a dart map
  static Map<String, List<TypeDetailDamageRelations>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TypeDetailDamageRelations>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TypeDetailDamageRelations.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'no_damage_to',
    'half_damage_to',
    'double_damage_to',
    'no_damage_from',
    'half_damage_from',
    'double_damage_from',
  };
}

