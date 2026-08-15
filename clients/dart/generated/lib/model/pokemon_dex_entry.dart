//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDexEntry {
  /// Returns a new [PokemonDexEntry] instance.
  PokemonDexEntry({
    required this.entryNumber,
    required this.pokedex,
  });

  int entryNumber;

  PokedexSummary pokedex;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDexEntry &&
    other.entryNumber == entryNumber &&
    other.pokedex == pokedex;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entryNumber.hashCode) +
    (pokedex.hashCode);

  @override
  String toString() => 'PokemonDexEntry[entryNumber=$entryNumber, pokedex=$pokedex]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'entry_number'] = this.entryNumber;
      json[r'pokedex'] = this.pokedex;
    return json;
  }

  /// Returns a new [PokemonDexEntry] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDexEntry? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokemonDexEntry[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokemonDexEntry[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PokemonDexEntry(
        entryNumber: mapValueOfType<int>(json, r'entry_number')!,
        pokedex: PokedexSummary.fromJson(json[r'pokedex'])!,
      );
    }
    return null;
  }

  static List<PokemonDexEntry> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDexEntry>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDexEntry.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDexEntry> mapFromJson(dynamic json) {
    final map = <String, PokemonDexEntry>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDexEntry.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDexEntry-objects as value to a dart map
  static Map<String, List<PokemonDexEntry>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDexEntry>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDexEntry.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'entry_number',
    'pokedex',
  };
}

