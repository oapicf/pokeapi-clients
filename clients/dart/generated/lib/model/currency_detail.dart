//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CurrencyDetail {
  /// Returns a new [CurrencyDetail] instance.
  CurrencyDetail({
    required this.id,
    required this.name,
    this.names = const [],
  });

  /// The identifier for this resource.
  int id;

  /// The name for this resource.
  String name;

  /// The name of this resource listed in different languages.
  List<CurrencyName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CurrencyDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'CurrencyDetail[id=$id, name=$name, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [CurrencyDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CurrencyDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "CurrencyDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "CurrencyDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "CurrencyDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "CurrencyDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "CurrencyDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "CurrencyDetail[names]" has a null value in JSON.');
        return true;
      }());

      return CurrencyDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        names: CurrencyName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<CurrencyDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CurrencyDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CurrencyDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CurrencyDetail> mapFromJson(dynamic json) {
    final map = <String, CurrencyDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CurrencyDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CurrencyDetail-objects as value to a dart map
  static Map<String, List<CurrencyDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CurrencyDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CurrencyDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'names',
  };
}

