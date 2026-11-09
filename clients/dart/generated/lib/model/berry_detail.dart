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
    this.growthTime,
    this.maxHarvest,
    this.naturalGiftPower,
    this.size,
    this.smoothness,
    this.soilDryness,
    required this.firmness,
    this.flavors = const [],
    required this.item,
    required this.naturalGiftType,
  });

  /// The identifier for this resource.
  int id;

  /// The name for this resource.
  String name;

  /// Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? growthTime;

  /// The maximum number of these berries that can grow on one tree in Generation IV.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? maxHarvest;

  /// The power of the move \"Natural Gift\" when used with this Berry.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? naturalGiftPower;

  /// The size of this Berry, in millimeters.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? size;

  /// The smoothness of this Berry, used in making Pokéblocks or Poffins.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? smoothness;

  /// The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? soilDryness;

  /// The firmness of this berry, used in making Pokéblocks or Poffins.
  BerryFirmnessSummary? firmness;

  /// A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
  List<BerryFlavorMap> flavors;

  /// Berries are actually items. This is a reference to the item specific data for this berry.
  ItemSummary item;

  /// The type inherited by \"Natural Gift\" when used with this Berry.
  TypeSummary? naturalGiftType;

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
    (growthTime == null ? 0 : growthTime!.hashCode) +
    (maxHarvest == null ? 0 : maxHarvest!.hashCode) +
    (naturalGiftPower == null ? 0 : naturalGiftPower!.hashCode) +
    (size == null ? 0 : size!.hashCode) +
    (smoothness == null ? 0 : smoothness!.hashCode) +
    (soilDryness == null ? 0 : soilDryness!.hashCode) +
    (firmness == null ? 0 : firmness!.hashCode) +
    (flavors.hashCode) +
    (item.hashCode) +
    (naturalGiftType == null ? 0 : naturalGiftType!.hashCode);

  @override
  String toString() => 'BerryDetail[id=$id, name=$name, growthTime=$growthTime, maxHarvest=$maxHarvest, naturalGiftPower=$naturalGiftPower, size=$size, smoothness=$smoothness, soilDryness=$soilDryness, firmness=$firmness, flavors=$flavors, item=$item, naturalGiftType=$naturalGiftType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.growthTime != null) {
      json[r'growth_time'] = this.growthTime;
    } else {
      json[r'growth_time'] = null;
    }
    if (this.maxHarvest != null) {
      json[r'max_harvest'] = this.maxHarvest;
    } else {
      json[r'max_harvest'] = null;
    }
    if (this.naturalGiftPower != null) {
      json[r'natural_gift_power'] = this.naturalGiftPower;
    } else {
      json[r'natural_gift_power'] = null;
    }
    if (this.size != null) {
      json[r'size'] = this.size;
    } else {
      json[r'size'] = null;
    }
    if (this.smoothness != null) {
      json[r'smoothness'] = this.smoothness;
    } else {
      json[r'smoothness'] = null;
    }
    if (this.soilDryness != null) {
      json[r'soil_dryness'] = this.soilDryness;
    } else {
      json[r'soil_dryness'] = null;
    }
    if (this.firmness != null) {
      json[r'firmness'] = this.firmness;
    } else {
      json[r'firmness'] = null;
    }
      json[r'flavors'] = this.flavors;
      json[r'item'] = this.item;
    if (this.naturalGiftType != null) {
      json[r'natural_gift_type'] = this.naturalGiftType;
    } else {
      json[r'natural_gift_type'] = null;
    }
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
        assert(json.containsKey(r'firmness'), 'Required key "BerryDetail[firmness]" is missing from JSON.');
        assert(json.containsKey(r'flavors'), 'Required key "BerryDetail[flavors]" is missing from JSON.');
        assert(json[r'flavors'] != null, 'Required key "BerryDetail[flavors]" has a null value in JSON.');
        assert(json.containsKey(r'item'), 'Required key "BerryDetail[item]" is missing from JSON.');
        assert(json[r'item'] != null, 'Required key "BerryDetail[item]" has a null value in JSON.');
        assert(json.containsKey(r'natural_gift_type'), 'Required key "BerryDetail[natural_gift_type]" is missing from JSON.');
        return true;
      }());

      return BerryDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        growthTime: mapValueOfType<int>(json, r'growth_time'),
        maxHarvest: mapValueOfType<int>(json, r'max_harvest'),
        naturalGiftPower: mapValueOfType<int>(json, r'natural_gift_power'),
        size: mapValueOfType<int>(json, r'size'),
        smoothness: mapValueOfType<int>(json, r'smoothness'),
        soilDryness: mapValueOfType<int>(json, r'soil_dryness'),
        firmness: BerryFirmnessSummary.fromJson(json[r'firmness']),
        flavors: BerryFlavorMap.listFromJson(json[r'flavors']),
        item: ItemSummary.fromJson(json[r'item'])!,
        naturalGiftType: TypeSummary.fromJson(json[r'natural_gift_type']),
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
    'firmness',
    'flavors',
    'item',
    'natural_gift_type',
  };
}

