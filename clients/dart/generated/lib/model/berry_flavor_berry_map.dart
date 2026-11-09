//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BerryFlavorBerryMap {
  /// Returns a new [BerryFlavorBerryMap] instance.
  BerryFlavorBerryMap({
    required this.potency,
    required this.berry,
  });

  /// How powerful the referenced flavor is for this berry.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int potency;

  /// The berry with the referenced flavor.
  BerrySummary berry;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BerryFlavorBerryMap &&
    other.potency == potency &&
    other.berry == berry;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (potency.hashCode) +
    (berry.hashCode);

  @override
  String toString() => 'BerryFlavorBerryMap[potency=$potency, berry=$berry]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'potency'] = this.potency;
      json[r'berry'] = this.berry;
    return json;
  }

  /// Returns a new [BerryFlavorBerryMap] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BerryFlavorBerryMap? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'potency'), 'Required key "BerryFlavorBerryMap[potency]" is missing from JSON.');
        assert(json[r'potency'] != null, 'Required key "BerryFlavorBerryMap[potency]" has a null value in JSON.');
        assert(json.containsKey(r'berry'), 'Required key "BerryFlavorBerryMap[berry]" is missing from JSON.');
        assert(json[r'berry'] != null, 'Required key "BerryFlavorBerryMap[berry]" has a null value in JSON.');
        return true;
      }());

      return BerryFlavorBerryMap(
        potency: mapValueOfType<int>(json, r'potency')!,
        berry: BerrySummary.fromJson(json[r'berry'])!,
      );
    }
    return null;
  }

  static List<BerryFlavorBerryMap> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BerryFlavorBerryMap>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BerryFlavorBerryMap.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BerryFlavorBerryMap> mapFromJson(dynamic json) {
    final map = <String, BerryFlavorBerryMap>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BerryFlavorBerryMap.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BerryFlavorBerryMap-objects as value to a dart map
  static Map<String, List<BerryFlavorBerryMap>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BerryFlavorBerryMap>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BerryFlavorBerryMap.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'potency',
    'berry',
  };
}

