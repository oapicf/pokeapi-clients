//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TypeDetailPastDamageRelationsInner {
  /// Returns a new [TypeDetailPastDamageRelationsInner] instance.
  TypeDetailPastDamageRelationsInner({
    required this.generation,
    required this.damageRelations,
  });

  AbilityDetailPokemonInnerPokemon generation;

  TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TypeDetailPastDamageRelationsInner &&
    other.generation == generation &&
    other.damageRelations == damageRelations;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (generation.hashCode) +
    (damageRelations.hashCode);

  @override
  String toString() => 'TypeDetailPastDamageRelationsInner[generation=$generation, damageRelations=$damageRelations]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'generation'] = this.generation;
      json[r'damage_relations'] = this.damageRelations;
    return json;
  }

  /// Returns a new [TypeDetailPastDamageRelationsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TypeDetailPastDamageRelationsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TypeDetailPastDamageRelationsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TypeDetailPastDamageRelationsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TypeDetailPastDamageRelationsInner(
        generation: AbilityDetailPokemonInnerPokemon.fromJson(json[r'generation'])!,
        damageRelations: TypeDetailPastDamageRelationsInnerDamageRelations.fromJson(json[r'damage_relations'])!,
      );
    }
    return null;
  }

  static List<TypeDetailPastDamageRelationsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TypeDetailPastDamageRelationsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TypeDetailPastDamageRelationsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TypeDetailPastDamageRelationsInner> mapFromJson(dynamic json) {
    final map = <String, TypeDetailPastDamageRelationsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TypeDetailPastDamageRelationsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TypeDetailPastDamageRelationsInner-objects as value to a dart map
  static Map<String, List<TypeDetailPastDamageRelationsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TypeDetailPastDamageRelationsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TypeDetailPastDamageRelationsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'generation',
    'damage_relations',
  };
}

