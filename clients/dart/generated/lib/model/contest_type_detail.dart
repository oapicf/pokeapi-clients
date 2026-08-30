//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ContestTypeDetail {
  /// Returns a new [ContestTypeDetail] instance.
  ContestTypeDetail({
    required this.id,
    required this.name,
    required this.berryFlavor,
    this.names = const [],
  });

  int id;

  String name;

  BerryFlavorSummary berryFlavor;

  List<ContestTypeName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ContestTypeDetail &&
    other.id == id &&
    other.name == name &&
    other.berryFlavor == berryFlavor &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (berryFlavor.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'ContestTypeDetail[id=$id, name=$name, berryFlavor=$berryFlavor, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'berry_flavor'] = this.berryFlavor;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [ContestTypeDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ContestTypeDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "ContestTypeDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "ContestTypeDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "ContestTypeDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "ContestTypeDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'berry_flavor'), 'Required key "ContestTypeDetail[berry_flavor]" is missing from JSON.');
        assert(json[r'berry_flavor'] != null, 'Required key "ContestTypeDetail[berry_flavor]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "ContestTypeDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "ContestTypeDetail[names]" has a null value in JSON.');
        return true;
      }());

      return ContestTypeDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        berryFlavor: BerryFlavorSummary.fromJson(json[r'berry_flavor'])!,
        names: ContestTypeName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<ContestTypeDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ContestTypeDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ContestTypeDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ContestTypeDetail> mapFromJson(dynamic json) {
    final map = <String, ContestTypeDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ContestTypeDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ContestTypeDetail-objects as value to a dart map
  static Map<String, List<ContestTypeDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ContestTypeDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ContestTypeDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'berry_flavor',
    'names',
  };
}

