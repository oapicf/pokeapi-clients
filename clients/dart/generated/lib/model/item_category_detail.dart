//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemCategoryDetail {
  /// Returns a new [ItemCategoryDetail] instance.
  ItemCategoryDetail({
    required this.id,
    required this.name,
    this.items = const [],
    this.names = const [],
    required this.pocket,
  });

  int id;

  String name;

  List<ItemSummary> items;

  List<ItemCategoryName> names;

  ItemPocketSummary pocket;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemCategoryDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.items, items) &&
    _deepEquality.equals(other.names, names) &&
    other.pocket == pocket;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (items.hashCode) +
    (names.hashCode) +
    (pocket.hashCode);

  @override
  String toString() => 'ItemCategoryDetail[id=$id, name=$name, items=$items, names=$names, pocket=$pocket]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'items'] = this.items;
      json[r'names'] = this.names;
      json[r'pocket'] = this.pocket;
    return json;
  }

  /// Returns a new [ItemCategoryDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemCategoryDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemCategoryDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemCategoryDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemCategoryDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        items: ItemSummary.listFromJson(json[r'items']),
        names: ItemCategoryName.listFromJson(json[r'names']),
        pocket: ItemPocketSummary.fromJson(json[r'pocket'])!,
      );
    }
    return null;
  }

  static List<ItemCategoryDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemCategoryDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemCategoryDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemCategoryDetail> mapFromJson(dynamic json) {
    final map = <String, ItemCategoryDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemCategoryDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemCategoryDetail-objects as value to a dart map
  static Map<String, List<ItemCategoryDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemCategoryDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemCategoryDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'items',
    'names',
    'pocket',
  };
}

