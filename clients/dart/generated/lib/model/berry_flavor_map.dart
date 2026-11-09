//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BerryFlavorMap {
  /// Returns a new [BerryFlavorMap] instance.
  BerryFlavorMap({
    required this.potency,
    required this.flavor,
  });

  /// How powerful the referenced flavor is for this berry.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int potency;

  /// The referenced berry flavor.
  BerryFlavorSummary flavor;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BerryFlavorMap &&
    other.potency == potency &&
    other.flavor == flavor;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (potency.hashCode) +
    (flavor.hashCode);

  @override
  String toString() => 'BerryFlavorMap[potency=$potency, flavor=$flavor]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'potency'] = this.potency;
      json[r'flavor'] = this.flavor;
    return json;
  }

  /// Returns a new [BerryFlavorMap] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BerryFlavorMap? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'potency'), 'Required key "BerryFlavorMap[potency]" is missing from JSON.');
        assert(json[r'potency'] != null, 'Required key "BerryFlavorMap[potency]" has a null value in JSON.');
        assert(json.containsKey(r'flavor'), 'Required key "BerryFlavorMap[flavor]" is missing from JSON.');
        assert(json[r'flavor'] != null, 'Required key "BerryFlavorMap[flavor]" has a null value in JSON.');
        return true;
      }());

      return BerryFlavorMap(
        potency: mapValueOfType<int>(json, r'potency')!,
        flavor: BerryFlavorSummary.fromJson(json[r'flavor'])!,
      );
    }
    return null;
  }

  static List<BerryFlavorMap> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BerryFlavorMap>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BerryFlavorMap.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BerryFlavorMap> mapFromJson(dynamic json) {
    final map = <String, BerryFlavorMap>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BerryFlavorMap.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BerryFlavorMap-objects as value to a dart map
  static Map<String, List<BerryFlavorMap>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BerryFlavorMap>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BerryFlavorMap.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'potency',
    'flavor',
  };
}

