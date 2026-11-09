//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemSprites {
  /// Returns a new [ItemSprites] instance.
  ItemSprites({
    required this.default_,
  });

  /// The default depiction of this item.
  String? default_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemSprites &&
    other.default_ == default_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (default_ == null ? 0 : default_!.hashCode);

  @override
  String toString() => 'ItemSprites[default_=$default_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.default_ != null) {
      json[r'default'] = this.default_;
    } else {
      json[r'default'] = null;
    }
    return json;
  }

  /// Returns a new [ItemSprites] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemSprites? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'default'), 'Required key "ItemSprites[default]" is missing from JSON.');
        return true;
      }());

      return ItemSprites(
        default_: mapValueOfType<String>(json, r'default'),
      );
    }
    return null;
  }

  static List<ItemSprites> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemSprites>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemSprites.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemSprites> mapFromJson(dynamic json) {
    final map = <String, ItemSprites>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemSprites.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemSprites-objects as value to a dart map
  static Map<String, List<ItemSprites>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemSprites>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemSprites.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'default',
  };
}

