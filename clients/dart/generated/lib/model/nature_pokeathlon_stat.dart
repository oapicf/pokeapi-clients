//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NaturePokeathlonStat {
  /// Returns a new [NaturePokeathlonStat] instance.
  NaturePokeathlonStat({
    required this.maxChange,
    required this.pokeathlonStat,
  });

  /// The amount of change.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int maxChange;

  /// The stat being affected.
  PokeathlonStatSummary pokeathlonStat;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NaturePokeathlonStat &&
    other.maxChange == maxChange &&
    other.pokeathlonStat == pokeathlonStat;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxChange.hashCode) +
    (pokeathlonStat.hashCode);

  @override
  String toString() => 'NaturePokeathlonStat[maxChange=$maxChange, pokeathlonStat=$pokeathlonStat]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'max_change'] = this.maxChange;
      json[r'pokeathlon_stat'] = this.pokeathlonStat;
    return json;
  }

  /// Returns a new [NaturePokeathlonStat] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static NaturePokeathlonStat? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'max_change'), 'Required key "NaturePokeathlonStat[max_change]" is missing from JSON.');
        assert(json[r'max_change'] != null, 'Required key "NaturePokeathlonStat[max_change]" has a null value in JSON.');
        assert(json.containsKey(r'pokeathlon_stat'), 'Required key "NaturePokeathlonStat[pokeathlon_stat]" is missing from JSON.');
        assert(json[r'pokeathlon_stat'] != null, 'Required key "NaturePokeathlonStat[pokeathlon_stat]" has a null value in JSON.');
        return true;
      }());

      return NaturePokeathlonStat(
        maxChange: mapValueOfType<int>(json, r'max_change')!,
        pokeathlonStat: PokeathlonStatSummary.fromJson(json[r'pokeathlon_stat'])!,
      );
    }
    return null;
  }

  static List<NaturePokeathlonStat> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NaturePokeathlonStat>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NaturePokeathlonStat.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, NaturePokeathlonStat> mapFromJson(dynamic json) {
    final map = <String, NaturePokeathlonStat>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = NaturePokeathlonStat.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of NaturePokeathlonStat-objects as value to a dart map
  static Map<String, List<NaturePokeathlonStat>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<NaturePokeathlonStat>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = NaturePokeathlonStat.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'max_change',
    'pokeathlon_stat',
  };
}

