//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonGameIndex {
  /// Returns a new [PokemonGameIndex] instance.
  PokemonGameIndex({
    required this.gameIndex,
    required this.version,
  });

  int gameIndex;

  VersionSummary version;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonGameIndex &&
    other.gameIndex == gameIndex &&
    other.version == version;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (gameIndex.hashCode) +
    (version.hashCode);

  @override
  String toString() => 'PokemonGameIndex[gameIndex=$gameIndex, version=$version]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'game_index'] = this.gameIndex;
      json[r'version'] = this.version;
    return json;
  }

  /// Returns a new [PokemonGameIndex] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonGameIndex? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokemonGameIndex[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokemonGameIndex[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PokemonGameIndex(
        gameIndex: mapValueOfType<int>(json, r'game_index')!,
        version: VersionSummary.fromJson(json[r'version'])!,
      );
    }
    return null;
  }

  static List<PokemonGameIndex> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonGameIndex>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonGameIndex.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonGameIndex> mapFromJson(dynamic json) {
    final map = <String, PokemonGameIndex>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonGameIndex.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonGameIndex-objects as value to a dart map
  static Map<String, List<PokemonGameIndex>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonGameIndex>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonGameIndex.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'game_index',
    'version',
  };
}

