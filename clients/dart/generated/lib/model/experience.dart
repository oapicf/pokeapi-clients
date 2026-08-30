//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Experience {
  /// Returns a new [Experience] instance.
  Experience({
    required this.level,
    required this.experience,
  });

  int level;

  int experience;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Experience &&
    other.level == level &&
    other.experience == experience;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (level.hashCode) +
    (experience.hashCode);

  @override
  String toString() => 'Experience[level=$level, experience=$experience]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'level'] = this.level;
      json[r'experience'] = this.experience;
    return json;
  }

  /// Returns a new [Experience] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Experience? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'level'), 'Required key "Experience[level]" is missing from JSON.');
        assert(json[r'level'] != null, 'Required key "Experience[level]" has a null value in JSON.');
        assert(json.containsKey(r'experience'), 'Required key "Experience[experience]" is missing from JSON.');
        assert(json[r'experience'] != null, 'Required key "Experience[experience]" has a null value in JSON.');
        return true;
      }());

      return Experience(
        level: mapValueOfType<int>(json, r'level')!,
        experience: mapValueOfType<int>(json, r'experience')!,
      );
    }
    return null;
  }

  static List<Experience> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Experience>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Experience.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Experience> mapFromJson(dynamic json) {
    final map = <String, Experience>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Experience.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Experience-objects as value to a dart map
  static Map<String, List<Experience>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Experience>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Experience.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'level',
    'experience',
  };
}

