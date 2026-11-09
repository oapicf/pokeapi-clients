//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemMachine {
  /// Returns a new [ItemMachine] instance.
  ItemMachine({
    required this.machine,
    required this.versionGroup,
  });

  /// The machine that teaches a move from an item.
  MachineSummary machine;

  /// The version group of this specific machine.
  VersionGroupSummary versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemMachine &&
    other.machine == machine &&
    other.versionGroup == versionGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (machine.hashCode) +
    (versionGroup.hashCode);

  @override
  String toString() => 'ItemMachine[machine=$machine, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'machine'] = this.machine;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [ItemMachine] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemMachine? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'machine'), 'Required key "ItemMachine[machine]" is missing from JSON.');
        assert(json[r'machine'] != null, 'Required key "ItemMachine[machine]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "ItemMachine[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "ItemMachine[version_group]" has a null value in JSON.');
        return true;
      }());

      return ItemMachine(
        machine: MachineSummary.fromJson(json[r'machine'])!,
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<ItemMachine> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemMachine>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemMachine.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemMachine> mapFromJson(dynamic json) {
    final map = <String, ItemMachine>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemMachine.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemMachine-objects as value to a dart map
  static Map<String, List<ItemMachine>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemMachine>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemMachine.listFromJson(entry.value, growable: growable,);
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

