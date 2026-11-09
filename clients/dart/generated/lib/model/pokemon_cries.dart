//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonCries {
  /// Returns a new [PokemonCries] instance.
  PokemonCries({
    required this.latest,
    required this.legacy,
  });

  /// The latest depiction of this Pokémon's cry.
  String? latest;

  /// The legacy depiction of this Pokémon's cry.
  String? legacy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonCries &&
    other.latest == latest &&
    other.legacy == legacy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (latest == null ? 0 : latest!.hashCode) +
    (legacy == null ? 0 : legacy!.hashCode);

  @override
  String toString() => 'PokemonCries[latest=$latest, legacy=$legacy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.latest != null) {
      json[r'latest'] = this.latest;
    } else {
      json[r'latest'] = null;
    }
    if (this.legacy != null) {
      json[r'legacy'] = this.legacy;
    } else {
      json[r'legacy'] = null;
    }
    return json;
  }

  /// Returns a new [PokemonCries] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonCries? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'latest'), 'Required key "PokemonCries[latest]" is missing from JSON.');
        assert(json.containsKey(r'legacy'), 'Required key "PokemonCries[legacy]" is missing from JSON.');
        return true;
      }());

      return PokemonCries(
        latest: mapValueOfType<String>(json, r'latest'),
        legacy: mapValueOfType<String>(json, r'legacy'),
      );
    }
    return null;
  }

  static List<PokemonCries> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonCries>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonCries.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonCries> mapFromJson(dynamic json) {
    final map = <String, PokemonCries>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonCries.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonCries-objects as value to a dart map
  static Map<String, List<PokemonCries>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonCries>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonCries.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'latest',
    'legacy',
  };
}

