//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AbilityFlavorText {
  /// Returns a new [AbilityFlavorText] instance.
  AbilityFlavorText({
    required this.flavorText,
    required this.language,
    required this.versionGroup,
  });

  String flavorText;

  LanguageSummary language;

  VersionGroupSummary versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AbilityFlavorText &&
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
  String toString() => 'AbilityFlavorText[flavorText=$flavorText, language=$language, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'flavor_text'] = this.flavorText;
      json[r'language'] = this.language;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [AbilityFlavorText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AbilityFlavorText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'flavor_text'), 'Required key "AbilityFlavorText[flavor_text]" is missing from JSON.');
        assert(json[r'flavor_text'] != null, 'Required key "AbilityFlavorText[flavor_text]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "AbilityFlavorText[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "AbilityFlavorText[language]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "AbilityFlavorText[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "AbilityFlavorText[version_group]" has a null value in JSON.');
        return true;
      }());

      return AbilityFlavorText(
        flavorText: mapValueOfType<String>(json, r'flavor_text')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<AbilityFlavorText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AbilityFlavorText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AbilityFlavorText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AbilityFlavorText> mapFromJson(dynamic json) {
    final map = <String, AbilityFlavorText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AbilityFlavorText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AbilityFlavorText-objects as value to a dart map
  static Map<String, List<AbilityFlavorText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AbilityFlavorText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AbilityFlavorText.listFromJson(entry.value, growable: growable,);
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

