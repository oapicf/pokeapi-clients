//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemFlingEffectEffectText {
  /// Returns a new [ItemFlingEffectEffectText] instance.
  ItemFlingEffectEffectText({
    required this.effect,
    required this.language,
  });

  String effect;

  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemFlingEffectEffectText &&
    other.effect == effect &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (effect.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'ItemFlingEffectEffectText[effect=$effect, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'effect'] = this.effect;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [ItemFlingEffectEffectText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemFlingEffectEffectText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemFlingEffectEffectText[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemFlingEffectEffectText[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemFlingEffectEffectText(
        effect: mapValueOfType<String>(json, r'effect')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<ItemFlingEffectEffectText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemFlingEffectEffectText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemFlingEffectEffectText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemFlingEffectEffectText> mapFromJson(dynamic json) {
    final map = <String, ItemFlingEffectEffectText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemFlingEffectEffectText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemFlingEffectEffectText-objects as value to a dart map
  static Map<String, List<ItemFlingEffectEffectText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemFlingEffectEffectText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemFlingEffectEffectText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'effect',
    'language',
  };
}

