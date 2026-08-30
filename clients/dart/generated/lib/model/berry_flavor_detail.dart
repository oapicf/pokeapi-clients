//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BerryFlavorDetail {
  /// Returns a new [BerryFlavorDetail] instance.
  BerryFlavorDetail({
    required this.id,
    required this.name,
    this.berries = const [],
    required this.contestType,
    this.names = const [],
  });

  int id;

  String name;

  List<BerryFlavorDetailBerriesInner> berries;

  ContestTypeSummary contestType;

  List<BerryFlavorName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BerryFlavorDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.berries, berries) &&
    other.contestType == contestType &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (berries.hashCode) +
    (contestType.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'BerryFlavorDetail[id=$id, name=$name, berries=$berries, contestType=$contestType, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'berries'] = this.berries;
      json[r'contest_type'] = this.contestType;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [BerryFlavorDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BerryFlavorDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "BerryFlavorDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "BerryFlavorDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "BerryFlavorDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "BerryFlavorDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'berries'), 'Required key "BerryFlavorDetail[berries]" is missing from JSON.');
        assert(json[r'berries'] != null, 'Required key "BerryFlavorDetail[berries]" has a null value in JSON.');
        assert(json.containsKey(r'contest_type'), 'Required key "BerryFlavorDetail[contest_type]" is missing from JSON.');
        assert(json[r'contest_type'] != null, 'Required key "BerryFlavorDetail[contest_type]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "BerryFlavorDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "BerryFlavorDetail[names]" has a null value in JSON.');
        return true;
      }());

      return BerryFlavorDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        berries: BerryFlavorDetailBerriesInner.listFromJson(json[r'berries']),
        contestType: ContestTypeSummary.fromJson(json[r'contest_type'])!,
        names: BerryFlavorName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<BerryFlavorDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BerryFlavorDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BerryFlavorDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BerryFlavorDetail> mapFromJson(dynamic json) {
    final map = <String, BerryFlavorDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BerryFlavorDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BerryFlavorDetail-objects as value to a dart map
  static Map<String, List<BerryFlavorDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BerryFlavorDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BerryFlavorDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'berries',
    'contest_type',
    'names',
  };
}

