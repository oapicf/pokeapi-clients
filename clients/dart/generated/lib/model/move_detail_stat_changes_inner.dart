//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveDetailStatChangesInner {
  /// Returns a new [MoveDetailStatChangesInner] instance.
  MoveDetailStatChangesInner({
    required this.change,
    required this.stat,
  });

  int change;

  AbilityDetailPokemonInnerPokemon stat;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveDetailStatChangesInner &&
    other.change == change &&
    other.stat == stat;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (change.hashCode) +
    (stat.hashCode);

  @override
  String toString() => 'MoveDetailStatChangesInner[change=$change, stat=$stat]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'change'] = this.change;
      json[r'stat'] = this.stat;
    return json;
  }

  /// Returns a new [MoveDetailStatChangesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveDetailStatChangesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'change'), 'Required key "MoveDetailStatChangesInner[change]" is missing from JSON.');
        assert(json[r'change'] != null, 'Required key "MoveDetailStatChangesInner[change]" has a null value in JSON.');
        assert(json.containsKey(r'stat'), 'Required key "MoveDetailStatChangesInner[stat]" is missing from JSON.');
        assert(json[r'stat'] != null, 'Required key "MoveDetailStatChangesInner[stat]" has a null value in JSON.');
        return true;
      }());

      return MoveDetailStatChangesInner(
        change: mapValueOfType<int>(json, r'change')!,
        stat: AbilityDetailPokemonInnerPokemon.fromJson(json[r'stat'])!,
      );
    }
    return null;
  }

  static List<MoveDetailStatChangesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveDetailStatChangesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveDetailStatChangesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveDetailStatChangesInner> mapFromJson(dynamic json) {
    final map = <String, MoveDetailStatChangesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveDetailStatChangesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveDetailStatChangesInner-objects as value to a dart map
  static Map<String, List<MoveDetailStatChangesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveDetailStatChangesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveDetailStatChangesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'change',
    'stat',
  };
}

