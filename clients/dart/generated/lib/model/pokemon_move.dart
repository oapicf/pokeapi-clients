//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonMove {
  /// Returns a new [PokemonMove] instance.
  PokemonMove({
    required this.move,
    this.versionGroupDetails = const [],
  });

  /// The move the Pokémon can learn.
  MoveSummary move;

  /// The details of the version in which the Pokémon can learn the move.
  List<PokemonMoveVersionGroup> versionGroupDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonMove &&
    other.move == move &&
    _deepEquality.equals(other.versionGroupDetails, versionGroupDetails);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (move.hashCode) +
    (versionGroupDetails.hashCode);

  @override
  String toString() => 'PokemonMove[move=$move, versionGroupDetails=$versionGroupDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'move'] = this.move;
      json[r'version_group_details'] = this.versionGroupDetails;
    return json;
  }

  /// Returns a new [PokemonMove] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonMove? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'move'), 'Required key "PokemonMove[move]" is missing from JSON.');
        assert(json[r'move'] != null, 'Required key "PokemonMove[move]" has a null value in JSON.');
        assert(json.containsKey(r'version_group_details'), 'Required key "PokemonMove[version_group_details]" is missing from JSON.');
        assert(json[r'version_group_details'] != null, 'Required key "PokemonMove[version_group_details]" has a null value in JSON.');
        return true;
      }());

      return PokemonMove(
        move: MoveSummary.fromJson(json[r'move'])!,
        versionGroupDetails: PokemonMoveVersionGroup.listFromJson(json[r'version_group_details']),
      );
    }
    return null;
  }

  static List<PokemonMove> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonMove>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonMove.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonMove> mapFromJson(dynamic json) {
    final map = <String, PokemonMove>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonMove.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonMove-objects as value to a dart map
  static Map<String, List<PokemonMove>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonMove>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonMove.listFromJson(entry.value, growable: growable,);
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

