//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TypePastRelationships {
  /// Returns a new [TypePastRelationships] instance.
  TypePastRelationships({
    required this.generation,
    required this.damageRelations,
  });

  /// The last generation in which the referenced type had the listed damage relations
  GenerationSummary generation;

  /// The damage relations the referenced type had up to and including the listed generation
  TypeRelationships damageRelations;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TypePastRelationships &&
    other.generation == generation &&
    other.damageRelations == damageRelations;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (generation.hashCode) +
    (damageRelations.hashCode);

  @override
  String toString() => 'TypePastRelationships[generation=$generation, damageRelations=$damageRelations]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'generation'] = this.generation;
      json[r'damage_relations'] = this.damageRelations;
    return json;
  }

  /// Returns a new [TypePastRelationships] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TypePastRelationships? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'generation'), 'Required key "TypePastRelationships[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "TypePastRelationships[generation]" has a null value in JSON.');
        assert(json.containsKey(r'damage_relations'), 'Required key "TypePastRelationships[damage_relations]" is missing from JSON.');
        assert(json[r'damage_relations'] != null, 'Required key "TypePastRelationships[damage_relations]" has a null value in JSON.');
        return true;
      }());

      return TypePastRelationships(
        generation: GenerationSummary.fromJson(json[r'generation'])!,
        damageRelations: TypeRelationships.fromJson(json[r'damage_relations'])!,
      );
    }
    return null;
  }

  static List<TypePastRelationships> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TypePastRelationships>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TypePastRelationships.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TypePastRelationships> mapFromJson(dynamic json) {
    final map = <String, TypePastRelationships>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TypePastRelationships.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TypePastRelationships-objects as value to a dart map
  static Map<String, List<TypePastRelationships>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TypePastRelationships>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TypePastRelationships.listFromJson(entry.value, growable: growable,);
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

