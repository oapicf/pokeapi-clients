//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LanguageDetail {
  /// Returns a new [LanguageDetail] instance.
  LanguageDetail({
    required this.id,
    required this.name,
    this.official,
    required this.iso639,
    required this.iso3166,
    this.names = const [],
  });

  int id;

  String name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? official;

  String iso639;

  String iso3166;

  List<LanguageName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LanguageDetail &&
    other.id == id &&
    other.name == name &&
    other.official == official &&
    other.iso639 == iso639 &&
    other.iso3166 == iso3166 &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (official == null ? 0 : official!.hashCode) +
    (iso639.hashCode) +
    (iso3166.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'LanguageDetail[id=$id, name=$name, official=$official, iso639=$iso639, iso3166=$iso3166, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.official != null) {
      json[r'official'] = this.official;
    } else {
      json[r'official'] = null;
    }
      json[r'iso639'] = this.iso639;
      json[r'iso3166'] = this.iso3166;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [LanguageDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LanguageDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "LanguageDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "LanguageDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "LanguageDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "LanguageDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'iso639'), 'Required key "LanguageDetail[iso639]" is missing from JSON.');
        assert(json[r'iso639'] != null, 'Required key "LanguageDetail[iso639]" has a null value in JSON.');
        assert(json.containsKey(r'iso3166'), 'Required key "LanguageDetail[iso3166]" is missing from JSON.');
        assert(json[r'iso3166'] != null, 'Required key "LanguageDetail[iso3166]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "LanguageDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "LanguageDetail[names]" has a null value in JSON.');
        return true;
      }());

      return LanguageDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        official: mapValueOfType<bool>(json, r'official'),
        iso639: mapValueOfType<String>(json, r'iso639')!,
        iso3166: mapValueOfType<String>(json, r'iso3166')!,
        names: LanguageName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<LanguageDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LanguageDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LanguageDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LanguageDetail> mapFromJson(dynamic json) {
    final map = <String, LanguageDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LanguageDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LanguageDetail-objects as value to a dart map
  static Map<String, List<LanguageDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LanguageDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LanguageDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'iso639',
    'iso3166',
    'names',
  };
}

