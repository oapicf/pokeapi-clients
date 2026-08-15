//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ContestTypeName {
  /// Returns a new [ContestTypeName] instance.
  ContestTypeName({
    required this.name,
    required this.color,
    required this.language,
  });

  String name;

  String color;

  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ContestTypeName &&
    other.name == name &&
    other.color == color &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (color.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'ContestTypeName[name=$name, color=$color, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'color'] = this.color;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [ContestTypeName] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ContestTypeName? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ContestTypeName[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ContestTypeName[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ContestTypeName(
        name: mapValueOfType<String>(json, r'name')!,
        color: mapValueOfType<String>(json, r'color')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<ContestTypeName> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ContestTypeName>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ContestTypeName.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ContestTypeName> mapFromJson(dynamic json) {
    final map = <String, ContestTypeName>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ContestTypeName.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ContestTypeName-objects as value to a dart map
  static Map<String, List<ContestTypeName>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ContestTypeName>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ContestTypeName.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'color',
    'language',
  };
}

