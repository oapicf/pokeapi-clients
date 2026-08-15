//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SuperContestEffectDetail {
  /// Returns a new [SuperContestEffectDetail] instance.
  SuperContestEffectDetail({
    required this.id,
    required this.appeal,
    this.flavorTextEntries = const [],
    this.moves = const [],
  });

  int id;

  int appeal;

  List<SuperContestEffectFlavorText> flavorTextEntries;

  List<MoveSummary> moves;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SuperContestEffectDetail &&
    other.id == id &&
    other.appeal == appeal &&
    _deepEquality.equals(other.flavorTextEntries, flavorTextEntries) &&
    _deepEquality.equals(other.moves, moves);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (appeal.hashCode) +
    (flavorTextEntries.hashCode) +
    (moves.hashCode);

  @override
  String toString() => 'SuperContestEffectDetail[id=$id, appeal=$appeal, flavorTextEntries=$flavorTextEntries, moves=$moves]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'appeal'] = this.appeal;
      json[r'flavor_text_entries'] = this.flavorTextEntries;
      json[r'moves'] = this.moves;
    return json;
  }

  /// Returns a new [SuperContestEffectDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SuperContestEffectDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SuperContestEffectDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SuperContestEffectDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SuperContestEffectDetail(
        id: mapValueOfType<int>(json, r'id')!,
        appeal: mapValueOfType<int>(json, r'appeal')!,
        flavorTextEntries: SuperContestEffectFlavorText.listFromJson(json[r'flavor_text_entries']),
        moves: MoveSummary.listFromJson(json[r'moves']),
      );
    }
    return null;
  }

  static List<SuperContestEffectDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SuperContestEffectDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SuperContestEffectDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SuperContestEffectDetail> mapFromJson(dynamic json) {
    final map = <String, SuperContestEffectDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SuperContestEffectDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SuperContestEffectDetail-objects as value to a dart map
  static Map<String, List<SuperContestEffectDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SuperContestEffectDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SuperContestEffectDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'appeal',
    'flavor_text_entries',
    'moves',
  };
}

