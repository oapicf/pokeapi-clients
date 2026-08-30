//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemDetailMachinesInner {
  /// Returns a new [ItemDetailMachinesInner] instance.
  ItemDetailMachinesInner({
    required this.machine,
    required this.versionGroup,
  });

  String machine;

  AbilityDetailPokemonInnerPokemon versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemDetailMachinesInner &&
    other.machine == machine &&
    other.versionGroup == versionGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (machine.hashCode) +
    (versionGroup.hashCode);

  @override
  String toString() => 'ItemDetailMachinesInner[machine=$machine, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'machine'] = this.machine;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [ItemDetailMachinesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemDetailMachinesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'machine'), 'Required key "ItemDetailMachinesInner[machine]" is missing from JSON.');
        assert(json[r'machine'] != null, 'Required key "ItemDetailMachinesInner[machine]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "ItemDetailMachinesInner[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "ItemDetailMachinesInner[version_group]" has a null value in JSON.');
        return true;
      }());

      return ItemDetailMachinesInner(
        machine: mapValueOfType<String>(json, r'machine')!,
        versionGroup: AbilityDetailPokemonInnerPokemon.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<ItemDetailMachinesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemDetailMachinesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemDetailMachinesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemDetailMachinesInner> mapFromJson(dynamic json) {
    final map = <String, ItemDetailMachinesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemDetailMachinesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemDetailMachinesInner-objects as value to a dart map
  static Map<String, List<ItemDetailMachinesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemDetailMachinesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemDetailMachinesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'machine',
    'version_group',
  };
}

