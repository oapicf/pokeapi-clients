//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationDetail {
  /// Returns a new [LocationDetail] instance.
  LocationDetail({
    required this.id,
    required this.name,
    required this.region,
    this.names = const [],
    this.gameIndices = const [],
    this.areas = const [],
  });

  int id;

  String name;

  RegionSummary region;

  List<LocationName> names;

  List<LocationGameIndex> gameIndices;

  List<LocationAreaSummary> areas;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationDetail &&
    other.id == id &&
    other.name == name &&
    other.region == region &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.gameIndices, gameIndices) &&
    _deepEquality.equals(other.areas, areas);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (region.hashCode) +
    (names.hashCode) +
    (gameIndices.hashCode) +
    (areas.hashCode);

  @override
  String toString() => 'LocationDetail[id=$id, name=$name, region=$region, names=$names, gameIndices=$gameIndices, areas=$areas]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'region'] = this.region;
      json[r'names'] = this.names;
      json[r'game_indices'] = this.gameIndices;
      json[r'areas'] = this.areas;
    return json;
  }

  /// Returns a new [LocationDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "LocationDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "LocationDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "LocationDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "LocationDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'region'), 'Required key "LocationDetail[region]" is missing from JSON.');
        assert(json[r'region'] != null, 'Required key "LocationDetail[region]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "LocationDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "LocationDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'game_indices'), 'Required key "LocationDetail[game_indices]" is missing from JSON.');
        assert(json[r'game_indices'] != null, 'Required key "LocationDetail[game_indices]" has a null value in JSON.');
        assert(json.containsKey(r'areas'), 'Required key "LocationDetail[areas]" is missing from JSON.');
        assert(json[r'areas'] != null, 'Required key "LocationDetail[areas]" has a null value in JSON.');
        return true;
      }());

      return LocationDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        region: RegionSummary.fromJson(json[r'region'])!,
        names: LocationName.listFromJson(json[r'names']),
        gameIndices: LocationGameIndex.listFromJson(json[r'game_indices']),
        areas: LocationAreaSummary.listFromJson(json[r'areas']),
      );
    }
    return null;
  }

  static List<LocationDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationDetail> mapFromJson(dynamic json) {
    final map = <String, LocationDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationDetail-objects as value to a dart map
  static Map<String, List<LocationDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'region',
    'names',
    'game_indices',
    'areas',
  };
}

