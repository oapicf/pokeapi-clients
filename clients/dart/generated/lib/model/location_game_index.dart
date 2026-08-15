//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationGameIndex {
  /// Returns a new [LocationGameIndex] instance.
  LocationGameIndex({
    required this.gameIndex,
    required this.generation,
  });

  int gameIndex;

  GenerationSummary generation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationGameIndex &&
    other.gameIndex == gameIndex &&
    other.generation == generation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (gameIndex.hashCode) +
    (generation.hashCode);

  @override
  String toString() => 'LocationGameIndex[gameIndex=$gameIndex, generation=$generation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'game_index'] = this.gameIndex;
      json[r'generation'] = this.generation;
    return json;
  }

  /// Returns a new [LocationGameIndex] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationGameIndex? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LocationGameIndex[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LocationGameIndex[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LocationGameIndex(
        gameIndex: mapValueOfType<int>(json, r'game_index')!,
        generation: GenerationSummary.fromJson(json[r'generation'])!,
      );
    }
    return null;
  }

  static List<LocationGameIndex> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationGameIndex>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationGameIndex.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationGameIndex> mapFromJson(dynamic json) {
    final map = <String, LocationGameIndex>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationGameIndex.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationGameIndex-objects as value to a dart map
  static Map<String, List<LocationGameIndex>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationGameIndex>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationGameIndex.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'game_index',
    'generation',
  };
}

