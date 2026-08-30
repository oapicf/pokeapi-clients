//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemFlingEffectDetail {
  /// Returns a new [ItemFlingEffectDetail] instance.
  ItemFlingEffectDetail({
    required this.id,
    required this.name,
    this.effectEntries = const [],
    this.items = const [],
  });

  int id;

  String name;

  List<ItemFlingEffectEffectText> effectEntries;

  List<ItemSummary> items;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemFlingEffectDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.effectEntries, effectEntries) &&
    _deepEquality.equals(other.items, items);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (effectEntries.hashCode) +
    (items.hashCode);

  @override
  String toString() => 'ItemFlingEffectDetail[id=$id, name=$name, effectEntries=$effectEntries, items=$items]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'effect_entries'] = this.effectEntries;
      json[r'items'] = this.items;
    return json;
  }

  /// Returns a new [ItemFlingEffectDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemFlingEffectDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "ItemFlingEffectDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "ItemFlingEffectDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "ItemFlingEffectDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "ItemFlingEffectDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'effect_entries'), 'Required key "ItemFlingEffectDetail[effect_entries]" is missing from JSON.');
        assert(json[r'effect_entries'] != null, 'Required key "ItemFlingEffectDetail[effect_entries]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "ItemFlingEffectDetail[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "ItemFlingEffectDetail[items]" has a null value in JSON.');
        return true;
      }());

      return ItemFlingEffectDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        effectEntries: ItemFlingEffectEffectText.listFromJson(json[r'effect_entries']),
        items: ItemSummary.listFromJson(json[r'items']),
      );
    }
    return null;
  }

  static List<ItemFlingEffectDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemFlingEffectDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemFlingEffectDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemFlingEffectDetail> mapFromJson(dynamic json) {
    final map = <String, ItemFlingEffectDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemFlingEffectDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemFlingEffectDetail-objects as value to a dart map
  static Map<String, List<ItemFlingEffectDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemFlingEffectDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemFlingEffectDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'effect_entries',
    'items',
  };
}

