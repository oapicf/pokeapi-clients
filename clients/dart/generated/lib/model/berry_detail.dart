//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BerryDetail {
  /// Returns a new [BerryDetail] instance.
  BerryDetail({
    required this.id,
    required this.name,
    required this.growthTime,
    required this.maxHarvest,
    required this.naturalGiftPower,
    required this.size,
    required this.smoothness,
    required this.soilDryness,
    required this.firmness,
    this.flavors = const [],
    required this.item,
    required this.naturalGiftType,
  });

  int id;

  String name;

  int growthTime;

  int maxHarvest;

  int naturalGiftPower;

  int size;

  int smoothness;

  int soilDryness;

  BerryFirmnessSummary firmness;

  List<BerryDetailFlavorsInner> flavors;

  ItemSummary item;

  TypeSummary naturalGiftType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BerryDetail &&
    other.id == id &&
    other.name == name &&
    other.growthTime == growthTime &&
    other.maxHarvest == maxHarvest &&
    other.naturalGiftPower == naturalGiftPower &&
    other.size == size &&
    other.smoothness == smoothness &&
    other.soilDryness == soilDryness &&
    other.firmness == firmness &&
    _deepEquality.equals(other.flavors, flavors) &&
    other.item == item &&
    other.naturalGiftType == naturalGiftType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (growthTime.hashCode) +
    (maxHarvest.hashCode) +
    (naturalGiftPower.hashCode) +
    (size.hashCode) +
    (smoothness.hashCode) +
    (soilDryness.hashCode) +
    (firmness.hashCode) +
    (flavors.hashCode) +
    (item.hashCode) +
    (naturalGiftType.hashCode);

  @override
  String toString() => 'BerryDetail[id=$id, name=$name, growthTime=$growthTime, maxHarvest=$maxHarvest, naturalGiftPower=$naturalGiftPower, size=$size, smoothness=$smoothness, soilDryness=$soilDryness, firmness=$firmness, flavors=$flavors, item=$item, naturalGiftType=$naturalGiftType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'growth_time'] = this.growthTime;
      json[r'max_harvest'] = this.maxHarvest;
      json[r'natural_gift_power'] = this.naturalGiftPower;
      json[r'size'] = this.size;
      json[r'smoothness'] = this.smoothness;
      json[r'soil_dryness'] = this.soilDryness;
      json[r'firmness'] = this.firmness;
      json[r'flavors'] = this.flavors;
      json[r'item'] = this.item;
      json[r'natural_gift_type'] = this.naturalGiftType;
    return json;
  }

  /// Returns a new [BerryDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BerryDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "BerryDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "BerryDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "BerryDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "BerryDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'growth_time'), 'Required key "BerryDetail[growth_time]" is missing from JSON.');
        assert(json[r'growth_time'] != null, 'Required key "BerryDetail[growth_time]" has a null value in JSON.');
        assert(json.containsKey(r'max_harvest'), 'Required key "BerryDetail[max_harvest]" is missing from JSON.');
        assert(json[r'max_harvest'] != null, 'Required key "BerryDetail[max_harvest]" has a null value in JSON.');
        assert(json.containsKey(r'natural_gift_power'), 'Required key "BerryDetail[natural_gift_power]" is missing from JSON.');
        assert(json[r'natural_gift_power'] != null, 'Required key "BerryDetail[natural_gift_power]" has a null value in JSON.');
        assert(json.containsKey(r'size'), 'Required key "BerryDetail[size]" is missing from JSON.');
        assert(json[r'size'] != null, 'Required key "BerryDetail[size]" has a null value in JSON.');
        assert(json.containsKey(r'smoothness'), 'Required key "BerryDetail[smoothness]" is missing from JSON.');
        assert(json[r'smoothness'] != null, 'Required key "BerryDetail[smoothness]" has a null value in JSON.');
        assert(json.containsKey(r'soil_dryness'), 'Required key "BerryDetail[soil_dryness]" is missing from JSON.');
        assert(json[r'soil_dryness'] != null, 'Required key "BerryDetail[soil_dryness]" has a null value in JSON.');
        assert(json.containsKey(r'firmness'), 'Required key "BerryDetail[firmness]" is missing from JSON.');
        assert(json[r'firmness'] != null, 'Required key "BerryDetail[firmness]" has a null value in JSON.');
        assert(json.containsKey(r'flavors'), 'Required key "BerryDetail[flavors]" is missing from JSON.');
        assert(json[r'flavors'] != null, 'Required key "BerryDetail[flavors]" has a null value in JSON.');
        assert(json.containsKey(r'item'), 'Required key "BerryDetail[item]" is missing from JSON.');
        assert(json[r'item'] != null, 'Required key "BerryDetail[item]" has a null value in JSON.');
        assert(json.containsKey(r'natural_gift_type'), 'Required key "BerryDetail[natural_gift_type]" is missing from JSON.');
        assert(json[r'natural_gift_type'] != null, 'Required key "BerryDetail[natural_gift_type]" has a null value in JSON.');
        return true;
      }());

      return BerryDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        growthTime: mapValueOfType<int>(json, r'growth_time')!,
        maxHarvest: mapValueOfType<int>(json, r'max_harvest')!,
        naturalGiftPower: mapValueOfType<int>(json, r'natural_gift_power')!,
        size: mapValueOfType<int>(json, r'size')!,
        smoothness: mapValueOfType<int>(json, r'smoothness')!,
        soilDryness: mapValueOfType<int>(json, r'soil_dryness')!,
        firmness: BerryFirmnessSummary.fromJson(json[r'firmness'])!,
        flavors: BerryDetailFlavorsInner.listFromJson(json[r'flavors']),
        item: ItemSummary.fromJson(json[r'item'])!,
        naturalGiftType: TypeSummary.fromJson(json[r'natural_gift_type'])!,
      );
    }
    return null;
  }

  static List<BerryDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BerryDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BerryDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BerryDetail> mapFromJson(dynamic json) {
    final map = <String, BerryDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BerryDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BerryDetail-objects as value to a dart map
  static Map<String, List<BerryDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BerryDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BerryDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'growth_time',
    'max_harvest',
    'natural_gift_power',
    'size',
    'smoothness',
    'soil_dryness',
    'firmness',
    'flavors',
    'item',
    'natural_gift_type',
  };
}

