//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TypeGameIndex {
  /// Returns a new [TypeGameIndex] instance.
  TypeGameIndex({
    required this.gameIndex,
    required this.generation,
  });

  int gameIndex;

  GenerationSummary generation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TypeGameIndex &&
    other.gameIndex == gameIndex &&
    other.generation == generation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (gameIndex.hashCode) +
    (generation.hashCode);

  @override
  String toString() => 'TypeGameIndex[gameIndex=$gameIndex, generation=$generation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'game_index'] = this.gameIndex;
      json[r'generation'] = this.generation;
    return json;
  }

  /// Returns a new [TypeGameIndex] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TypeGameIndex? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'game_index'), 'Required key "TypeGameIndex[game_index]" is missing from JSON.');
        assert(json[r'game_index'] != null, 'Required key "TypeGameIndex[game_index]" has a null value in JSON.');
        assert(json.containsKey(r'generation'), 'Required key "TypeGameIndex[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "TypeGameIndex[generation]" has a null value in JSON.');
        return true;
      }());

      return TypeGameIndex(
        gameIndex: mapValueOfType<int>(json, r'game_index')!,
        generation: GenerationSummary.fromJson(json[r'generation'])!,
      );
    }
    return null;
  }

  static List<TypeGameIndex> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TypeGameIndex>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TypeGameIndex.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TypeGameIndex> mapFromJson(dynamic json) {
    final map = <String, TypeGameIndex>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TypeGameIndex.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TypeGameIndex-objects as value to a dart map
  static Map<String, List<TypeGameIndex>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TypeGameIndex>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TypeGameIndex.listFromJson(entry.value, growable: growable,);
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

