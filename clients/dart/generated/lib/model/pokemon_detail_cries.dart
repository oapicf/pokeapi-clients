//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDetailCries {
  /// Returns a new [PokemonDetailCries] instance.
  PokemonDetailCries({
    required this.latest,
    required this.legacy,
  });

  String latest;

  String legacy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDetailCries &&
    other.latest == latest &&
    other.legacy == legacy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (latest.hashCode) +
    (legacy.hashCode);

  @override
  String toString() => 'PokemonDetailCries[latest=$latest, legacy=$legacy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'latest'] = this.latest;
      json[r'legacy'] = this.legacy;
    return json;
  }

  /// Returns a new [PokemonDetailCries] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDetailCries? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'latest'), 'Required key "PokemonDetailCries[latest]" is missing from JSON.');
        assert(json[r'latest'] != null, 'Required key "PokemonDetailCries[latest]" has a null value in JSON.');
        assert(json.containsKey(r'legacy'), 'Required key "PokemonDetailCries[legacy]" is missing from JSON.');
        assert(json[r'legacy'] != null, 'Required key "PokemonDetailCries[legacy]" has a null value in JSON.');
        return true;
      }());

      return PokemonDetailCries(
        latest: mapValueOfType<String>(json, r'latest')!,
        legacy: mapValueOfType<String>(json, r'legacy')!,
      );
    }
    return null;
  }

  static List<PokemonDetailCries> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDetailCries>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDetailCries.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDetailCries> mapFromJson(dynamic json) {
    final map = <String, PokemonDetailCries>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDetailCries.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDetailCries-objects as value to a dart map
  static Map<String, List<PokemonDetailCries>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDetailCries>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDetailCries.listFromJson(entry.value, growable: growable,);
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

