//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ContestEffectDetail {
  /// Returns a new [ContestEffectDetail] instance.
  ContestEffectDetail({
    required this.id,
    required this.appeal,
    required this.jam,
    this.effectEntries = const [],
    this.flavorTextEntries = const [],
  });

  int id;

  int appeal;

  int jam;

  List<ContestEffectEffectText> effectEntries;

  List<ContestEffectFlavorText> flavorTextEntries;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ContestEffectDetail &&
    other.id == id &&
    other.appeal == appeal &&
    other.jam == jam &&
    _deepEquality.equals(other.effectEntries, effectEntries) &&
    _deepEquality.equals(other.flavorTextEntries, flavorTextEntries);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (appeal.hashCode) +
    (jam.hashCode) +
    (effectEntries.hashCode) +
    (flavorTextEntries.hashCode);

  @override
  String toString() => 'ContestEffectDetail[id=$id, appeal=$appeal, jam=$jam, effectEntries=$effectEntries, flavorTextEntries=$flavorTextEntries]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'appeal'] = this.appeal;
      json[r'jam'] = this.jam;
      json[r'effect_entries'] = this.effectEntries;
      json[r'flavor_text_entries'] = this.flavorTextEntries;
    return json;
  }

  /// Returns a new [ContestEffectDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ContestEffectDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "ContestEffectDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "ContestEffectDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'appeal'), 'Required key "ContestEffectDetail[appeal]" is missing from JSON.');
        assert(json[r'appeal'] != null, 'Required key "ContestEffectDetail[appeal]" has a null value in JSON.');
        assert(json.containsKey(r'jam'), 'Required key "ContestEffectDetail[jam]" is missing from JSON.');
        assert(json[r'jam'] != null, 'Required key "ContestEffectDetail[jam]" has a null value in JSON.');
        assert(json.containsKey(r'effect_entries'), 'Required key "ContestEffectDetail[effect_entries]" is missing from JSON.');
        assert(json[r'effect_entries'] != null, 'Required key "ContestEffectDetail[effect_entries]" has a null value in JSON.');
        assert(json.containsKey(r'flavor_text_entries'), 'Required key "ContestEffectDetail[flavor_text_entries]" is missing from JSON.');
        assert(json[r'flavor_text_entries'] != null, 'Required key "ContestEffectDetail[flavor_text_entries]" has a null value in JSON.');
        return true;
      }());

      return ContestEffectDetail(
        id: mapValueOfType<int>(json, r'id')!,
        appeal: mapValueOfType<int>(json, r'appeal')!,
        jam: mapValueOfType<int>(json, r'jam')!,
        effectEntries: ContestEffectEffectText.listFromJson(json[r'effect_entries']),
        flavorTextEntries: ContestEffectFlavorText.listFromJson(json[r'flavor_text_entries']),
      );
    }
    return null;
  }

  static List<ContestEffectDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ContestEffectDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ContestEffectDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ContestEffectDetail> mapFromJson(dynamic json) {
    final map = <String, ContestEffectDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ContestEffectDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ContestEffectDetail-objects as value to a dart map
  static Map<String, List<ContestEffectDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ContestEffectDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ContestEffectDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'appeal',
    'jam',
    'effect_entries',
    'flavor_text_entries',
  };
}

