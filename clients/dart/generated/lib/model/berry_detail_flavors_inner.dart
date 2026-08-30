//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BerryDetailFlavorsInner {
  /// Returns a new [BerryDetailFlavorsInner] instance.
  BerryDetailFlavorsInner({
    required this.potency,
    required this.flavor,
  });

  int potency;

  BerryDetailFlavorsInnerFlavor flavor;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BerryDetailFlavorsInner &&
    other.potency == potency &&
    other.flavor == flavor;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (potency.hashCode) +
    (flavor.hashCode);

  @override
  String toString() => 'BerryDetailFlavorsInner[potency=$potency, flavor=$flavor]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'potency'] = this.potency;
      json[r'flavor'] = this.flavor;
    return json;
  }

  /// Returns a new [BerryDetailFlavorsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BerryDetailFlavorsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'potency'), 'Required key "BerryDetailFlavorsInner[potency]" is missing from JSON.');
        assert(json[r'potency'] != null, 'Required key "BerryDetailFlavorsInner[potency]" has a null value in JSON.');
        assert(json.containsKey(r'flavor'), 'Required key "BerryDetailFlavorsInner[flavor]" is missing from JSON.');
        assert(json[r'flavor'] != null, 'Required key "BerryDetailFlavorsInner[flavor]" has a null value in JSON.');
        return true;
      }());

      return BerryDetailFlavorsInner(
        potency: mapValueOfType<int>(json, r'potency')!,
        flavor: BerryDetailFlavorsInnerFlavor.fromJson(json[r'flavor'])!,
      );
    }
    return null;
  }

  static List<BerryDetailFlavorsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BerryDetailFlavorsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BerryDetailFlavorsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BerryDetailFlavorsInner> mapFromJson(dynamic json) {
    final map = <String, BerryDetailFlavorsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BerryDetailFlavorsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BerryDetailFlavorsInner-objects as value to a dart map
  static Map<String, List<BerryDetailFlavorsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BerryDetailFlavorsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BerryDetailFlavorsInner.listFromJson(entry.value, growable: growable,);
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

