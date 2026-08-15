//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BerryFlavorDetailBerriesInnerBerry {
  /// Returns a new [BerryFlavorDetailBerriesInnerBerry] instance.
  BerryFlavorDetailBerriesInnerBerry({
    this.name,
    this.url,
  });

  /// The name of the berry
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// The URL to get more information about the berry
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BerryFlavorDetailBerriesInnerBerry &&
    other.name == name &&
    other.url == url;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (url == null ? 0 : url!.hashCode);

  @override
  String toString() => 'BerryFlavorDetailBerriesInnerBerry[name=$name, url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.url != null) {
      json[r'url'] = this.url;
    } else {
      json[r'url'] = null;
    }
    return json;
  }

  /// Returns a new [BerryFlavorDetailBerriesInnerBerry] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BerryFlavorDetailBerriesInnerBerry? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BerryFlavorDetailBerriesInnerBerry[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BerryFlavorDetailBerriesInnerBerry[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BerryFlavorDetailBerriesInnerBerry(
        name: mapValueOfType<String>(json, r'name'),
        url: mapValueOfType<String>(json, r'url'),
      );
    }
    return null;
  }

  static List<BerryFlavorDetailBerriesInnerBerry> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BerryFlavorDetailBerriesInnerBerry>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BerryFlavorDetailBerriesInnerBerry.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BerryFlavorDetailBerriesInnerBerry> mapFromJson(dynamic json) {
    final map = <String, BerryFlavorDetailBerriesInnerBerry>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BerryFlavorDetailBerriesInnerBerry.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BerryFlavorDetailBerriesInnerBerry-objects as value to a dart map
  static Map<String, List<BerryFlavorDetailBerriesInnerBerry>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BerryFlavorDetailBerriesInnerBerry>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BerryFlavorDetailBerriesInnerBerry.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

