//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TypeGameSprite {
  /// Returns a new [TypeGameSprite] instance.
  TypeGameSprite({
    this.nameIcon,
    this.symbolIcon,
  });

  /// The URL of the icon displaying the type name in this game, or null if unavailable.
  String? nameIcon;

  /// The URL of the type symbol icon in this game, or null if unavailable.
  String? symbolIcon;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TypeGameSprite &&
    other.nameIcon == nameIcon &&
    other.symbolIcon == symbolIcon;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (nameIcon == null ? 0 : nameIcon!.hashCode) +
    (symbolIcon == null ? 0 : symbolIcon!.hashCode);

  @override
  String toString() => 'TypeGameSprite[nameIcon=$nameIcon, symbolIcon=$symbolIcon]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.nameIcon != null) {
      json[r'name_icon'] = this.nameIcon;
    } else {
      json[r'name_icon'] = null;
    }
    if (this.symbolIcon != null) {
      json[r'symbol_icon'] = this.symbolIcon;
    } else {
      json[r'symbol_icon'] = null;
    }
    return json;
  }

  /// Returns a new [TypeGameSprite] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TypeGameSprite? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return TypeGameSprite(
        nameIcon: mapValueOfType<String>(json, r'name_icon'),
        symbolIcon: mapValueOfType<String>(json, r'symbol_icon'),
      );
    }
    return null;
  }

  static List<TypeGameSprite> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TypeGameSprite>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TypeGameSprite.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TypeGameSprite> mapFromJson(dynamic json) {
    final map = <String, TypeGameSprite>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TypeGameSprite.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TypeGameSprite-objects as value to a dart map
  static Map<String, List<TypeGameSprite>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TypeGameSprite>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TypeGameSprite.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

