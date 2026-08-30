//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokeathlonStatDetailAffectingNatures {
  /// Returns a new [PokeathlonStatDetailAffectingNatures] instance.
  PokeathlonStatDetailAffectingNatures({
    this.decrease = const [],
    this.increase = const [],
  });

  List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease;

  List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokeathlonStatDetailAffectingNatures &&
    _deepEquality.equals(other.decrease, decrease) &&
    _deepEquality.equals(other.increase, increase);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (decrease.hashCode) +
    (increase.hashCode);

  @override
  String toString() => 'PokeathlonStatDetailAffectingNatures[decrease=$decrease, increase=$increase]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'decrease'] = this.decrease;
      json[r'increase'] = this.increase;
    return json;
  }

  /// Returns a new [PokeathlonStatDetailAffectingNatures] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokeathlonStatDetailAffectingNatures? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'decrease'), 'Required key "PokeathlonStatDetailAffectingNatures[decrease]" is missing from JSON.');
        assert(json[r'decrease'] != null, 'Required key "PokeathlonStatDetailAffectingNatures[decrease]" has a null value in JSON.');
        assert(json.containsKey(r'increase'), 'Required key "PokeathlonStatDetailAffectingNatures[increase]" is missing from JSON.');
        assert(json[r'increase'] != null, 'Required key "PokeathlonStatDetailAffectingNatures[increase]" has a null value in JSON.');
        return true;
      }());

      return PokeathlonStatDetailAffectingNatures(
        decrease: PokeathlonStatDetailAffectingNaturesDecreaseInner.listFromJson(json[r'decrease']),
        increase: PokeathlonStatDetailAffectingNaturesIncreaseInner.listFromJson(json[r'increase']),
      );
    }
    return null;
  }

  static List<PokeathlonStatDetailAffectingNatures> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokeathlonStatDetailAffectingNatures>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokeathlonStatDetailAffectingNatures.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokeathlonStatDetailAffectingNatures> mapFromJson(dynamic json) {
    final map = <String, PokeathlonStatDetailAffectingNatures>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokeathlonStatDetailAffectingNatures.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokeathlonStatDetailAffectingNatures-objects as value to a dart map
  static Map<String, List<PokeathlonStatDetailAffectingNatures>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokeathlonStatDetailAffectingNatures>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokeathlonStatDetailAffectingNatures.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'decrease',
    'increase',
  };
}

