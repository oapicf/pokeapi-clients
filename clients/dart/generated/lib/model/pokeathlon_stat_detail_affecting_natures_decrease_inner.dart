//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokeathlonStatDetailAffectingNaturesDecreaseInner {
  /// Returns a new [PokeathlonStatDetailAffectingNaturesDecreaseInner] instance.
  PokeathlonStatDetailAffectingNaturesDecreaseInner({
    required this.maxChange,
    required this.nature,
  });

  /// Maximum value: -1
  int maxChange;

  AbilityDetailPokemonInnerPokemon nature;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokeathlonStatDetailAffectingNaturesDecreaseInner &&
    other.maxChange == maxChange &&
    other.nature == nature;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxChange.hashCode) +
    (nature.hashCode);

  @override
  String toString() => 'PokeathlonStatDetailAffectingNaturesDecreaseInner[maxChange=$maxChange, nature=$nature]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'max_change'] = this.maxChange;
      json[r'nature'] = this.nature;
    return json;
  }

  /// Returns a new [PokeathlonStatDetailAffectingNaturesDecreaseInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokeathlonStatDetailAffectingNaturesDecreaseInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'max_change'), 'Required key "PokeathlonStatDetailAffectingNaturesDecreaseInner[max_change]" is missing from JSON.');
        assert(json[r'max_change'] != null, 'Required key "PokeathlonStatDetailAffectingNaturesDecreaseInner[max_change]" has a null value in JSON.');
        assert(json.containsKey(r'nature'), 'Required key "PokeathlonStatDetailAffectingNaturesDecreaseInner[nature]" is missing from JSON.');
        assert(json[r'nature'] != null, 'Required key "PokeathlonStatDetailAffectingNaturesDecreaseInner[nature]" has a null value in JSON.');
        return true;
      }());

      return PokeathlonStatDetailAffectingNaturesDecreaseInner(
        maxChange: mapValueOfType<int>(json, r'max_change')!,
        nature: AbilityDetailPokemonInnerPokemon.fromJson(json[r'nature'])!,
      );
    }
    return null;
  }

  static List<PokeathlonStatDetailAffectingNaturesDecreaseInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokeathlonStatDetailAffectingNaturesDecreaseInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokeathlonStatDetailAffectingNaturesDecreaseInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokeathlonStatDetailAffectingNaturesDecreaseInner> mapFromJson(dynamic json) {
    final map = <String, PokeathlonStatDetailAffectingNaturesDecreaseInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokeathlonStatDetailAffectingNaturesDecreaseInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokeathlonStatDetailAffectingNaturesDecreaseInner-objects as value to a dart map
  static Map<String, List<PokeathlonStatDetailAffectingNaturesDecreaseInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokeathlonStatDetailAffectingNaturesDecreaseInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokeathlonStatDetailAffectingNaturesDecreaseInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'max_change',
    'nature',
  };
}

