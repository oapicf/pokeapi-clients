//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDetailTypesInner {
  /// Returns a new [PokemonDetailTypesInner] instance.
  PokemonDetailTypesInner({
    required this.slot,
    required this.type,
  });

  int slot;

  AbilityDetailPokemonInnerPokemon type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDetailTypesInner &&
    other.slot == slot &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slot.hashCode) +
    (type.hashCode);

  @override
  String toString() => 'PokemonDetailTypesInner[slot=$slot, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'slot'] = this.slot;
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [PokemonDetailTypesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDetailTypesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'slot'), 'Required key "PokemonDetailTypesInner[slot]" is missing from JSON.');
        assert(json[r'slot'] != null, 'Required key "PokemonDetailTypesInner[slot]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "PokemonDetailTypesInner[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "PokemonDetailTypesInner[type]" has a null value in JSON.');
        return true;
      }());

      return PokemonDetailTypesInner(
        slot: mapValueOfType<int>(json, r'slot')!,
        type: AbilityDetailPokemonInnerPokemon.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<PokemonDetailTypesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDetailTypesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDetailTypesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDetailTypesInner> mapFromJson(dynamic json) {
    final map = <String, PokemonDetailTypesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDetailTypesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDetailTypesInner-objects as value to a dart map
  static Map<String, List<PokemonDetailTypesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDetailTypesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDetailTypesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'slot',
    'type',
  };
}

