//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveFlavorText {
  /// Returns a new [MoveFlavorText] instance.
  MoveFlavorText({
    required this.flavorText,
    required this.language,
    required this.versionGroup,
  });

  String flavorText;

  LanguageSummary language;

  VersionGroupSummary versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveFlavorText &&
    other.flavorText == flavorText &&
    other.language == language &&
    other.versionGroup == versionGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (flavorText.hashCode) +
    (language.hashCode) +
    (versionGroup.hashCode);

  @override
  String toString() => 'MoveFlavorText[flavorText=$flavorText, language=$language, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'flavor_text'] = this.flavorText;
      json[r'language'] = this.language;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [MoveFlavorText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveFlavorText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MoveFlavorText[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MoveFlavorText[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MoveFlavorText(
        flavorText: mapValueOfType<String>(json, r'flavor_text')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<MoveFlavorText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveFlavorText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveFlavorText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveFlavorText> mapFromJson(dynamic json) {
    final map = <String, MoveFlavorText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveFlavorText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveFlavorText-objects as value to a dart map
  static Map<String, List<MoveFlavorText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveFlavorText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveFlavorText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'flavor_text',
    'language',
    'version_group',
  };
}

