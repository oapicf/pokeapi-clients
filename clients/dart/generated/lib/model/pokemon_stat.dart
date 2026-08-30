//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonStat {
  /// Returns a new [PokemonStat] instance.
  PokemonStat({
    required this.baseStat,
    required this.effort,
    required this.stat,
  });

  int baseStat;

  int effort;

  StatSummary stat;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonStat &&
    other.baseStat == baseStat &&
    other.effort == effort &&
    other.stat == stat;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (baseStat.hashCode) +
    (effort.hashCode) +
    (stat.hashCode);

  @override
  String toString() => 'PokemonStat[baseStat=$baseStat, effort=$effort, stat=$stat]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'base_stat'] = this.baseStat;
      json[r'effort'] = this.effort;
      json[r'stat'] = this.stat;
    return json;
  }

  /// Returns a new [PokemonStat] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonStat? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'base_stat'), 'Required key "PokemonStat[base_stat]" is missing from JSON.');
        assert(json[r'base_stat'] != null, 'Required key "PokemonStat[base_stat]" has a null value in JSON.');
        assert(json.containsKey(r'effort'), 'Required key "PokemonStat[effort]" is missing from JSON.');
        assert(json[r'effort'] != null, 'Required key "PokemonStat[effort]" has a null value in JSON.');
        assert(json.containsKey(r'stat'), 'Required key "PokemonStat[stat]" is missing from JSON.');
        assert(json[r'stat'] != null, 'Required key "PokemonStat[stat]" has a null value in JSON.');
        return true;
      }());

      return PokemonStat(
        baseStat: mapValueOfType<int>(json, r'base_stat')!,
        effort: mapValueOfType<int>(json, r'effort')!,
        stat: StatSummary.fromJson(json[r'stat'])!,
      );
    }
    return null;
  }

  static List<PokemonStat> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonStat>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonStat.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonStat> mapFromJson(dynamic json) {
    final map = <String, PokemonStat>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonStat.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonStat-objects as value to a dart map
  static Map<String, List<PokemonStat>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonStat>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonStat.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'base_stat',
    'effort',
    'stat',
  };
}

