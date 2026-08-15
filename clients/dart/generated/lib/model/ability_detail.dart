//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AbilityDetail {
  /// Returns a new [AbilityDetail] instance.
  AbilityDetail({
    required this.id,
    required this.name,
    this.isMainSeries,
    required this.generation,
    this.names = const [],
    this.effectEntries = const [],
    this.effectChanges = const [],
    this.flavorTextEntries = const [],
    this.pokemon = const [],
  });

  int id;

  String name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isMainSeries;

  GenerationSummary generation;

  List<AbilityName> names;

  List<AbilityEffectText> effectEntries;

  List<AbilityChange> effectChanges;

  List<AbilityFlavorText> flavorTextEntries;

  List<AbilityDetailPokemonInner> pokemon;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AbilityDetail &&
    other.id == id &&
    other.name == name &&
    other.isMainSeries == isMainSeries &&
    other.generation == generation &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.effectEntries, effectEntries) &&
    _deepEquality.equals(other.effectChanges, effectChanges) &&
    _deepEquality.equals(other.flavorTextEntries, flavorTextEntries) &&
    _deepEquality.equals(other.pokemon, pokemon);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (isMainSeries == null ? 0 : isMainSeries!.hashCode) +
    (generation.hashCode) +
    (names.hashCode) +
    (effectEntries.hashCode) +
    (effectChanges.hashCode) +
    (flavorTextEntries.hashCode) +
    (pokemon.hashCode);

  @override
  String toString() => 'AbilityDetail[id=$id, name=$name, isMainSeries=$isMainSeries, generation=$generation, names=$names, effectEntries=$effectEntries, effectChanges=$effectChanges, flavorTextEntries=$flavorTextEntries, pokemon=$pokemon]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.isMainSeries != null) {
      json[r'is_main_series'] = this.isMainSeries;
    } else {
      json[r'is_main_series'] = null;
    }
      json[r'generation'] = this.generation;
      json[r'names'] = this.names;
      json[r'effect_entries'] = this.effectEntries;
      json[r'effect_changes'] = this.effectChanges;
      json[r'flavor_text_entries'] = this.flavorTextEntries;
      json[r'pokemon'] = this.pokemon;
    return json;
  }

  /// Returns a new [AbilityDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AbilityDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AbilityDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AbilityDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AbilityDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        isMainSeries: mapValueOfType<bool>(json, r'is_main_series'),
        generation: GenerationSummary.fromJson(json[r'generation'])!,
        names: AbilityName.listFromJson(json[r'names']),
        effectEntries: AbilityEffectText.listFromJson(json[r'effect_entries']),
        effectChanges: AbilityChange.listFromJson(json[r'effect_changes']),
        flavorTextEntries: AbilityFlavorText.listFromJson(json[r'flavor_text_entries']),
        pokemon: AbilityDetailPokemonInner.listFromJson(json[r'pokemon']),
      );
    }
    return null;
  }

  static List<AbilityDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AbilityDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AbilityDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AbilityDetail> mapFromJson(dynamic json) {
    final map = <String, AbilityDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AbilityDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AbilityDetail-objects as value to a dart map
  static Map<String, List<AbilityDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AbilityDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AbilityDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'generation',
    'names',
    'effect_entries',
    'effect_changes',
    'flavor_text_entries',
    'pokemon',
  };
}

