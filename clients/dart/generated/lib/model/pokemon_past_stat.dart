//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonPastStat {
  /// Returns a new [PokemonPastStat] instance.
  PokemonPastStat({
    required this.generation,
    this.stats = const [],
  });

  /// The last generation in which the referenced pokémon had the listed stats.
  GenerationSummary generation;

  /// The stat the Pokémon had up to and including the listed generation.
  List<PokemonStat> stats;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonPastStat &&
    other.generation == generation &&
    _deepEquality.equals(other.stats, stats);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (generation.hashCode) +
    (stats.hashCode);

  @override
  String toString() => 'PokemonPastStat[generation=$generation, stats=$stats]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'generation'] = this.generation;
      json[r'stats'] = this.stats;
    return json;
  }

  /// Returns a new [PokemonPastStat] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonPastStat? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'generation'), 'Required key "PokemonPastStat[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "PokemonPastStat[generation]" has a null value in JSON.');
        assert(json.containsKey(r'stats'), 'Required key "PokemonPastStat[stats]" is missing from JSON.');
        assert(json[r'stats'] != null, 'Required key "PokemonPastStat[stats]" has a null value in JSON.');
        return true;
      }());

      return PokemonPastStat(
        generation: GenerationSummary.fromJson(json[r'generation'])!,
        stats: PokemonStat.listFromJson(json[r'stats']),
      );
    }
    return null;
  }

  static List<PokemonPastStat> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonPastStat>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonPastStat.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonPastStat> mapFromJson(dynamic json) {
    final map = <String, PokemonPastStat>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonPastStat.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonPastStat-objects as value to a dart map
  static Map<String, List<PokemonPastStat>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonPastStat>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonPastStat.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'generation',
    'stats',
  };
}

