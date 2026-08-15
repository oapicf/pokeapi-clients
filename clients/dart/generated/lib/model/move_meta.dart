//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveMeta {
  /// Returns a new [MoveMeta] instance.
  MoveMeta({
    required this.ailment,
    required this.category,
    this.minHits,
    this.maxHits,
    this.minTurns,
    this.maxTurns,
    this.drain,
    this.healing,
    this.critRate,
    this.ailmentChance,
    this.flinchChance,
    this.statChance,
  });

  MoveMetaAilmentSummary ailment;

  MoveMetaCategorySummary category;

  int? minHits;

  int? maxHits;

  int? minTurns;

  int? maxTurns;

  int? drain;

  int? healing;

  int? critRate;

  int? ailmentChance;

  int? flinchChance;

  int? statChance;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveMeta &&
    other.ailment == ailment &&
    other.category == category &&
    other.minHits == minHits &&
    other.maxHits == maxHits &&
    other.minTurns == minTurns &&
    other.maxTurns == maxTurns &&
    other.drain == drain &&
    other.healing == healing &&
    other.critRate == critRate &&
    other.ailmentChance == ailmentChance &&
    other.flinchChance == flinchChance &&
    other.statChance == statChance;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ailment.hashCode) +
    (category.hashCode) +
    (minHits == null ? 0 : minHits!.hashCode) +
    (maxHits == null ? 0 : maxHits!.hashCode) +
    (minTurns == null ? 0 : minTurns!.hashCode) +
    (maxTurns == null ? 0 : maxTurns!.hashCode) +
    (drain == null ? 0 : drain!.hashCode) +
    (healing == null ? 0 : healing!.hashCode) +
    (critRate == null ? 0 : critRate!.hashCode) +
    (ailmentChance == null ? 0 : ailmentChance!.hashCode) +
    (flinchChance == null ? 0 : flinchChance!.hashCode) +
    (statChance == null ? 0 : statChance!.hashCode);

  @override
  String toString() => 'MoveMeta[ailment=$ailment, category=$category, minHits=$minHits, maxHits=$maxHits, minTurns=$minTurns, maxTurns=$maxTurns, drain=$drain, healing=$healing, critRate=$critRate, ailmentChance=$ailmentChance, flinchChance=$flinchChance, statChance=$statChance]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ailment'] = this.ailment;
      json[r'category'] = this.category;
    if (this.minHits != null) {
      json[r'min_hits'] = this.minHits;
    } else {
      json[r'min_hits'] = null;
    }
    if (this.maxHits != null) {
      json[r'max_hits'] = this.maxHits;
    } else {
      json[r'max_hits'] = null;
    }
    if (this.minTurns != null) {
      json[r'min_turns'] = this.minTurns;
    } else {
      json[r'min_turns'] = null;
    }
    if (this.maxTurns != null) {
      json[r'max_turns'] = this.maxTurns;
    } else {
      json[r'max_turns'] = null;
    }
    if (this.drain != null) {
      json[r'drain'] = this.drain;
    } else {
      json[r'drain'] = null;
    }
    if (this.healing != null) {
      json[r'healing'] = this.healing;
    } else {
      json[r'healing'] = null;
    }
    if (this.critRate != null) {
      json[r'crit_rate'] = this.critRate;
    } else {
      json[r'crit_rate'] = null;
    }
    if (this.ailmentChance != null) {
      json[r'ailment_chance'] = this.ailmentChance;
    } else {
      json[r'ailment_chance'] = null;
    }
    if (this.flinchChance != null) {
      json[r'flinch_chance'] = this.flinchChance;
    } else {
      json[r'flinch_chance'] = null;
    }
    if (this.statChance != null) {
      json[r'stat_chance'] = this.statChance;
    } else {
      json[r'stat_chance'] = null;
    }
    return json;
  }

  /// Returns a new [MoveMeta] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveMeta? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MoveMeta[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MoveMeta[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MoveMeta(
        ailment: MoveMetaAilmentSummary.fromJson(json[r'ailment'])!,
        category: MoveMetaCategorySummary.fromJson(json[r'category'])!,
        minHits: mapValueOfType<int>(json, r'min_hits'),
        maxHits: mapValueOfType<int>(json, r'max_hits'),
        minTurns: mapValueOfType<int>(json, r'min_turns'),
        maxTurns: mapValueOfType<int>(json, r'max_turns'),
        drain: mapValueOfType<int>(json, r'drain'),
        healing: mapValueOfType<int>(json, r'healing'),
        critRate: mapValueOfType<int>(json, r'crit_rate'),
        ailmentChance: mapValueOfType<int>(json, r'ailment_chance'),
        flinchChance: mapValueOfType<int>(json, r'flinch_chance'),
        statChance: mapValueOfType<int>(json, r'stat_chance'),
      );
    }
    return null;
  }

  static List<MoveMeta> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveMeta>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveMeta.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveMeta> mapFromJson(dynamic json) {
    final map = <String, MoveMeta>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveMeta.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveMeta-objects as value to a dart map
  static Map<String, List<MoveMeta>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveMeta>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveMeta.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ailment',
    'category',
  };
}

