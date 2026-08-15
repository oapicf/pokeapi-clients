//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemFlavorText {
  /// Returns a new [ItemFlavorText] instance.
  ItemFlavorText({
    required this.text,
    required this.versionGroup,
    required this.language,
  });

  String text;

  VersionGroupSummary versionGroup;

  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemFlavorText &&
    other.text == text &&
    other.versionGroup == versionGroup &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (text.hashCode) +
    (versionGroup.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'ItemFlavorText[text=$text, versionGroup=$versionGroup, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'text'] = this.text;
      json[r'version_group'] = this.versionGroup;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [ItemFlavorText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemFlavorText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemFlavorText[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemFlavorText[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemFlavorText(
        text: mapValueOfType<String>(json, r'text')!,
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<ItemFlavorText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemFlavorText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemFlavorText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemFlavorText> mapFromJson(dynamic json) {
    final map = <String, ItemFlavorText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemFlavorText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemFlavorText-objects as value to a dart map
  static Map<String, List<ItemFlavorText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemFlavorText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemFlavorText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'text',
    'version_group',
    'language',
  };
}

