//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokeathlonStatAffectingNature {
  /// Returns a new [PokeathlonStatAffectingNature] instance.
  PokeathlonStatAffectingNature({
    required this.maxChange,
    required this.nature,
  });

  /// The maximum amount of change to the referenced Pokéathlon stat.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int maxChange;

  /// The nature causing the change.
  NatureSummary nature;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokeathlonStatAffectingNature &&
    other.maxChange == maxChange &&
    other.nature == nature;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxChange.hashCode) +
    (nature.hashCode);

  @override
  String toString() => 'PokeathlonStatAffectingNature[maxChange=$maxChange, nature=$nature]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'max_change'] = this.maxChange;
      json[r'nature'] = this.nature;
    return json;
  }

  /// Returns a new [PokeathlonStatAffectingNature] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokeathlonStatAffectingNature? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'max_change'), 'Required key "PokeathlonStatAffectingNature[max_change]" is missing from JSON.');
        assert(json[r'max_change'] != null, 'Required key "PokeathlonStatAffectingNature[max_change]" has a null value in JSON.');
        assert(json.containsKey(r'nature'), 'Required key "PokeathlonStatAffectingNature[nature]" is missing from JSON.');
        assert(json[r'nature'] != null, 'Required key "PokeathlonStatAffectingNature[nature]" has a null value in JSON.');
        return true;
      }());

      return PokeathlonStatAffectingNature(
        maxChange: mapValueOfType<int>(json, r'max_change')!,
        nature: NatureSummary.fromJson(json[r'nature'])!,
      );
    }
    return null;
  }

  static List<PokeathlonStatAffectingNature> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokeathlonStatAffectingNature>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokeathlonStatAffectingNature.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokeathlonStatAffectingNature> mapFromJson(dynamic json) {
    final map = <String, PokeathlonStatAffectingNature>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokeathlonStatAffectingNature.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokeathlonStatAffectingNature-objects as value to a dart map
  static Map<String, List<PokeathlonStatAffectingNature>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokeathlonStatAffectingNature>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokeathlonStatAffectingNature.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'max_change',
    'nature',
  };
}

