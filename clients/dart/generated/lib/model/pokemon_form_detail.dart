//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonFormDetail {
  /// Returns a new [PokemonFormDetail] instance.
  PokemonFormDetail({
    required this.id,
    required this.name,
    this.order,
    this.formOrder,
    this.isDefault,
    this.isBattleOnly,
    this.isMega,
    required this.formName,
    required this.pokemon,
    required this.sprites,
    required this.versionGroup,
    this.formNames = const [],
    this.names = const [],
    this.types = const [],
  });

  int id;

  String name;

  int? order;

  int? formOrder;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isBattleOnly;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isMega;

  String formName;

  PokemonSummary pokemon;

  PokemonFormDetailSprites sprites;

  VersionGroupSummary versionGroup;

  List<PokemonFormDetailFormNamesInner> formNames;

  List<PokemonFormDetailFormNamesInner> names;

  List<PokemonDetailTypesInner> types;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonFormDetail &&
    other.id == id &&
    other.name == name &&
    other.order == order &&
    other.formOrder == formOrder &&
    other.isDefault == isDefault &&
    other.isBattleOnly == isBattleOnly &&
    other.isMega == isMega &&
    other.formName == formName &&
    other.pokemon == pokemon &&
    other.sprites == sprites &&
    other.versionGroup == versionGroup &&
    _deepEquality.equals(other.formNames, formNames) &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.types, types);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (order == null ? 0 : order!.hashCode) +
    (formOrder == null ? 0 : formOrder!.hashCode) +
    (isDefault == null ? 0 : isDefault!.hashCode) +
    (isBattleOnly == null ? 0 : isBattleOnly!.hashCode) +
    (isMega == null ? 0 : isMega!.hashCode) +
    (formName.hashCode) +
    (pokemon.hashCode) +
    (sprites.hashCode) +
    (versionGroup.hashCode) +
    (formNames.hashCode) +
    (names.hashCode) +
    (types.hashCode);

  @override
  String toString() => 'PokemonFormDetail[id=$id, name=$name, order=$order, formOrder=$formOrder, isDefault=$isDefault, isBattleOnly=$isBattleOnly, isMega=$isMega, formName=$formName, pokemon=$pokemon, sprites=$sprites, versionGroup=$versionGroup, formNames=$formNames, names=$names, types=$types]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.order != null) {
      json[r'order'] = this.order;
    } else {
      json[r'order'] = null;
    }
    if (this.formOrder != null) {
      json[r'form_order'] = this.formOrder;
    } else {
      json[r'form_order'] = null;
    }
    if (this.isDefault != null) {
      json[r'is_default'] = this.isDefault;
    } else {
      json[r'is_default'] = null;
    }
    if (this.isBattleOnly != null) {
      json[r'is_battle_only'] = this.isBattleOnly;
    } else {
      json[r'is_battle_only'] = null;
    }
    if (this.isMega != null) {
      json[r'is_mega'] = this.isMega;
    } else {
      json[r'is_mega'] = null;
    }
      json[r'form_name'] = this.formName;
      json[r'pokemon'] = this.pokemon;
      json[r'sprites'] = this.sprites;
      json[r'version_group'] = this.versionGroup;
      json[r'form_names'] = this.formNames;
      json[r'names'] = this.names;
      json[r'types'] = this.types;
    return json;
  }

  /// Returns a new [PokemonFormDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonFormDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "PokemonFormDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "PokemonFormDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "PokemonFormDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "PokemonFormDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'form_name'), 'Required key "PokemonFormDetail[form_name]" is missing from JSON.');
        assert(json[r'form_name'] != null, 'Required key "PokemonFormDetail[form_name]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon'), 'Required key "PokemonFormDetail[pokemon]" is missing from JSON.');
        assert(json[r'pokemon'] != null, 'Required key "PokemonFormDetail[pokemon]" has a null value in JSON.');
        assert(json.containsKey(r'sprites'), 'Required key "PokemonFormDetail[sprites]" is missing from JSON.');
        assert(json[r'sprites'] != null, 'Required key "PokemonFormDetail[sprites]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "PokemonFormDetail[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "PokemonFormDetail[version_group]" has a null value in JSON.');
        assert(json.containsKey(r'form_names'), 'Required key "PokemonFormDetail[form_names]" is missing from JSON.');
        assert(json[r'form_names'] != null, 'Required key "PokemonFormDetail[form_names]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "PokemonFormDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "PokemonFormDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'types'), 'Required key "PokemonFormDetail[types]" is missing from JSON.');
        assert(json[r'types'] != null, 'Required key "PokemonFormDetail[types]" has a null value in JSON.');
        return true;
      }());

      return PokemonFormDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        order: mapValueOfType<int>(json, r'order'),
        formOrder: mapValueOfType<int>(json, r'form_order'),
        isDefault: mapValueOfType<bool>(json, r'is_default'),
        isBattleOnly: mapValueOfType<bool>(json, r'is_battle_only'),
        isMega: mapValueOfType<bool>(json, r'is_mega'),
        formName: mapValueOfType<String>(json, r'form_name')!,
        pokemon: PokemonSummary.fromJson(json[r'pokemon'])!,
        sprites: PokemonFormDetailSprites.fromJson(json[r'sprites'])!,
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
        formNames: PokemonFormDetailFormNamesInner.listFromJson(json[r'form_names']),
        names: PokemonFormDetailFormNamesInner.listFromJson(json[r'names']),
        types: PokemonDetailTypesInner.listFromJson(json[r'types']),
      );
    }
    return null;
  }

  static List<PokemonFormDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonFormDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonFormDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonFormDetail> mapFromJson(dynamic json) {
    final map = <String, PokemonFormDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonFormDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonFormDetail-objects as value to a dart map
  static Map<String, List<PokemonFormDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonFormDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonFormDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'form_name',
    'pokemon',
    'sprites',
    'version_group',
    'form_names',
    'names',
    'types',
  };
}

