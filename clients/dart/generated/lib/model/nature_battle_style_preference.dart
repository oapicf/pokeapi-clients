//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NatureBattleStylePreference {
  /// Returns a new [NatureBattleStylePreference] instance.
  NatureBattleStylePreference({
    required this.lowHpPreference,
    required this.highHpPreference,
    required this.moveBattleStyle,
  });

  int lowHpPreference;

  int highHpPreference;

  MoveBattleStyleSummary moveBattleStyle;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NatureBattleStylePreference &&
    other.lowHpPreference == lowHpPreference &&
    other.highHpPreference == highHpPreference &&
    other.moveBattleStyle == moveBattleStyle;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (lowHpPreference.hashCode) +
    (highHpPreference.hashCode) +
    (moveBattleStyle.hashCode);

  @override
  String toString() => 'NatureBattleStylePreference[lowHpPreference=$lowHpPreference, highHpPreference=$highHpPreference, moveBattleStyle=$moveBattleStyle]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'low_hp_preference'] = this.lowHpPreference;
      json[r'high_hp_preference'] = this.highHpPreference;
      json[r'move_battle_style'] = this.moveBattleStyle;
    return json;
  }

  /// Returns a new [NatureBattleStylePreference] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static NatureBattleStylePreference? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "NatureBattleStylePreference[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "NatureBattleStylePreference[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return NatureBattleStylePreference(
        lowHpPreference: mapValueOfType<int>(json, r'low_hp_preference')!,
        highHpPreference: mapValueOfType<int>(json, r'high_hp_preference')!,
        moveBattleStyle: MoveBattleStyleSummary.fromJson(json[r'move_battle_style'])!,
      );
    }
    return null;
  }

  static List<NatureBattleStylePreference> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NatureBattleStylePreference>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NatureBattleStylePreference.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, NatureBattleStylePreference> mapFromJson(dynamic json) {
    final map = <String, NatureBattleStylePreference>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = NatureBattleStylePreference.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of NatureBattleStylePreference-objects as value to a dart map
  static Map<String, List<NatureBattleStylePreference>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<NatureBattleStylePreference>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = NatureBattleStylePreference.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'low_hp_preference',
    'high_hp_preference',
    'move_battle_style',
  };
}

