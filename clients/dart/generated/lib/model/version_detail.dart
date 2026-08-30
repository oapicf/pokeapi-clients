//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VersionDetail {
  /// Returns a new [VersionDetail] instance.
  VersionDetail({
    required this.id,
    required this.name,
    this.names = const [],
    required this.versionGroup,
  });

  int id;

  String name;

  List<VersionName> names;

  VersionGroupSummary versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VersionDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.names, names) &&
    other.versionGroup == versionGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (names.hashCode) +
    (versionGroup.hashCode);

  @override
  String toString() => 'VersionDetail[id=$id, name=$name, names=$names, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'names'] = this.names;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [VersionDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VersionDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "VersionDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "VersionDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "VersionDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "VersionDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "VersionDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "VersionDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "VersionDetail[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "VersionDetail[version_group]" has a null value in JSON.');
        return true;
      }());

      return VersionDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        names: VersionName.listFromJson(json[r'names']),
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<VersionDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VersionDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VersionDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VersionDetail> mapFromJson(dynamic json) {
    final map = <String, VersionDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VersionDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VersionDetail-objects as value to a dart map
  static Map<String, List<VersionDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VersionDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VersionDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'names',
    'version_group',
  };
}

