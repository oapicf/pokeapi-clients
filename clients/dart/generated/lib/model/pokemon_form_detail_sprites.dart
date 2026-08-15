//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonFormDetailSprites {
  /// Returns a new [PokemonFormDetailSprites] instance.
  PokemonFormDetailSprites({
    this.default_,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? default_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonFormDetailSprites &&
    other.default_ == default_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (default_ == null ? 0 : default_!.hashCode);

  @override
  String toString() => 'PokemonFormDetailSprites[default_=$default_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.default_ != null) {
      json[r'default'] = this.default_;
    } else {
      json[r'default'] = null;
    }
    return json;
  }

  /// Returns a new [PokemonFormDetailSprites] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonFormDetailSprites? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokemonFormDetailSprites[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokemonFormDetailSprites[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PokemonFormDetailSprites(
        default_: mapValueOfType<String>(json, r'default'),
      );
    }
    return null;
  }

  static List<PokemonFormDetailSprites> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonFormDetailSprites>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonFormDetailSprites.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonFormDetailSprites> mapFromJson(dynamic json) {
    final map = <String, PokemonFormDetailSprites>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonFormDetailSprites.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonFormDetailSprites-objects as value to a dart map
  static Map<String, List<PokemonFormDetailSprites>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonFormDetailSprites>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonFormDetailSprites.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

