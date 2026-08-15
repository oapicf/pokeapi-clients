//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveDetailContestCombosNormal {
  /// Returns a new [MoveDetailContestCombosNormal] instance.
  MoveDetailContestCombosNormal({
    this.useBefore = const [],
    this.useAfter = const [],
  });

  List<AbilityDetailPokemonInnerPokemon> useBefore;

  List<AbilityDetailPokemonInnerPokemon> useAfter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveDetailContestCombosNormal &&
    _deepEquality.equals(other.useBefore, useBefore) &&
    _deepEquality.equals(other.useAfter, useAfter);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (useBefore.hashCode) +
    (useAfter.hashCode);

  @override
  String toString() => 'MoveDetailContestCombosNormal[useBefore=$useBefore, useAfter=$useAfter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'use_before'] = this.useBefore;
      json[r'use_after'] = this.useAfter;
    return json;
  }

  /// Returns a new [MoveDetailContestCombosNormal] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveDetailContestCombosNormal? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MoveDetailContestCombosNormal[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MoveDetailContestCombosNormal[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MoveDetailContestCombosNormal(
        useBefore: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'use_before']),
        useAfter: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'use_after']),
      );
    }
    return null;
  }

  static List<MoveDetailContestCombosNormal> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveDetailContestCombosNormal>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveDetailContestCombosNormal.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveDetailContestCombosNormal> mapFromJson(dynamic json) {
    final map = <String, MoveDetailContestCombosNormal>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveDetailContestCombosNormal.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveDetailContestCombosNormal-objects as value to a dart map
  static Map<String, List<MoveDetailContestCombosNormal>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveDetailContestCombosNormal>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveDetailContestCombosNormal.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'use_before',
    'use_after',
  };
}

