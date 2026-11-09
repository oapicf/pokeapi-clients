//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonFormType {
  /// Returns a new [PokemonFormType] instance.
  PokemonFormType({
    required this.slot,
    required this.type,
  });

  /// The order the Pokémon's types are listed in.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int slot;

  /// The type the referenced Form has.
  TypeSummary type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonFormType &&
    other.slot == slot &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slot.hashCode) +
    (type.hashCode);

  @override
  String toString() => 'PokemonFormType[slot=$slot, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'slot'] = this.slot;
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [PokemonFormType] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonFormType? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'slot'), 'Required key "PokemonFormType[slot]" is missing from JSON.');
        assert(json[r'slot'] != null, 'Required key "PokemonFormType[slot]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "PokemonFormType[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "PokemonFormType[type]" has a null value in JSON.');
        return true;
      }());

      return PokemonFormType(
        slot: mapValueOfType<int>(json, r'slot')!,
        type: TypeSummary.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<PokemonFormType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonFormType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonFormType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonFormType> mapFromJson(dynamic json) {
    final map = <String, PokemonFormType>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonFormType.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonFormType-objects as value to a dart map
  static Map<String, List<PokemonFormType>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonFormType>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonFormType.listFromJson(entry.value, growable: growable,);
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

