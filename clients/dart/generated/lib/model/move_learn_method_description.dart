//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveLearnMethodDescription {
  /// Returns a new [MoveLearnMethodDescription] instance.
  MoveLearnMethodDescription({
    this.description,
    required this.language,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveLearnMethodDescription &&
    other.description == description &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'MoveLearnMethodDescription[description=$description, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [MoveLearnMethodDescription] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveLearnMethodDescription? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'language'), 'Required key "MoveLearnMethodDescription[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "MoveLearnMethodDescription[language]" has a null value in JSON.');
        return true;
      }());

      return MoveLearnMethodDescription(
        description: mapValueOfType<String>(json, r'description'),
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<MoveLearnMethodDescription> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveLearnMethodDescription>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveLearnMethodDescription.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveLearnMethodDescription> mapFromJson(dynamic json) {
    final map = <String, MoveLearnMethodDescription>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveLearnMethodDescription.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveLearnMethodDescription-objects as value to a dart map
  static Map<String, List<MoveLearnMethodDescription>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveLearnMethodDescription>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveLearnMethodDescription.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'language',
  };
}

