//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDetailMovesInner {
  /// Returns a new [PokemonDetailMovesInner] instance.
  PokemonDetailMovesInner({
    required this.move,
    this.versionGroupDetails = const [],
  });

  AbilityDetailPokemonInnerPokemon move;

  List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDetailMovesInner &&
    other.move == move &&
    _deepEquality.equals(other.versionGroupDetails, versionGroupDetails);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (move.hashCode) +
    (versionGroupDetails.hashCode);

  @override
  String toString() => 'PokemonDetailMovesInner[move=$move, versionGroupDetails=$versionGroupDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'move'] = this.move;
      json[r'version_group_details'] = this.versionGroupDetails;
    return json;
  }

  /// Returns a new [PokemonDetailMovesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDetailMovesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokemonDetailMovesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokemonDetailMovesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PokemonDetailMovesInner(
        move: AbilityDetailPokemonInnerPokemon.fromJson(json[r'move'])!,
        versionGroupDetails: PokemonDetailMovesInnerVersionGroupDetailsInner.listFromJson(json[r'version_group_details']),
      );
    }
    return null;
  }

  static List<PokemonDetailMovesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDetailMovesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDetailMovesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDetailMovesInner> mapFromJson(dynamic json) {
    final map = <String, PokemonDetailMovesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDetailMovesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDetailMovesInner-objects as value to a dart map
  static Map<String, List<PokemonDetailMovesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDetailMovesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDetailMovesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'move',
    'version_group_details',
  };
}

