//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemPocketDetail {
  /// Returns a new [ItemPocketDetail] instance.
  ItemPocketDetail({
    required this.id,
    required this.name,
    this.categories = const [],
    this.names = const [],
  });

  int id;

  String name;

  List<ItemCategorySummary> categories;

  List<ItemPocketName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemPocketDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.categories, categories) &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (categories.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'ItemPocketDetail[id=$id, name=$name, categories=$categories, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'categories'] = this.categories;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [ItemPocketDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemPocketDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemPocketDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemPocketDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemPocketDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        categories: ItemCategorySummary.listFromJson(json[r'categories']),
        names: ItemPocketName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<ItemPocketDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemPocketDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemPocketDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemPocketDetail> mapFromJson(dynamic json) {
    final map = <String, ItemPocketDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemPocketDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemPocketDetail-objects as value to a dart map
  static Map<String, List<ItemPocketDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemPocketDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemPocketDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'categories',
    'names',
  };
}

