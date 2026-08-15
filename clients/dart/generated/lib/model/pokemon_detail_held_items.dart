//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDetailHeldItems {
  /// Returns a new [PokemonDetailHeldItems] instance.
  PokemonDetailHeldItems({
    required this.item,
    this.versionDetails = const [],
  });

  AbilityDetailPokemonInnerPokemon item;

  List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDetailHeldItems &&
    other.item == item &&
    _deepEquality.equals(other.versionDetails, versionDetails);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (item.hashCode) +
    (versionDetails.hashCode);

  @override
  String toString() => 'PokemonDetailHeldItems[item=$item, versionDetails=$versionDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'item'] = this.item;
      json[r'version_details'] = this.versionDetails;
    return json;
  }

  /// Returns a new [PokemonDetailHeldItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDetailHeldItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokemonDetailHeldItems[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokemonDetailHeldItems[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PokemonDetailHeldItems(
        item: AbilityDetailPokemonInnerPokemon.fromJson(json[r'item'])!,
        versionDetails: ItemDetailHeldByPokemonInnerVersionDetailsInner.listFromJson(json[r'version_details']),
      );
    }
    return null;
  }

  static List<PokemonDetailHeldItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDetailHeldItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDetailHeldItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDetailHeldItems> mapFromJson(dynamic json) {
    final map = <String, PokemonDetailHeldItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDetailHeldItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDetailHeldItems-objects as value to a dart map
  static Map<String, List<PokemonDetailHeldItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDetailHeldItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDetailHeldItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'item',
    'version_details',
  };
}

