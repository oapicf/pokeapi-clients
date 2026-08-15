//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NatureDetail {
  /// Returns a new [NatureDetail] instance.
  NatureDetail({
    required this.id,
    required this.name,
    required this.decreasedStat,
    required this.increasedStat,
    required this.likesFlavor,
    required this.hatesFlavor,
    this.berries = const [],
    this.pokeathlonStatChanges = const [],
    this.moveBattleStylePreferences = const [],
    this.names = const [],
  });

  int id;

  String name;

  StatSummary decreasedStat;

  StatSummary increasedStat;

  BerryFlavorSummary likesFlavor;

  BerryFlavorSummary hatesFlavor;

  List<BerrySummary> berries;

  List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges;

  List<NatureBattleStylePreference> moveBattleStylePreferences;

  List<NatureName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NatureDetail &&
    other.id == id &&
    other.name == name &&
    other.decreasedStat == decreasedStat &&
    other.increasedStat == increasedStat &&
    other.likesFlavor == likesFlavor &&
    other.hatesFlavor == hatesFlavor &&
    _deepEquality.equals(other.berries, berries) &&
    _deepEquality.equals(other.pokeathlonStatChanges, pokeathlonStatChanges) &&
    _deepEquality.equals(other.moveBattleStylePreferences, moveBattleStylePreferences) &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (decreasedStat.hashCode) +
    (increasedStat.hashCode) +
    (likesFlavor.hashCode) +
    (hatesFlavor.hashCode) +
    (berries.hashCode) +
    (pokeathlonStatChanges.hashCode) +
    (moveBattleStylePreferences.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'NatureDetail[id=$id, name=$name, decreasedStat=$decreasedStat, increasedStat=$increasedStat, likesFlavor=$likesFlavor, hatesFlavor=$hatesFlavor, berries=$berries, pokeathlonStatChanges=$pokeathlonStatChanges, moveBattleStylePreferences=$moveBattleStylePreferences, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'decreased_stat'] = this.decreasedStat;
      json[r'increased_stat'] = this.increasedStat;
      json[r'likes_flavor'] = this.likesFlavor;
      json[r'hates_flavor'] = this.hatesFlavor;
      json[r'berries'] = this.berries;
      json[r'pokeathlon_stat_changes'] = this.pokeathlonStatChanges;
      json[r'move_battle_style_preferences'] = this.moveBattleStylePreferences;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [NatureDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static NatureDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "NatureDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "NatureDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return NatureDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        decreasedStat: StatSummary.fromJson(json[r'decreased_stat'])!,
        increasedStat: StatSummary.fromJson(json[r'increased_stat'])!,
        likesFlavor: BerryFlavorSummary.fromJson(json[r'likes_flavor'])!,
        hatesFlavor: BerryFlavorSummary.fromJson(json[r'hates_flavor'])!,
        berries: BerrySummary.listFromJson(json[r'berries']),
        pokeathlonStatChanges: NatureDetailPokeathlonStatChangesInner.listFromJson(json[r'pokeathlon_stat_changes']),
        moveBattleStylePreferences: NatureBattleStylePreference.listFromJson(json[r'move_battle_style_preferences']),
        names: NatureName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<NatureDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NatureDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NatureDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, NatureDetail> mapFromJson(dynamic json) {
    final map = <String, NatureDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = NatureDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of NatureDetail-objects as value to a dart map
  static Map<String, List<NatureDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<NatureDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = NatureDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'decreased_stat',
    'increased_stat',
    'likes_flavor',
    'hates_flavor',
    'berries',
    'pokeathlon_stat_changes',
    'move_battle_style_preferences',
    'names',
  };
}

