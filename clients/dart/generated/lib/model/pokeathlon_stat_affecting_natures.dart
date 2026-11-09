//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokeathlonStatAffectingNatures {
  /// Returns a new [PokeathlonStatAffectingNatures] instance.
  PokeathlonStatAffectingNatures({
    this.increase = const [],
    this.decrease = const [],
  });

  /// A list of natures and how they change the referenced Pokéathlon stat.
  List<PokeathlonStatAffectingNature> increase;

  /// A list of natures and how they change the referenced Pokéathlon stat.
  List<PokeathlonStatAffectingNature> decrease;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokeathlonStatAffectingNatures &&
    _deepEquality.equals(other.increase, increase) &&
    _deepEquality.equals(other.decrease, decrease);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (increase.hashCode) +
    (decrease.hashCode);

  @override
  String toString() => 'PokeathlonStatAffectingNatures[increase=$increase, decrease=$decrease]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'increase'] = this.increase;
      json[r'decrease'] = this.decrease;
    return json;
  }

  /// Returns a new [PokeathlonStatAffectingNatures] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokeathlonStatAffectingNatures? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'increase'), 'Required key "PokeathlonStatAffectingNatures[increase]" is missing from JSON.');
        assert(json[r'increase'] != null, 'Required key "PokeathlonStatAffectingNatures[increase]" has a null value in JSON.');
        assert(json.containsKey(r'decrease'), 'Required key "PokeathlonStatAffectingNatures[decrease]" is missing from JSON.');
        assert(json[r'decrease'] != null, 'Required key "PokeathlonStatAffectingNatures[decrease]" has a null value in JSON.');
        return true;
      }());

      return PokeathlonStatAffectingNatures(
        increase: PokeathlonStatAffectingNature.listFromJson(json[r'increase']),
        decrease: PokeathlonStatAffectingNature.listFromJson(json[r'decrease']),
      );
    }
    return null;
  }

  static List<PokeathlonStatAffectingNatures> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokeathlonStatAffectingNatures>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokeathlonStatAffectingNatures.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokeathlonStatAffectingNatures> mapFromJson(dynamic json) {
    final map = <String, PokeathlonStatAffectingNatures>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokeathlonStatAffectingNatures.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokeathlonStatAffectingNatures-objects as value to a dart map
  static Map<String, List<PokeathlonStatAffectingNatures>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokeathlonStatAffectingNatures>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokeathlonStatAffectingNatures.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'increase',
    'decrease',
  };
}

