//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TypeDetailPokemonInner {
  /// Returns a new [TypeDetailPokemonInner] instance.
  TypeDetailPokemonInner({
    this.slot,
    this.pokemon,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? slot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TypeDetailPokemonInnerPokemon? pokemon;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TypeDetailPokemonInner &&
    other.slot == slot &&
    other.pokemon == pokemon;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slot == null ? 0 : slot!.hashCode) +
    (pokemon == null ? 0 : pokemon!.hashCode);

  @override
  String toString() => 'TypeDetailPokemonInner[slot=$slot, pokemon=$pokemon]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slot != null) {
      json[r'slot'] = this.slot;
    } else {
      json[r'slot'] = null;
    }
    if (this.pokemon != null) {
      json[r'pokemon'] = this.pokemon;
    } else {
      json[r'pokemon'] = null;
    }
    return json;
  }

  /// Returns a new [TypeDetailPokemonInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TypeDetailPokemonInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return TypeDetailPokemonInner(
        slot: mapValueOfType<int>(json, r'slot'),
        pokemon: TypeDetailPokemonInnerPokemon.fromJson(json[r'pokemon']),
      );
    }
    return null;
  }

  static List<TypeDetailPokemonInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TypeDetailPokemonInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TypeDetailPokemonInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TypeDetailPokemonInner> mapFromJson(dynamic json) {
    final map = <String, TypeDetailPokemonInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TypeDetailPokemonInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TypeDetailPokemonInner-objects as value to a dart map
  static Map<String, List<TypeDetailPokemonInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TypeDetailPokemonInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TypeDetailPokemonInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

